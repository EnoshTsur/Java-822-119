package run;

import java.io.*;
import java.util.Map;
import java.util.logging.*;

public class Main2 {

    static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        try {
            FileHandler fileHandler = new FileHandler("./src/run/log");
            fileHandler.setFormatter( new SimpleFormatter());
            ConsoleHandler consoleHandler = new ConsoleHandler();

            logger.addHandler(fileHandler);
            logger.addHandler(consoleHandler);

        } catch (IOException e) {
            e.printStackTrace();
        }

        String filePath = "./src/run/hi.txt";

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(filePath)))) {

            Person person = new Person("Mr Person");
            out.writeObject(person);

            logger.log(Level.INFO, "Wrote person");

        } catch (IOException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(filePath)))) {

            Person person = (Person) in.readObject();

            logger.log(Level.INFO, "Read person: " + person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, e.getMessage());
        }
    }
}

class Person implements Serializable {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
