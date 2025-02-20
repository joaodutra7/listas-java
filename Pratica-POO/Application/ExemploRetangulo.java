package Application;

import Entities.Rectangle;

import java.util.Scanner;

public class ExemploRetangulo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.print("Base: ");
        rectangle.width = input.nextDouble();

        System.out.print("Altura: ");
        rectangle.height = input.nextDouble();

        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimetro: " + rectangle.perimeter());
        System.out.println("Diagonal: " + rectangle.diagonal());

    }
}
