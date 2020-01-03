package example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Main2 {

	public static void main(String[] args) {

		File path = new File("./src/example/player.dat");

		Player p = new Player(0);

		if (path.exists() && path.isFile()) {
			try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {

				Player newOne = (Player) in.readObject();
				if (newOne != null) {
					p.setLevel(newOne.getLevel());
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		System.out.println(p);

		p.setLevel(p.getLevel() + 1);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path))) {

			out.writeObject(p);

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(p);
	}

}

class Player implements Serializable {

	private int level;

	public Player(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Player [level=" + level + "]";
	}

}
