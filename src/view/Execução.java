package view;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Execução {
	public static void main(String args[]) {
		
		//Pessoa pessoa = new Pessoa();
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setName("Nicolas");
		System.out.println(pf.getName());
		pf.falar();
		
		pj.setRazaoSocial("ETEC Zona Leste");
		System.out.println(pj.getRazaoSocial());
		pj.falar();
		
		/*pessoa.setEndereco("Rua Gaucho");
		 System.out.println("pessoa.getEndereco());*/
		 
	}

}
