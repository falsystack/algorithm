package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10811 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int baskets = numbers[0];
    int counts = numbers[1];

    int[] numberBasket = new int[baskets + 1];
    for (int i = 1; i < numberBasket.length; i++) {
      numberBasket[i] = i;
    }

    for (int i = 1; i <= counts; i++) {
      int[] range = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int start = range[0];
      int finish = range[1];
      while (start < finish) {
        int tmp = numberBasket[start];
        numberBasket[start] = numberBasket[finish];
        numberBasket[finish] = tmp;
        start++;
        finish--;
      }
    }

    for (int i = 1; i < numberBasket.length; i++) {
      System.out.print(numberBasket[i] + " ");
    }
  }

}
