package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다. 검정색 피스는 모두 있었으나, 흰색 피스는 개수가
 * 올바르지 않았다. 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
 */
public class Q3003 {

  public static void main(String[] args) throws IOException {

    int[] black = {1, 1, 2, 2, 2, 8};
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] str = br.readLine().split(" ");
    int[] whites = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
    for (int i = 0; i < black.length; i++) {
      System.out.print(black[i] - whites[i] + " ");
    }
  }

}
