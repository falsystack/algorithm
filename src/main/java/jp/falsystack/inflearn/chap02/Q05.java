package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 소수 구하기(에라토스테네스 체: 소수구하는 방법중 가장 빠르다.)
 * 소수의 갯수
 */
public class Q05 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int len = Integer.parseInt(br.readLine());
    int[] ch = new int[len + 1];
    int result = 0;
    for (int i = 2; i <= len; i++) {
      if (ch[i] == 0) {
        result++;
        for (int j = i; j < len; j = j + i) {
          ch[j] = 1;
        }
      }
    }
    System.out.println(result);
  }
}
