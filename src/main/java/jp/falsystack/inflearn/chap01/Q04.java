package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
 * <p>
 * 3 good Time Big
 */
public class Q04 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int count = Integer.parseInt(br.readLine());

    ArrayList<String> words = new ArrayList<>();
    for (int i = 0; i < count; i++) {
      words.add(br.readLine());
    }

    for (String word : words) {
      char[] chars = word.toCharArray();
      StringBuilder sb = new StringBuilder();
      for (int j = chars.length - 1; j >= 0; j--) {
        sb.append(chars[j]);
      }
      System.out.println(sb);
    }
  }

}
