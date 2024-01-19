import java.util.Locale;
import java.util.Scanner;

/**
 * @author Roxana
 * @date 18/01/2024
 * @objetivo count the BMI
 **/
public class Main {
    public static void main(String[] args) {
        //variables
        String name;
        int age;
        double height;
        int weight;
        double bmi;

        //formulario
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" BMI  Form");
        System.out.println("================");
DSGERGE

        System.out.println(" Enter your name: ");
        name = scan.nextLine();

        System.out.println("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Enter your height: ");
        height= scan.nextDouble();

        System.out.println("Enter your weight: ");
        weight= scan.nextInt();
        //fin de formulario
        System.out.println("=================");

        // procesamiento de datos
        bmi= weight/(height*height);
        //salida de datos
       System.out.println("The BMI of "+name+" is "+String.format("%.2f",bmi)+" and your age is "+age+ " years.");


    }
}