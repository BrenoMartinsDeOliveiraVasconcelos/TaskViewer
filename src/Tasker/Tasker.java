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
					+ "[2] Adicionar tarefa\n"
					+ "[3] Marcar como concluido\n"
					+ "[4] Excluir uma tarefa\n"
					+ "[5] Sair\n"
					+ "\n"
					+ "=> ");
			
			//Se não for nenhuma das opções, dá erro.
			if (opt < 1 || opt > 5) {
				System.out.print("Opção invalida!\n");
			}else {
				//Agora sim!!
				boolean isNum = false; //Para ajudar a checar se o input se trata de um número
				switch (opt) {
					case 1:
						//Começar pelas tarefas pendentes
						System.out.print("=========\nPENDENTES\n=========\n");
						for (int index=0; index<tarefasPendentes.size(); index++) {
							System.out.print(tarefasPendentes.get(index)+" (CODIGO: "+(tarefasPendentes.size()-1)+")\n"); //Output o indice especificado
						};
						
					 	System.out.print("==========\nCONCLUIDAS\n==========\n");
						for (int index=0; index<tarefasConcluidas.size(); index++) {
							System.out.print(tarefasConcluidas.get(index)+" (CODIGO: "+(tarefasConcluidas.size()-1)+")\n"); //Output o indice especificado
						}
						break;
					case 2:
						//Adiciona uma nova tarefa
						Scanner tarefa = new Scanner(System.in);
						
						System.out.print("Tarefa: ");
						tarefasPendentes.add(tarefa.nextLine());
						break;
					case 3:
						System.out.print("Codigo: ");
						Scanner codigo = new Scanner(System.in); //Pegar o indice da tarefa e adicionar as tarefas concluidas. Remover das pendentes
						int indice = 0;

						//Para pegar números
						try {
							indice = Integer.parseInt(codigo.nextLine());
						}catch (NumberFormatException e) {
							System.out.print("Numero invalido\n");
						}

						if (indice >= tarefasPendentes.size()){
							System.out.print("Fora do range!\n"); //Se tiver for do indice
						}else{
							tarefasConcluidas.add(tarefasConcluidas.size(), tarefasPendentes.get(indice)); //Adiciona as tarefas concluidas
							tarefasPendentes.remove(indice); //Remove das pendentes
							isNum = true;
						}
						break;
					case 4:
						/*
						* Excluir da lista de tarefas
						*/

						Scanner opc = new Scanner(System.in);
						int index = 0;
						String opcao = "";

						// Remoção
						System.out.print("Remover dos pendentes ou dos concluidos? [PENDENTES/CONCLUIDAS]: ");
						opcao = opc.nextLine();
						System.out.print("Código: ");

						try {
							indice = Integer.parseInt(opc.nextLine());
						}catch (NumberFormatException e) {
							System.out.print("Numero invalido\n");
						}
						
						//Fazer a operação de exclusão
						if (opcao.toUpperCase().equals("PENDENTES")){
							try{
								tarefasPendentes.remove(index);
							}catch (IndexOutOfBoundsException e){
								System.out.print("Fora do RANGE!\n");
							}
						}else if (opcao.toUpperCase().equals("CONCLUIDAS")){
							try{
								tarefasConcluidas.remove(index);
							}catch (IndexOutOfBoundsException e){
								System.out.print("Fora do RANGE!\n");
							}
						}else{
							System.out.print("Opção invalida");
						}
						break;
					case 5:
						System.exit(300);
					default:
						System.out.print("Opcao incorreta");
				};
				Input.pausar();
			}
		}
		
	}

}
