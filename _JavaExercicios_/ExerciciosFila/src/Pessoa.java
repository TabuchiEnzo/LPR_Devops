public class Pessoa {
    private String nome;
    private String CPF;
    private int idade;

    // Método Construtor
    public Pessoa(String nome, String CPF, int idade) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public int getIdade() {
        return idade;
    }

    // Método toString
    public String toString() {
        return "\nNome: " + nome + " | CPF: " + CPF + " | Idade: " + idade;
    }
}