package turneros.Common.entidades;

import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "servicio")
public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;
	private static String CODIGOSERVICIO = "codigoServicio";
	

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@DatabaseField(id = true, columnName = "codigoServicio")
	private int codigoServicio;
	public int getCodigoServicio() {
		return codigoServicio;
	}
	public void setCodigoServicio(int codigoServicio) {
		this.codigoServicio = codigoServicio;
	}

	@DatabaseField
	private String nombre;
    public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	@DatabaseField
	public String turno;
	
	@DatabaseField
	public String label;


	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
