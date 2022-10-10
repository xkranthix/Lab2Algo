package currencyDenomination;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CurrencyDenomination {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of currency denominations");
    int size = sc.nextInt();
    Integer[] Denominations = new Integer[size];
    System.out.println("enter the currency denominations value");
    for (int i = 0; i < size; i++) {
      Denominations[i] = sc.nextInt();
    }   
    Arrays.sort(Denominations, Collections.reverseOrder());
    System.out.println("enter the amount you want to pay");
    int targetAmount = sc.nextInt();
    int cumulativeTarget = targetAmount;
    sc.close();
    for (int i = 0; i < Denominations.length; i++) {
      int denominator = Denominations[i];
      if (cumulativeTarget > Denominations[i] || cumulativeTarget % denominator == 0) {

        int numberOfNotes = cumulativeTarget / denominator;
        if (numberOfNotes > 0)
          System.out.println(numberOfNotes + " of " + denominator);
        cumulativeTarget = cumulativeTarget % denominator;
      }
    }
    if (cumulativeTarget > 0) {
      System.out.println("remaining change is "+ cumulativeTarget);
    }
  }

}
