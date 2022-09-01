package _02_Core_Java_API;
import java.util.Arrays;
public class _06_ArraysBinarySearch {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1 };
		System.out.println(Arrays.binarySearch(numbers, 2)); //Resultado 1
		System.out.println(Arrays.binarySearch(numbers, 3)); //Resultado -4
		Arrays.sort(numbers); // Ordenando array
		System.out.println(Arrays.binarySearch(numbers, 2)); //Resultado 1
		System.out.println(Arrays.binarySearch(numbers, 3)); //Resultado 2
		}
}