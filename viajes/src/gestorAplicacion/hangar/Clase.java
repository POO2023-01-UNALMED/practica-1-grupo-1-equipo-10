package gestorAplicacion.hangar;
public enum Clase {

	ECONOMICA(10000),EJECUTIVA(70000);

	private int precio;

	private Clase(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio =precio;
	}
}
