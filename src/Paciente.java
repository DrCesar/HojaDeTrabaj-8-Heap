/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */
public class Paciente implements Comparable<Paciente>{
    
    private String nombre;
    private String condicion;
    private String prioridad;
    
    
    public Paciente(String n, String c, String p){
        this.nombre = n;
        this.condicion = c;
        this.prioridad = p;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the condicion
     */
    public String getCondicion() {
        return condicion;
    }

    /**
     * @param condicion the condicion to set
     */
    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    /**
     * @return the prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int compareTo(Paciente t) {
        return this.getPrioridad().compareTo(t.getPrioridad());
    }
    
    public String toString(){
        return this.nombre + ", " + this.condicion + ", " + this.prioridad + ".";
    }
}
