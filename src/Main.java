
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Roxana
 * @date 21/01/2024
 * @objetive count the BMI
 **/
public class Main {
    public static void main(String[] args) {
        // declaración de variables
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Person> persons = new ArrayList <>();
         String name;
         int age;
         double height;
         int weight;


        //form
        System.out.println(" BMI  Form");
        System.out.println("================");

        System.out.println(" Enter your name: ");
        name = scan.nextLine();

        System.out.println("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Enter your height: ");
        height = scan.nextDouble();

        System.out.println("Enter your weight: ");
        weight = scan.nextInt();
        //fin of form
        System.out.println("=================");
        //fin form


        // create the objets Person
       persons.add(new Person(name,age,height,weight));
       persons.add(new Person("Roxana",35,1.64,59));
       persons.add(new Person("Arthur",8,1.32,25));
       persons.add(new Person("Albert",11,1.60,41));
       persons.add(new Person(" Florin",36,1.84,68));
       persons.add(new Person("Ana",40,1.54,57));


        //calculation result
        for(Person p :persons){
            System.out.println(p.calculationResult());

        }

    }
}