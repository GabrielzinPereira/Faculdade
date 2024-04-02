import java.util.Queue;
import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>(); // Criar uma fila usando LinkedList
        fila.add("Elemento 1"); // Adicionar elementos à fila
        fila.add("Elemento 2"); // Adicionar elementos à fila
        fila.add("Elemento 3"); // Adicionar elementos à fila
        
        System.out.println("Fila: " + fila); // Mostrar a fila
        
        String primeiroElemento = fila.poll(); // Remover o primeiro elemento da fila
        System.out.println("Primeiro elemento removido: " + primeiroElemento);
        
        System.out.println("Fila após a remoção: " + fila); // Mostrar a fila após a remoção
        
        fila.add("Novo Elemento"); // Adicionar mais um elemento à fila
        System.out.println("Fila após adição: " + fila); // Mostrar a fila após a adição
        
        String primeiroElementoSemRemover = fila.peek(); // Obter o primeiro elemento da fila sem removê-lo
        System.out.println("Primeiro elemento sem remover: " + primeiroElementoSemRemover);
        
        System.out.println("Fila após peek: " + fila); // Mostrar a fila após a operação de peek
        
        // Iterar sobre a fila
        System.out.println("Iteração sobre a fila:");
        for (String elemento : fila) {
            System.out.println(elemento);
        }
    }
}
