//Classe Caixa
public class Caixa {

    //Definindo atributos
    private String identificacao;
    private double altura;
    private double profundidade;
    private double largura;

    //Método construtor
    public Caixa(String identificacao, double largura, double profundidade, double altura){
        this.identificacao = identificacao;
        this.altura = altura;
        this.profundidade = profundidade;
        this.largura = largura;
    }

    //Método get Identificador
    public String getIdentificacao() {
        return identificacao;
    }

    //Método set identificador
    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    //Método get altura
    public double getAltura() {
        return altura;
    }

    //Método set altura
    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Método get profundidade
    public double getProfundidade() {
        return profundidade;
    }

    //Método set profundidade
    public void setProfundidade(double profundidade) {
        this.profundidade = profundidade;
    }

    //Método get largura
    public double getLargura() {
        return largura;
    }

    //Método set largura
    public void setLargura(double largura) {
        this.largura = largura;
    }

    //Método toString para mostrar ao usuário as informações da caixa adequada
    @Override
    public String toString() {
        return "--------------------------------" +
                "\n\033[1;35mCAIXA: \033[0m" +
                "\nIdentificacao: " + identificacao +
                "\nAltura: " + altura +
                "\nprofundidade: " + profundidade +
                "\nLargura: " + largura +
                "\n--------------------------------";
    }
}