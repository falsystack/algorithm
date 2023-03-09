package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(br.readLine());
      int[] points = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int sum = 0;
      int num = 0;
      for (int point : points) {
        if (point == 1) {
          num++;
          sum += num;
          continue;
        }
        num = 0;
      }
      System.out.println(sum);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
