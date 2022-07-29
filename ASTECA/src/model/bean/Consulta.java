package model.bean;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class Consulta {

    private int codRaca;
    private int codAnimal;
    private String especie;
    private String suspeitaClinica;
    private int codCom;
    private char crmv;

    public int getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(int codRaca) {
        this.codRaca = codRaca;
    }

    public int getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(int codAnimal) {
        this.codAnimal = codAnimal;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSuspeitaClinica() {
        return suspeitaClinica;
    }

    public void setSuspeitaClinica(String suspeitaClinica) {
        this.suspeitaClinica = suspeitaClinica;
    }

    public int getCodCom() {
        return codCom;
    }

    public void setCodCom(int codCom) {
        this.codCom = codCom;
    }

    public char getCrmv() {
        return crmv;
    }

    public void setCrmv(char crmv) {
        this.crmv = crmv;
    }

}
