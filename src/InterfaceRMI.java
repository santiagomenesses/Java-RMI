import java.rmi.Remote; 
import java.rmi.RemoteException;  

// Creating Remote interface for our application 
public interface InterfaceRMI extends Remote {  
   void printMsg() throws RemoteException;  
   String registrarOfertas() throws RemoteException;
   void consultarOfertas() throws RemoteException;
} 