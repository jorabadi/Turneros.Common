package turneros.Common.entidades;

import java.io.Serializable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "servicioTaquilla")
public class ServicioTaquilla implements Serializable {

	private static final long serialVersionUID = 1L;
	public static String CODIGOSERVICIO = "codigoServicio";
	public static String CODIGOTAQUILLA = "codigoTaquilla";
	
	@DatabaseField(id = true)
	private int codigoTaquillaServicio;
	
	@DatabaseField
	private int codigoServicio;
	
	@DatabaseField
	private int codigoTaquilla;
}
