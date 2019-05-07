package model;

public class PessoaJuridica {
	private String razaoSocial ;

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public void falar() {
		System.out.println("Falando - Pessoa Juridica");
	}

}
