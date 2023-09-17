package entidades;

public class Topic {

	private String nome;
	private String descricao;
	private String id;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Topic(String nome, String descricao, String id) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.id = id;
	}
	public Topic() {
		super();
	}
	
	
}
