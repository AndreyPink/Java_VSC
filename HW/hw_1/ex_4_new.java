package HW.hw_1;

import java.util.Scanner;

public class ex_4_new {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Введите первое двузначное слагаемое: ");
        String a = sc.nextLine();
        System.out.println("Введите второе двузначное слагаемое: ");
        String b = sc.nextLine();
        System.out.println("Введите двузначную сумму слагаемых: ");
        String c = sc.nextLine();

        int[] MasA = new int[a.length()];
        int[] MasB = new int[b.length()];
        int[] MasC = new int[c.length()];

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < a.length(); i++) {

                if (Character.isDigit(a.toCharArray()[i]))
                    MasA[i] = Character.digit(a.toCharArray()[i], 10);
                else
                    MasA[i] = j;
            }
            StringBuilder stringA = new StringBuilder();
            for(int i=0; i < MasA.length; i++)
            stringA.append(MasA[i]);
            int newA = Integer.parseInt(stringA.toString());

            for (int i = 0; i < b.length(); i++) {

                if (Character.isDigit(b.toCharArray()[i]))
                    MasB[i] = Character.digit(b.toCharArray()[i], 10);
                else
                    MasB[i] = j;
            }
            StringBuilder stringB = new StringBuilder();
            for(int i=0; i < MasB.length; i++)
            stringB.append(MasB[i]);
            int newB = Integer.parseInt(stringB.toString());

            for (int i = 0; i < c.length(); i++) {

                if (Character.isDigit(c.toCharArray()[i]))
                    MasC[i] = Character.digit(c.toCharArray()[i], 10);
                else
                    MasC[i] = j;
            }
            StringBuilder stringC = new StringBuilder();
            for(int i=0; i < MasC.length; i++)
            stringC.append(MasC[i]);
            int newC = Integer.parseInt(stringC.toString());

            if (newA + newB == newC) {
                System.out.printf("Решение данного уравнения: %d + %d = %d", newA, newB, newC);
                check = true;
            }
        }
        if (check == false)
            System.out.println("У данного уравнения нет решения");
        sc.close();
    }
}