
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
        Person [] persons = new Person[10];
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
        persons[0] = new Person("Roxana", 19, 1.35, 37);
        persons[1] = new Person("Roxan", 149, 1.55, 367);
        persons[2] = new Person("Roxa", 192, 1.635, 347);
        persons[3] = new Person("Rox", 119, 1.35, 317);
        persons[4] = new Person("Roa", 189, 1.35, 347);
        persons[5] = new Person("Roxab", 159, 1.35, 378);
        persons[6] = new Person("Roxanrwa", 139, 1.35, 367);
        persons[7] = new Person("Roxarwna", 109, 1.35, 37);
        persons[8] = new Person("Roxweana", 192, 1.35, 327);
        persons[9] = new Person("Roxanrwa", 149, 1.35, 375);



        //calculation result
        for(int i=0; i< persons.length; i++){
            System.out.println(persons[i].calculationResult());
        }


    }
}