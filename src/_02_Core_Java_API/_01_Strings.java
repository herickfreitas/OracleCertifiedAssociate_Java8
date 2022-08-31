package _02_Core_Java_API;
public class _01_Strings {
	public static void main(String[] args) {
		// Declarando Strings
		String nome  = "Herick"; 				// Exemplo 1
		String nome_ = new String("Herick");	// Exemplo 2
		
		// Quando tratamos de String o + faz a concatenação
		System.out.println(1 + 2);			// 3
		System.out.println("a" + "b");		//ab
		System.out.println("a" + "b" + 3);	//ab3
		System.out.println(1 + 2 + "c");	//3c
		
		// Imutabilidade String
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); // 123 mas s2 não será alterado
		System.out.println(s2); //Resultado 12 // s1 não foi modificado
	}
}