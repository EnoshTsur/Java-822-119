package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DaoIO<T> implements Dao<T>{

	private File file;
	
	public DaoIO(File file) {
		this.file = file;
	}
	
	@Override
	public void write(T t) {
		try(ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(file))) {
			
			out.writeObject(t);
			
		} catch(IOException e) {
				e.printStackTrace();
		}
	}

	@Override
	public T read() {
		T t = null;
		
		try(ObjectInputStream in = new ObjectInputStream(
				new FileInputStream(file))) {
			
			t = (T) in.readObject();
			
		} catch(ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}	
		return t;
	}

}
