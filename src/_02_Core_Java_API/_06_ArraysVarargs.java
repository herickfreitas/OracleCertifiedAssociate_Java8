package _02_Core_Java_API;
import java.util.Arrays;
public class _06_ArraysVarargs {
	public static void main(String[] args) {
		metodoV("1", "2");
		}
	public static void metodoV(String s1, String... strs) {
		System.out.println(s1);
		System.out.println(strs[0]);
	}
}