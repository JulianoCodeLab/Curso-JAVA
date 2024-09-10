//Estrutura de controle

import java.util.Scanner;

public class estrutura_cond {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas?");
        hora = sc.nextInt();

        if(hora < 12){
            System.out.println("Bom dia");
        }else if (hora < 18){
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }




        sc.close();

        // condicional ternaria -> otimização do if

        double preco = 34.5;
        //double desconto;

        /*if (preco < 20.0){
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.5;
        }*/

        double desconto = (preco < 20) ? preco * 0.1 : preco * 0.5;
    }
}



