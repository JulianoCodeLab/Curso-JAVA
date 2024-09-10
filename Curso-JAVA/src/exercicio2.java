// Uma Operadora de telefonia cobra $50.00 por um plano basico
//que da direito a 100 min de telefone. Cada min que exceder a franquia
//custara $2.00. Fazer um programa para ler a quantidade de min que uma pessoa consumiu,
//e mostrar o valor a ser pago

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main (String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc= new Scanner(System.in);

        //recebendo a quantidade de minutos
        int minutos;
        double valor;
        System.out.println("Quantos minutos?");
        minutos = sc.nextInt();



        //criando condicional
        if (minutos <= 100){
            valor = 50;
            System.out.printf("O valor a ser pago é de $ %.2f", valor);

        }else {
            valor = ((minutos - 100) * 2) + 50;
            System.out.printf("O valor a ser pago é de $ %.2f", valor);
        }
        sc.close();
    }
}
