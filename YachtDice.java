import java.util.Scanner;


public class YachtDice{
  public static final int DICE_PER_ROW = 10;

  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int numberOfDice;

    System.out.println("How many dice do you want to roll? ");
    numberOfDice = keyboard.nextInt();

    int[] r = new int[numberOfDice];
//    char[][] faces = new char[7][6]; //seven mark locations, 6 faces
    boolean allSame;
    rollDice(r); //pass by address
    printDice(r);


  }

  public static void rollDice(int[] r){
    for (int i = 0; i<r.length; i++){
      r[i] = 1 + (int)(Math.random()*6);
    }
    //return r; NOT NEEDED BECAUSE PASSING ADDRESS
  }

  public static void printDice(int[] r){
    char[][] faces = {{' ','o','o','o','o','o'},
                      {' ',' ',' ','o','o','o'},
                      {' ',' ',' ',' ',' ','o'},
                      {'o',' ','o',' ','o',' '},
                      {' ',' ',' ',' ',' ','o'},
                      {' ',' ',' ','o','o','o'},
                      {' ','o','o','o','o','o'}};
    System.out.print("\nYou rolled: ");

    //print the actual numbers
    for (int i = 0; i<r.length; i++){
      System.out.print(r[i]+" ");
    }
    System.out.println();

    //print the faces in rows of 6
    for (int i = 0; i<=(r.length-1)/6; i++){ //e.g. want 2 rows if len>=7
      int index = i*DICE_PER_ROW; //index of first die in row
      int diceInRow = Math.min(DICE_PER_ROW, r.length-index);
      printHorizontalBorders(diceInRow);
      //print top third
      for (int j = 0; j<diceInRow; j++){
        System.out.print("| " + faces[0][r[index+j]-1] + " " + faces[1][r[index+j]-1] + " | ");
      }
      System.out.println();
      //print middle third
      for (int j = 0; j<diceInRow; j++){
        System.out.print("| " + faces[2][r[index+j]-1] + faces[3][r[index+j]-1] + faces[4][r[index+j]-1] + " | ");
      }
      System.out.println();
      //print bottom third
      for (int j = 0; j<diceInRow; j++){
        System.out.print("| " + faces[5][r[index+j]-1] + " " + faces[6][r[index+j]-1] + " | ");
      }
      System.out.println();
      printHorizontalBorders(diceInRow);
    }
  }

  public static void printHorizontalBorders(int n){
    for(int i = 0; i<n; i++){
      System.out.print("+-----+ ");
    }
    System.out.println();
  }


}
