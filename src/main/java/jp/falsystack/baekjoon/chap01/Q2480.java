package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2480 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    if (isAllSame(numbers)) {
      System.out.println(10000 + (numbers[0] * 1000));
    } else if (isSameFirstAndSecond(numbers) || isSameFirstAndLast(numbers)) {
      System.out.println(1000 + (numbers[0] * 100));
    } else if (isSameSecondAndThird(numbers)) {
      System.out.println(1000 + (numbers[1] * 100));
    } else {
      int max = Arrays.stream(numbers).max().getAsInt();
      System.out.println(max * 100);
    }
  }

  private static boolean isAllSame(int[] numbers) {
    return isSameFirstAndSecond(numbers) && isSameSecondAndThird(numbers);
  }

  private static boolean isSameFirstAndLast(int[] numbers) {
    return numbers[0] == numbers[2];
  }

  private static boolean isSameSecondAndThird(int[] numbers) {
    return numbers[1] == numbers[2];
  }

  private static boolean isSameFirstAndSecond(int[] numbers) {
    return numbers[0] == numbers[1];
  }

}
