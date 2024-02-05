package cl.datos;

import java.util.LinkedList;

public class Colas {

	public static void main(String[] args) {
			
		//FIFO
		LinkedList<Integer> cola = new LinkedList<Integer>();
		
		for(int i = 1; i<11; i++) {
			cola.offer(i);
			
			while(cola.peek() != null) {
				System.out.println(cola.poll());
			}	
		}
	}
}
