package tarefa_fs;

public class PessoaFisica extends Pessoa {

	private int cpf;
	private String dtNascimento;
	private String genero;
	
	public int getCpf() {
		return this.cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf; 
	}
	
	public String getDtNascimento() {
		return this.dtNascimento;
	}
	
	public void setDtNascimento(String dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	
	public String getGenero() {
		return this.genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public int getIdade() {
		
	}
	
}
