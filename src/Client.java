import java.rmi.registry.LocateRegistry; 
import java.rmi.registry.Registry;
import java.util.Scanner;  

public class Client {  
   private Client() {}  
   public static void main(String[] args) {  
     
    Scanner s = new Scanner(System.in);
    int op;
    Integer id = 0, sector, vacante;
    
      try {  
         // Getting the registry 
         Registry registry = LocateRegistry.getRegistry(null); 
    
         // Looking up the registry for the remote object 
         InterfaceRMI stub = (InterfaceRMI) registry.lookup("InterfaceRMI"); 
    
         do{
         System.out.println("Bienvenido! Escoja la opcion que desee utilizar: (Escriba '1', '2' o '3')"); 
         System.out.println("1. Crear oferta de trabajo");
         System.out.println("2. Consultar las ofertas registradas");
         System.out.println("3. Salir");
         op = s.nextInt();
         if(op==1){     // Calling the registrarOfertas() method
            id += 1;
            System.out.println("Ingrese el sector de la oferta: ");
            sector = s.nextInt();
            System.out.println("Ingrese la cantidad de vacantes para la oferta: ");
            vacante = s.nextInt();
            stub.registrarOfertas(id, sector, vacante);
            System.out.println("stub enviado");
         }
         if(op==2){     // Calling the consultarOfertas() method
            stub.consultarOfertas();
         }
         }while(op!=3);

         // Calling the remote method using the obtained object 
         // stub.printMsg(); 
            
      } catch (Exception e) {
         System.err.println("Client exception: " + e.toString()); 
         e.printStackTrace(); 
      } 
   } 
}