package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11382 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strings = br.readLine().split(" ");
    System.out.println(
        Long.parseLong(strings[0]) + Long.parseLong(strings[1]) + Long.parseLong(strings[2])
    );
  }

}
