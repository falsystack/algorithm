package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q10813 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int baskets = numbers[0];
    int counts = numbers[1];

    int[] intBaskets = new int[baskets + 1];
    for (int i = 1; i <= baskets; i++) {
      intBaskets[i] = i;
    }

    for (int i = 0; i < counts; i++) {
      int[] range = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int a = range[0];
      int b = range[1];
      int tmp = intBaskets[a];
      intBaskets[a] = intBaskets[b];
      intBaskets[b] = tmp;
    }

    for (int i = 1; i < intBaskets.length; i++) {
      System.out.print(intBaskets[i] + " ");
    }
  }

}
