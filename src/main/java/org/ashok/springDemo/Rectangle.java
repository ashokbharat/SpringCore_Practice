package org.ashok.springDemo;

public class Rectangle {
  private Point firstPoint;
  private Point secondPoint;
  private Point thirdPoint;
  private Point fourthPoint;
  
  /*public Rectangle(Point firstPoint, Point secondPoint, Point thirdPoint, Point fourthPoint) {
    super();
    this.firstPoint = firstPoint;
    this.secondPoint = secondPoint;
    this.thirdPoint = thirdPoint;
    this.fourthPoint = fourthPoint;
  }*/
  public Point getFirstPoint() {
    return firstPoint;
  }
  public void setFirstPoint(Point firstPoint) {
    this.firstPoint = firstPoint;
  }
  public Point getSecondPoint() {
    return secondPoint;
  }
  public void setSecondPoint(Point secondPoint) {
    this.secondPoint = secondPoint;
  }
  public Point getThirdPoint() {
    return thirdPoint;
  }
  public void setThirdPoint(Point thirdPoint) {
    this.thirdPoint = thirdPoint;
  }
  public Point getFourthPoint() {
    return fourthPoint;
  }
  public void setFourthPoint(Point fourthPoint) {
    this.fourthPoint = fourthPoint;
  }
  public void draw(){
    System.out.println("firstPoint x co-ordinate is:" + getFirstPoint().getX() + "firstPoint y co-ordinate is:" + getFirstPoint().getY());
    System.out.println("secondPoint x co-ordinate is:" + getSecondPoint().getX() + "secondPoint y co-ordinate is:" + getSecondPoint().getY());
    System.out.println("thirdPoint x co-ordinate is:" + getThirdPoint().getX() + "thirdPoint y co-ordinate is:" + getThirdPoint().getY());
    System.out.println("fourthPoint x co-ordinate is:" + getFourthPoint().getX() + "fourthPoint y co-ordinate is:" + getFourthPoint().getY());
  }
}
