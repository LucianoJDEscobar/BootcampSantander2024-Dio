package edu.collection_framework.introducing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import edu.collection_framework.util.Range;
import edu.collection_framework.util.Range2;

public class IteratingElements {

	/*
	 * A escolha mais simples para iterar os elementos de uma coleção é usar o
	 * padrão for-each. Ele é muito eficiente, desde que você precise apenas ler os
	 * elementos da sua coleção.
	 * 
	 * O padrão Iterator permite remover alguns dos elementos de sua coleção
	 * enquanto você os itera.
	 * 
	 * ---------------- USANDO UM ITERATOR EM UMA COLEÇÃO ----------------
	 * 
	 * A iteração sobre os elementos de uma coleção utiliza um objeto especial, uma
	 * instância da interface Iterator. Você pode obter um objeto Iterator de
	 * qualquer extensão da interface Collection. O método iterator() é definido na
	 * interface Iterable, estendido pela interface Collection e posteriormente
	 * estendido por todas as interfaces da hierarquia de colection.
	 * 
	 * Iterar os elementos de uma coleção usando esse objeto é um processo de duas
	 * etapas.
	 * 
	 * Primeiro você precisa verificar se há mais elementos a serem visitados com o
	 * método hasNext() e então avançar para o próximo elemento com o método next().
	 * Se você chamar o método next() sem utilizar o hasNext() e não houver mais
	 * elementos na coleção, você receberá um NoSuchElementException. A chamada
	 * hasNext() não é obrigatória, ela existe para ajudá-lo a ter certeza de que
	 * realmente existe um próximo elemento.
	 * 
	 * ---------------------- ATUALIZANDO UMA COLEÇÃO --------------------------
	 * 
	 * Se acontecer de você modificar o conteúdo de uma coleção enquanto itera sobre
	 * ela, você poderá obter uma EXCEPTION ConcurrentModificationException. Obter
	 * esta exceção pode ser um pouco confuso, porque esta exceção também é usada em
	 * programação simultânea. No contexto do Collections Framework, você pode
	 * obtê-lo sem tocar na programação multithread.
	 * 
	 * ---------------------IMPLEMENTANDO A INTERFACE ITERABLE ------------------
	 * 
	 * Agora que você viu o que é um iterador no Collection Framework, você pode
	 * criar uma implementação simples da interface Iterable.
	 * 
	 * Suponha que você precise criar uma classe Range que modele um intervalo de
	 * números inteiros entre dois limites. Tudo que você precisa fazer é iterar do
	 * primeiro número inteiro ao último.
	 * 
	 * Você pode implementar a interface Iterable com um registro, um recurso
	 * introduzido no Java SE 16: veja a classe Range.java localizada na package
	 * edu.collection_framework.util;
	 * 
	 * Você pode fazer o mesmo com uma classe simples, caso seu aplicativo ainda não
	 * suporte Java SE 16. Observe que o código de implementação de Iterator é
	 * exatamente o mesmo. Veja na classe Range2.java localizada na package
	 * edu.collection_framework.util;
	 */

	public static void main(String[] args) {

		// Padrão FOREACH para iterar elementos sobre uma coleção
		System.out.println("------------- PADRÃO FOREACH -----------");
		Collection<String> strings = myCollection();
		for (String element : strings) {
			System.out.println(element);
		}

		// Padrão ITERATOR para iterar elementos sobre uma coleção
		System.out.println("------------- PADRÃO ITERATOR -----------");
		Collection<String> string = myCollection();
		// COM O USO DE UM FOR TRADICIONAL
		for (Iterator<String> iterator = string.iterator(); iterator.hasNext();) {
			String element = iterator.next();
			System.out.println(element);
		}
		// COM O USO DE UM WHILE
		Iterator<String> iteravel = string.iterator();
		while (iteravel.hasNext()) {
			String palavra = iteravel.next();
			System.out.println(palavra);
		}

		System.out.println("\n------------- ATUALIZANDO UMA COLEÇÃO -----------");
		Collection<String> strin = myArray();
		System.out.println(strin);
		Iterator<String> iterator = strin.iterator();

		/*
		 * GERANDO UMA EXCEPTIONAL ConcurrentModificationException
		 * while(iterator.hasNext()) {
		 * 
		 * String element = iterator.next(); strin.remove(element); }
		 */

		System.out.println("\n--------- INTERFACE ITERABLE COM RECORD ---------------");
		for (int i : new Range(0, 5)) {
		    System.out.println("i = " + i);
		}

		System.out.println("\n--------- INTERFACE ITERABLE COM CLASSE ---------------");
		for (int i : new Range2(6, 10)) {
		    System.out.println("i = " + i);
		}
		
	}

	static Collection<String> myCollection() {
		Collection<String> strings = List.of("Um", "Dois", "Três", "Quatro");
		return strings;
	}

	static Collection<String> myArray() {
		Collection<String> strings = new ArrayList<String>();
		strings.add("Um");
		strings.add("Dois");
		strings.add("Três");
		strings.add("Quatro");
		return strings;
	}
}
