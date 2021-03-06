package Encapsulamento;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	
	@Override
	public String toString() {
		return "Cliente [Nome: " + nome + ", CPF: " + cpf + ", Telefone: " + telefone + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	/*Construtor ? utilizado para criar um objeto com as caracteristicas j? atribuidas*/
	
	public Cliente(String cpf) {
		this.cpf = cpf; 
		/*"this" referencia o atributo da propria classe o depois do igual referencia o parametro;
		  "this" ? usado quando o atributo e o argumento tem o mesmo nome, que no caso colocar o mesmo nome ? uma boa pratica;
		*/
	}
	
	/*Quando n?o se atribui argumentos para uma classe  se cria um construtor o construtor padr?o deixa de funcionar */
	
	public Cliente( ) {
		
	}
	
	public Cliente(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}
}