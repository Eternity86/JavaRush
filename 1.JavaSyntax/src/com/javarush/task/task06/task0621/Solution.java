package com.javarush.task.task06.task0621;

import javax.swing.text.AttributeSet;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandpaName = reader.readLine();

        String grandmaName = reader.readLine();
        String fatherName = reader.readLine();
        String motherName = reader.readLine();
        String sonName = reader.readLine();
        String daughterName = reader.readLine();

        Cat catGrandpa = new Cat(grandpaName, null, null);
        Cat catGrandma = new Cat(grandmaName, null, null);
        Cat catFather = new Cat(fatherName, null, catGrandpa);
        Cat catMother = new Cat(motherName, catGrandma, null);
        Cat catSon = new Cat(sonName, catMother, catFather);
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandpa);
        System.out.println(catGrandma);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        /*Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = null;
        }*/

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father == null) {
                return "Cat name is " + name + ", no mother, no father";
            } else if (mother == null) {
                return "Cat name is " + name + ", no mother, father is " + father.name;
            } else if (father == null) {
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            } else return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
