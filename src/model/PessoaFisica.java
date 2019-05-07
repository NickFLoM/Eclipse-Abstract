package model;

public class PessoaFisica {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
		
	public void falar () {
		System.out.println("Falando - Pessoa Fisica");
	}

}
