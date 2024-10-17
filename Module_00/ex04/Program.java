import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    int[] counter = new int[65536];

    System.out.println("enter a String");
    Scanner inp = new Scanner(System.in);
    String input = inp.nextLine();
    String [] data = new String[input.length()];
    int [] lbp = new int[input.length()];
    int largest = 1;
    int reps = 0, pans = 0;

    for (char c : input.toCharArray())
      counter[c]++;

    for (char c = 0; c < 65535; c++) {
      if (counter[c] > 0) {
        if (counter[c] > largest)
          largest = counter[c];
        if (data[counter[c]] != null)
          data[counter[c]] +=  String.valueOf(c);
        else
          data[counter[c]] = String.valueOf(c);
      }
    }

    boolean inited = false;
    for (int j = 0; j <= 10; j++){
      pans = 0;
      System.out.println("");
      if (j == 1)
        inited = true;
      for(int i = largest; i > 0; i--) {
        if (data[i] != null){
          if (!inited)
          lbp[i] = 10 - (i * 10 / largest) + 1;
        }
        else 
          lbp[i] = -1;
        //start printing 
        if (lbp[i] == 1){
          for (int k = 0; k < data[i].length(); k++) {
            if (reps == 10)
              break;
            System.out.print(i);
            System.out.print("  ");
            reps++;
          }
        }
        else if (lbp[i] == 0 && pans != 10){
          for (int k = data[i].length(); k > 0; k--) {
            System.out.print("#  ");
            pans++;
          }
        }
        if (lbp[i] > 0)
          lbp[i]--;
      }
    }
    System.out.println("");
    reps = 0;
    for(int i = largest; i > 1; i--) {
      if(data[i] != null) {
        char [] single = data[i].toCharArray();
        for (int k = 0; k < single.length; k++) {
          if (reps == 10)
            break;
          System.out.print(single[k]);
          System.out.print("  ");
          reps++;
        }
      }
    }
  } 
}
