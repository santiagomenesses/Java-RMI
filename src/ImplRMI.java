import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Implementing the remote interface 
public class ImplRMI implements InterfaceRMI {  
   
    // Implementing the interface method 
    public void printMsg() {  
       System.out.println("This is an example RMI program");  
    }

   
    public void registrarOfertas(Integer id, Integer sector, Integer vacante) {
       
        Oferta oferta = new Oferta();
        oferta.setId(id);
        oferta.setSector(sector);
        oferta.setVacantes(vacante);
        oferta.saveDB(oferta);
        System.out.println("Satisfactoria");
    }


    public void consultarOfertas(){
        // Imprimir consultas registradas
        // Leer db.txt
        try {
            File file = new File("db.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }  

   
 }  