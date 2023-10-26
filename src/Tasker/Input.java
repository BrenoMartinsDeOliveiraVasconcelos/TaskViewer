package Tasker;

import java.util.Scanner;

public class Input {
	static void pausar() {
		/*
		 * Pausa o programa
		 */
		Scanner pause = new Scanner(System.in);
		
		System.out.print("ENTER PARA CONTINUAR. ");
		pause.next();
	}
}
