package Entities;

public class Rectangle {
    public double width;
    public double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public double diagonal(){
        double soma = Math.pow(width, 2) + Math.pow(height, 2);
        return Math.sqrt(soma);
    }
}
