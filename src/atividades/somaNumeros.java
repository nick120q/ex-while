package atividades;
import java.util.Scanner;
public class somaNumeros {
    static void main() {
        int n1, soma, resultado, somaTotal;
        Scanner sc = new Scanner(System.in);
        n1 = sc.nextInt();
        resultado = 1;
        somaTotal = 0;
        while(resultado <= n1){
            soma = resultado;
            somaTotal += resultado;
            if (n1 != resultado){
                IO.print(soma + "+");
            }else {
                IO.print(soma + "=" + somaTotal);
            }
            resultado++;
        }
    }
}
