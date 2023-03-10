package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q27866 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String strings = br.readLine();
      int pointer = Integer.parseInt(br.readLine()) - 1;
      System.out.println(strings.charAt(pointer));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

}
