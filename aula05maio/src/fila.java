public class fila {
	private Elemento inicio, fim, aux;
	private int size = 0;
	
	public void enqueue(Object obj) {
		if (inicio == null) {
			inicio = new Elemento(obj, null, null);
			aux = inicio;
			size++;
		}
		else {
			fim = new Elemento(obj, aux, null);
			aux.setProximo(fim);
			aux = fim;
			size++;
		}
	}
	
	public void dequeue() {
		if (inicio != null) {
			if (size > 1) {
				inicio = inicio.getProximo();
				inicio.setAnterior(null);
				size--;
			}
			else {
				inicio = inicio.getProximo();
				size--;
			}
		}
	}
	
	public Object front() {
		return inicio != null ? inicio.getObjeto() : null;
	}
	
	public boolean empty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
}
