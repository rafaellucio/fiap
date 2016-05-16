package br.com.mba.fiap.trabalho3.exercicios;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class MedirPerformanceListas {

	public final int search = 500000;
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		HashSet<Integer> hashSet = new HashSet<>();
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		WeakHashMap<Integer, Integer> weakHashMap = new WeakHashMap<>();
		
		MedirPerformanceListas medirPerformanceListas = new MedirPerformanceListas();

		System.out.println("======================================================");
		Instant startInsert = Instant.now();
		for (int i = 0; i < 1000000; i++) {
			arrayList.add(i);
		}
		Instant finishInsert = Instant.now();
		medirPerformanceListas.displayDuration("arrayList:insert", startInsert, finishInsert);


		Instant startGet = Instant.now();
		arrayList.get(medirPerformanceListas.search);
		Instant finishGet = Instant.now();

		medirPerformanceListas.displayDuration("arrayList:get", startGet, finishGet);

		System.out.println("======================================================");
		System.out.println("======================================================");

		Instant startInsert2 = Instant.now();
		for (int i = 0; i < 1000000; i++) {
			linkedList.add(i);
		}
		Instant finishInsert2 = Instant.now();
		medirPerformanceListas.displayDuration("linkedList:insert", startInsert2, finishInsert2);
		
		Instant startGet2 = Instant.now();
		linkedList.get(medirPerformanceListas.search);
		Instant finishGet2 = Instant.now();

		medirPerformanceListas.displayDuration("linkedList:get", startGet2, finishGet2);

		System.out.println("======================================================");
		System.out.println("======================================================");

		Instant startInsert3 = Instant.now();
		for (int i = 0; i < 1000000; i++) {
			stack.add(i);
		}
		Instant finishInsert3 = Instant.now();
		medirPerformanceListas.displayDuration("stack:insert", startInsert3, finishInsert3);

		Instant startGet3 = Instant.now();
		stack.get(medirPerformanceListas.search);
		Instant finishGet3 = Instant.now();
		
		medirPerformanceListas.displayDuration("stack:get", startGet3, finishGet3);

		System.out.println("======================================================");
		System.out.println("======================================================");

		Instant startInsert4 = Instant.now();
		for (int i = 0; i < 1000000; i++) {
			hashSet.add(i);
		}
		Instant finishInsert4 = Instant.now();
		medirPerformanceListas.displayDuration("hashSet:insert", startInsert4, finishInsert4);

		Instant startGet4 = Instant.now();
		Iterator<Integer> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			if(iterator.next().equals(medirPerformanceListas.search)) {
				break;
			}
		}		
		Instant finishGet4 = Instant.now();

		medirPerformanceListas.displayDuration("hashSet:get", startGet4, finishGet4);

		System.out.println("======================================================");
		System.out.println("======================================================");

		Instant startInsert5 = Instant.now();
		for (int i = 0; i < 1000000; i++) {
			hashMap.put(i, i);
		}
		Instant finishInsert5 = Instant.now();
		medirPerformanceListas.displayDuration("hashMap:insert", startInsert5, finishInsert5);

		Instant startGet5 = Instant.now();
		hashMap.get(medirPerformanceListas.search);
		Instant finishGet5 = Instant.now();

		medirPerformanceListas.displayDuration("hashMap:get", startGet5, finishGet5);

		System.out.println("======================================================");
		System.out.println("======================================================");

		Instant startInsert6 = Instant.now();
		for (int i = 0; i < 1000000; i++) {
			weakHashMap.put(i, i);
		}
		Instant finishInsert6 = Instant.now();
		medirPerformanceListas.displayDuration("weakHashMap:insert", startInsert6, finishInsert6);

		Instant startGet6 = Instant.now();
		weakHashMap.get(medirPerformanceListas.search);
		Instant finishGet6 = Instant.now();
		
		medirPerformanceListas.displayDuration("weakHashMap:get", startGet6, finishGet6);

		System.out.println("======================================================");
	}
	
	public void displayDuration(String nomeDaLista, Instant start, Instant finish) {
		System.out.println(nomeDaLista + ": " + ChronoUnit.MILLIS.between(start, finish));
	}
	
	/*
	 * Com base no console a melhor lista para inserção de Inteiros
	 * é o ArrayList foi o que fez a tarefa mais rápido;
	 * 
	 * O mais lento para insersão de dados é o WeakHashMap
	 * 
	 * O mais lento para recuperação de dados foi o LinkedList e HashSet
	 * 
	 * ======================================================
		arrayList:insert: 44
		arrayList:get: 0
		======================================================
		======================================================
		linkedList:insert: 220
		linkedList:get: 6
		======================================================
		======================================================
		stack:insert: 48
		stack:get: 0
		======================================================
		======================================================
		hashSet:insert: 546
		hashSet:get: 29
		======================================================
		======================================================
		hashMap:insert: 576
		hashMap:get: 0
		======================================================
		======================================================
		weakHashMap:insert: 1019
		weakHashMap:get: 0
		====================================================== 
	 * 
	 * */
	
}