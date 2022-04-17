package Congratulation;

import java.util.Objects;
import java.util.Scanner;

public class Congratulation {
    public static void main(String[] args) {
        System.out.println("Сегодня твой праздник?");
        String str = new Scanner(System.in).nextLine();
        if (Objects.equals(str, "Да")) {
            System.out.println("С праздником!");
        } else System.out.println("В другой раз");
    }
}