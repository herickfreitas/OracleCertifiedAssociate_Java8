package Operadores_e_Instrucoes;
import java.util.*;
public class ExemploForEach {
    public static void main(String args[]) {
    	List<String> cidades = new ArrayList<String>();
    	cidades.add("Curitiba");
    	cidades.add("S�o Paulo");
    	cidades.add("Rio de Janeiro");
    	cidades.add("Salvador");
    	cidades.add("Esp�rito Santo");
    	cidades.add("Rio Grande do Sul");
    	 
    	for (String cidade : cidades) {
    	    System.out.println(cidade);
    	}
    }
} 