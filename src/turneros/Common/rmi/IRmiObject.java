package turneros.Common.rmi;

import java.rmi.RemoteException;
import java.util.List;

import turneros.Common.entidades.Reserva;
import turneros.Common.entidades.Servicio;
import turneros.Common.entidades.Taquilla;

public interface IRmiObject extends java.rmi.Remote
{
	public Reserva solicitarServicio(Servicio servicio) throws RemoteException;
	public Reserva solicitarTurno(Taquilla taquilla) throws RemoteException;
	public List<Servicio> listarServiciosDisponibles() throws RemoteException;
}