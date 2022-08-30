# OracleCertifiedAssociate_Java8

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
