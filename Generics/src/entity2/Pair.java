package entity2;

public class Pair<T extends Player, E extends Entity> {

	private T t;
	private E e;
	
	public Pair(T t, E e) {
		this.t = t;
		this.e = e;
	}
	
	
	public void printBoth() {
		e.talk();
		t.talk();
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
	
	
	
}
