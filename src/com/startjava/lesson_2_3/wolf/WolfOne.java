//Модифицированный класс Wolf
package com.startjava.lesson_02_03.wolf;

public class WolfOne {

    private String gender;
    private String nickname;
    private float weight;
    private int age;
    private String color;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
        }
        this.age = age;
    }

    public String getСolor() {
        return color;
    }

    public void setСolor(String color) {
        this.color = color;
    }

    public void move() {
        System.out.println("Волк идёт");
    }

    public void sit() {
        System.out.println("Волк сидит");
    }

    public void run() {
        System.out.println("Волк бежит");
    }

    public void howl() {
        System.out.println("Волк воет");
    }

    public void hunt() {
        System.out.println("Волк охотится");
    }
}