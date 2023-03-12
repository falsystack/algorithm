package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2675 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(br.readLine());

      for (int i = 0; i < count; i++) {
        String[] strs = br.readLine().split(" ");
        int repeatNumber = Integer.parseInt(strs[0]);
        String word = strs[1];
        for (char aChar : word.toCharArray()) {
          System.out.print((String.valueOf(aChar)).repeat(repeatNumber));
        }
        System.out.println();
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
