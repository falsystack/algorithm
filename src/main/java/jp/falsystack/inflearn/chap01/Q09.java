package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * tge0a1h205er -> 1205
 */
public class Q09 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] chars = br.readLine().toCharArray();
    StringBuilder sb = new StringBuilder();
    for (char aChar : chars) {
      if (aChar >= 48 && aChar <= 57) {
        sb.append(aChar);
      }
    }

    System.out.println(Integer.parseInt(sb.toString()));
  }
}
