package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 * a#b!GE*T@S -> S#T!EG*b@a
 */
public class Q05 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();

    int lpo = 0;
    int rpo = chars.length - 1;

    while (lpo < rpo) {
      if (!Character.isAlphabetic(chars[lpo])) {
        lpo++;
      } else if (!Character.isAlphabetic(chars[rpo])) {
        rpo--;
      } else {
        char temp = chars[lpo];
        chars[lpo] = chars[rpo];
        chars[rpo] = temp;

        lpo++;
        rpo--;
      }
    }

    System.out.println(String.valueOf(chars));
  }
}
