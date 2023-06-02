public class Pilha {

	private Elemento inicio, fim, aux;
	private int size = 0;

	public void push(Object obj) {  // inserir na pilha
		if (inicio == null) {
			inicio = new Elemento(obj, null, null);
			aux = inicio;
			size++;
		} else {
			fim = new Elemento(obj, null, aux);
			aux.setProximo(fim);
			aux = fim;
			size++;
		}
	}
	public void pop() { // remover na pilha
		if (inicio != null) {
			if (size > 1) {
				fim = fim.getAnterior();
				aux = fim;
				aux.setProximo(null);
				size--;
			}
			else {
				inicio = inicio.getProximo();
				aux = inicio;
				size--;
			}
		}
	}

	public boolean empty() { // está vazia?
		return size == 0;
	}

	public Object top() { // primeiro da pilha
		return inicio != null ? aux.getObjeto() : null;
	}

	public int size() { // tamanho
		return size;
	}

}
