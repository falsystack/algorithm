package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Q5597 {

  public static void main(String[] args) throws IOException {
    int[] ints = new int[31];
    ArrayList<Integer> numbers = new ArrayList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    for (int i = 1; i <= 28; i++) {
      int target = Integer.parseInt(br.readLine());
      ints[target] = 1;
    }

    for (int i = 1; i <= 30; i++) {
      if (ints[i] != 1) {
        numbers.add(i);
      }
    }

    for (Integer number : numbers) {
      System.out.println(number);
    }
  }
}
