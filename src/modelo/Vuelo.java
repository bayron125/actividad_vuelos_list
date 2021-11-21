package modelo;

import java.util.Date;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo>{
    private String idVuelo, origen, destino;
    private Integer cantidadPasajeros;
    private Date fechaLlegada;

    public Vuelo(String vuelo, String origen, String destino,Date fechaLlegada, int cantidadPasajeros) {
        this.idVuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.cantidadPasajeros = cantidadPasajeros;
        this.fechaLlegada = fechaLlegada;

    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Integer getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }


    @Override
    public int compareTo(Vuelo o) {

        return this.fechaLlegada.compareTo(o.getFechaLlegada());
    }

    @Override
    public String toString() {
        return  idVuelo + "   " +
                origen + "   " +
                destino + "   " +
                fechaLlegada + "   " +
                cantidadPasajeros ;
    }
}
