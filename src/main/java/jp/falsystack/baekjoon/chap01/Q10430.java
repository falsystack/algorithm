package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 */
public class Q10430 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] numbers = Arrays.stream(br.readLine().split(" "))
        .mapToInt(Integer::parseInt)
        .toArray();

    System.out.println(expression1(numbers[0], numbers[1], numbers[2]));
    System.out.println(expression3(numbers[0], numbers[1], numbers[2]));

    System.out.println(expression2(numbers[0], numbers[1], numbers[2]));
    System.out.println(expression4(numbers[0], numbers[1], numbers[2]));
  }

  private static int expression1(int A, int B, int C) {
    return (A + B) % C;
  }

  private static int expression2(int A, int B, int C) {
    return (A * B) % C;
  }

  private static int expression3(int A, int B, int C) {
    return ((A % C) + (B % C)) % C;
  }

  private static int expression4(int A, int B, int C) {
    return ((A % C) * (B % C)) % C;
  }
}
