import java.util.Scanner;

//"Absolute correctness of data is guaranteed" - The subject
//
//data:
//[][][][][][][][][][][] <-- students. 
//[][][][][][][][][][][] <-- classes.
//[][][][][][][][][][][] <-- presences records.
//
//
//The calendar: 
//        Su = [] 4
//        MO = [] 4
//        Tu = 5
//        We = 5
//        Th = 4 []
//        Fr = 4 []
//        Sa = 4 []
//
//Classes on calendar:
//        we have an array of 30
//        each one is a day, each day either have no classes, one, or many
//        but we might not need all of these, one referecial week enough
//        [][][][][][][][][][][][][][][]
//
//        tu      we  th  F   sa  su     Mo
//        [2]    [1] [1] [0] [1] [2]    [3]
//        [1, 6] [2] [1] [0] [1] [2,4]  [3 2 4]
//
//

public class Program {
  public static void main(String[] args) {
    Scanner ipt = new Scanner(System.in);
    String[][] data = new String[3][10];
    String input;

    for (int i = 0; i < 3; i++){
      for (int j = 0; j < 10; j++){
        input = ipt.nextLine();
        if (input.equals(".")){
          j = 0;
          break;
        }
        else {
          data[i][j] = input;
        }
      }
    }
    System.out.println(data[1][0]);

  }
}
