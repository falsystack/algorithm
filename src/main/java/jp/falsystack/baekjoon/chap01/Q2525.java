package jp.falsystack.baekjoon.chap01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2525 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] strTimes = br.readLine().split(" ");
    int hour = Integer.parseInt(strTimes[0]) * 60;
    int minute = Integer.parseInt(strTimes[1]);
    int cookingTime = Integer.parseInt(br.readLine());

    int totalTime = hour + minute + cookingTime;
    if (totalTime > 1440) {
      totalTime -= 1440;
    }
    int resultHour = totalTime / 60 == 24 ? 0 : totalTime / 60;
    int resultMin = totalTime % 60;

    System.out.println(resultHour+ " " +resultMin);
  }

}
