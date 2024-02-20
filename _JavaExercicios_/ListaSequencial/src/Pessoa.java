public class Pessoa {
    private String nome;
    private double altura;
    public Pessoa() {
        this.nome = "";
        this.altura = 0;
    }
    public Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }
    public double getAltura() {
        return altura;
    }
    public String getNome() {
        return nome;
    }
    public int compararAltura(Pessoa outro) {
        if (altura < outro.getAltura()) {
            return -1;
        } else if (altura > outro.getAltura()) {
            return 1;
        } else {
            return 0;
        }
    }
    public boolean equals(Pessoa outro) {
        if (altura != outro.getAltura()) {
            return false;
        }
        if (nome.compareTo(outro.getNome()) != 0) {
            return false;
        }
        return true;
    }
    public String toString() {
        return nome + " tem " + altura + " metros.";
    }
} // Fim da Classe Pessoa
