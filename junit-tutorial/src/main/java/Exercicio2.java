import java.util.Scanner;

public class Exercicio2{

    public String classificador(int nota) {

        String classificador = "";

        if(nota>=0 || nota<=10) {
            classificador = "Nota válida";
        }
        else {
            classificador = "Nota inválida";
        }
        return classificador;


    }
}