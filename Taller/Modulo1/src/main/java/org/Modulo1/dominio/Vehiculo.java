package Iteracion1.Dominio;

public class Vehiculo {

	private string matricula;
	private string marca;
	private string modelo;
	private Cliente cliente;

	public Vehiculo() {
		// TODO - implement Vehiculo.Vehiculo
		throw new UnsupportedOperationException();
	}

	public string getMatricula() {
		return this.matricula;
	}

	/**
	 * 
	 * @param matricula
	 */
	public void setMatricula(string matricula) {
		this.matricula = matricula;
	}

	public string getMarca() {
		return this.marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(string marca) {
		this.marca = marca;
	}

	public string getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(string modelo) {
		this.modelo = modelo;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}