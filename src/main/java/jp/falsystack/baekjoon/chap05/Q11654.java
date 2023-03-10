package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      String string = br.readLine();
      string.chars().forEach(System.out::println);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
