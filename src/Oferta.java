import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Oferta {

    private Integer id;
    private Integer sector;
    private Integer vacantes;
    

    public Oferta() {
    }

    public Oferta(Integer id, Integer sector, Integer vacantes) {
        this.id = id;
        this.sector = sector;
        this.vacantes = vacantes;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSector() {
        return this.sector;
    }

    public void setSector(Integer sector) {
        this.sector = sector;
    }

    public Integer getVacantes() {
        return this.vacantes;
    }

    public void setVacantes(Integer vacantes) {
        this.vacantes = vacantes;
    }

    @Override
    public String toString() {
        return "id='" + getId() + "'" +
            ", sector='" + getSector() + "'" +
            ", vacantes='" + getVacantes() + "'";
    }

    public void saveDB(Oferta oferta){
        File db = new File("db.txt");

        try{
            if(!db.exists()){
                System.out.println("We had to make a new file.");
                db.createNewFile();
            }
        FileWriter fileWriter = new FileWriter(db, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(oferta.toString() + "\n");
        bufferedWriter.close();    

    } catch(IOException e) {
        System.out.println("No satisfactoria");
    }
        
    }
}