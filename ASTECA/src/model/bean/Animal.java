
package model.bean;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class Animal {

    private String nomeAnimal;
    private int codRaca;
    private String sexo;
    private String codAnimal;
    private String datNasc;
    private char cpfPropie;
    private String raca;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public int getCodRaca() {
        return codRaca;
    }

    public void setCodRaca(int codRaca) {
        this.codRaca = codRaca;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(String codAnimal) {
        this.codAnimal = codAnimal;
    }

    public String getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(String datNasc) {
        this.datNasc = datNasc;
    }

    public char getCpfPropie() {
        return cpfPropie;
    }

    public void setCpfPropie(char cpfPropie) {
        this.cpfPropie = cpfPropie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
