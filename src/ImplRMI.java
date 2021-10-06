// Implementing the remote interface 
public class ImplRMI implements InterfaceRMI {  
   
    // Implementing the interface method 
    public void printMsg() {  
       System.out.println("This is an example RMI program");  
    }

   
    public String registrarOfertas() {
        // TODO Auto-generated method stub
        return "Satisfactoria";  //else 'No satisfactoria' 
        //Crear objeto y guardar en el db.txt
    }


    public void consultarOfertas(){
        // TODO Auto-generated method stub 
        // Imprimir consultas registradas
        // Leer db.txt
    }  

   
 }  