import java.util.Scanner;
import java.util.ArrayList;


public class Program {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    Scanner intInp = new Scanner(System.in);
    String Week;
    int tmpVal;
    int weeks;
    ArrayList<Integer> data = new ArrayList<>();

    for (weeks = 0; weeks < 18; weeks++){
      try {
        System.out.println("enter Week");
        Week = inp.nextLine();
        String[] splitedWeek = Week.split(" ");
        if (splitedWeek.length != 2 || (splitedWeek[0].equals("Week") && splitedWeek[0].equals("week"))){
          if (splitedWeek.length == 1 && splitedWeek[0].equals("42"))
          break;
          System.err.println("Error, bad week format!");
          System.exit(-1);
        }
        else if ((int)splitedWeek[1].charAt(0) != (weeks + 1) + '0') {
          System.err.println("IllegalArgument!");
          System.exit(-1);
        }
        else {
          tmpVal = intInp.nextInt();
          data.add(tmpVal);
          for (int i = 3; i >= 0; i--){
            tmpVal = intInp.nextInt();
            if (tmpVal < data.get(weeks)) {
              data.set(weeks, tmpVal);
            }
          }
          System.out.println("aan we got:" + data.get(weeks));

        }

      } catch (Exception e) {
        System.err.println("Error, bad Input!");
        System.exit(-1);
      } 
    }
    for (int i = 1; i <= weeks; i++){
      System.out.print("week " + i + " ");
      for (int j = 0;j < data.get(i - 1); j++){
        System.out.print("=");
      }
      System.out.println(">");
    }
  }
}
