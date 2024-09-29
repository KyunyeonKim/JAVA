package multi.chap04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
  public int x, y;
  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  @Override
  public int compareTo(Point o) {
    if (this.x == o.x) return this.y - o.y; // 오름차순
    else return this.x - o.x;
  }
  // o.y - this.y는 내림차순
}

public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    ArrayList<Point> arr = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      int x = stdIn.nextInt();
      int y = stdIn.nextInt();
      arr.add(new Point(x, y));
    }
    Collections.sort(arr);
    for (Point o : arr) {
      System.out.println(o.x + " " + o.y);
    }
  }
}