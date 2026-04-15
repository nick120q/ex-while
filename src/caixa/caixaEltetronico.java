package caixa;

import java.util.Scanner;

public class caixaEltetronico {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nome;
        int opcao;
        double monetario, saque, deposito;
        boolean sair, cadastro;
        sair = false;
        cadastro = false;
        monetario = 0;
        do {
            sair = false;
            IO.print("-------------------------------\n" +
                    "BEM VINDO AO CAIXA ELETRONICO DO NICK'S BURGER\n" +
                    "Caixa mais 67 que você irá conhecer B)\n" +
                    "1-Login\n" +
                    "2-Sacar e depositar(FAÇA O LOGIN PRIMEIRO67)\n" +
                    "3-Sair\n");
            opcao = sc.nextInt();
            if (opcao == 1){
                IO.println("Login\n" +
                        "1-Cadastro\n" +
                        "2-sair");
                opcao = sc.nextInt();
                if (opcao == 1){
                    IO.println("----CADASTRO----\n\n" +
                            "Fala seu nome ai patrão\n");
                    nome = sc.next();
                    IO.println("Suave " + nome + " você faz parte da famila nick's burger 67");
                    IO.println("Fala seu monetário em R$");
                    monetario = sc.nextDouble();
                    IO.println("Suave, então você tem R$" + monetario + " para gastar no nick's burger(resenha max)");
                    IO.println("\n CADASTRO CONCLUIDO(+5k aura)\n\n\n\n\n");
                    cadastro = true;
                    sair = true;
                }else{
                    sair = true;
                }
            }else if (opcao == 2 && cadastro){
                IO.println("----SAQUE E DEPOSITO----\n\n" +
                        "1-Saque\n" +
                        "2-Deposito\n" +
                        "3-Sair");
                opcao = sc.nextInt();
                if (opcao == 1){
                    IO.println("----SAQUE----\n\n");
                    IO.println("Fala ai quantos pilas você vai sacar(ESPERO QUE GASTE NO NICK'S BURGER EM)");
                    saque = sc.nextInt();
                    monetario -= saque;
                    IO.println("Sacou R$" + saque + " que VOCE VAI usar no nick's burger neh");
                    sair = true;
                }else if (opcao == 2){
                    IO.println("----DEPÓSITO----\n\n");
                    IO.println("Fala ai quantos pilas você vai adicionar para comprar no Nick's burger");
                    deposito = sc.nextInt();
                    monetario += deposito;
                    IO.println("Você tem R$" + monetario + " para resenhar no nick's burger67");
                    sair = true;
                }else {
                    sair = true;
                }
            }else if (cadastro == false) {
                IO.println("FAZ O CADASTRO RESENHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                sair = true;
            }
        } while(sair);
    }
}
