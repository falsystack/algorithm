package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 472
 * 385
 * ---
 * 2360
 * 3776
 * 1416
 * 181720
 */
public class Q2588 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int firstLine = Integer.parseInt(br.readLine());
    String secondLine = br.readLine();
    String[] secondLineSplited = secondLine.split("");
    int secondLineAsNumber = Integer.parseInt(secondLine);
    int secondLineOfThird = Integer.parseInt(secondLineSplited[2]);
    int secondLineOfSecond = Integer.parseInt(secondLineSplited[1]);
    int secondLineOfFirst = Integer.parseInt(secondLineSplited[0]);

    System.out.println(firstLine * secondLineOfThird);
    System.out.println(firstLine * secondLineOfSecond);
    System.out.println(firstLine * secondLineOfFirst);
    System.out.println(firstLine * secondLineAsNumber);
  }

}
