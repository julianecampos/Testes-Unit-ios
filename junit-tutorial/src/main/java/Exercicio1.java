import java.util.Scanner;

public class Exercicio1{

    public String classificador(int ano) {

        String classificador = "";

        if(ano>=1900 || ano<=2022) {
            classificador = "Ano válido";
        }
        else {
            classificador = "Ano inválido";
        }
        return classificador;


    }
}