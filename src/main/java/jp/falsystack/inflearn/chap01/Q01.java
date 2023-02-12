package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자 찾기
 */
public class Q01 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();
    char target = br.readLine().charAt(0);
    int count = 0;
    for (char aChar : chars) {
      if (Character.toUpperCase(aChar) == Character.toUpperCase(target)) {
        count++;
      }
    }
    System.out.println(count);
  }
}
