package entities;

public class Pair<T extends Animal, E extends Animal> {

	private T t;
	private E e;
	
	public Pair(T t, E e) {
		this.t = t;
		this.e = e;
	}
	
	public void makeASound() {
		t.speak();
		e.speak();
	}

	public void printBoth() {
		System.out.println(t);
		System.out.println(e);
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

	@Override
	public String toString() {
		return "Pair [t=" + t + ", e=" + e + "]";
	}

	
	
	
}
