package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * max = m
 * n/m*100
 * ex:
 * m = 70, n = 50
 * 50/70 * 100 = 71.43
 */
public class Q1546 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(br.readLine());
      double[] points = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
      double max = Arrays.stream(points).max()
          .orElseThrow(() -> new RuntimeException("no points"));
      double sum = Arrays.stream(points).reduce(0.0, (prev, cur) -> {
        prev += (cur / max) * 100;
        return prev;
      });
      System.out.printf("%.2f",sum/count);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

  }

}
