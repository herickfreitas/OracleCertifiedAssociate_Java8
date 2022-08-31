package _02_Core_Java_API;
public class _02_MetodosString {
	public static void main(String[] args) {
		String string = "animais";
		System.out.println(string.length()); 	// Retorna o tamanho da string 	// resultado 7

		System.out.println(string.charAt(0)); 	// Retorna o caracter no indice solicitado // Resultado a
		System.out.println(string.charAt(6));	// Resultado s
		//System.out.println(string.charAt(8));	// Exception - StringIndexOutOfBoundsException
		
		System.out.println(string.indexOf("n"));   	// Resultado 1
		System.out.println(string.indexOf("ai"));  	// Resultado 4 apartir da posição
		System.out.println(string.indexOf("a", 4));	// Resultado 4, irá procurar apartir do indice 4
		System.out.println(string.indexOf("z"));	// Resultado -1, não encontrado
		
		System.out.println(string.substring(4));	// Resultado ais
		System.out.println(string.substring(4,6));	// Resultado ai
		System.out.println(string.substring(string.indexOf("m"))); // Resultado mais
		
		System.out.println(string.toUpperCase());  		// Resultado ANIMAIS
		System.out.println("AbCDF1234".toLowerCase());  // Resultado abcdf1234
	
		System.out.println("abc".equals("ABC"));			// false
		System.out.println("ABC".equals("ABC"));			// true
		System.out.println("abc".equalsIgnoreCase("ABC"));	// true
		
		System.out.println("abc".startsWith("a"));	// Começa com a letra? true
		System.out.println("ABC".startsWith("A"));	// Começa com a letra? true
		System.out.println("abc".endsWith("c"));	// Termina com a letra? true
		System.out.println("ABC".endsWith("C"));	// Termina com a letra? true
		
		System.out.println("abc".contains("a"));	// Contem a contraint? true
		System.out.println("abc".contains("A"));	// Contem a contraint? false
		
		System.out.println(string.replace("ai", "ea"));	// Resultado animeas
		
		System.out.println("\t	accv".trim());	// Removendo espaços - accv
	}

}
