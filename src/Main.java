
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
        Person person1;
        Person person2;
        Person person3;
        Person person4;

       /* String name;
        int age;
        double height;
        int weight;
        double bmi;*/

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
        person1 = new Person("Roxana", 19, 1.35, 37);
        person2 = new Person("Roxa", 11, 1.75, 67);
        person3 = new Person("Roxan", 17, 1.45, 47);
        person4 = new Person("Rox", 15, 1.49, 57);

        //calculation result
        System.out.println(person1.calculationResult());
        System.out.println(person2.calculationResult());
        System.out.println(person3.calculationResult());
        System.out.println(person4.calculationResult());


    }
}