package com.startjava.lesson_1.conditionalStatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 30;
        if (age > 20) {
            System.out.println("Возраст больше двадцати");
        }

        boolean isMale = true;
        if (isMale) {
            System.out.println("Мужской пол");
        }

        if (!isMale) {
            System.out.println("Женский пол");
        }

        double height = 1.74;
        if (height < 1.80) {
            System.out.println("Рост меньше  1.80");
        } else {
            System.out.println("Рост больше 1.80");
        }

        char firstLetter = 'A';
        if (firstLetter == 'М') {
            System.out.println("Имя начинается с буквы М");
        } else if (firstLetter == 'И') {
            System.out.println("Имя начинается с буквы И");
        } else {
            System.out.println("Имя начинается с другой буквы");
        }
    }
}