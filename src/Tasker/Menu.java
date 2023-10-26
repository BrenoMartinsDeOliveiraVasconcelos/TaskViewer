package Tasker;
import java.util.Scanner;

public class Menu {
	static int escolher(String menu) {
		/*
		 * Fun��o para escolher op��es
		 */
		boolean isNum = false; //Se � um n�mero
		Scanner entrada = new Scanner(System.in); //Entrada do usu�rio
		String opt = ""; //Vari�vel de op��o
		String opts = menu;
		
		// Pega um input e checa se � um n�mero
		int intOpt = 0; //N�mero da op��o
		System.out.print(opts);
		do {
			opt = entrada.nextLine();
			
			try {
				intOpt = Integer.parseInt(opt);
				isNum = true;
			}catch (NumberFormatException e) {
				System.out.print("Numero invalido \n=> ");
			}
			
		}while(!isNum);
		
		return intOpt;
	}
}
