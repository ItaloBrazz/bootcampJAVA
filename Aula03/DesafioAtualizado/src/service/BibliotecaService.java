package service;

import model.Livro;

import java.io.*;
import java.util.ArrayList;

public class BibliotecaService {

    private ArrayList<Livro> livros = new ArrayList<>();
    private final String ARQUIVO = "data/livros.txt";

    public BibliotecaService() {
        carregarLivros();
    }

    public void adicionar(Livro livro) {
        livros.add(livro);
        salvarLivro(livro);
    }

    public ArrayList<Livro> listar() {
        return livros;
    }

    public Livro buscarPorIndice(int i) {
        if (i >= 0 && i < livros.size()) {
            return livros.get(i);
        }
        return null;
    }

    public boolean remover(int i) {
        if (i >= 0 && i < livros.size()) {
            livros.remove(i);
            salvarTodos();
            return true;
        }
        return false;
    }

    public boolean estaVazio() {
        return livros.isEmpty();
    }

    //Carregar Aarquivo
    private void carregarLivros() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARQUIVO))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] d = linha.split(";");
                livros.add(new Livro(
                        d[0], d[1],
                        Integer.parseInt(d[2]),
                        Boolean.parseBoolean(d[3])
                ));
            }
        } catch (IOException e) {
            // Sem Arquivo
        }
    }

    private void salvarLivro(Livro l) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO, true))) {
            bw.write(l.getTitulo() + ";" + l.getAutor() + ";" +
                    l.getAno() + ";" + l.isDisponivel());
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar livro!");
        }
    }

    private void salvarTodos() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARQUIVO))) {
            for (Livro l : livros) {
                bw.write(l.getTitulo() + ";" + l.getAutor() + ";" +
                        l.getAno() + ";" + l.isDisponivel());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar livros!");
        }
    }
}
