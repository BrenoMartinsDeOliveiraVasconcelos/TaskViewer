package Tasker;

import java.util.LinkedList;
import java.util.Scanner;

public class Tasker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> tarefasPendentes = new LinkedList<String>(); //Lista contendo as tarefas
		LinkedList<String> tarefasConcluidas = new LinkedList<String>();
		
		while (true) {
			/*
			 * Loop principal
			 */
			//Chama o menu
			int opt = Menu.escolher("[1] Listar tarefa\n"
					+ "[2] Adicionar tarefas\n"
					+ "[3] Marcar como concluido\n"
					+ "[4] Excluir uma tarefa\n"
					+ "[5] Sair\n"
					+ "\n"
					+ "=> ");
			
			//Se não for nenhuma das opções, dá erro.
			if (opt < 1 || opt > 5) {
				System.out.print("Opção invalida!");
			}else {
				//Agora sim!!
				switch (opt) {
					case 1:
						//Começar pelas tarefas pendentes
						System.out.print("=========\nPENDENTES\n=========\n");
						for (int index=0; index<tarefasPendentes.size(); index++) {
							System.out.print(tarefasPendentes.get(index)); //Output o indice especificado
						};
						
					 	System.out.print("==========\nCONCLUIDAS\n==========\n");
						for (int index=0; index<tarefasConcluidas.size(); index++) {
							System.out.print(tarefasConcluidas.get(index)); //Output o indice especificado
						}
						break;
					case 2:
						//Adiciona uma nova tarefa
						Scanner tarefa = new Scanner(System.in);
						
						System.out.print("Tarefa: ");
						tarefasPendentes.add(tarefa.next()+"(CODIGO: "+tarefasPendentes.size()-1+")\n");
						break;
					case 3:
						System.out.print("Codigo: ");
						Scanner 
				};
				Input.pausar();
			}
		}
		
	}

}
