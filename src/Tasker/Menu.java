package Tasker;
import java.util.Scanner;

public class Menu {
	static int escolher() {
		/*
		 * Função para escolher opções
		 */
		boolean isNum = false; //Se é um número
		Scanner entrada = new Scanner(System.in); //Entrada do usuário
		String opt = ""; //Variável de opção
		String opts = "[1] Adicionar tarefa\n"
				+ "[2] Listar tarefas\n"
				+ "[3] Marcar como concluído"
				+ "[4] Excluir uma tarefa\n"
				+ "\n"
				+ "=> ";
		
		// Pega um input e checa se é um número
		int intOpt = 0; //Número da opção
		do {
			opt = entrada.nextLine();
			
			try {
				intOpt = Integer.parseInt(opt);
				isNum = true;
			}catch (NumberFormatException e) {
				System.out.print("Não é um número válido. \n=> ");
			}
			
		}while(!isNum);
		
		return intOpt;
	}
}
