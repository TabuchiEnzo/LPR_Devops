// Criação da Classe Pessoa
public class Pessoa_ex4 {
    private String nome;
    private double altura;

    // Getters
    public String getNome() {return nome;}
    public double getAltura() {return altura;}

    // Método Construtor

    public Pessoa_ex4 (String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    // Método ToString
    public String toString () {
        return "Nome: " + this.nome + "\nAltura " + this.altura;
    }
}
