package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q11720 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      br.readLine();
      int sum = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt)
          .reduce(0, (prev, cur) -> prev += cur);
      System.out.println(sum);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
