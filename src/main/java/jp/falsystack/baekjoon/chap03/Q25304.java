package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q25304 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    long receiptTotalAmount = Long.parseLong(br.readLine());
    long totalItems = Long.parseLong(br.readLine());
    long recalculateTotalAmount = 0;
    for (int i = 0; i < totalItems; i++) {
      String[] itemDetails = br.readLine().split(" ");
      long itemPrice = Long.parseLong(itemDetails[0]);
      long itemCount = Long.parseLong(itemDetails[1]);
      recalculateTotalAmount += itemPrice * itemCount;
    }
    if (receiptTotalAmount == recalculateTotalAmount) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

}
