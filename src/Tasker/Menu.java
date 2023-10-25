package Tasker;
import java.util.Scanner;

public class Menu {
	static int escolher() {
		/*
		 * Fun��o para escolher op��es
		 */
		boolean isNum = false; //Se � um n�mero
		Scanner entrada = new Scanner(System.in); //Entrada do usu�rio
		String opt = ""; //Vari�vel de op��o
		String opts = "[1] Adicionar tarefa\n"
				+ "[2] Listar tarefas\n"
				+ "[3] Marcar como conclu�do"
				+ "[4] Excluir uma tarefa\n"
				+ "\n"
				+ "=> ";
		
		// Pega um input e checa se � um n�mero
		int intOpt = 0; //N�mero da op��o
		do {
			opt = entrada.nextLine();
			
			try {
				intOpt = Integer.parseInt(opt);
				isNum = true;
			}catch (NumberFormatException e) {
				System.out.print("N�o � um n�mero v�lido. \n=> ");
			}
			
		}while(!isNum);
		
		return intOpt;
	}
}
