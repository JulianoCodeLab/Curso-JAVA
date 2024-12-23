package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

import static java.text.ChoiceFormat.nextDouble;

public class program {

    public static void main(String[] args){


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));
        Account account ;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there as initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            //sobrecarga de 2 valores
            account = new Account(number, holder);
        }

        //interação com usuario
        System.out.println();
        System.out.println("Account Data: ");
        System.out.println(account);

        System.out.println();

        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(account);


        System.out.println();

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();
    }
}
