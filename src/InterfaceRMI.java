import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface InterfaceRMI extends Remote {  
   void printMsg() throws RemoteException;  
   void registrarOfertas(Integer id, Integer sector, Integer vacante) throws RemoteException;
   void consultarOfertas() throws RemoteException;
} 