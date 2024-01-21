/**
 * @author Roxana
 * @date 19/01/2024
 */


public class Person {
    private String name;
    private int age;
    private double height;
    private int weight;
    private double bmi;

    public Person() {
    }
    public Person(String name, int age, double height, int weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bmi = this.weight / (this.height * this.height);
        calculateBMI(); //calculate the BMI
    }

    private void calculateBMI() {this.bmi = this.weight / (this.height * this.height);}

    public String calculationResult(){
        return "Your name is; "+name+",  your IMC is: "+String.format("%.2f",bmi)+", the age is: "+age+ ", the height is:" +height+" kg, and the weight is: "+weight+" m" ;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        calculateBMI();
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
        calculateBMI();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
        calculateBMI();
    }

}
