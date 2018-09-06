package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private float height;
        private double weight;
        private ArrayList<Human> parents;
        private ArrayList<Human> children;

        public Human() {

        }
        public Human(String name) {

        }
        public Human(int age) {

        }
        public Human(float weight) {

        }
        public Human(double height) {

        }
        public Human(ArrayList<Human> parents) {

        }
        public Human(ArrayList<Human> parents, ArrayList<Human> children) {

        }
        public Human(String name, int age) {

        }
        public Human(String name, int age, float weight, double height) {

        }
        public Human(String name, int age, float weight, double height, ArrayList<Human> parents, ArrayList<Human> children) {

        }



    }
}
