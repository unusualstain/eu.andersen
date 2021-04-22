package Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String a = scanner.next();
        String b = new String("Вячеслав");

        if (a.equals(b)){
            System.out.println("Привет Вячеслав");
        }else{
            System.out.println("Нет такого имени");
        }
    }
}
