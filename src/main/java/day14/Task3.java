package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        File file = new File("people");

        System.out.println(parseFileToObjList(file).toString());
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
