import java.util.Scanner;

public class swith_case {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        String dia;

        switch (x){
            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda-Feira";
                break;

            case 3:
                dia = "terça-Feira";
                break;

            case 4:
                dia = "Quarta-Feira";
                break;

            case 5:
                dia = "Quinta-Feira";
                break;

            case 6:
                dia = "Sexta-Feira";
                break;

            case 7:
                dia = "Sabado-Feira";
                break;
            default:
                dia = "valor invalido";
            break;

        }
    System.out.println("Dia da semana: " + dia);
        sc.close();

    }

}
