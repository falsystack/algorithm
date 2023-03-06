package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q3052 {

  public static final int BASE_NUMBER = 42;
  public static final int LENGTH = 10;

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = 0;
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < LENGTH; i++) {
      int a = Integer.parseInt(br.readLine());
      int result = a % BASE_NUMBER;
      numbers.add(result);
    }

    for (int i = 0; i < numbers.size(); i++) {
      if (i == numbers.indexOf(numbers.get(i))) {
        count++;
      }
    }
    System.out.println(count);
  }
}
