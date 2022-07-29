package model.bean;

/**
 *
 * @author Caio Cardosdo,Carlos Henrrique,Ian Carlos, Maikon Alexandre,Raul
 * Romualdo e Vitor Ricardo.
 */
public class Proprietario {

    private String nomePropie;
    private char cpfPropie;
    private char telefonePropie;

    public String getNomePropie() {
        return nomePropie;
    }

    public void setNomePropie(String nomePropie) {
        this.nomePropie = nomePropie;
    }

    public char getCpfPropie() {
        return cpfPropie;
    }

    public void setCpfPropie(char cpfPropie) {
        this.cpfPropie = cpfPropie;
    }

    public char getTelefonePropie() {
        return telefonePropie;
    }

    public void setTelefonePropie(char telefonePropie) {
        this.telefonePropie = telefonePropie;
    }
}
