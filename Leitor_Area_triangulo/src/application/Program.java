package application;
//Projeto que lê o tamanho de cada lado de um triangulo e fala
//qual tem a maior área

import entities.Triagle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main (String [] args){

        //Metodo sem ser orientada a objeto
        /*//Para usar marcadores padrão americano
        Locale.setDefault(Locale.US);

        //Iniciando o scanner para ler os valores
        Scanner sc = new Scanner(System.in);

        //variaveis que recebem as áreas dos triangulos
        double xA, xB, xC, yA, yB, yC;

        //recebendo os valores do primeiro triangulo
        System.out.println("Enter the measure of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        //recebendo os valores do segundo triangulo
        System.out.println("Enter the measure of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();


        //Para calcular a área do triangulo X
        //formula geral para calcular de um triangulo
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));



        p = (yA + yB + yC) / 2.0;
        double areaY= Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        //Imprimindo as áreas do triangulo
        System.out.printf("triangle X area: %.4f\n", areaX);
        System.out.printf("triangle Y area: %.4f\n", areaY);

        //Exibindo um triangulo com a maior área
        if (areaX < areaY){
            System.out.println("the area of triagle Y is grater");
        } else {
            System.out.println("the area of triagle X is grater");
        }
     sc.close();*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //criando variaveis x, y do tipo 'Triagle'
        Triagle x, y;

        //instanciando novo objeto do tipo 'Triagle' (instanciando objeto)
        x = new Triagle();
        y = new Triagle();

        //lendo dados e pondo nos atributos
        System.out.println("Enter the measures of triagle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measurres of triagle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //chamando o metodo para tirar a área dos objetos
        double areaX = x.area();
        double areaY = y.area();

        //Exibindo um triangulo com a maior área
        if (areaX < areaY){
            System.out.println("the area of triagle Y is grater");
        } else {
            System.out.println("the area of triagle X is grater");
        }

        System.out.printf("area of triagle X is: %.2f\n", areaX);
        System.out.printf("area of triagle X is: %.2f\n", areaY);
        sc.close();
    }

}
