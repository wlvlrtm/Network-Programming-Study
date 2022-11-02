package Ex6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.GregorianCalendar;

public class Example6 {

    static void writeToFile(Person person, String filePath)
            throws FileNotFoundException, IOException
    {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(person);
        }
    }

    static Person readFromFile(String filePath)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            return (Person)in.readObject();
        }
    }

    public static void main(String[] args)
            throws FileNotFoundException, IOException, ClassNotFoundException
    {
        Date birthday = new GregorianCalendar(2000, 12-1, 21).getTime();
        Person p1 = new Person(3, "홍길동", birthday);
        writeToFile(p1, "/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex6.dat");
        Person p2 = readFromFile("/Users/araina/Documents/Programming-Study/Network-Programming-Study/file/ex6.dat");
        System.out.println(p1);
        System.out.println(p2);
    }

}