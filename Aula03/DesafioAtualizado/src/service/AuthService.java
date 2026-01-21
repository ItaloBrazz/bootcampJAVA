package service;

import model.Admin;
import java.io.*;
import java.util.ArrayList;

public class AuthService {

    private ArrayList<Admin> admins = new ArrayList<>();

    private final String BASE_DIR = System.getProperty("user.dir");
    private final String PASTA = BASE_DIR + "/data";
    private final String ARQUIVO = PASTA + "/admins.txt";

    public AuthService() {
        criarArquivoSeNaoExistir();
        carregarAdmins();
    }

    // ================== CADASTRO ==================
    public boolean cadastrar(String usuario, String senha) {
        for (Admin a : admins) {
            if (a.getUsuario().equals(usuario)) {
                return false;
            }
        }

        Admin novo = new Admin(usuario, senha);
        admins.add(novo);
        salvarAdmin(novo);
        return true;
    }

    // ================== LOGIN ==================
    public boolean login(String usuario, String senha) {
        for (Admin a : admins) {
            if (a.getUsuario().equals(usuario) &&
                    a.getSenha().equals(senha)) {
                return true;
            }
        }
        return false;
    }

    // ================== ARQUIVOS ==================
    private void criarArquivoSeNaoExistir() {
        try {
            File pasta = new File(PASTA);
            if (!pasta.exists()) {
                pasta.mkdirs();
            }

            File arquivo = new File(ARQUIVO);
            if (!arquivo.exists()) {
                arquivo.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }

    private void carregarAdmins() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 2) {
                    admins.add(new Admin(dados[0], dados[1]));
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar admins: " + e.getMessage());
        }
    }

    private void salvarAdmin(Admin admin) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            bw.write(admin.getUsuario() + ";" + admin.getSenha());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar admin: " + e.getMessage());
        }
    }
}
