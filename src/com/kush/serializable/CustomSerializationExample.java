package com.kush.serializable;
import java.io.*;

class SerializedStudent implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private double score;

    public SerializedStudent(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Custom serialization method
    private void writeObject(ObjectOutputStream out) throws IOException {
        if (score >= 75.0) {
            out.defaultWriteObject(); // Serialize default fields
        } else {
            throw new NotSerializableException("Student with ID " + id + " did not meet the criteria.");
        }
    }

    // Custom Deserialize method
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject(); // Deserialize default fields
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

public class CustomSerializationExample {
	public static void main(String[] args) {
		SerializedStudent[] students = { new SerializedStudent(1, "John", 80.0),
				new SerializedStudent(2, "Alice", 70.0), new SerializedStudent(3, "Bob", 85.0) };

		// Serialization
		try (FileOutputStream fileOut = new FileOutputStream("students.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			for (SerializedStudent student : students) {
				try {
					out.writeObject(student);
					System.out.println("Student with ID " + student.getId() + " serialized successfully.");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		//Deserialization
        try (FileInputStream fileIn = new FileInputStream("students.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            Object obj;
            while ((obj = in.readObject()) != null) {
                if (obj instanceof SerializedStudent) {
                    SerializedStudent student = (SerializedStudent) obj;
                    System.out.println("Deserialized Student: " + student.getName() + ", Score: " + student.getScore());
                }
            }
        } catch (EOFException e) {
        	e.printStackTrace();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
}
