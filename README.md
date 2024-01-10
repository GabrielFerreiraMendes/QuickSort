## Algoritmo de ordenação Quick Sort
Projeto desenvolvido, originalmente em C++, para projeto academico da disciplina estrutura de dados.

## Funcionamento do Bubble Sort

Quick Sort é um algoritmo eficiente de ordenação por divisão e conquista. Apesar de ser da mesma classe de complexidade do Merge Sort e do Heap Sort, o Quick Sort é na prática o mais veloz deles, pois suas constantes são menores. Contudo, é importante destacar de antemão que, em seu pior caso, o Quick Sort é O(n2)
, enquanto que o Merge Sort e o Heap Sort garantem n∗logn
 para todos os casos. A boa notícia é que há estratégias simples com as quais podemos minimizar as chances de ocorrência do pior caso.

O funcionamento do Quick Sort baseia-se em uma rotina fundamental cujo nome é particionamento. Particionar significa escolher um número qualquer presente no array, chamado de pivot, e colocá-lo em uma posição tal que todos os elementos à esquerda são menores ou iguais e todos os elementos à direita são maiores.

![image](https://github.com/GabrielFerreiraMendes/QuickSort/assets/14356303/bdac2a8f-62d2-447b-a311-9b63faf853aa)
