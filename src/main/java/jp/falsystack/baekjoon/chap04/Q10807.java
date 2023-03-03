package jp.falsystack.baekjoon.chap04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
 */
public class Q10807 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    br.readLine();
    IntStream intStream = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt);
    int target = Integer.parseInt(br.readLine());
    int result = intStream.filter(a -> a == target).toArray().length;
    System.out.println(result);
  }

}
