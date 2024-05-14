package edu.collection_framework.introducing;

public class Teoria {

	/*
	 * O Collections Framework é uma implementação dos conceitos sobre como
	 * armazenar, organizar e acessar dados na memória que foram desenvolvidos muito
	 * antes da invenção do Java.
	 * 
	 * O Collections Framework foi introduzido pela primeira vez no Java SE 2, em
	 * 1998 e foi reescrito duas vezes desde então: - No Java SE 5 quando os
	 * genéricos foram adicionados; - No Java 8, quando as expressões lambda foram
	 * introduzidas, juntamente com os métodos padrão nas interfaces.
	 * 
	 * Estas duas são as atualizações mais importantes do Quadro de Coleções que
	 * foram feitas até agora. Mas, na verdade, quase todas as versões do JDK têm
	 * seu conjunto de alterações no Collections Framework.
	 * 
	 * Do ponto de vista técnico, o Collections Framework é um conjunto de
	 * interfaces que modela diferentes formas de armazenar dados em diferentes
	 * tipos de containers. Então o Framework fornece pelo menos uma implementação
	 * para cada interface. Conhecer essas implementações é tão importante quanto as
	 * interfaces, e escolher a correta depende do que você precisa fazer com ela.
	 * 
	 * A estrutura consiste em interfaces e implementações. Escolher a interface
	 * certa significa que você precisa saber quais funções deseja trazer para seu
	 * aplicativo. Alguns dos questionamentos são:
	 * 
	 * - armazenando objetos e iterando sobre eles?
	 * 
	 * - empurrando seu objeto para uma fila e estourando-o?
	 * 
	 * - recuperá-los com o uso de uma chave?
	 * 
	 * - acessando-os pelo seu índice?
	 * 
	 * - classificando-os?
	 * 
	 * - evitando a presença de duplicatas ou valores nulos?
	 * 
	 * Escolher a implementação certa significa que você precisa saber como usará
	 * essas funcionalidades:
	 * 
	 * - O acesso aos seus objetos será feito por iteração ou acesso indexado
	 * aleatório?
	 * 
	 * - Os objetos serão corrigidos na inicialização do seu aplicativo e não
	 * mudarão muito ao longo de sua vida útil?
	 * 
	 * - A quantidade de objetos será importante com muita verificação da presença
	 * de determinados objetos?
	 * 
	 * - A estrutura em que você precisa armazenar seus objetos será acessada
	 * simultaneamente?
	 * 
	 * Existem duas categorias principais de interfaces no Collections Framework:
	 * COLLECTIONS e MAPS.
	 * 
	 * As coleções tratam de armazenar objetos e iterá-los. A INTERFACE Collection é
	 * a interface raiz desta categoria. Na verdade, ela estende a interface
	 * ITERABLE, mas essa interface não faz parte do Collections Framework.
	 * 
	 * Um MAP armazena um objeto junto com uma chave, que representa esse objeto,
	 * assim como uma chave primária representa um objeto em um banco de dados, Os
	 * MAPs armazenam pares chave/valor. A interface Map é a interface raiz desta
	 * categoria.
	 * 
	 * Não há relacionamento direto entre as interfaces da hierarquia Collection e
	 * da hierarquia Map.
	 * 
	 * Junto com essas coleções e mapas, existem interfaces para modelar filas e
	 * pilhas na hierarquia Collection. Filas e pilhas não se tratam realmente de
	 * iterar coleções de objetos, mas como foram adicionadas à hierarquia, você
	 * pode utilizá-las para isso.
	 * 
	 * Existe uma última hierarquia que é a hierarquia ITERATOR. Um iterador é um
	 * objeto que pode iterar sobre uma coleção de objetos e faz parte do
	 * Collections Framework.
	 * 
	 * Isso cria duas categorias principais, Collection e Map, uma subcategoria,
	 * Queuee uma categoria secundária Iterator.
	 * 
	 * O Collections Framework só foi introduzido no Java 2, o que significa que
	 * houve uma vida antes dele. Essa vida consistiu em diversas classes e
	 * interfaces que ainda estão no JDK, para preservar a retrocompatibilidade, mas
	 * que você não deve mais utilizar em suas aplicações.
	 * 
	 * A classe Vector foi adaptada para implementar a interface List. Se estiver
	 * usando um vetor em um ambiente não simultâneo, poderá substituí-lo com
	 * segurança por ArrayList. Esta classe usa a interface Enumeration para modelar
	 * seu iterador. Esta interface não deve mais ser usada: a interface preferida
	 * agora é a Iterator.
	 * 
	 * A classe Stack se estende de Vector e deve ser substituída por ArrayDeque em
	 * ambientes não simultâneos.
	 * 
	 * A classe HashTable foi adaptada para implementar a interface Map. Se estiver
	 * usando instâncias desta classe em um ambiente não simultâneo, poderá
	 * substituir seu uso com segurança por HashMap. Em um ambiente simultâneo,
	 * ConcurrentHashMap pode ser usado como substituto.
	 * 
	 * Você pode estar se perguntando por que deveria se preocupar em aprender os
	 * Collection Frameworks quando pode ter a sensação de que colocar seus dados em
	 * um bom e velho array resolve o problema.
	 * 
	 * O fato é que, em qualquer caso, se você tem uma solução que é simples, que
	 * você domina bem e que se adapta às suas necessidades, então você
	 * definitivamente deveria persistir nela!
	 * 
	 * O que uma coleção pode fazer que um array não pode?
	 * 
	 * Uma coleção rastreia o número de elementos que ela contém. A capacidade de
	 * uma coleção não é limitada: você pode adicionar (quase) qualquer quantidade
	 * de elementos a uma coleção. Pode controlar quais os elementos que podem ser
	 * armazenados nela. Pode impedir que elementos nulos sejam adicionados. Pode
	 * ser consultada quanto à presença de um determinado elemento. Fornece
	 * operações como cruzar ou mesclar com outra coleção. Isto é apenas uma pequena
	 * fração do que uma coleção pode fazer por você. Na verdade, como uma coleção é
	 * um objeto e dado que um objeto é extensível, você pode adicionar qualquer
	 * operação necessária na maioria das coleções fornecidas pelo JDK. Não é
	 * possível fazer isso com um array, porque um array não é um objeto em Java.
	 * 
	 */
}
