package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Q11022 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    int count = Integer.parseInt(br.readLine());
    for (int i = 1; i <= count; i++) {
      String[] numbers = br.readLine().split(" ");
      int a = Integer.parseInt(numbers[0]);
      int b = Integer.parseInt(numbers[1]);
      int sum = a + b;
      bw.write("Case #"+ i +": " + a + " + "  + b + " = " + sum + "\n");
    }
    bw.flush();
  }

}
