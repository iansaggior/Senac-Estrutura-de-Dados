public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila();
        Pilha pilha = new Pilha();

        fila.enqueue(4);
        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);
        fila.dequeue();// remove o primeiro elemento da fila
        System.out.println(fila.front()); // primeiro elemento da fila
        System.out.println(fila.empty()); // está vazia?
        System.out.println(fila.size());// tamanho da fila

        pilha.push(1);
        pilha.push(3);
        pilha.push(2);
        pilha.push(0);
        pilha.pop();// remove o primeiro elemento da fila
        System.out.println(pilha.top());// ultimo elemento da pilha
        System.out.println(pilha.empty()); // está vazia?
        System.out.println(pilha.size());// tamanho da pilha

    }
}
