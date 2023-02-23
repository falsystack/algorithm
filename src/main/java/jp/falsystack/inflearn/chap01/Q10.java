package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 */
public class Q10 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strs = br.readLine().split(" ");
    String paragraph = strs[0];
    String target = strs[1];

    int tmp = 1000;
    int[] result = new int[paragraph.length()];

    for (int i = 0; i < paragraph.length(); i++) {
      if (paragraph.charAt(i) == target.charAt(0)) {
        tmp = 0;
      } else {
        tmp++;
      }
      result[i] = tmp;
    }

    tmp = 1000;
    for (int i = paragraph.length() - 1; i >= 0; i--) {
      if (paragraph.charAt(i) == target.charAt(0)) {
        tmp = 0;
        result[i] = tmp;
      } else {
        tmp++;
        result[i] = Math.min(result[i], tmp);
      }
    }

    for (int i : result) {
      System.out.print(i + " ");
    }
  }

}
