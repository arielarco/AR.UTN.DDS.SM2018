package sge;

public abstract class Categoria {
	private String descripcion;
	private int rangoDesde;
	private int rangoHasta;
	
	public Categoria(String descripcion, int rangoDesde, int rangoHasta, float cargoFijo, float cargoVariable) {
		super();
		this.descripcion = descripcion;
		this.rangoDesde = rangoDesde;
		this.rangoHasta = rangoHasta;
		this.cargoFijo = cargoFijo;
		this.cargoVariable = cargoVariable;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public int getRangoDesde() {
		return rangoDesde;
	}
	public int getRangoHasta() {
		return rangoHasta;
	}
	public float getCargoFijo() {
		return cargoFijo;
	}
	public float getCargoVariable() {
		return cargoVariable;
	}
	private float cargoFijo;
	private float cargoVariable;
}
