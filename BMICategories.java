import java.util.Scanner;

public class BMICategories{
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

    System.out.print("BMI category: ");
    if (bmi < 15.0){
      System.out.println("very severely underweight");
    }
    else if (bmi <= 16.0){
      System.out.println("severely underweight");
    }
    else if (bmi < 18.5){
      System.out.println("underweight");
    }
    else if (bmi < 25.0){
      System.out.println("normal weight");
    }
    else if (bmi < 30.0){
      System.out.println("overweight");
    }
    else if (bmi < 35.0){
      System.out.println("moderately obese");
    }
    else if (bmi < 40.0){
      System.out.println("severely obese");
    }
    else{
      System.out.println("very severely/\"morbidly\" obese");
    }
  }
}
