package esgi;

public class DataPair <Integer,Day>{
    private Integer numero;
    private Day jours;

    public DataPair(Integer numero1, Day jours1){
        numero = numero1;
        jours = jours1;
    }

    public Integer getNumero(){
        return numero;
    }

    public Day getJours(){
        return jours;
    }
}
