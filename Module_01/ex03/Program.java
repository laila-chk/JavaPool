import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    String Week;
    for (int weeks = 0; weeks < 18; weeks++){
      try {
        System.out.println("enter Week");
        Week = inp.nextLine();
        System.out.println("u entered: " + Week);
        //we need to check on week order.
        //then get grades to figure out the smallest.

      } catch (Exception e) {
        System.out.println("ERRoR!");
      } 
    }
  }
}
