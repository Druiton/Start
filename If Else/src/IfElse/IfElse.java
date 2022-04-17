package IfElse;

import java.util.Objects;
import java.util.Scanner;

public class IfElse {
    public static void main(String [] args){
        System.out.println("5+3=?");
        String str = new Scanner(System.in).nextLine();
        if (Objects.equals(str, "8")){
            System.out.println("Да");
        } else System.out.println("Нет");
    }
}