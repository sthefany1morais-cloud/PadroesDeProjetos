package exercicios.ex18.TemplateMethod;

public class ProcessadorClientes extends ProcessadorArquivo {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public ProcessadorClientes(String nome, String cpf, String email, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    @Override
    public void validarEstrutura() {
        System.out.println("Validando estrutura do arquivo de clientes...");
    }

    @Override
    public void lerDados() {
        System.out.println("Lendo dados do cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
    }

    @Override
    public void processarDados() {
        System.out.println("Processando dados do cliente: " + nome);
    }

}