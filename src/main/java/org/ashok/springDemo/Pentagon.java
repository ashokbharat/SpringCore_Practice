package org.ashok.springDemo;

import java.util.ArrayList;
import java.util.List;

public class Pentagon {
  private ArrayList<Point> points;

  public ArrayList<Point> getPoints() {
    return points;
  }

  public void setPoints(ArrayList<Point> points) {
    this.points = points;
  }
  public void draw(){
    for(Point point: points){
      System.out.println("point x co-0rdinate is :" + point.getX() + "point y co-ordinate is :" + point.getY());
    }
  }
}
