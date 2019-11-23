package Iteracion1.Dominio;

public class Cliente {

	private string nombre;
	private string dni;
	private string cuentaBancaria;
	private long telefono;

	public Cliente() {
		// TODO - implement Cliente.Cliente
		throw new UnsupportedOperationException();
	}

	public string getCuentaBancaria() {
		return this.cuentaBancaria;
	}

	/**
	 * 
	 * @param cuentaBancaria
	 */
	public void setCuentaBancaria(string cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getDni() {
		return this.dni;
	}

	/**
	 * 
	 * @param dni
	 */
	public void setDni(string dni) {
		this.dni = dni;
	}

	public long getTelefono() {
		return this.telefono;
	}

	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

}