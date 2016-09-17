import java.util.Scanner;

public class BMICalculator{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int feet, inches;
    double pounds, m, kg, bmi;

    System.out.print("Your height (feet only): ");
    feet = keyboard.nextInt();
    System.out.print("Your height (inches): ");
    inches = keyboard.nextInt();
    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    inches = feet*12 + inches;
    m = inches*2.54/100;
    kg = pounds/2.20462;
    bmi=kg/(m*m);
    System.out.println("Your BMI is " + bmi);
  }
}
