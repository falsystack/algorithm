package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8393 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int number = Integer.parseInt(br.readLine());
    int result = 0;
    for (int i = 1; i <= number; i++) {
      result += i;
    }
    System.out.println(result);
  }

}
