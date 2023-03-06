package ejercicio;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String frase; //Se guardará la frase
		
		String [] frasePartida; //Se guardará la frase fraccionada
		
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		
		//Pedimos la frase
		System.out.println("Introduzca una frase para ordenar sus palabras:");
		//Leemos la frase
		frase= read.nextLine();
		
		//Pasamos la frase a minúsculas
		frase=frase.toLowerCase();
		
		//Fraccionamos la frase y la guardamos en un array
		frasePartida=frase.split(" ");
		
		//Ordenamos la frase
		Arrays.sort(frasePartida);
		
		//Recorremos el array
		for (int i = 0; i<frasePartida.length;i++) {
			//Mostramos el contenido de la posición i, ordenado, seguido de un espacio
			System.out.print(frasePartida[i]+ " ");
		}
		
		//Cerramos el Scanner
		read.close();
	}

}
