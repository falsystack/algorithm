package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 * ASCII 이용 65 ~ 90 대문자 87 ~ 122 소문자 둘의 차이는 32 소문자 - 32 = 대문자
 */
public class Q02 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();

    StringBuilder stringBuilder = new StringBuilder();

    for (char aChar :
        chars) {
      if (isUpperCase(aChar)) {
        char ch = (char) (aChar + 32);
        stringBuilder.append(ch);
        continue;
      }
      char ch = (char) (aChar - 32);
      stringBuilder.append(ch);
    }
    System.out.println(stringBuilder);
  }

  private static boolean isUpperCase(char aChar) {
    return aChar >= 65 && aChar <= 90;
  }
}
