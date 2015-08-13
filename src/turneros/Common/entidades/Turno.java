package turneros.Common.entidades;

import java.io.Serializable;
import java.util.Date;


public class Turno implements Serializable {
	public String turno;
	private String taquilla;
	
	public int getServicio() {
		return servicio;
	}
	public void setServicio(int servicio) {
		this.servicio = servicio;
	}

	private int servicio;
    public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	private Date fecha;
	
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getTaquilla() {
		return taquilla;
	}
	public void setTaquilla(String taquilla) {
		this.taquilla = taquilla;
	}
	
	
	public Turno(String turno,
		  String taquilla,
		  int servicio,
		  Date fecha) {

          this.turno = turno;
          this.taquilla = taquilla;
          this.servicio = servicio;
          this.fecha = fecha;
    }
	private Turno() {} // For deserialization
	
	@Override
    public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("turno=").append(turno);
		sb.append(" taquilla=").append(taquilla);
		sb.append(" servicio=").append(servicio);
		sb.append(" fecha=").append(fecha);
		return sb.toString();
    }
	
}
