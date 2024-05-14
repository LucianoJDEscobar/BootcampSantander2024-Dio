package edu.collection_framework.introducing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

import edu.collection_framework.util.User;

public class StoringElements {

	/*
	 * Uma interface COLLECTION pode armazenar elementos e oferece diferentes
	 * maneiras de recuperá-los.
	 * 
	 * 
	 * ------------ MÉTODOS QUE TRATAM DE ELEMENTOS INDIVIDUAIS -------------------
	 * 
	 * Vamos começar armazenando e removendo um elemento de uma coleção. Os dois
	 * métodos envolvidos são add() e remove().
	 * 
	 * add(element): adiciona um elemento na coleção. Este método retorna um boolean
	 * caso a operação falhe. Você viu na introdução que não deve falhar para a
	 * List, mas pode falhar para a Set, porque um conjunto não permite duplicatas.
	 * 
	 * remove(element): remove o elemento fornecido da coleção. Este método também
	 * retorna um booleano, pois a operação pode falhar, por exemplo, quando o item
	 * solicitado para remoção não estiver presente na coleção.
	 * 
	 * Maiores esclarecimentos no EXEMPLO 1.
	 * 
	 * Você pode verificar a presença de um elemento em uma coleção com o método
	 * contains(). Observe que você pode verificar a presença de qualquer tipo de
	 * elemento.
	 * 
	 * Maiores esclarecimentos no EXEMPLO 2.
	 * 
	 * 
	 * ---------------- MÉTODOS QUE TRATAM DE OUTRAS COLEÇÕES ----------------------
	 * 
	 * Existem quatro métodos para o tratamento de outras coleções: containsAll(),
	 * addAll(), removeAll() e retainAll().
	 * 
	 * containsAll(): define a inclusão
	 * 
	 * addAll(): define a união
	 * 
	 * removeAll(): define o complemento
	 * 
	 * retainAll(): define a interseção.
	 * 
	 * containsAll() pega outra coleção como argumento e retorna true se todos os
	 * elementos das outras coleções estiverem contidos nesta coleção. A coleção
	 * passada como argumento não precisa ser do mesmo tipo que esta coleção: é
	 * legal perguntar se uma coleção de String, de tipo Collection<String>está
	 * contida em uma coleção de User, de tipo Collection<User>. Veja o EXEMPLO 3.
	 * 
	 * addAll() permite adicionar todos os elementos de uma determinada coleção a
	 * esta coleção. Tal como acontece com o método add(), isso pode falhar para
	 * alguns elementos em alguns casos. Este método retorna true se esta coleção
	 * tiver sido modificada por esta chamada. Este é um ponto importante a ser
	 * entendido: obter um valor true não significa que todos os elementos da outra
	 * coleção foram adicionados; isso significa que pelo menos um foi adicionado.
	 * Você precisa estar ciente de que a execução desse código produzirá um
	 * resultado diferente se alterar a implementação do Collection. Este resultado
	 * para ArrayList, não seria o mesmo para HashSet. Veja EXEMPLO 4.
	 * 
	 * removeAll(). Remove todos os elementos desta coleção que estão contidos na
	 * outra coleção. Assim como é o caso de contains()or remove(), a outra coleção
	 * pode ser definida em qualquer tipo; não precisa ser compatível com o desta
	 * coleção. Veja EEXEMPLO 5.
	 * 
	 * retainAll() esta operação retém apenas os elementos desta coleção que estão
	 * contidos na outra coleção; todos os outros são removidos. Mais uma vez, como
	 * é o caso de contains() ou remove(), a outra coleção pode ser definida em
	 * qualquer tipo. Veja EXEMPLO 6.
	 * 
	 * -------------- MÉTODOS QUE TRATAM DA PRÓPRIA COLEÇÕES ----------------------
	 * 
	 * O último lote de métodos trata da coleção em si. Existem dois métodos para
	 * verificar o conteúdo de uma coleção.
	 * 
	 * size(): Retorna o número de elementos em uma coleção, com um tipo int.
	 * 
	 * isEmpty(): Informa se a coleção fornecida está vazia ou não.
	 * 
	 * clear(): limpa o condeúdo de uma lista. Veja EXEMPLO 7
	 * 
	 * -------------- OBTENDO UMA MATRIZ DOS ELEMENTOS DE UMA COLEÇÃO --------------
	 * 
	 * Mesmo que armazenar seus elementos em uma coleção possa fazer mais sentido em
	 * seu aplicativo do que colocá-los em um array, ainda há casos em que
	 * colocá-los em um array é algo que você precisará.
	 * 
	 * A interface Collection fornece três padrões para obter os elementos de uma
	 * coleção em um array, na forma de três sobrecargas de um método toArray().
	 * 
	 * A primeira é uma chamada simples ao toArray(), sem argumentos. Isso retorna
	 * seus elementos em uma matriz de objetos simples. Veja EXEMPLO 8.
	 * 
	 * ---------- FILTRANDO ELEMENTOS DE UMA COLEÇÃO COM UM PREDICADO -------------
	 * 
	 * O Java SE 8 adicionou um novo recurso à interface Collection de filtrar
	 * elementos de uma coleção com um predicado. Suponha que você tenha um
	 * List<String> e precise remover todas as strings nulas, as strings vazias e as
	 * strings com mais de 5 caracteres. No Java SE 7 e anteriores, você pode usar o
	 * método Iterator.remove() para fazer isso, chamando-o em uma instrução if.
	 * Você verá esse padrão junto com a interface Iterator, com removeIf(), seu
	 * código fica muito mais simples. Veja EXEMPLO 9.
	 * 
	 * ---------ESCOLHENDO UMA IMPLEMENTAÇÃO PARA A INTERFACE DE COLEÇÃO -----------
	 * 
	 * Em todos esses exemplos, usamos ArrayList para implementar a INTERFACE
	 * Collection.
	 * 
	 * O fato é: o Collections Framework não fornece uma implementação direta da
	 * interface Collection. ArrayList implementa List e como List estende Collection,
	 * também implementa Collection.
	 * 
	 * Se você decidir usar a interface Collection para modelar as coleções em seu
	 * aplicativo, escolher a implementação padrão ArrayList será sua melhor opção,
	 * na maioria das vezes.
	 */

	public static void main(String[] args) {

		// ----------- EXEMPLO 1 -----------
		System.out.println("\n----------- EXEMPLO 1 -----------\n");
		// Aqui, você cria uma instância da Collectioninterface usando a implementação
		// ArrayLis. Os genéricos usados ​​informam ao compilador Java que você deseja
		// armazenar objetos String nesta coleção. ArrayList não é a única implementação
		// que você pode usar em uma Collection.

		Collection<String> strings1 = new ArrayList<>();
		strings1.add("um");
		strings1.add("dois");
		System.out.println("strings = " + strings1);
		strings1.remove("um");
		System.out.println("strings = " + strings1);
		System.out.println("\n");

		// ----------- EXEMPLO 2 -----------
		System.out.println("\n----------- EXEMPLO 2 -----------\n");
		/*
		 * É válido verificar a presença de um objeto User em uma coleção de arquivos
		 * String. Isso pode parecer estranho, já que não há chance dessa verificação
		 * retornar true, mas é permitido pelo compilador. No use de uma IDE para testar
		 * esse código, ela poderá avisar sobre o teste da presença de um objeto User em
		 * uma coleção de objetos String.
		 */

		Collection<String> strings2 = new ArrayList<>();
		strings2.add("Um");
		strings2.add("Dois");
		System.out.println("strings2 = " + strings2);
		System.out.println("contains('Um')? ");
		if (strings2.contains("Um")) {
			System.out.println("Um está aqui");
		}
		System.out.println("contains('Três')? ");
		if (!strings2.contains("Três")) {
			System.out.println("Três não está aqui");
		}
		System.out.println("contains('Dois') como objeto User? ");
		User rebecca = new User("Dois");
		if (!strings2.contains(rebecca)) {
			System.out.println("Dois não está aqui");
		}
		System.out.println("\n");

		// ----------- EXEMPLO 3 -----------
		System.out.println("\n----------- EXEMPLO 3 -----------\n");
		Collection<String> strings3 = new ArrayList<>();
		strings3.add("Um");
		strings3.add("Dois");
		strings3.add("Três");

		Collection<String> primeiro = new ArrayList<>();
		primeiro.add("Um");
		primeiro.add("Dois");

		Collection<String> segundo = new ArrayList<>();
		segundo.add("Um");
		segundo.add("Quatro");

		System.out.println("strings3 = " + strings3);
		System.out.println("primeiro = " + primeiro);
		System.out.println("segundo = " + segundo);
		System.out.println("O primeiro está contido em string3? " + strings3.containsAll(primeiro));
		System.out.println("O segundo está contido em string3? " + strings3.containsAll(segundo));

		System.out.println("\n");

		System.out.println("\n----------- EXEMPLO 4 -----------\n");
		Collection<String> strings4 = new ArrayList<>();
		strings4.add("Um");
		strings4.add("Dois");
		strings4.add("Três");

		Collection<String> primeiro4 = new ArrayList<>();
		primeiro4.add("Um");
		primeiro4.add("Quatro");
		System.out.println("strings4 = " + strings4);
		System.out.println("addAll() = " + primeiro4);
		boolean hasChanged = strings4.addAll(primeiro4);

		System.out.println("strings4 foi alterado? " + hasChanged);
		System.out.println("strings4 = " + strings4);
		System.out.println("\n");

		// ----------- EXEMPLO 5 -----------
		System.out.println("\n----------- EXEMPLO 5 -----------\n");
		Collection<String> toBeRemoved = new ArrayList<>();
		toBeRemoved.add("Um");
		toBeRemoved.add("Quatro");
		System.out.println("strings4 = " + strings4);
		System.out.println("removeAll() = " + toBeRemoved);
		boolean hasChanged2 = strings4.removeAll(toBeRemoved);
		System.out.println("strings4 foi alterado? " + hasChanged2);
		System.out.println("strings4 = " + strings4);
		System.out.println("\n");

		// ----------- EXEMPLO 6 -----------
		System.out.println("\n----------- EXEMPLO 6 -----------\n");
		Collection<String> toBeRetained = new ArrayList<>();
		toBeRetained.add("Um");
		toBeRetained.add("Quatro");
		strings4.add("Quatro");

		System.out.println("strings4 = " + strings4);
		System.out.println("toBeRetained = " + toBeRetained);
		boolean hasChanged3 = strings4.retainAll(toBeRetained);

		System.out.println("strings4 foi alterado? " + hasChanged3);
		System.out.println("strings4 = " + strings4);

		System.out.println("\n");
		// ----------- EXEMPLO 7 -----------
		System.out.println("\n----------- EXEMPLO 7 -----------\n");
		Collection<String> strings7 = new ArrayList<>();
		strings7.add("one");
		strings7.add("two");
		System.out.println("strings = " + strings7);
		if (!strings7.isEmpty()) {
			System.out.println("A lista strings7 não está vazia!");
		}
		System.out.println("O número de elementos da lista strings7 é " + strings7.size());
		strings7.clear();
		System.out.println("strings = " + strings7);
		if (strings7.isEmpty()) {
			System.out.println("A lista strings7 está vazia!");
		}
		System.out.println("O número de elementos da lista strings7 é " + strings7.size());
		System.out.println("\n"); 
		// ----------- EXEMPLO 8 -----------
		System.out.println("\n----------- EXEMPLO 8 -----------\n");
		// Neste primeiro padrão, você precisa passar um array do tipo correspondente.
		Collection<String> strings = List.of("um", "dois", "tres", "quatro", "cinco", "seis");

		String[] tabString1 = strings.toArray(new String[] {}); // Você pode passar um Array vazio
		String[] tabString2 = strings.toArray(new String[15]); // Você pode passar um Array de tamanho 6
		System.out.println(Arrays.toString(tabString2));
		System.out.println("\n");

		/*
		 * Qual é a utilidade desse array passado como argumento? Se for grande o
		 * suficiente para conter todos os elementos da coleção, esses elementos serão
		 * copiados no array e ele será retornado. Se houver mais espaço na matriz do
		 * que o necessário, a primeira célula não utilizada da matriz será definida
		 * como nula. Se o array que você passa for muito pequeno, um novo array com o
		 * tamanho exato será criado para conter os elementos da coleção.
		 */

		Collection<String> strings8 = List.of("um", "dois");
		String[] largerTab = { "tres", "tres", "tres", "eu", "quero", "tres" };
		System.out.println("largerTab = " + Arrays.toString(largerTab));
		String[] result = strings8.toArray(largerTab);
		System.out.println("result = " + Arrays.toString(result));
		System.out.println("Arrays iguais? " + (result == largerTab));
		System.out.println("\n");

		/*
		 * Você pode ver que o array foi copiado nas primeiras células do array de
		 * argumentos, e null foi adicionado logo depois dele, deixando assim os últimos
		 * elementos deste array intactos. O array retornado é o mesmo array que você
		 * forneceu como argumento, com um conteúdo diferente.
		 */

		Collection<String> strings8a = List.of("um", "dois");

		String[] zeroLengthTab = {};
		String[] result8a = strings8a.toArray(zeroLengthTab);
		System.out.println("zeroLengthTab = " + Arrays.toString(zeroLengthTab));
		System.out.println("result = " + Arrays.toString(result8a));
		System.out.println("\n");

		/*
		 * O segundo padrão é escrito usando uma referência de método construtor para
		 * implementar IntFunction<T[]>:
		 * 
		 * Nesse caso, um array de comprimento zero do tipo certo é criado com esta
		 * função, e este método então chama toArray() com este array passado como
		 * argumento.
		 * 
		 * Este padrão de código foi adicionado no JDK 8 para melhorar a legibilidade
		 * das toArray()chamadas.
		 */

		Collection<String> string = List.of("um", "dois", "tres", "quatro", "cinco", "seis", "sete");
		String[] tabString = string.toArray(String[]::new);
		System.out.println(Arrays.toString(tabString));

		System.out.println("\n");
		// ----------- EXEMPLO 9 -----------
		System.out.println("\n----------- EXEMPLO 9 -----------\n");
		Predicate<String> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNullOrEmpty = isNull.or(isEmpty);

		Collection<String> strings9 = new ArrayList<>();
		strings9.add(null);
		strings9.add("");
		strings9.add("one");
		strings9.add("two");
		strings9.add("");
		strings9.add("three");
		strings9.add(null);

		Collection<String> string9 = new ArrayList<String>(strings9);
		System.out.println("strings9 = " + strings9);
		strings9.removeIf(isNull);
		System.out.println("isNull");
		System.out.println("strings9 filtrado = " + strings9);
		System.out.println("\nstring9 = " + strings9);
		strings9.removeIf(isEmpty);
		System.out.println("isEmpty");
		System.out.println("strings9 filtrado = " + strings9);
		System.out.println("\nstring9 = " + string9);
		string9.removeIf(isNullOrEmpty);
		System.out.println("isNullorEmpty");
		System.out.println("string9 filtrado = " + string9);
		System.out.println("\n");
	}
}
