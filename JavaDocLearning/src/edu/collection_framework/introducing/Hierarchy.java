package edu.collection_framework.introducing;

public class Hierarchy {

	/*
	 * O Collections Framework é dividido em diversas hierarquias de interfaces e
	 * classes. O primeiro que você precisa entender é o seguinte:
	 * 
	 * - A hierarquia da interface da coleção.
	 * 
	 * (ITERABLE)<-(COLLECTIO)<-(LIST);
	 * (ITERABLE)<-(COLLECTIO)<-(SET)<-(SORTEDSET)<-(NAVIGABLESET);
	 * 
	 * A primeira interface desta hierarquia é a Iterableinterface e, na verdade,
	 * não faz parte do Collections Framework. Ainda vale a pena mencioná-la aqui
	 * porque é a superinterface da Collectioninterface e, portanto, de todas as
	 * interfaces desta hierarquia.
	 * 
	 * A interface ITERABLE é uma adição do Java SE 5 (2004) junto com cada padrão
	 * de código. Um objeto que implementa Iterable é um objeto sobre o qual você
	 * pode iterar.
	 * 
	 * Você já deve estar familiarizado com a forma de iterar os elementos de a
	 * Collection através de um FOREACH. Pode-se iterar em qualquer coleção ou array
	 * usando esse padrão. Acontece que, na verdade, qualquer instância de Iterable
	 * pode ser usada aqui.
	 * 
	 * Para implementar a interface Iterable é muito fácil, basta fornecer uma
	 * instância da interface, Iterator.
	 * 
	 * Todas as outras interfaces tratam do armazenamento de elementos em
	 * contêineres.
	 * 
	 * As duas interfaces List e Set compartilham um comportamento comum, que é
	 * modelado pela interface COLLECTION, onde ela modela diversas operações em
	 * contêineres de elementos. Aqui está o que você pode fazer com a Collection:
	 * 
	 * Adicionar ou remover elementos. Testar a presença de um determinado elemento.
	 * Perguntar a quantidade de elementos contidos ou se esta coleção está vazia.
	 * Limpar este conteúdo.
	 * 
	 * Como a Collection é um conjunto de elementos, também existem operações
	 * definidas nesta interface:
	 * 
	 * Testar a inclusão de um conjunto em outro conjunto. União. Interseção.
	 * Complemento.
	 * 
	 * Por fim, a Collection também modela diferentes formas de acesso aos seus
	 * elementos:
	 * 
	 * Você pode iterar sobre os elementos de uma coleção, através do uso de um
	 * iterador. Você pode criar um fluxo nesses elementos, que pode ser paralelo.
	 * Claro, todas essas operações também estão disponíveis em Liste Set. Então,
	 * qual é a diferença entre uma instância simples de Collection e uma instância
	 * de Set ou List?
	 * 
	 * A diferença entre elementos de List e Collection é que a List lembra em que
	 * ordem seus elementos foram adicionados.
	 * 
	 * A primeira consequência é que se você iterar sobre os elementos de uma List,
	 * o primeiro elemento que você obterá será o primeiro que foi adicionado. Então
	 * você obterá o segundo e assim por diante até que todos os elementos tenham
	 * sido vistos. Portanto, a ordem em que você irá iterar sobre os elementos é
	 * sempre a mesma, isto é, é fixada pela ordem em que esses elementos foram
	 * adicionados. Você não tem essa garantia com um plano Collection nem para um
	 * arquivo Set.
	 * 
	 * Acontece que algumas implementações Set fornecidas pelo Collections Framework
	 * sempre iteram sobre os elementos na mesma ordem. Este é um efeito acidental e
	 * seu código não deve depender desse comportamento.
	 * 
	 * Há uma segunda consequência, talvez não tão clara quanto a primeira, onde os
	 * elementos de uma lista possuem um índice e consultar uma COLEÇÃO pelo seu
	 * primeiro elemento não faz sentido, MAS consultar uma LISTA pelo seu primeiro
	 * elemento faz sentido, pois uma lista lembra disso.
	 * 
	 * Como esses índices são tratados? Bom, mais uma vez, isso é responsabilidade
	 * da implementação. A primeira função de uma interface é especificar um
	 * comportamento, não dizer como uma implementação deve conseguir isso.
	 * 
	 * Uma interface List adiciona novas operações à interface Collection. Como os
	 * elementos de uma lista possuem um índice, você pode fazer o seguinte com esse
	 * índice.
	 * 
	 * Obter ou excluir um elemento em um índice específico. Insirir ou substituir
	 * um elemento em uma posição específica. Obter um intervalo de elementos entre
	 * dois índices.
	 * 
	 * A diferença entre elementos de Set e elementos de Collection é que você não
	 * pode ter duplicatas em um arquivo Set. Você pode ter várias instâncias iguais
	 * da mesma classe em uma Collection, ou até mesmo a mesma instância mais de uma
	 * vez. Em um arquivo Set isso não é permitido. Como isso é aplicado é
	 * responsabilidade da implementação.
	 * 
	 * Uma das consequências desse comportamento é que a adição de um elemento Set
	 * pode falhar.
	 * 
	 * A interface Set possui duas extensões: SortedSet e NavigableSet.
	 * 
	 * A interface SortedSet mantém seus elementos ordenados em ordem crescente.
	 * Mais uma vez, a forma como isso é aplicado é responsabilidade da
	 * implementação. Para poder classificá-los, é necessário comparar seus
	 * elementos. Como isso pode ser alcançado? Bem, existem dois mecanismos padrão
	 * definidos na linguagem Java para isso.
	 * 
	 * Seus elementos podem implementar a interface Comparable e fornecer um método
	 * compareTo() ou você dá um Comparator ao SortedSet para que ele possa
	 * compará-los. Mesmo que seus elementos sejam Comparable, você ainda pode
	 * fornecer um Comparator ao construir um SortedSet. Isso pode ser útil se você
	 * precisar classificar seus elementos em uma ordem diferente daquela
	 * implementada no método compareTo().
	 * 
	 * Enquanto a List mantém seus elementos na ordem em que foram adicionados, a
	 * SortedSet os mantém classificados. 
	 * 
	 * Qual é a diferença entre classificar e ordenar? Classificar elementos significa que o
	 * primeiro elemento obtido AO PERCORRER um conjunto será o mais baixo, no
	 * sentido de uma determinada lógica de comparação. Ordenar elementos significa
	 * que a ordem em que você os adicionou em uma lista é mantida durante toda a
	 * vida desta lista. Portanto, o primeiro elemento que você obtém AO PERCORRER
	 * uma lista é o primeiro que foi adicionado a ela.
	 * 
	 * O SortedSet adiciona várias operações ao Set. Aqui está o que você pode fazer
	 * com um arquivo SortedSet.
	 * 
	 * Você pode obter o elemento mais baixo e o maior elemento do conjunto. Você
	 * pode extrair a headSet e a tailSet de todos os elementos menores ou maiores que
	 * um determinado elemento. A iteração sobre os elementos de uma SortedSet será
	 * feita do elemento mais baixo para o maior.
	 * 
	 * O NavigableSet não altera o comportamento de um arquivo SortedSet. Ele
	 * adiciona diversas operações muito úteis SortedSet, entre elas a possibilidade
	 * de iterar sobre os elementos em ordem decrescente.
	 * 
	 */
}
