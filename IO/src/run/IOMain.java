package run;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class IOMain {

	public static void main(String[] args) {

		File hi = new File("./src/run/hi.txt");
		File hi2 = new File("./src/run/hi2.txt");
		
		File cat1 = new File("./src/run/cat.png");
		File cat2 = new File("./src/run/cat2.png");

		try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(cat1));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(cat2))) {

			int currentByte;
			byte[] buffer = new byte[in.available()];
			while ((currentByte = in.read(buffer)) != -1) {
				out.write(buffer, 0, currentByte);
			}

		} catch (IOException e) {

			e.printStackTrace();
		}

		try(BufferedReader reader = new BufferedReader(new FileReader(hi));
				BufferedWriter writer = new BufferedWriter(new FileWriter(hi2))) {
			
			int currentChar;
			while ((currentChar = reader.read()) != -1) {
				
				writer.write((char) currentChar);
				
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}

		try (BufferedWriter out = new BufferedWriter(new FileWriter(hi2, true))) {

			out.newLine();
			out.append("Enosh!");
			
			
		} catch (IOException e) {

		}

		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new PrintWriter(System.out))) {
			
				String content = reader.readLine();
				writer.append(content + " asdfasd");
			
		} catch(IOException e) {
			
		}

		Person p = new Person("Avner", 74);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("person.dat")))) {

			out.writeObject(p);

		} catch (IOException e) {

		}

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("person.dat")))) {

			Person personRead = (Person) in.readObject();
			System.out.println(personRead);
			
		} catch (IOException | ClassNotFoundException e) {

		} 

	}

}
