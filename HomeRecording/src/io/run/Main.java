package io.run;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {

		File file = new File("./src/io/run/hi.txt");
		File target = new File("./src/io/run/hi2.txt");
//		System.out.println(file.exists());
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isAbsolute());
//		System.out.println(file.getPath());
//		System.out.println(file.getParent());
//		System.out.println(file.getFreeSpace());

		try (BufferedInputStream bis = 
				new BufferedInputStream(new FileInputStream(file))) {
			
			int i;
			while ((i = bis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try (BufferedInputStream in = 
				new BufferedInputStream(new FileInputStream(file));
				BufferedOutputStream out = 
						new BufferedOutputStream(new FileOutputStream(target))) {
			
			byte[] buffer = new byte[in.available()];
			out.write(buffer);

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
			
			int i;
			while ((i = reader.read()) != -1) {
//				System.out.print((char) i);
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try(BufferedReader reader = new BufferedReader(
				new InputStreamReader(new FileInputStream(file)))){
		
			while(reader.ready()) {
				System.out.println(reader.readLine());
			}
		} catch(IOException e) {
			
		}
		
		
		try(BufferedWriter writer = new BufferedWriter(new PrintWriter(target))) {
			
//			writer.write("enosh");
//			writer.append(" yoyoy");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new PrintWriter(System.out))) {
			
				String text = reader.readLine();
				writer.append(text);
				writer.newLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
