package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9086 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int counts = Integer.parseInt(br.readLine());
      for (int i = 0; i < counts; i++) {
        StringBuilder result = new StringBuilder();
        String strings = br.readLine();
        char first = strings.charAt(0);
        char last = strings.charAt(strings.length() - 1);
        result.append(first);
        result.append(last);
        System.out.println(result);
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
