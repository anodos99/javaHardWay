import java.util.Scanner;

public class ShapeArea{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int choice;
    double area = 0.0;

    System.out.print("Shape Area Calculator version 0.1");
    System.out.println(" (c) 2015 LJtHW Sample Output, Inc.");

    do{
      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
      System.out.println("1) Triangle");
      System.out.println("2) Circle");
      System.out.println("3) Rectangle");
      System.out.println("4) Square");
      System.out.println("5) Quit");
      System.out.print("> ");
      choice = keyboard.nextInt();

      if (choice == 1){
        System.out.print("\nBase: ");
        int b = keyboard.nextInt();
        System.out.print("Height: ");
        int h = keyboard.nextInt();
        System.out.println("The area is " + computeTriangleArea(b,h));
      }
      else if (choice == 2){
        System.out.print("\nRadius: ");
        System.out.print("The area is: " + computeCircleArea(keyboard.nextInt()));
      }
      else if (choice == 3){
        System.out.print("\nLength: ");
        int q = keyboard.nextInt();
        System.out.print("Width: ");
        int w = keyboard.nextInt();
        System.out.println("The area is " + computeRectangleArea(q,w));
      }
      else if (choice == 4){
        System.out.print("\nLength: ");
        int l = keyboard.nextInt();
        System.out.println("The area is " + computeRectangleArea(l, l) );
      }
      else if (choice != 5) {
        System.out.println("ERROR.");
      }
    } while (choice !=5);
  }

  public static double computeTriangleArea(int base, int height){
    return (0.5 * base * height);
  }

  public static double computeCircleArea(int radius){
    return (Math.PI * radius * radius);
  }

  public static int computeRectangleArea(int length, int width){
    return (length * width);
  }
}
