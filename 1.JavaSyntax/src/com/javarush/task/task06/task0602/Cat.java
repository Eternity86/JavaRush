package com.javarush.task.task06.task0602;

/* 
Пустые кошки, пустые псы
*/

public class Cat {
    public static void main(String[] args) {

    }
    public Cat() {

    }

    //напишите тут ваш код
    public void finalize() {
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    //напишите тут ваш код
    public void finalize() {
        System.out.println("Dog was destroyed");
    }
    public Dog() {

    }
}
