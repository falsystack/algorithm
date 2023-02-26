package jp.falsystack.baekjoon.chap02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2884 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String[] times = br.readLine().split(" ");

    int convertedHour = Integer.parseInt(times[0]);
    int convertedMin = Integer.parseInt(times[1]);

    int hour = convertedHour == 0 ? 24 * 60 : convertedHour * 60;

    int total = ((hour + convertedMin) - 45);

    int alarmHour = total / 60 == 24 ? 0 : total / 60;
    int alarmMin = total % 60;
    System.out.print(alarmHour + " " + alarmMin);

  }

}
