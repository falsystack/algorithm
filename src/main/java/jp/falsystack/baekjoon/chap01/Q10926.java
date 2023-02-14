package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성
 * joonas -> joonas??!
 */
public class Q10926 {

  public static final String SURPRISED = "??!";

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String result = br.readLine() + SURPRISED;
    System.out.println(result);
  }

}
