package _02_Core_Java_API;
public class _04_Arrays {
	public static void main(String[] args) {
		//[] - s�o inseridos em uma vari�vel que referecia um array
        int[] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARA��O DE ARRAY
        int[] b;
        b = new int[10];
        //DECLARANDO V�RIOS ARRAYS
        int[] r = new int[44], k = new int[23];
        //{} - inicializar valores em um array sua declara��o
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
        //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;
        //ALOCA MEM�RIA PARA 10 INTEIROS
        meuArray = new int[10];
        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray [0] = 100;
        meuArray [1] = 85;
        meuArray [2] = 88;
        meuArray [3] = 93;
        meuArray [4] = 123;
        meuArray [5] = 952;
        meuArray [6] = 344;
        meuArray [7] = 233;
        meuArray [8] = 622;
        meuArray [9] = 8522;
        //meuArray [10] = 564; //ESTOURA A PILHA POIS N�O EXISTE O �NDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
	
        System.out.println(meuArray.length); 
        //Aten��o, � uma propriedade e n�o um m�todo quando string
	}
}