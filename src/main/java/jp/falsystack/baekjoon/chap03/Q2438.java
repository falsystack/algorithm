package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Q2438 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    for (int i = 1; i <= count; i++) {
      System.out.println("*".repeat(i));
    }
  }

}
