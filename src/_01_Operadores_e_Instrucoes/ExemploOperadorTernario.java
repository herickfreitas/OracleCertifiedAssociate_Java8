package _01_Operadores_e_Instrucoes;

public class ExemploOperadorTernario {
	public static void main(String[] args) {
		int media = 8;
		String resultado;
		resultado = (media >= 7) ? "Aprovado!" :  "Reprovado!";
		System.out.println(resultado);
	}
}