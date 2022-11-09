package Week10;

public class Circle {
    public double radius;
    private int i;
    public Circle(){
        radius = 1.0;
    }
    public Circle(double newRadius){
        radius = newRadius;
    }
    public double computeArea(){
        return  Math.PI * radius * radius;
    }
    public void setVar(){
        i = 20;
        int j = 200; //局部變數
        for (int i = 0; i < 10; i++);
        System.out.println(i);
    }
    public void outputVar(){
        System.out.println(i);
    }
}
