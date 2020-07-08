package tareaUI1.probabilidad;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;    //Para capturar por teclado.

public class Principal {
	
	public static String leerDato(){
		
	    String sdato = "";
	    try
	    {
	      // Definir un flujo de caracteres de entrada: 
	      InputStreamReader isr = new InputStreamReader(System.in);
	      BufferedReader flujoE = new BufferedReader(isr);
	      sdato = flujoE.readLine();
	    }
	    catch(IOException e)
	    {
	      System.err.println("Error Class_EControl_Foc: " + e.getMessage());
	    }
	    return sdato; 
	} 

	public static void main(String[] args) {
		//Variables globales. 
			Dados partida = new Dados();
			Scanner teclado = new Scanner(System.in);
			int iNumeroCaras, iValorDado1, iValorDado2, iResultado;
		
		//Pedimos dato de número de caras por consola.
			System.out.println("Casino Micasa. Bienvenido");
			System.out.println();
			System.out.print("Introducir número de cara de los dados = ");
			iNumeroCaras = teclado.nextInt();
			//String pepe = leerDato();
			//System.out.println(pepe);
		//Comprobamos el dato introducido.
			if ((iNumeroCaras != 4) & (iNumeroCaras != 6) & (iNumeroCaras != 10)){
				System.out.println();
				System.out.print("Dato mal introducido, debe ser 4, 6 ó 10.");
			}
		//Si el dato es bueno calculamos el valor de los dados y los mostramos
			else {
				System.out.println();
				System.out.print("Pulsar tecla para tirar los dados... ");
				//Para esperar la pulsación hay que ponerlo 2 veces...
				teclado.nextLine();
				teclado.nextLine();
				iValorDado1 = partida.LanzarDado(iNumeroCaras);
				System.out.println();
				System.out.print("El valor del dado 1 es = " + iValorDado1);
				iValorDado2 = partida.LanzarDado(iNumeroCaras);
				System.out.println();
				System.out.print("El valor del dado 2 es = " + iValorDado2);
				iResultado = iValorDado1 + iValorDado2;
				System.out.println();
				System.out.print("El valor total es = " + iResultado);
				System.out.println();
					System.out.print("F I N");
			}	
	}
}
