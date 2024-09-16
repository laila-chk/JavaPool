import java.util.Scanner;
import java.util.Map;
import java.util.TreeMap;

public class Program {
  public static void main(String[] args) {
    int tmp;
    Integer largestVal;
    int k = 0;
    int[] lines = new int[10];
    int[] reps = new int[10];

    Scanner inp = new Scanner(System.in);
    System.out.print("->");
    String input = inp.nextLine();
    Map<Character, Integer> map = new TreeMap<>();

    //storing element in a map.
    for (int i = 0; i < input.length(); i++){
      try {
        tmp = map.get(input.charAt(i)) + 1;
      } catch (Exception e) {
        tmp = 1;
      }
      map.put(input.charAt(i), tmp);
    }

    //creating a map that sorts values based on values instead of keys (overriding the comparator)
    TreeMap<Character, Integer> ValsSortedMap = new TreeMap<>((k1, k2) -> { 
      int compVal = map.get(k2).compareTo(map.get(k1));
      return compVal == 0 ? k1.compareTo(k2) : compVal;
    });
    //copying from the first map to the second
    ValsSortedMap.putAll(map);

    Map.Entry<Character, Integer> firstEntry = ValsSortedMap.firstEntry();
    largestVal = firstEntry.getValue();

    // calculate percentage of each char
    // we have : biggest value, 10 #'s, and current value, to know how many #'s to print we can do:
    // currentVal * 10 / biggestVal.
    for (Map.Entry<Character, Integer> entry : ValsSortedMap.entrySet()) {
      if (k == 10)
      break;
      lines[k] = 10 - (entry.getValue() * 10 / largestVal) + 1; //ghanji mn ba3d n9ol dyalach had 1: f 0 kanprintiw #, khsna nprintiw number of reps 9bl so zdna wahd.
      reps[k] = entry.getValue();
      k++;
    }
    while (k < 10){
      reps[k] = -1;
      lines[k++] = -1;
    }

    //iterating on lines:
    for (int i = 0; i < 11; i++){
      //iterating on columns/our array:
      for (int j = 0; j < 10; j++){
        if (lines[j] == 0)
        System.out.print("    #");
        if (lines[j] == 1)
        System.out.print("    " + reps[j]);
        if (lines[j] > 0)
        lines[j]--;
      }
      System.out.println("");
    }

    for (Map.Entry<Character, Integer> entry : ValsSortedMap.entrySet()) {
      if (k == 0)
      break;
      System.out.print("    " + entry.getKey());
      k--;
    }
    System.out.println("");
  }
}
