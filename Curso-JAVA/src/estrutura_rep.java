import java.util.Locale;
import java.util.Scanner;

public class estrutura_rep {
    public static void main (String [] args){
        //estrutura de repetição, du while:

        /*
        Pegue a temperatura em graus celsio e transforme em fahrenheit
         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        char resp;

        do{
            //gerando a condicional que sera executada pelo menos 1x
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f\n", F);
            System.out.print("Deseja repetir: s/n? ");
            resp = sc.next().charAt(0);

            //criando condicional de resposta, caso 's' repete o "do" | caso 'n' sai do sistema
        } while ( resp != 'n');

        sc.close();
    }
}
