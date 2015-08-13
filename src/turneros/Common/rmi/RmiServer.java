package turneros.Common.rmi;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServer {
	public RmiServer() {
		super();
	}
	
	public void bindServer(String server,String bindingName,int port,Remote object) throws AlreadyBoundException, IOException {
		Runtime.getRuntime().exec("rmiregistry "+String.valueOf(port));
		//Registry registry = LocateRegistry.getRegistry(server,port);
		LocateRegistry.createRegistry(port);
        Naming.rebind("//"+server+":"+port+"/"+bindingName,object); 
	}
}
