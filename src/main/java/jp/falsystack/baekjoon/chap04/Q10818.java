package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 */
public class Q10818 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int max = Arrays.stream(numbers).max().orElseThrow(() -> new RuntimeException("no number"));
    int min = Arrays.stream(numbers).min().orElseThrow(() -> new RuntimeException("no number"));
    System.out.println(min + " " + max);
  }
}
