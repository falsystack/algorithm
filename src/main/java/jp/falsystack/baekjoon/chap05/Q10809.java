package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10809 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
          'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

      String word = br.readLine();

      for (char c : alphabet) {
        System.out.print(word.indexOf(c) + " ");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

}
