package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 5 4
 * 1 2 3
 * 3 4 4
 * 1 4 1
 * 2 2 2
 * -> 1 2 1 1 0
 */
public class Q10810 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] stringToInt = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
        .toArray();
    int range = stringToInt[0];
    int count = stringToInt[1];

    int[] numbers = new int[range + 1];

    for (int i = 0; i < count; i++) {
      int[] strings = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int a = strings[0];
      int b = strings[1];
      int target = strings[2];
      for (int j = a; j <= b; j++) {
        numbers[j] = target;
      }
    }

    for (int i = 1; i < numbers.length; i++) {
      System.out.print(numbers[i] + " ");
    }

  }

}
