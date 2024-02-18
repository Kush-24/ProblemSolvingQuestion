package com.kush.serializable;
import java.io.*;

class MyClass implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure version compatibility
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class SerializationExample {
    public static void main(String[] args) {
    	System.out.println("SerializationExample");
        MyClass object = new MyClass(1, "John");

        // Serialization
        try (FileOutputStream fileOut = new FileOutputStream("object.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(object);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (FileInputStream fileIn = new FileInputStream("object.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            MyClass objectIn = (MyClass) in.readObject();
            objectIn.display();
            System.out.println("Object deserialized successfully.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        // Serialization
        File file = new File("object.ser");
        System.out.println("File location: " + file.getAbsolutePath());
    }
}
