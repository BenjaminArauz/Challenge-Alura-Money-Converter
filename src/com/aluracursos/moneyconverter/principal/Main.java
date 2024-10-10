package com.aluracursos.moneyconverter.principal;

import com.aluracursos.moneyconverter.network.MoneyApi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        float result = 0;

        while (option != 7){
            System.out.println("***************************************");
            System.out.println("Be welcome to the Money Converter!");
            showMenu();

            try {
                option = scanner.nextInt();
                if (option < 1 || option > 7){
                    System.out.println("Invalid option");
                } else {
                    System.out.println("Enter the amount you want to convert: ");
                    float quantity = scanner.nextFloat();
                    converter(option, quantity);
                }
            } catch (Exception e){
                System.out.println("Invalid option");
                scanner.next();
                continue;
            }
        }
    }

    public static void showMenu(){
        System.out.println("1 - USD => ARS");
        System.out.println("2 - ARS => USD");
        System.out.println("3 - USD => BRL");
        System.out.println("4 - BRL => USD");
        System.out.println("5 - USD => COP");
        System.out.println("6 - COP => USD");
        System.out.println("7 - Exit");
    }

    public static void converter(int option, float quantity){
        MoneyApi moneyApi = new MoneyApi();
        float result = -1;
        String from = "";
        String to = "";
        switch (option){
            case 1:
                result = moneyApi.convertData("USD", "ARS", quantity);
                from = "USD";
                to = "ARS";
                break;
            case 2:
                result = moneyApi.convertData("ARS", "USD", quantity);
                from = "ARS";
                to = "USD";
                break;
            case 3:
                result = moneyApi.convertData("USD", "BRL", quantity);
                from = "USD";
                to = "BRL";
                break;
            case 4:
                result = moneyApi.convertData("BRL", "USD", quantity);
                from = "BRL";
                to = "USD";
                break;
            case 5:
                result = moneyApi.convertData("USD", "COP", quantity);
                from = "USD";
                to = "COP";
                break;
            case 6:
                result = moneyApi.convertData("COP", "USD", quantity);
                from = "COP";
                to = "USD";
                break;
            case 7:
                result = -1;
                System.out.println("Goodbye!");
                break;
            default:
                result = -1;
                System.out.println("Invalid option");
        }

        if (result != -1){
            System.out.println("The value " + quantity + " [" + from + "] corresponds to the value of " + result + " [" + to + "]");
        }
    }
}
