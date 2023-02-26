package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요. (첫 번째 수는 무조건 출력한다)
 */
public class Q01 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    String[] lines = br.readLine().split(" ");
    int[] numbers = new int[count];

    for (int i = 0; i < count; i++) {
      numbers[i] = Integer.parseInt(lines[i]);
    }

    System.out.print(numbers[0]);
    for (int i = 0; i < count - 1; i++) {
      if (numbers[i] <= numbers[i + 1]) {
        System.out.print(" " + numbers[i + 1]);
      }
    }
  }

}
