package Operadores_e_Instrucoes;
import java.util.*;
public class ExemploForEach {
    public static void main(String args[]) {
    	List<String> cidades = new ArrayList<String>();
    	cidades.add("Curitiba");
    	cidades.add("São Paulo");
    	cidades.add("Rio de Janeiro");
    	cidades.add("Salvador");
    	cidades.add("Espírito Santo");
    	cidades.add("Rio Grande do Sul");
    	 
    	for (String cidade : cidades) {
    	    System.out.println(cidade);
    	}
    }
} 