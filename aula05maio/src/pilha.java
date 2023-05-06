public class pilha {

	private Elemento inicio, fim, aux;
	private int size = 0;

	public void push(Object obj) {
		if (inicio == null) {
			inicio = new Elemento(obj, null, null);
			aux = inicio;
			size++;
		} else {
			fim = new Elemento(obj, aux, null);
			aux.setProximo(fim);
			aux = fim;
			size++;
		}
	}
	public void pop() {
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

	public boolean empty() {
		return size == 0;
	}

	public Object top() {
		return inicio != null ? n.getObjeto() : null;
	}

	public int size() {
		return size;
	}

}
