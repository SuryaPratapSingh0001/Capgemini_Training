package Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerializationDemo {

    public static void main(String[] args) throws Exception {

        FileOutputStream fos = new FileOutputStream("EmpData.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(new Student(234, "Aditya", 32));
        oos.writeObject(new Student(235, "Shibham", 55));

        oos.close();
        fos.close();

        System.out.println("Data written successfully!");


        FileInputStream fis = new FileInputStream("EmpData.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Student obj1 = (Student) ois.readObject();
        Student obj2 = (Student) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}
