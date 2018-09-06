package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //напишите тут ваш код
        if (this.age * this.weight * this.strength > anotherCat.age * anotherCat.weight * anotherCat.strength) return true;
            else return false;
    }

    public static void main(String[] args) {
        Cat vaska = new Cat();
        Cat barsik = new Cat();
        vaska.age = 2;
        vaska.weight = 2;
        vaska.strength = 2;
        barsik.age = 3;
        barsik.weight = 2;
        barsik.strength = 1;
        vaska.fight(barsik);
        barsik.fight(vaska);

    }
}
