package PayMoney;
import java.util.Scanner;

public class PayMoney {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the number of transactions");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the values of transaction");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter the total no of targets that needs to be achieved");
    int targets = sc.nextInt();
    int[] targetValue = new int[targets];
    for (int i = 0; i < targets; i++) {
      System.out.println("enter the value for target " + (i+1));
      targetValue[i] = sc.nextInt();
    }
    for (int j = 0; j < targets; j++) {
      int cumulativeValue = 0;
      int i = 0;
      while (cumulativeValue < targetValue[j] && i < arr.length) {
        cumulativeValue += arr[i];
        i++;
      }
      if (cumulativeValue < targetValue[j])
        System.out.println("Target " + (j + 1) + " not Reached");
      else
        System.out.println("target " + (j + 1) + " reached at " + (i) + " transactions");
    }
  }
}