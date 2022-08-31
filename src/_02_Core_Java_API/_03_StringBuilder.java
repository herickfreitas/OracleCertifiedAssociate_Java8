package _02_Core_Java_API;

public class _03_StringBuilder {

	public static void main(String[] args) {
		/* METODO APPEND */
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);
		System.out.println(sb); // Resultado 1c-true
		// Todos os conteúdos serão convertidos para String
		
		sb = new StringBuilder("animais");
		sb.insert(7, "-");		//animais-
		sb.insert(0, "-");		//-animais-
		sb.insert(4, "-");		// Resultado -ani-mais-
		System.out.println(sb); 
		
		sb.delete(1, 3);
		System.out.println(sb); // Resultado -i-mais-
		sb.deleteCharAt(15);	// Exception - String index out of range
	}
}
