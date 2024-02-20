//classe produto
public class Produto {

    //Definindo atributos
    private int codigo;
    private String descricao;
    private double largura;
    private double altura;
    private double profundidade;

    //Método construtor
    public Produto(int codigo, String descricao, double largura, double profundidade, double altura){
        this.codigo = codigo;
        this.descricao = descricao;
        this.largura = largura;
        this.altura = altura;
        this.profundidade = profundidade;
    }

    //Método get Código
    public int getCodigo() {
        return codigo;
    }

    //Método get Altura
    public double getAltura() {
        return altura;
    }

    //Método get Largura
    public double getLargura() {
        return largura;
    }

    //Método get Profundidade
    public double getProfundidade() {
        return profundidade;
    }

    //Método get Descrição
    public String getDescricao() {
        return descricao;
    }

    //Método set descrição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //Método toString
    public String toString() {
        return "\033[1;35mPRODUTO: \033[0m" +
                "\nCodigo: " + codigo +
                "\nDescricao: " + descricao +
                "\nLargura: " + largura +
                "\nAltura: " + altura +
                "\nProfundidade: " + profundidade;
    }
}