import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hello. What is your name? ");
        String name = input.nextLine();
        
        System.out.print("Hi " + name + ". How old are you? ");
        int age = input.nextInt();
        
        System.out.print("So you're " + age + "? That's not old at all! How much do you make, " + name + "?");
        double salary = input.nextDouble();
        
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
        }
}      
        
