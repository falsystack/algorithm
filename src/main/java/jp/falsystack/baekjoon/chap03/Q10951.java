package jp.falsystack.baekjoon.chap03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10951 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    while (true) {
      String str = br.readLine();
      if (str == null || str.equals("")) {
        break;
      }
      String[] strings = str.split(" ");
      int A = Integer.parseInt(strings[0]);
      int B = Integer.parseInt(strings[1]);
      System.out.println(A + B);
    }
  }

}
