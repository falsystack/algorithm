package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자 찾기
 * 文字探し
 */
public class Q01 {

  public static void main(String[] args) throws IOException {
    char[] chars = getChars();
    char target = getTarget();
    int count = 0;
    for (char aChar : chars) {
      if (isEqual(target, aChar)) {
        count++;
      }
    }
    System.out.println(count);
  }

  private static String getString() throws IOException {
    return new BufferedReader(new InputStreamReader(System.in)).readLine();
  }

  private static char getTarget() throws IOException {
    return getString().toUpperCase().charAt(0);
  }

  private static char[] getChars() throws IOException {
    return getString().toUpperCase().toCharArray();
  }

  private static boolean isEqual(char target, char aChar) {
    return aChar == target;
  }
}
