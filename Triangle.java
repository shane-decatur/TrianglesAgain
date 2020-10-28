public class Triangle{
  private Point v1,v2,v3;

  public Triangle(Point a, Point b, Point c){
    v1 = a;
    v2 = b;
    v3 = c;
  }

  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3){
    v1 = new Point(x1,y1);
    v2 = new Point(x2,y2);
    v3 = new Point(x3,y3);
  }

  public double getPerimeter(){
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
  }

  public double getArea(){
    double s = getPerimeter() / 2;
    double a = v1.distanceTo(v2);
    double b = v1.distanceTo(v3);
    double c = v2.distanceTo(v3);
    double squared = s*(s-a)*(s-b)*(s-c);
    return Math.sqrt(squared);
  }

  public String classify(){
    int equalSides = 1;
    double a = Math.round((v1.distanceTo(v2) * 10000)) / 10000.0;
    double b = Math.round((v1.distanceTo(v3) * 10000)) / 10000.0;
    double c = Math.round((v2.distanceTo(v3) * 10000)) / 10000.0;
    if (a == b) equalSides++;
    if (a == c) equalSides++;
    if (equalSides == 3) {
      return "equilateral";
    }
    if (equalSides == 2) {
      return "isosceles";
    }
    else {
      return "scalene";
    }
  }
}
