package Operator;

import java.util.Date;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        System.out.println("Введите ваш возраст");
        int age = new Scanner(System.in).nextInt();
        System.out.println("сколько сейчас времени");
        int time = new Scanner(System.in).nextInt();
        if (age < 18){
            System.out.println("Нельзя");
        } else if(age > 18 && age < 100 && time < 22 ) {
            System.out.println("Можно");
        } else if(age > 18 && age < 100 && time >= 22) {
            System.out.println("нельзя");
        } else System.out.println("Ты пьян, иди домой");
    }
}
