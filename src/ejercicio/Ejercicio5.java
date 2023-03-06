package ejercicio;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		String palabra; //Se guardará la palabra elegida por el usuario
		int n; //Se guardará el número en el que desea fraccionar las palabras
		String parte=" "; //Se guardará cada trozo de palabra fraccionada
		int inicio=0; //Se guardará desde donde empezará a coger letras
		int fin =0; //Se guardará hasta donde cogerá letras
		
		//Creamos el Scanner 
		Scanner read= new Scanner (System.in);

		//Solictamos palabra
		System.out.println("Introduzca una palabra");
		//Leemos palabra
		palabra= read.next();
		
		//Pedimos en cuántas letras desea fraccionarla
		System.out.println("¿En cuántas letras desea fraccionar la palabra?");
		//Leemos el número
		n=read.nextInt();
		
		//Mientras que inicio sea menor a la longitud de la palabra
		while (inicio<palabra.length()) {
			//Sumaremos n + inicio para saber a donde tenemos que llegar
			fin=inicio+n;
			//Si el fin es mayor que la longitud de la palabra
			if (fin>palabra.length()) {
				//El fin será la longitud de la palabra
				fin=palabra.length();
			}
			//Fraccionará la palabra cogiendo las letras desde el inicio hasta el fin
			parte=palabra.substring(inicio, fin);
			
			//Mostramos en pantalla cada parte
			System.out.println(parte);
			
			//Sumamos la cantidad a frasccionar para comenzar en una nueva posicion
			inicio+=n;
		}
		
		//Cerramos el Scanner 
		read.close();
	}

}
