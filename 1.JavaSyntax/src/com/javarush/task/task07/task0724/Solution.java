package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human Katya = new Human("Катя", false, 55);
        Human Vasya = new Human("Вася", true, 66);
        Human Dasha = new Human("Даша", false, 58);
        Human Ivan = new Human("Иван", true, 63);
        Human Vova = new Human("Вова", true, 40, Vasya, Katya);
        Human Inna = new Human("Инна", false, 36, Dasha, Ivan);
        Human Petr = new Human("Петр", true, 10, Vova, Inna);
        Human Marie = new Human("Мария", false, 6, Vova, Inna);
        Human Anton = new Human("Антон", true, 3, Vova, Inna);

        System.out.println(Katya);
        System.out.println(Vasya);
        System.out.println(Dasha);
        System.out.println(Ivan);
        System.out.println(Vova);
        System.out.println(Inna);
        System.out.println(Petr);
        System.out.println(Marie);
        System.out.println(Anton);

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















