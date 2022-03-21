package exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceDeUsuario {

	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>() ;
	Scanner entrada = new Scanner(System.in);
	
	public void apresentarInterface()
	{
		this.mostrarMenuOpcoes();
		int opcao = entrada.nextInt();
		while(opcao != 0)
		{
			switch(opcao)
			{
			case 1:
				System.out.println("Nome: ");
				String nome = entrada.nextLine();
				Paciente aux = new Paciente();
				aux.set(nome);
				pacientes.add(aux) ;
				break;
				
			case 2:
				
				
			case 3:
				for(int i=0 ;  i<pacientes.size()   ; i++)
				{
					System.out.println(pacientes.get(i).getNome());
				}
				break;
				
			}
			
			this.mostrarMenuOpcoes();
			opcao = entrada.nextInt();
			
		}
		
	}
	
	
	private void mostrarMenuOpcoes()
	{
		System.out.println("0.Sair");
		System.out.println("1.Cadastrar um paciente");
		System.out.println("2.Cadastrar um médico");
		System.out.println("3.Agendar consulta");
	}
	
	
}
