package jp.falsystack.inflearn.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q06 {

  public static void main(String[] args) {
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      int count = Integer.parseInt(br.readLine());
      String[] numbersStr = br.readLine().split(" ");

      for (int i = 0; i < count; i++) {
        StringBuilder sb = new StringBuilder(numbersStr[i]);
        sb.reverse();
        int number = Integer.parseInt(sb.toString());
        if (isPrime(number)) {
          System.out.print(number + " ");
        }
      }

    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static boolean isPrime(int number) {
    if (number == 0 || number == 1) {
      return false;
    }
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

}
