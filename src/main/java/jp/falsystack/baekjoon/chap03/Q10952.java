package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Q10952 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      String[] strings = br.readLine().split(" ");
      int a = Integer.parseInt(strings[0]);
      int b = Integer.parseInt(strings[1]);

      if (a == 0 && b == 0) {
        return;
      }

      System.out.println(a + b);
    }
  }

}
