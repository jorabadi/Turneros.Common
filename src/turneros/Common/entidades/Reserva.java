package turneros.Common.entidades;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "reserva")
public class Reserva implements Serializable {
	public static String CODIGOTAQUILLA = "codigoTaquilla";
	public int getCodigoReserva() {
		return codigoReserva;
	}
	public void setCodigoReserva(int codigoReserva) {
		this.codigoReserva = codigoReserva;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	@DatabaseField(generatedId = true)
	private int codigoReserva;
	@DatabaseField
	public String turno;
	
	@DatabaseField
	private int codigoServicio;
	

	public int getCodigoServicio() {
		return codigoServicio;
	}
	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	@DatabaseField
	private String codigoTaquilla;
	public String getCodigoTaquilla() {
		return codigoTaquilla;
	}
	public void setCodigoTaquilla(String codigoTaquilla) {
		this.codigoTaquilla = codigoTaquilla;
	}
	@DatabaseField
	private String estado;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String servicio;
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
    
}
