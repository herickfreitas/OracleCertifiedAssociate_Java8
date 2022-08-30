package _01_Operadores_e_Instrucoes;

//import java.io.*;
class ExemploLoopAninhado {

	/*// Exemplo 01
	public static void print2D(int mat[][])
    {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String args[]) throws IOException
    {
        int mat[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 8, 7, 6 } };
        print2D(mat);
    }*/
    
	// Exemplo 02
	public static void main(String args[]) {
		String[][] ArrayComplexo = 
			{{"Herick","João","Igor","Carlos"},{"Leandro","Daniel","Fabio","Manoel"},{"Walter","Rogerio","Marcos","Joaquim"}};
			for (String[] ArraySimple : ArrayComplexo){
				for (int i=0; i<ArraySimple.length; i++ ) {
					System.out.print(ArraySimple[i]+"\t");
				}
				System.out.println();
			}
	}
	
	
}


