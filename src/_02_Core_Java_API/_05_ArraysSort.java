package _02_Core_Java_API;
import java.util.Arrays;
public class _05_ArraysSort {
	public static void main(String[] args) {
		String[] strings = {"Manoel","Zebra","Julia","Antônio","Herick"};
		Arrays.sort(strings);
		//Exibindo string ordenado
		for( String string : strings){
			System.out.print(string + " ");
		}
	}
}