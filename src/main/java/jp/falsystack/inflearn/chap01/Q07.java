package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES",
 * 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 */
public class Q07 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();

    for (int i = 0; i < str.length() / 2; i++) {
      if (!(str.charAt(i) == str.charAt((str.length() - 1) - i))) {
        System.out.println("NO");
        return;
      }
    }
    System.out.println("YES");
  }
}
