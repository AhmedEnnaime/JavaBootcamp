package Serialization;

import java.io.*;

public class SerDeserDemo {
    public static void main(String[] args){
        Student student = new Student("Ahmed", 21, "Safi");
        student.setX(10);

        // Location where the file supposed to be received or stored
        String fileName = "";
        FileOutputStream fileOut = null;
        ObjectOutputStream objOut = null;

        //Serialization
        try{
            fileOut = new FileOutputStream(fileName);
            objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(student);

            objOut.close();
            fileOut.close();
            System.out.println("Object has been serialized: \n" + student);
        }catch (IOException ex){
            System.out.println("IOException is caught");
        }

        // Deserialization
        FileInputStream fileIn = null;
        ObjectInputStream objIn = null;
        try {
            fileIn = new FileInputStream(fileName);
            objIn = new ObjectInputStream(fileIn);

            Student object = (Student) objIn.readObject();

            System.out.println("Object has been deserialized: \n" + object);

            objIn.close();
            fileIn.close();

        }catch (IOException ex){
            System.out.println("IOException is caught");
        }catch (ClassNotFoundException ex){
            System.out.println("ClassNotFoundException" + " is caught");
        }
    }
}
