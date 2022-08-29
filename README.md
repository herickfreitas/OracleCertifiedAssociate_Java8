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

