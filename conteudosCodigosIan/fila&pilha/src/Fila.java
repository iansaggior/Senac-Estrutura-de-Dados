public class Fila {
	private Elemento inicio, fim, aux;
	private int size = 0;

	public void enqueue(Object obj) { // inserir na fila
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

	public void dequeue() {  // remover na fila
		if (inicio != null) {
			if (size > 1) {
				inicio = inicio.getProximo();
				inicio.setAnterior(null);
				size--;
			} else {
				inicio = inicio.getProximo();
				size--;
			}
		}
	}
	
		public boolean empty() { // está vazia?
			return size == 0;
		}
	
	public Object front() { // primeiro da fila
		return inicio != null ? inicio.getObjeto() : null;
	}

	public int size() { // tamanho
		return size;
	}
}
