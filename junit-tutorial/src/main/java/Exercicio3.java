import java.util.Scanner;

public class Exercicio3{

    public String classificador(int idade) {

        String classificador = "";

        if(idade <= 50) {
            classificador = "Renovação a cada 10 anos";
        }
        if(idade > 50 || idade < 70) {
            classificador = "Renovação a cada 5 anos";
        }
        if(idade >= 70) {
            classificador = "Renovação a cada 3 anos";
        }
        return classificador;


    }
}