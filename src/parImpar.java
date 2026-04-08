import java.util.Scanner;
public class parImpar {
    static void main() {
    int n1;
    Scanner sc = new Scanner(System.in);
    n1 = sc.nextInt();
    while(n1 != 0){
        if (n1 % 2 == 0){
            IO.println("Número par");
        }else{
            IO.println("Número impar");
        }
        n1 = sc.nextInt();
    }
    }
}
