package cl.datos;

import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		
		Stack<Integer> pila = new Stack<Integer>();
		
		for(int i = 0; i<10; i++) {
			pila.push(i);
			
		}	
		pila.pop();
		System.out.println(pila.peek());
	}
}
