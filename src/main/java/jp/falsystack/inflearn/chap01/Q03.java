package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
 * <p>
 * it is time to study
 * it is just time
 */
public class Q03 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] paragraph = br.readLine().split(" ");

    int max = 0;
    String result = "";
    for (String str : paragraph) {
      if (str.length() > max) {
        max = str.length();
        result = str;
      }
    }

    System.out.println(result);

  }

}
