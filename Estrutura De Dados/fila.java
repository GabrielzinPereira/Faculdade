public class fila {

    private Node primeiro; // Nó que referencia o primeiro elemento da fila
    private Node ultimo; // Nó que referencia o último elemento da fila
    private int quantidade; // Quantidade de elementos na fila

    // Classe interna para representar um nó da fila
    private class Node {
        int elemento;
        Node proximo;

        public Node(int elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    // Método para criar uma nova fila
    public void criarFila() {
        primeiro = null;
        ultimo = null;
        quantidade = 0;
    }

    // Método para destruir a fila
    public void destruirFila() {
        primeiro = null;
        ultimo = null;
    }

    // Método para verificar se a fila está vazia
    public boolean filaVazia() {
        return quantidade == 0;
    }

    // Método para inserir um elemento na fila
    public void inserirElemento(int elemento) {
        Node novoNo = new Node(elemento);
        if (filaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            ultimo.proximo = novoNo;
            ultimo = novoNo;
        }
        quantidade++;
    }

    // Método para remover um elemento da fila
    public int removerElemento() {
        if (filaVazia()) {
            throw new IllegalStateException("Fila vazia!");
        }
        int elementoRemovido = primeiro.elemento;
        primeiro = primeiro.proximo;
        if (primeiro == null) {
            ultimo = null;
        }
        quantidade--;
        return elementoRemovido;
    }

    // Método para localizar um elemento na fila
    public int localizarElemento(int elemento) {
        int posicao = 0;
        Node atual = primeiro;
        while (atual != null && atual.elemento != elemento) {
            posicao++;
            atual = atual.proximo;
        }
        return atual != null ? posicao : -1;
    }

    // Programa principal para teste da fila
    public static void main(String[] args) {
        fila fila = new fila();
        fila.inserirElemento(10);
        fila.inserirElemento(20);
        fila.inserirElemento(30);
        System.out.println("Elemento removido: " + fila.removerElemento());
        int posicao = fila.localizarElemento(20);
        if (posicao != -1) {
            System.out.println("Elemento 20 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 20 não encontrado na fila.");
        }
        fila.destruirFila();
    }
}
