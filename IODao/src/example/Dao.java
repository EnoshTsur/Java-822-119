package example;


public interface Dao<T> {
	
	void write(T t);
	
	T read();
}

