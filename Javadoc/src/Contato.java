
/**
 * Classe que representa contato,gerando javadoc 
 * @author tiyas
 * @version 1.0
 *
 */

public class Contato {

	/**
	 * Nome do contato
	 */
	private String nome;
	/**
	 * E-mail do contato.
	 */
	private String email;
	/**
	 * Endereco contato
	 */
	private Endereco endereco= new Endereco();
	
	/**
	 * Construtor
	 * @param nome Nome do contato
	 * @param email contato
	 */
	public Contato(String nome, String email) {
		this.nome= nome;
		this.email=email;
	}
	/**
	 * Define o endereco do contato
	 * @param rua
	 * @param numero
	 */
	public void definirEndereco(String rua, int numero) {
		endereco.setRua(rua);
		endereco.setNumero(numero);
	}
	/**
	 * Retorna um nome
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * Retorna email
	 * @return
	 */
	public String getEmail() {
		return email;
	}
}
