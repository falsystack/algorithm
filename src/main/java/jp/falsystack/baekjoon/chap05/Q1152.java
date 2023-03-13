package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1152 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      StringTokenizer stringTokenizer = new StringTokenizer(br.readLine().strip());

      System.out.println(stringTokenizer.countTokens());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
