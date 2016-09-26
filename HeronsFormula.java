import java.util.Arrays;

public class HeronsFormula{

  public static void main(String[] args){
    double a, g;
    int[][] sides = {{3,3,3},
                     {3,4,5},
                     {7,8,9},
                     {5,12,13},
                     {10,9,11},
                     {8,15,17},
                     {9,9,9}};
    String tws = "A triangle with sides ";

    for (int i = 0; i<sides.length; i++){
      System.out.println(tws+Arrays.toString(sides[i])+" has area "
                          + triangleArea(sides[i][0], sides[i][1], sides[i][2]));
    }
  }

  public static double triangleArea(int a, int b, int c){
    double s, A;
    s = (a+b+c)/2.0;
    A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    return A;
  }
}
