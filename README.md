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
Toda classe pode ter um método main, que determina o ponto de início de execução de qualquer aplicação Java. Ao contrário do que acontece em C e C++, onde apenas uma função main deve ser definida para a aplicação como um todo, toda e qualquer classe Java pode ter um método main definido. Apenas no momento da interpretação o main a ser executado é definido através do primeiro argumento (o nome da classe) para o programa interpretador.

O método main é um método associado à classe e não a um objeto específico da classe -- assim, ele é definido como um método estático. Adicionalmente, deve ser um método público para permitir sua execução a partir da máquina virtual Java. Não tem valor de retorno, mas recebe como argumento um arranjo de strings que corresponde aos parâmetros que podem ser passados para a aplicação a partir da linha de comando. Essas características determinam a assinatura do método.


 
