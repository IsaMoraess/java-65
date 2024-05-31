import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
Exemplos:
Entrada: Saída:
25.01 Intervalo (25,50]
Entrada: Saída:
25.00 Intervalo [0,25]
Entrada: Saída:
100.00 Intervalo (75,100]
Entrada: Saída:
-25.02 Fora de intervalo */
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um valor no intervalo de 0 a 100");
    double valor = sc.nextDouble();
    if (valor >=0 && valor <= 25){
        System.out.println("O valor esta no intervalo de (0,25)");
    }else if ( valor >=25 && valor <= 50){
        System.out.println("o valor esta no intervalo de (25,50)");
    }else if( valor >=50 && valor <= 75){
        System.out.println("O valor esta no intervalo de (50,75)");
    } else if( valor >=75 && valor <=100){
        System.out.println("O valor esta no intervalo de (75,100)");
    }
    }
}
