//Autores: Enzo Tabuchi, Geovanna Petarnella, Juan Silva, Nicolas Nicodem, Pedro Nascimento
//Data: 13/11/2023

//Importando bibliocas 
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Criando as listas
        ArrayList<Caixa> caixas = new ArrayList<>();
        ArrayList<Produto> lista1 = new ArrayList<>();
        ArrayList<Produto> lista2 = new ArrayList<>();
        ArrayList<Produto> lista3 = new ArrayList<>();

        //Criando objetos das Caixas
        Caixa comprida = new Caixa("Comprida", 12, 32, 8);
        Caixa pequena = new Caixa("Pequena", 12, 16, 4);
        Caixa grande = new Caixa("Grande", 24, 32, 16);
        Caixa media = new Caixa("Média", 16, 24, 12);
        Caixa superCaixa = new Caixa("Super", 32, 48, 20);

        // adicionando as caixas em uma lista de Caixas
        caixas.add(comprida);
        caixas.add(pequena);
        caixas.add(media);
        caixas.add(grande);
        caixas.add(superCaixa);

        //Criando objetos dos produtos
        Produto produto1 = new Produto(1, "produto1", 10, 8, 15); //lista1 lista2 lista3
        Produto produto2 = new Produto(2, "produto2", 15, 4, 20);  //lista2 lista3
        Produto produto3 = new Produto(3, "produto3", 5, 10, 50); //lista2
        Produto produto4 = new Produto(4, "produto4", 5, 10, 30); //lista3
        Produto produto5 = new Produto(5, "produto5", 15, 30, 20); //lista3
        Produto produto6 = new Produto(6, "produto6", 12, 30, 6); //lista3

        //Teste de produto
        Produto produtoGigante = new Produto(7, "produto7", 120, 300, 60); //lista3

        //Criando listas de produtos
        //lista1
        lista1.add(produto1);

        //lista2
        lista2.add(produto1);
        lista2.add(produto3);
        lista2.add(produto2);

        //lista 3
        lista3.add(produto1);
        lista3.add(produto2);
        lista3.add(produto4);
        lista3.add(produto5);
        lista3.add(produto6);

        System.out.println("CAIXA 1 PRODUTO");
        Caixa cabem = definir_1caixa_1produto(caixas, produto2);
        if (cabem == null) {
            System.out.println("O produto não cabe em nenhuma caixa");
        } else {
            System.out.println(cabem);
        }

        System.out.println("\nCAIXA VARIOS PRODUTOS");
        Caixa cabem2 = definir_1caixa_varios_produtos(caixas, lista2);
        if (cabem2 == null) {
            System.out.println("Os produto não cabem em nenhuma mesma caixa");
        } else {
            System.out.println(cabem2);
        }

    }

    // Criando o método definir_1caixa_1produto
    public static Caixa definir_1caixa_1produto(ArrayList<Caixa> listaCaixas, Produto produto) {

        //For para definir caixa mais adequada para cada produto
        for (Caixa caixa : listaCaixas) {
            double caixaAltura = caixa.getAltura();
            double caixaLargura = caixa.getLargura();
            double caixaProfundidade = caixa.getProfundidade();

            // Verificando 1 posicão -> ver se tudo é menor no tamanho padrão
            if (caixaAltura >= produto.getAltura() &&
                    caixaLargura >= produto.getLargura() &&
                    caixaProfundidade >= produto.getProfundidade()){
                return caixa;


            // Verificando 2 posicão ->
        } else if (
                caixaAltura >= produto.getProfundidade() &&
                        caixaLargura >= produto.getAltura() &&
                        caixaProfundidade >= produto.getLargura()) {
            return caixa;

            // Verificando 3 posicão
        } else if (
                caixaAltura >= produto.getLargura() &&
                        caixaLargura >= produto.getProfundidade() &&
                        caixaProfundidade >= produto.getAltura())

            return caixa;
    }

        return null;
}

    // Criando método definir_1caixa_varios_produtos
    public static Caixa definir_1caixa_varios_produtos(ArrayList<Caixa> listaCaixa, ArrayList<Produto> listaProdutos){
        ArrayList<Caixa> cabeNaCaixa = new ArrayList<>();
        ArrayList<Caixa> couberam = new ArrayList<>();

        for (Produto produto : listaProdutos) {
            // Verificando 1 posicão -> ver se tudo é menor no tamanho padrão
            cabeNaCaixa.add(definir_1caixa_1produto(listaCaixa, produto));
        }

        for (int i = 0; i < listaCaixa.size() - 1; i++) {
            if (listaCaixa.get(i).getAltura() == listaCaixa.get(i + 1).getAltura() &&
                    listaCaixa.get(i).getLargura() == listaCaixa.get(i + 1).getLargura() &&
                    listaCaixa.get(i).getProfundidade() == listaCaixa.get(i + 1).getProfundidade()) {
                couberam.add(null);
            } else {
                couberam.add(listaCaixa.get(i));
            }
        }

        if(couberam.contains(null)) {
            return null;
        }

        return couberam.get(0);
    }
}