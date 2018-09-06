package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man manJohn = new Man("John", 25, "Russia");
        Man manBill = new Man("Bill", 32, "Ukraine");
        Woman womanJill = new Woman("Jill", 22, "USA");
        Woman womanKatie = new Woman("Katie", 28, "Germany");
        System.out.println(manJohn.name + " " + manJohn.age + " " + manJohn.address);
        System.out.println(manBill.name + " " + manBill.age + " " + manBill.address);
        System.out.println(womanJill.name + " " + womanJill.age + " " + womanJill.address);
        System.out.println(womanKatie.name + " " + womanKatie.age + " " + womanKatie.address);

    }

    //напишите тут ваш код
    public static class Man {
        private String name;
        private int age;
        private String address;


        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
