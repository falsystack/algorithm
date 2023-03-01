package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 */
public class Q10871 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int target = numbers[1];

    Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
        .filter(num -> num < target).forEach(num -> System.out.print(num + " "));
    br.close();
  }

}
