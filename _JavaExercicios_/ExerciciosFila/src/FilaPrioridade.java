public class FilaPrioridade {

    // Atributos da classe
    private int capacidade;
    private int inicio;
    private int fim;
    private int qntArmazenada;
    private Pessoa pessoa;
    private Pessoa[] container;

    public FilaPrioridade(int capacidade) { // Método Construtor
        this.capacidade = capacidade;
        this.qntArmazenada = 0;
        this.container = new Pessoa[capacidade];
    }

    public int getInicio() {
        return inicio;
    }

    public int getFim() {
        return fim;
    }

    // Métodos principais da classe
    public boolean isEmpty() { // Método isEmpty (Verifica se a fila está vazia
        if (this.qntArmazenada == 0) {
            return true;
        } else {
            return false;
        }
    }
    public int size() { // Método size (Verifica a quantidade de valores na fila)
        return this.qntArmazenada;
    }
    public boolean offer(Pessoa valor) { // Método offer (adiciona um valor na fila)
        if (this.capacidade == this.qntArmazenada) {
            return false;
        } else {
            if (isEmpty()) {
                this.inicio = 0;
                this.fim = 0;
            }
            this.qntArmazenada++;
            this.container[fim] = valor;
            this.fim = (this.fim + 1) % this.capacidade;
        }
        return true;
    }
    public Pessoa poll() {
        Pessoa pessoaAtendida = null;
        for (int i = this.inicio; i < this.size(); i = (i + 1) % this.capacidade) {
            if (container[i].getIdade() > 65) {
                pessoaAtendida = container[i];

                for (int j = this.inicio; j < this.size() - 1; j++) {
                    container[j] = container[j + 1];

                }
                fim--;
            }
        }

        if (pessoaAtendida == null) {
            pessoaAtendida = container[0];
            for (int i = this.inicio; i < this.size() - 1; i = (i + 1) % this.capacidade) {
                container[i] = container[i + 1];
            }
            fim--;
        }

        return pessoaAtendida;
    }
    public Pessoa peek() {
        return container[inicio];
    }
    public String toString() { // Método toString (Mostra a Fila)
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < container.length; i++) {
            sb.append(container[i]);
            sb.append(" ");
        }
        return String.valueOf(sb);
    }
}