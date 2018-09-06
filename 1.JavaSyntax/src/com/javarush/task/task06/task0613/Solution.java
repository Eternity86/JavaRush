package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        //создай 10 котов
        Cat murzik = new Cat();
        Cat barsik = new Cat();
        Cat tom = new Cat();
        Cat puh = new Cat();
        Cat speedy = new Cat();
        Cat murchik = new Cat();
        Cat lysyi = new Cat();
        Cat urchik = new Cat();
        Cat thomas = new Cat();
        Cat chichik = new Cat();

        //выведи значение переменной catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        //создай статическую переменную catCount
        public static int catCount;

        //создай конструктор
        public Cat() {
            catCount++;
        }

    }
}
