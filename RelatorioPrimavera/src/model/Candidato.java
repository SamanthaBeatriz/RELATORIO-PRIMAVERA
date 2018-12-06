package model;

public class Candidato {
	private int ID;
	private String nome;
	private int RM;
	private int idade;
	private String sala;
	private String sexo;

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		this.ID = id;
	}
	
	public int getRm() {
		return RM;
	}

	public void setRm(int RM) {
		this.RM = RM;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala= sala;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
}
