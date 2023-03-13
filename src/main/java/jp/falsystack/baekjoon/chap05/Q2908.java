package jp.falsystack.baekjoon.chap05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class Q2908 {

  public static void main(String[] args) {
    ReverseNumber reverseNumber = new ReverseNumber();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      IntStream intStream = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt);
      int max = intStream.map(reverseNumber::apply).max()
          .orElseThrow(() -> new RuntimeException("no max"));

      System.out.println(max);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static class ReverseNumber implements UnaryOperator<Integer> {

    @Override
    public Integer apply(Integer number) {
      int newNumber = number;
      int result = 0;
      while (newNumber > 0) {
        int lastNumber = newNumber % 10;
        result = (result * 10) + lastNumber;
        newNumber = newNumber / 10;
      }
      return result;
    }
  }

}
