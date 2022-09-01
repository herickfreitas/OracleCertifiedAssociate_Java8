package _02_Core_Java_API;
import java.util.Arrays;
public class _08_ArraysMultidimensional {
	public static void main(String[] args) {
		String [][] retangulo = new String[3][2]; //Onde, 3 = dimensão e 2 = tamanho
		retangulo[0][1] = "set"; // Desta forma um valor é atribuido
		System.out.println(retangulo[0][1]); //Resultado set
		
		//É possível criar o array atribuindo valores
		int[][] tamanhoDiferente = {{1,2,0},{3,0,0},{9,8,7}};
		for (int i = 0; i < tamanhoDiferente.length; i++) {
			for (int j = 0; j < tamanhoDiferente.length; j++) {
				System.out.print(tamanhoDiferente[i][j]+" ");
			}
			System.out.println();
		}
	}
}