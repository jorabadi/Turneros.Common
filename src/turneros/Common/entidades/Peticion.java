package turneros.Common.entidades;

public class Peticion {
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCodigoTaquilla() {
		return codigoTaquilla;
	}
	public void setCodigoTaquilla(int codigoTaquilla) {
		this.codigoTaquilla = codigoTaquilla;
	}
	private String nombre;
	private int codigoTaquilla;
	
}
