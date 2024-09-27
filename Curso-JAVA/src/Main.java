import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.US;
import static java.util.Locale.setDefault;

public class Main {
    public static void main(String[] args) {
       /* //Inicio do sistema Main
        int y = 32;
        double x = 10.6427;

        //print*ln = quebra linha depois de exibir o que está ();
        System.out.println(y);
        System.out.println(x);

        //print*f serve para formatar casas decimais obs: nescessario o \n ou %n
        //para quebra de linha
        System.out.printf("%.2f\n", x);

        //para usar separador decimal como ','
        //setDefault(US);
        System.out.printf("%.4f\n", x);

        //----------------------------------------------
        //Para concatenar frases com valores
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros\n", x);

        //----------------------------------------------

        //Para concatenar varios elementos em uma frase

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;

        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
//----------------------------------------------------------------------------------------------
        System.out.println("\n");


        //---------------------------------------------------

        //Entrada de dados em JAVA

        Scanner sc = new Scanner(System.in);

       /*
        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();*//*

        //Lendo diferentes ariaveis


        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;


        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados " + x);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    sc.close();*/

        Scanner sc = new Scanner(System.in);

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("Os dados digitados: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        sc.close();
    }
}