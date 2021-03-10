package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String  name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name " + name + ", age " + age ;
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> person = new ArrayList<>();


        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String [] peopleString = line.split(" ");

                if(Integer.parseInt(peopleString[1]) < 0){
                    throw new Exception();
                }
               Person person1 = new Person(peopleString[0], Integer.parseInt(peopleString[1]));
                person.add(person1);
            }
            scanner.close();

            return  person;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (Exception e1) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}
