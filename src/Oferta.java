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
        return "{" +
            " id='" + getId() + "'" +
            ", sector='" + getSector() + "'" +
            ", vacantes='" + getVacantes() + "'" +
            "}";
    }

}