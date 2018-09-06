package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("Ivan", true, 13);
        Human child2 = new Human("Sophia", false, 4);
        Human child3 = new Human("Max", true, 1);
        ArrayList<Human> childrens = new ArrayList<>();
        childrens.add(child1);
        childrens.add(child2);
        childrens.add(child3);

        Human father = new Human("Pyotr", true, 38, childrens);
        Human mother = new Human("Sveta", false, 34, childrens);
        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(father);
        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(mother);

        Human grandFather1 = new Human("Vasya", true, 70, parent1);
        Human grandFather2 = new Human("Kolya", true, 68, parent2);
        Human grandMother1 = new Human("Klava", false, 65, parent1);
        Human grandMother2 = new Human("Tanya", false, 66, parent2);

        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather1);
        System.out.println(grandFather2);
        System.out.println(grandMother1);
        System.out.println(grandMother2);



    }

    public static class Human {
        //напишите тут ваш код
        String name;
        Boolean sex;
        Integer age;
        ArrayList<Human> children;

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            try {
                int childCount = this.children.size();

            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            }
            catch (NullPointerException e) {
                text += "";
            }

            return text;
        }

        public Human(String name, Boolean sex, Integer age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, Boolean sex, Integer age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
    }

}
