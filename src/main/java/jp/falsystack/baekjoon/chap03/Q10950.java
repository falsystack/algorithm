package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 */
public class Q10950 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int counts = Integer.parseInt(br.readLine());
    long start = System.currentTimeMillis();
    for (int i = 0; i < counts; i++) {
      // stream.mapToInt -> 16ms,
      // Integer.parseInt -> 2ms,
//      int[] lines = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//      System.out.println(lines[0] + lines[1]);
      String[] lines = br.readLine().split(" ");
      System.out.println(Integer.parseInt(lines[0]) + Integer.parseInt(lines[1]));
    }
    long finish = System.currentTimeMillis();
    System.out.println(finish - start + "ms");

  }

}
