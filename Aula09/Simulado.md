Simulado - Arquitetura de Java com SpringBoot

*Parte 01 - Programação Orientada a Objetos*

1) POO é um processo da programação que organiza o código em objetos, que representam coisas do mundo real, juntando atributos e métodos. O POO tem como principais benefícios facilitar a manutenção do código e a reutilização do mesmo, já que não é preciso ficar repetindo a mesma coisa em vários lugares do sistema.

2) Encapsulamento é o conceito de proteger os atributos de uma classe, permitindo o acesso a eles apenas por métodos controlados os getters e setters. Ele resolve o problema de alterações não permitidas nos dados, garantindo mais segurança e controle do objeto.

3) Os atributos estão públicos, permitindo o acesso direto por qualquer classe, sem controle nem validação dos valores.

4) Questões de segurança, os getters e setters permitem, controlar o acesso aos dados corretamente, validar valores e manter o encapsulamento, assim melhorando a organização do código e a segurança.

5) 
public class Produto {

    private Long id;
    private String nome;
    private double preco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }
}

*Parte 2 - Spring-Boot e REST*

6) Spring Boot é um framework do Spring que facilita a criação de aplicações em Java, geralmente APIs RESt. Sua principal vantagem seria a configuração automática já que o springboot permite criar aplicações rapidamente, com menos código e menos configuração.

7) RestController. Essa anotação indica que a classe um controller REST e que os métodos retornam dados.

8) O RequestMapping serve para mapear URLs e métodos HTTP para métodos do controller, ele basicamente vai mostrar qual rota sera utilizada para acessar a aplicação.

9) O controller está acessando o repositório diretamente, sem passar por uma camada de serviço, está errado pois a regra de negócio deveria estar na Service, não no Controller.

10) GET = Busca Dados / POST = Envia/Cria Dados / PUT = Atualiza um dado existente / DELETE = Apaga um dado existente

*Parte 3 - JPA e Hibernate* 

11) JPA é uma especificação do Java ou uma ORM, usada para persistir objetos no banco de dados. O Hibernate é uma implementação do JPA, ou seja, ele que vai executar de fato as operações no banco.

12) @Entity. Essa anotação indica que a classe representa uma tabela no banco de dados.

13) @Id define a PK da entidade e o @GeneratedValue indica que o valor do ID será gerado automaticamente pelo banco ou pelo JPA. É como um AutoIncrement do SQL.

14) Realizar as operações de CRUD e abstrair o acesso ao banco de dados, evitando SQL manual.

15) Porque o JPA tem muitos benefícios, ele simplifica o código, reduz erros, deixa a aplicação independente do banco e etc. Então além disso tudo ele evita a necessidade de escrever SQL manual, fazendo o desenvolvimento ser mais rápido e organizado.

*Parte 4 - DTO e Service Layer*

16) O DTO é um objeto usado para transportar dados entre as camadas da aplicação. Ele resolve o problema de, expor entidades diretamente, resolve o acoplamento entre camadas e o envio de dados desnecessários.

17) Essa abordagem não é recomendada pois o controller recebe a entidade diretamente ou seja não está usando DTO além de violar a separação de camadas e pode expor campos sensíveis e regras de negócio. 

18) A camada Service serve principalmente para abrigar algunas funções como as regras de negócio, ela serve também para orquestrar as operações e fazer a comunicação entre o controller e o repository.

19) A camada Service. Essa camada vai centralizar as regras, evitar a duplicação de código e mantém a arquitetura do projeto organizada.

20) O controller não deve acessar o repository diretamente para manter a separação de responsabilidades e uma arquitetura mais organizada. Quebra a separação de camadas e aumenta o acoplamento, além de dificultar a manutenção do código.

*Parte 5 - SOLID*

21) SRP diz que uma classe deve ter apenas uma responsabilidade. Por exemplo se uma classe ProdutoController realiza validação de dados, regras de negócio e persistência no banco, ela viola o princípio, pois essas responsabilidades deveriam estar separadas.

22) O princípio violado é o SRP. Porque o ProdutoController faz validação, regra de negócio e acesso ao banco, ou seja, tem várias responsabilidades.

23) O OCP diz que uma classe deve estar aberta para extensão, mas fechada para modificação. Ou seja, posso adicionar novas funcionalidades mas sem alterar o código já existente.

24) O LSP diz que uma classe filho deve poder substituir a classe pai sem quebrar o comportamento do sistema.

25) O ISP diz que interfaces não devem ser grandes e sim específicas, para que as classes implementem apenas o que realmente usam.

26) O princípio violado é o ISP. Porque a interface tem muitos métodos, forçando classes a implementar coisas que talvez não precisem.

27) O DIP diz que módulos de alto nível não devem depender de módulos de baixo nível, e sim de interfaces.

28) O uso de injeção de dependência, usando interfaces em vez de classes concretas.

*Parte 6 - Arquitetura*

29) Inicialmente o cliente envia uma requisição HTTP, geralmente em um frontend (Ou postman se estiver em produção). Essa requisição é recebida pelo Controller, que trata a entrada de dados e chama o Service, onde ficam as regras de negócio. O Service então chama o Repository, que é responsável por acessar o banco de dados. Depois de buscar ou salvar as informações, o Repository retorna os dados para o Service, que processa esse resultado e devolve para o Controller. Por fim, o Controller retorna a resposta para o cliente.

30) Pois deixam o código mais organizado, desacoplado e com responsabilidades bem definidas. Os DTOs servem para transferir apenas os dados necessários, sem expor diretamente as entidades, facilitando mudanças sem afetar o resto do sistema. Os princípios SOLID ajudam a criar classes com uma única responsabilidade, fáceis de entender, testar e etc. E a camada de Service concentra as regras de negócio, evitando lógica nos Controllers e permitindo reutilização de código, o que facilita a manutenção e a evolução do sistema.