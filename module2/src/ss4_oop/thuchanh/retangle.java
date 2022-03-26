package ss4_oop.thuchanh;

import java.util.Scanner;

public class retangle {
    private static retangle rectangle;
    double width, height;

    public retangle(){
    }

    public retangle(double width,double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.height * this.width;
    }
    public double getPerimeter(){
        return (this.width + this.width) * 2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width");
        double width = scanner.nextDouble();
        System.out.println("enter height");
        double height = scanner.nextDouble();
        retangle retangle=new retangle(width,height);
        System.out.println("Your Rectangle '<br>'"+ rectangle.display());
        System.out.println("Perimeter of the Rectangle: "+ rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rectangle.getArea());
    }
}


