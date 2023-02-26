package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2439 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    for (int i = 0; i < count; i++) {
      System.out.print(" ".repeat(count - i - 1) + "*".repeat(i + 1));
      System.out.println();
    }
  }

}
