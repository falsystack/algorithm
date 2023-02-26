package jp.falsystack.baekjoon.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1330 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Arrays
        .stream(br.readLine()
            .split(" "))
            .mapToInt(Integer::parseInt).toArray();
    if (numbers[0] > numbers[1]) {
      System.out.println(">");
    } else if (numbers[0] == numbers[1]) {
      System.out.println("==");
    } else {
      System.out.println("<");
    }
  }

}
