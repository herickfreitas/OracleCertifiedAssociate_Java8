# OracleCertifiedAssociate_Java8

/* ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ====  */
## _01_Operadores_e_Instrucoes
/* ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ====  */

## 1 - Formatos para implementação de comentários. 
Mais informações em: https://acervolima.com/comentarios-em-java/ 

### Comentários de linha única
```
// Single line comment here
```

### Comentários multilinhas
```
/*Comment starts
continues
continues
Commnent ends*/
```

### Comentários de documentação

```
/**Comment start
*
*tags are used in order to specify a parameter
*or method or heading
*HTML tags can also be used 
*such as <h1>
*
*comment ends*/
```

## 2 - Estrtura de uma Classe. 
Mais informações em: https://www.devmedia.com.br/entendendo-a-estrutura-de-um-codigo-java/24622 

Em uma classe java são colocados os métodos(methods) ,funções ou procedimentos. Todo o código deve estar em alguma classe, pois quando executamos algum aplicativo java nós estamos, na verdade, executando uma classe.

Diferentemente de um arquivo fonte que só pode conter uma classe, uma classe pode conter vários métodos. Em java a classe deve estar em um Arquivo Fonte(Source File) e deve ir com um par de chaves “{}”, são nessas chaves que serão colocados os métodos. Lembrando que uma classe sempre inicia com letra maiúscula.
```
public class MyClass{
public  void meuMetodo(/*argumentos*/){
   }
}
```
<b>public</b> = Refere-se a visibilidade desta classe. Quando dizemos que uma classe é de visibilidade “public” , estamos dizendo que esta classe poderá ser acessada por outras classes.

<b>class</b> = Mostramos que estamos criando uma classe.

<b>MyClass</b> = Refere-se ao nome da classe que estamos criando. Nesse caso , o nome da minha classe será “MyClass”.

<b>{ }</b> = As chaves indicam até onde certa classe ou método se extende. O código que queremos inserir nesta classe deverá ser escrito dentro do espaço das chaves.

## 3 - O método main
Quando o java virtual machine(JVM) inicia, ele procura na sua classe principal por um método muito específico, chamado de método main.

Uma aplicação java obrigatóriamente deverá possuir pelo menos uma classe e um método main, pois é por esse método main que o JVM começará a executar. Como o método main é padrão para qualquer aplicação java, há algumas regras que devem ser cumpridas para o funcionamento desse método. Por regra , todo método main deverá ser : Público, estático , sem retorno(void), com nome de “main”, e deverá receber como argumento um array do tipo String.

```
public class MyClass{
public static void main(String[] args){
   }
}
```
<b>public</b> = Do mesmo modo que um método comum, refere-se a visibilidade deste método. Quando dizemos que o método é de visibilidade “public” , estamos dizendo que este método poderá ser acessado por outras classes.

<b>static</b> = Nos garante que somente haverá uma, e não mais que uma, referência para nosso método main, ou seja, todas as instâncias da classe irão compartilhar a mesma cópia do método main.

<b>void</b> = Assim como um método comum, refere-se ao tipo de retorno que esse método terá. Nesse caso, como o tipo de retorno deve ser “void”, ou seja , “vazio”, esse método não retornará valor nenhum.

<b>(String[] args )</b> = Refere-se aos argumentos que serão passados para esse método, sendo obrigatório no caso do método main

<b>{}</b> = Assim como um método comum , As chaves indicam até onde certa classe ou método se estende. O código que queremos inserir neste método deverá ser escrito dentro do espaço das chaves.

## 4 - Pacotes
Um pacote ou package na tecnologia Java nada mais é do que um conjunto de classes localizadas na mesma estrutura hierárquica de diretórios. Usualmente, são colocadas em um package classes relacionadas, construídas com um propósito comum para promover a reutilização de código; assim, sobre certos aspectos, os packages reproduzem a ideia das bibliotecas de código (libraries e units), de outras linguagens de programação.

![image](https://user-images.githubusercontent.com/28120443/187214871-adc38414-092a-49eb-b88a-10ac61c2ab08.png)


## 5 - Criação de objetos
Uma vez que a classe a partir da qual deseja-se criar o objeto exista, a criação do objeto dá-se através da aplicação do operador new:
```
new NomeDaClasse();
```
Essa expressão invoca o construtor da classe, um (pseudo-)método especial presente em todas as classes.

A aplicação do operador new ao construtor da classe retorna uma referência para o objeto. Para que o objeto possa ser efetivamente manipulado, essa referência deve ser armazenada por quem determinou a criação do objeto:
```
NomeDaClasse umaRef;
umaRef = new NomeDaClasse();

// ou 

NomeDaClasse umaRef = new NomeDaClasse();

```
Nesse exemplo, umaRef é uma variável que guarda uma referência para um objeto do tipo NomeDaClasse. As duas formas apresentadas são equivalentes.

## 6 - Tipos primitivos
![image](https://user-images.githubusercontent.com/28120443/187232098-e63c4f0d-97e0-49fa-8a72-6893f5899230.png)


```
public class Tipos_Primitivos {
	public static void main(String[] args) {
	      byte tipoByte = 127;
	      short tipoShort = 32767;
	      char tipoChar = 'C';
	      float tipoFloat = 2.6f;
	      double tipoDouble = 3.59;
	      int tipoInt = 2147483647;
	      long tipoLong = 9223372036854775807L;
	      boolean tipoBooleano = true;
	      System.out.println("Valor do tipoByte = " + tipoByte);
	      System.out.println("Valor do tipoShort = " + tipoShort);
	      System.out.println("Valor do tipoChar = " + tipoChar);
	      System.out.println("Valor do tipoFloat = " + tipoFloat);
	      System.out.println("Valor do tipoDouble = " + tipoDouble);
	      System.out.println("Valor do tipoInt = " + tipoInt);
	      System.out.println("Valor do tipoLong = " + tipoLong);
	      System.out.println("Valor do tipoBooleano = " + tipoBooleano);
	}
}
```
## 7 - Declaração e inicialização de variáveis
Na linguagem Java, declaramos uma variável informando o tipo de dados que ela poderá receber e seu nome.

<b>Boas práticas</b>

Iniciar o nome com LETRA ou $, nos caracteres seguintes podem haver números e não use palavras reservadas.

Para termos um código limpo, devemos nomear variáveis, funções, parâmetros, classes ou métodos de acordo com suas funcionalidades. Isso é essencial para um bom entendimento do código. Ou seja, nada de variável com nome i para salvar a idade de uma pessoa ou de aux para nomear uma variável com papel de auxiliar.

Geralmente o tamanho usado é de 1 (um) caractere para contadores em loops; 1 (uma) palavra para variáveis de loops e condicionais; 1–2 palavras para nomes de métodos; 2–3 palavras para nomes de classes; 3–4 palavras para nomes de variáveis globais. Não use tamanhos muito longos para nomes de variáveis (mais de 50 caracteres). Caso contrário ficará difícil de ler o código, além de que o mesmo pode não rodar em alguns compiladores por causa da limitação de tamanho das linhas.

Além disso, não use “_” (underscore) em lugar algum exceto para constantes e valores de enums. Não reuse o mesmo nome de variável na mesma classe em diferentes contextos. E outra coisa: decida pelo uso de uma linguagem natural apenas, ou seja, só português ou só inglês.
```
// Compila
int x, y;
int x = 1, y = 2;
int x, y, z = 2; // Somente z foi inicializada
int x; int y;

// Não compila
int x, int y;
int x; y;
int x, String y;
```
## 8 - Ordem elementos na classe
![image](https://user-images.githubusercontent.com/28120443/187253444-8c9323d1-50e5-47de-9a14-c50d0f77d15a.png)

## 9 - Garbage Collection
Mais informações em: https://blog.mandic.com.br/artigos/java-garbage-collection-melhores-praticas-tutoriais-e-muito-mais/

O Java garbage collection é o processo pelo qual os programas Java executam o gerenciamento automático de memória. Os programas Java compilam para bytecode que pode ser executado em um Java Virtual Machine (JVM). Quando os programas Java são executados na JVM, os objetos são criados no heap, que é uma parte da memória dedicada ao programa. Eventualmente, alguns objetos não serão mais necessários. O garbage collector localiza esses objetos não utilizados e os exclui para liberar memória.
![image](https://user-images.githubusercontent.com/28120443/187268082-41547c41-8de9-42d9-bbae-398282223ce8.png)

<b>Young Generation</b>: Os objetos recém-criados começam no Young Generation. O Young Generation é ainda subdividido em um espaço Eden, onde todos os novos objetos se iniciam, e dois espaços Survivor, onde os objetos são movidos do Eden depois de sobreviver a um ciclo do garbage collection. Quando os objetos são coletados ao garbage collection da Young Generation, é um evento menor do garbage collection.

<b>Old Generation</b>: Objetos de longa duração são eventualmente movidos da Young Generation para a Old Generation. Quando os objetos são lixo coletado da Old Generation, é um grande evento de garbage collection.

<b>Permanent Generation</b>: Metadados como classes e métodos são armazenados na Permanent Generation. As classes que não estão mais em uso podem ser coletadas da Permanent Generation.

<b>Melhores práticas em Garbage Collection Java</b>

Para muitos aplicativos simples, o Java garbage collection não é algo que um programador precise conscientemente considerar. No entanto, para programadores que desejam avançar suas habilidades Java, é importante entender como funciona o Java garbage collection e as maneiras pelas quais ele pode ser ajustado.

Além dos mecanismos básicos de garbage collection, um dos pontos mais importantes para entender sobre o garbage collection em Java é que ela é não-determinística e não há como prever quando o garbage collection ocorrerá em tempo de execução. É possível incluir um hint no código para executar o garbage collector com os métodos System.gc() ou Runtime.gc(), mas eles não oferecem nenhuma garantia de que o garbage collector será realmente executado.

A melhor abordagem para ajustar o Java garbage collection é configurar flags na JVM. As flags podem ajustar o garbage collector a ser usado (por exemplo, Serial, G1 etc.), o tamanho inicial e máximo do heap, o tamanho das seções de heap (por exemplo, Young Generation, Old Generation) e muito mais. A natureza do aplicativo a ser ajustado é um bom guia inicial para as configurações. Por exemplo, o Parallel garbage collector é eficiente, mas frequentemente levará a eventos “stop the world”, tornando-o mais adequado para o processamento backend onde longas pausas para o garbage collection são aceitáveis.

Por outro lado, o CMS garbage collector é projetado para minimizar pausas, o que o torna ideal para aplicações GUI onde a capacidade de resposta é importante. O ajuste fino adicional pode ser realizado alterando o tamanho do heap ou suas seções e medindo a eficiência do garbage collection usando uma ferramenta como jstat.

## 10 - Operadores

<b>Operadores Unários</b>: Esses operadores são aplicados especificamente sobre um operador. Eles realizam alguns trabalhos básicos como incremental, decremental e inversão de valores numéricos e booleanos:
```
+	Operador unário de valor positivo – números são positivos sem esse operador explicitamente
–	Operador unário de valor negativo – nega um número ou expressão aritmética
++	Operador unário de incremento de valor – incrementa o valor em 1 unidade
—	Operador unário de decremento de valor – decrementa o valor em 1 unidade
!	Operador unário lógico de negação – nega o valor de uma expressão booleana
```
<b>Operadores Binários ou Bit a Bit</b>: os operadores bit a bit operam um bit de cada vez e é importante ter a noção relativamente ao que é o código bínario.
```
1	Verdadeiro
0	Falso
&	Apenas é verdadeiro quando ambos os números corresponderem a 1 e 1
|	Apenas é falso quando ambos os números corresponderem a 0 e 0
<<	Deslocam os bits de acordo com o número dado para a esquerda
>>	Deslocam os bits de acordo com o número dado para a direita
```
Exemplo
```
package com.caffeinealgorithm.programaremjava;

public class OperadoresBitABit {
  private int x = 60; // 00111100 < 01111000 < 11110000 | 00111100 > 00011110 > 00001111
  private int y = 13; // 00001101

  public void Run() {
    System.out.printf("Resultado do operador &: %d\n", x & y); // 12 -> 00001100
    System.out.printf("Resultado do operador |: %d\n", x | y); // 61 -> 00111101
    System.out.printf("Resultado do operador <<: %d\n", x << 2); // 240 -> 11110000
    System.out.printf("Resultado do operador >>: %d", x >> 2); // 15 -> 00001111
  }
}

/*
  Resultado do operador &: 12
  Resultado do operador |: 61
  Resultado do operador <<: 240
  Resultado do operador >>: 15
*/
```
<b>Operadores Ternários</b>: O operador ternário é um recurso para tomada de decisões com objetivo similar ao do if/else, mas que é codificado em apenas uma linha.
```
double salario = 1000; 
double bonus = salario * (salario > 1000 ? 0.10 : 0.15); 
// Quando salario maior que 1000, o bonus será salario * 0.10 senão salario * 0.15 
System.out.println(bonus);
```
<b>Ordem de precedência</b>: 1º Unários, 2º Binários e 3º Ternários. Mas há prioridade das operações que estão dentro do dos parênteses.

![image](https://user-images.githubusercontent.com/28120443/187277828-e7d6790f-6ff1-4082-87f7-77fdd21a9592.png)

## 11 - Comandos de decisão básicos
<b>Estrutura de decisão if</b> : A estrutura de decisão “if” ou instrução de seleção única constitui uma construção simples que permite que uma instrução ou um bloco de instruções seja executado após a análise de determinada condição que deverá ser satisfeita para que a execução ocorra. O que ela faz é avaliar se uma expressão é verdadeira (true) ou falsa (false).

É importante ressaltar que em Java essa expressão deve ser sempre um boolean. Assim, fragmentando o exemplo acima, “media do aluno”, se a média do aluno for maior ou igual a 7, ou seja, se a expressão for verdadeira, imprima “APROVADO”.

<b>Estrutura de decisão if / else</b> : Se desejarmos definir uma ação para quando a condição for verdadeira e outra ação distinta para quando a condição for falsa, então usaremos a instrução de seleção dupla, if … else, que nos permitirá executar uma ação fora da ordem da sequência.

Assim sendo, o primeiro bloco de instrução somente será executado se a condição for true, caso contrário, se a condição for false, o bloco de instrução a ser executado será o segundo, desviando então, o fluxo de execução do sistema.
```
public class Teste {
	public static void main(String[] args) {
		int media = 7;
		String resultado;
		if (media >= 7) {
			resultado = "Aprovado!";
		}
		else {
			resultado = "Reprovado!";
		}
			System.out.println(resultado);
	}
}
```
<b>Estrutura de decisão else-if</b> : Com este recurso poderemos adicionar uma nova condição a estrutura de decisão, se a média do aluno for maior ou igual a 7, ou seja se a expressão for verdadeira, imprima “APROVADO”, senão, se a média for maior ou igual a 5 e menor que 7, imprima “EM RECUPERAÇÃO”, caso contrário imprima “REPROVADO”.
```
public class Teste {
	public static void main(String[] args) {
		int media = 6;
		String resultado;
		if (media >= 7) {
			resultado = "Aprovado!";
		}
		else if (media >= 5){
			resultado = "Recuperação!";
		}
		else {
			resultado = "Reprovado!";
		}
			System.out.println(resultado);
	}
}
```
<b>Operador ternário</b> : A linguagem Java fornece um operador ternário ou operador condicional (?:). Este operador pode ser utilizado no lugar de uma instrução if…else. Entretanto, ao contrário desta, quando usamos o operador ternário, codificamos as instruções em apenas uma linha, tornando o código mais curto.
```
public class Teste {
	public static void main(String[] args) {
		int media = 8;
		String resultado;
		resultado = (media >= 7) ? "Aprovado!" :  "Reprovado!";
		System.out.println(resultado);
	}
}
```
## 12 - Comando Switch
Colocamos várias opções e vários comandos dentro do comando switch, todas as possibilidades de nosso aplicativo ou todas as opções ou rumos que nossos programas possam tomar.
O switch vai funcionar como um interruptor, pois dependendo da entrada que você der a ele, ele vai acionar somente certo(s) comando(s) dentre os que você disponibilizou.
```
import java.util.Scanner;
public class SwitchTest {
    public static void main(String[] args) {
        float numero1, numero2;
        char operacao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escolha sua operação [+ - * / ]: ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.print("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();
        
        switch( operacao )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
        }
    }
}
```
## 13 - Loops: while, do-while e for
<b>while</b> : É utilizado para construir uma estrutura de repetição que executa, repetidamente, enquanto uma expressão booleana for verdadeira.
```
public class ExemploWhile {
    public static void main(String args[]) {
        int contador = 0;
        while (contador < 50) {
            System.out.println("Repetição nr: " + contador);
            contador++;
        }
    }
} 
```
<b>do-while</b> : Primeiramente é executado o "do" e o mesmo continuará sendo executado enquanto a expressão booleana for verdadeira, o "while".
```
public class ExemploDoWhile {
    public static void main(String args[]) {
        int contador = 0;
        do {
        	System.out.println("Repetição nr: " + contador);
        	contador++;
        }
        while (contador < 50); 
    }
} 
```
<b>for - Básico</b> : Executa a declaração e expressão de laço repetidamente, até que a condição da expressão se torne falsa.
```
public class ExemploForBasico {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
        	System.out.println("Impressão nº: "+i);
        }
    }
} 
```
<b>for each</b> : Essa estrutura é caracterizada por promover uma forma mais limpa de realizar uma iteração sobre uma collection em Java, pois não é necessário manter um inteiro contador para setar a posição ou chamar o método hasNext() para verificar se existem mais elementos na collection.
```
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
```
## 14 - Controle de fluxo avançado
<b>Loop aninhado</b> : Significa uma instrução de loop dentro de outra instrução de loop. É por isso que os loops aninhados também são chamados de “ loop inside loop ”.

Sintaxe para for aninhado o mesmo procedimento poderá ser realizado com while, do-while, for each...
```
for ( initialization; condition; increment ) {
   for ( initialization; condition; increment ) {
      // statement of inside loop
   }
   // statement of outer loop
}
```
Loop aninhados são indispensáveis para representação de matrizes.
```
// Exemplo 01
import java.io.*;
class ExemploLoopAninhado {
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
    }
}
```
```
// Exemplo 02
class ExemploLoopAninhado {
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

```
![image](https://user-images.githubusercontent.com/28120443/187511840-8ddf1d20-337c-4551-bde1-164668980de3.png)

/* ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ====  */
## _02_Core_Java_API
/* ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ==== +++ ====  */

## 15 - Classe String
Uma String armazena uma sequência de caracteres. Apesar de ser fácil de utilizar, essa classe possui diversas características que podem não ser óbvias.
```
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
```
Métodos importantes
```
package _02_Core_Java_API;
public class _02_MetodosString {
	public static void main(String[] args) {
		String string = "animais";
		/* length() - RETORNA TAMANHO */
		System.out.println(string.length()); 	// resultado 7
		/* charAt() - RETORNA CARACTER NO INDICE INFORMADO */
		System.out.println(string.charAt(0)); 	// Resultado a
		System.out.println(string.charAt(6));	// Resultado s
		//System.out.println(string.charAt(8));	// Exception - StringIndexOutOfBoundsException
		/* indexOf() - RETORNA INDICE DO CARACTER INFORMADO */
		System.out.println(string.indexOf("n"));   	// Resultado 1
		System.out.println(string.indexOf("ai"));  	// Resultado 4 apartir da posição
		System.out.println(string.indexOf("a", 4));	// Resultado 4, irá procurar apartir do indice 4
		System.out.println(string.indexOf("z"));	// Resultado -1, não encontrado
		/* substring() - RETORNA TRECHO CONFORME SOLICITADO */
		System.out.println(string.substring(4));	// Resultado ais
		System.out.println(string.substring(4,6));	// Resultado ai
		System.out.println(string.substring(string.indexOf("m"))); // Resultado mais
		/* toUpperCase() /  toLowerCase() - RETORNA CAIXA ALTA OU BAIXA */
		System.out.println(string.toUpperCase());  		// Resultado ANIMAIS
		System.out.println("AbCDF1234".toLowerCase());  // Resultado abcdf1234
		/* equals() - RETORNA BOLEANO RESULTADO DA COMPARAÇÃO */
		System.out.println("abc".equals("ABC"));			// false
		System.out.println("ABC".equals("ABC"));			// true
		System.out.println("abc".equalsIgnoreCase("ABC"));	// true
		/* startsWith() / endsWith - RETORNA BOLEANO BASEADO NA LETRA INICIAL OU FINAL */
		System.out.println("abc".startsWith("a"));	// Começa com a letra? true
		System.out.println("ABC".startsWith("A"));	// Começa com a letra? true
		System.out.println("abc".endsWith("c"));	// Termina com a letra? true
		System.out.println("ABC".endsWith("C"));	// Termina com a letra? true
		/* contains() - RETORNA BOLEANO SE HOUVER A INFORMAÇÃO */
		System.out.println("abc".contains("a"));	// Contem a contraint? true
		System.out.println("abc".contains("A"));	// Contem a contraint? false
		/* replace() - SUBSTITUIÇÃO CONFORME SOLICITAÇÃO */
		System.out.println(string.replace("ai", "ea"));	// Resultado animeas
		/* trim() - REMOVE ESPAÇOS */
		System.out.println("\t	accv".trim());	// Removendo espaços - accv
	}

}
```
## 16 - Classe StringBuilder
A classe StringBuilder faz parte do pacote java.lang. Essa classe permite criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.

O significado da classe StringBuilder não tem o mesmo sentido que classe String. Existe uma diferença entre essas classes, veja algumas características.

<b>Características StringBuilder </b>

Armazena caracteres especificados pela sua capacidade, caso ela seja excedida, é aumentada para acomodar os caracteres adicionais;
-	Não precisa alocar novos objetos quando realiza uma concatenação;
-	Não são sincronizadas;
-	Não são seguras para threads;

Uma vantagem sobre a classe String é a concatenação de strings. Pois quando concatena strings com StringBuilder é invocado o método append. 
Esse método aloca novas strings concatenadas para o mesmo objeto, ou seja, cada vez que concatena strings não são criadas cópias dos objetos como é realizado pelo método concat da classe String, 
contribuindo para um melhor desempenho do sistema.

```
package _02_Core_Java_API;
public class _03_StringBuilder {
	public static void main(String[] args) {
		/* METODO APPEND */
		StringBuilder sb = new StringBuilder().append(1).append('c');
		sb.append("-").append(true);
		System.out.println(sb); // Resultado 1c-true
		// Todos os conteúdos serão convertidos para String
		/* METODO INSERT */
		sb = new StringBuilder("animais");
		sb.insert(7, "-");		//animais-
		sb.insert(0, "-");		//-animais-
		sb.insert(4, "-");		// Resultado -ani-mais-
		System.out.println(sb); 
		/* METODO DELETE */
		sb.delete(1, 3);
		System.out.println(sb); // Resultado -i-mais-
		sb.deleteCharAt(15);	// Exception - String index out of range
	}
}
```
```
package _02_Core_Java_API;
public class _03_StringIgualdade {
			String name;
			public static void main(String[] args) {
				_03_StringIgualdade t1 = new _03_StringIgualdade(); //Objeto_1
				_03_StringIgualdade t2 = new _03_StringIgualdade();	//Objeto_2
				_03_StringIgualdade t3 = t1;						//Objeto_1
				System.out.println(t1 == t3);		// true
				System.out.println(t1 == t2);		// false
				System.out.println(t1.equals(t2));	// false equals é a mesma coisa de ==
		}
	}
```
## 17 - Arrays
Os arrays ou matrizes, como são conhecidos pelo Java, fazem parte do pacote java.util na coleção da API do Java. São objetos de recipientes que contém um número fixo de valores de um único tipo. 
O comprimento de um array é estabelecido quando criado, sendo que após a criação o seu comprimento fica fixo.
Cada item em um array é chamado de elemento, e cada elemento é acessado pelo número, o índice. Abaixo é mostrado se dá esse acesso aos seus elementos, lembrando que sempre sua numeração começa em 0.
```
package _02_Core_Java_API;
public class _04_Arrays {
	public static void main(String[] args) {
		//[] - são inseridos em uma variável que referecia um array
        int[] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];
        //{} - inicializar valores em um array sua declaração
        int[] iniciaValores = {12,32,54,6,8,89,64,64,6};
        //DECLARA UM ARRAY DE INTEIROS
        int[] meuArray;
        //ALOCA MEMÓRIA PARA 10 INTEIROS
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
        //meuArray [10] = 564; //ESTOURA A PILHA POIS NÃO EXISTE O ÍNDICE 10

        System.out.println(meuArray[9]);
        System.out.println(meuArray[2]);
	
        System.out.println(meuArray.length); 
        //Atenção, é uma propriedade e não um método quando string
	}
}
```