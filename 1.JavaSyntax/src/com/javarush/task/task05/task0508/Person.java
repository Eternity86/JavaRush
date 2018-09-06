package com.javarush.task.task05.task0508;

/* 
Геттеры и сеттеры для класса Person
*/

public class Person {
    //напишите тут ваш код
    protected String name;
    protected int age;
    //protected String address;
    protected char sex;

    /*public Person(String name, int age, String address, char sex) {
        this.name = name;
        this.age = age;
        //this.address = address;
        this.sex = sex;
    }*/
    public void setName(String name) {this.name = name;}
    public String getName() {return this.name;}
    public void setAge(int age) {this.age = age;}
    public int getAge() {return this.age;}
    public void setSex(char sex) {this.sex = sex;}
    public char getSex() {return this.sex;}

    public static void main(String[] args) {

    }
}
