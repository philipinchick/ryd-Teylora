package com.company;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите k: ");
            int k = in.nextInt();
            System.out.print("Введите x: ");
            double x = in.nextDouble();


            System.out.format("СУмма по Телйлору: %.3f", Delat.Summa(k, x));
            System.out.println();
            System.out.format("Арктангенс %.4f равен %.3f градусам ", x, Delat.Tangens(x));
            double delta = Delat.Summa(k, x)-Delat.Tangens(x);
            System.out.println();
            System.out.format("Разность сумм %.3f",delta);



    }
    }


