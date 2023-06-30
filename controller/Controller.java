package controller;

import java.util.Scanner;

import model.FirstNamber;
import model.SecondNumber;
import service.Difference;
import service.Division;
import service.Multiplication;
import service.Sum;

public class Controller {
    public void Enter() {
        int numberFirst;
        int numberSecond;
        Character action;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое комплексное число");
        System.out.print("       Введите вещественное число: ");
        numberFirst = scanner.nextInt();
        System.out.print("           Введите вещественное число мнимой единицы: ");
        numberSecond = scanner.nextInt();

        FirstNamber firstNamber = new FirstNamber(numberFirst, numberSecond);

        System.out.println("Введите второе комплексное число");
        System.out.print("       Введите вещественное число: ");
        numberFirst = scanner.nextInt();
        System.out.print("           Введите вещественное число мнимой единицы: ");
        numberSecond = scanner.nextInt();
        SecondNumber secondNumber = new SecondNumber(numberFirst, numberSecond);

        System.out.print("Введите действие: ");
        action = scanner.next().trim().charAt(0);
        scanner.close();
        switch (action) {
            case '+':
                Sum sum = new Sum();
                sum.exampl(firstNamber, secondNumber);

                break;
            case '-':
                Difference difference = new Difference();
                difference.exampl(firstNamber, secondNumber);

                break;
            case '*':
                Multiplication multiplication = new Multiplication();
                multiplication.exampl(firstNamber, secondNumber);

                break;
            case '/':
                Division division = new Division();
                division.exampl(firstNamber, secondNumber);

                break;

        }

    }
}
