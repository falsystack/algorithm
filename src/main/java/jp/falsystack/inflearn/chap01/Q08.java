package jp.falsystack.inflearn.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * found7, time: study; Yduts; emit, 7Dnuof -> YES
 */
public class Q08 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine().toUpperCase();

    String replacedStr = str.replaceAll("[^A-Z]", "");
    StringBuilder reversedStr = new StringBuilder(replacedStr).reverse();

    if (replacedStr.equals(reversedStr.toString())) {
      System.out.println("YES");
      return;
    }
    System.out.println("NO");
  }

}
