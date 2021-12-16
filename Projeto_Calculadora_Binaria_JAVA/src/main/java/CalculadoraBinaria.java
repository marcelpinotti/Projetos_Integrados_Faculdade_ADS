import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CalculadoraBinaria {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int resultado;
        int resto;
        List<Integer> valores = new ArrayList<>();


        System.out.print("Digite um número entre 1 e 100: ");
        int numero;
        numero = teclado.nextInt();


        if(numero >= 1 && numero <= 100){
            System.out.print("O número " + numero + " representa o número binário: ");
            while(numero > 0){
                resultado = (int) numero/2;
                resto = (int) numero%2;
                numero = (int) resultado;
                valores.add(resto);
            }

            Collections.reverse(valores);
            int binarioFinal = valores.size();
            for(int j = 0; j < binarioFinal; j++){
                System.out.print(valores.get(j));
            }

            System.out.println("b");

        } else {
            System.out.println("Número inválido. Inicie o programa novamente.");
        }

        teclado.close();
    }
}
