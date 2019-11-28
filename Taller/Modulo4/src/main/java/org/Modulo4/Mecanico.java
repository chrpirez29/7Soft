package Dominio;

public class Mecanico {

	private string nombre;
	private string dni;
	private Box box;
	private date fnacimiento;

	public Mecanico() {
		// TODO - implement Mecanico.Mecanico
		throw new UnsupportedOperationException();
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

	public Box getBox() {
		return this.box;
	}

	/**
	 * 
	 * @param box
	 */
	public void setBox(Box box) {
		this.box = box;
	}

	public date getFnacimiento() {
		return this.fnacimiento;
	}

	/**
	 * 
	 * @param fnacimiento
	 */
	public void setFnacimiento(date fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public void gestionarBox() {
		// TODO - implement Mecanico.gestionarReparacion
		throw new UnsupportedOperationException();
	}

}