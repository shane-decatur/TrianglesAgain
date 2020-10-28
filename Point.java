public class Point{
  private double x,y;

  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x=p.x;
    y=p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo(Point other){
    double squares = (other.x-x)*(other.x-x)+(other.y-y)*(other.y-y);
    return Math.sqrt(squares);
  }
}
