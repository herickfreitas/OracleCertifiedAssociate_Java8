package _01_Operadores_e_Instrucoes;

public class ExemploDoWhile {
    public static void main(String args[]) {
        int contador = 0;
        do {
        	System.out.println("Repetição nr: " + contador);
        	contador++;
        }
        while (contador < 50); 
    }
} 