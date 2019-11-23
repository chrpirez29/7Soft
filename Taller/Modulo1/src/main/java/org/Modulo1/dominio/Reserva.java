package Iteracion1.Dominio;

public class Reserva {

	private Cliente cliente;
	private Vehiculo vehiculo;
	private int idReserva;
	private Box box;
	private Jefe jefe;

	public Reserva() {
		// TODO - implement Reserva.Reserva
		throw new UnsupportedOperationException();
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

	public Vehiculo getVehiculo() {
		return this.vehiculo;
	}

	/**
	 * 
	 * @param vehiculo
	 */
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public int getIdReserva() {
		return this.idReserva;
	}

	/**
	 * 
	 * @param idReserva
	 */
	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

}