package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
 * 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
 * 배열을 이용한 구현
 */
public class Q04 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int[] numbers = new int[num];
    numbers[0] = 1;
    numbers[1] = 1;

    for (int i = 2; i < num; i++) {
      numbers[i] = numbers[i - 2] + numbers[i - 1];
    }
    Arrays.stream(numbers).forEach(System.out::println);
  }
}
