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


## 2 - O método main
Toda classe pode ter um método main, que determina o ponto de início de execução de qualquer aplicação Java. Ao contrário do que acontece em C e C++, onde apenas uma função main deve ser definida para a aplicação como um todo, toda e qualquer classe Java pode ter um método main definido. Apenas no momento da interpretação o main a ser executado é definido através do primeiro argumento (o nome da classe) para o programa interpretador.

O método main é um método associado à classe e não a um objeto específico da classe -- assim, ele é definido como um método estático. Adicionalmente, deve ser um método público para permitir sua execução a partir da máquina virtual Java. Não tem valor de retorno, mas recebe como argumento um arranjo de strings que corresponde aos parâmetros que podem ser passados para a aplicação a partir da linha de comando. Essas características determinam a assinatura do método.


 
