package Iteracion5.Dominio;

public class Box {

	private string estado;
	private int id;
	private int turno;

	public Box() {
		// TODO - implement Box.Box
		throw new UnsupportedOperationException();
	}

	public string getEstado() {
		return this.estado;
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(string estado) {
		this.estado = estado;
	}

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getTurno() {
		return this.turno;
	}

	/**
	 * 
	 * @param turno
	 */
	public void setTurno(int turno) {
		this.turno = turno;
	}

}