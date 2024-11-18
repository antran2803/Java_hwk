

abstract class Shape{
    public String color="Red";
   public boolean filled= true;
   public double radius;

   public Shape(){}
    public Shape(double radius,String color, boolean filled ) {
        this.color=color ;
        this.filled=filled;
        this.radius=radius;
    }
    public String getColor(){
       return color;
    }
    public void setColor(String color) {
       this.color=color;
    }
    public boolean isFilled() {
       this.filled= filled;
       return true;
    }
    public void setFilled(boolean filled){
    }
    abstract double getArea ();
    abstract double Perimeter();
     public String toString(){
    return color;
    }
}
 class Circle extends Shape {
    double radius=1.0;
    Circle(){}
    Circle(double radius){
        this.radius=radius;
    }
    Circle(double radius, String color, boolean filled){}
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){}
    public double getArea () {
        return Math.PI* (radius*radius);
    }

     @Override
     double Perimeter() {
         return 0;
     }

     public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public String toString (){
         this.radius=radius;
         return String.valueOf(radius);
    }
}

