package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    private double x;
    private double y;
    private double radius;

    //напишите тут ваш код
    public Circle() {
        this.x = 1.0;
        this.y = 1.0;
        this.radius = 1.0;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 1.0;
    }

    public Circle(double x) {
        this.x = x;
        this.y = x;
        this.radius = 1.0;
    }

    public Circle(Circle circ) {
        this.x = circ.x;
        this.y = circ.y;
        this.radius = circ.radius;
    }

    public static void main(String[] args) {

    }
}