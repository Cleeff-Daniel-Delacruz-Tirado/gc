/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cleeff Daniel D.T
 */
public class Medico {

    private String nombre;
    /*
    colegio de medicos del Perú
    */
     private String Cmp;
     
/* Agrega las especialidades al medico
     */
     private List<Especialidad> especialidades;
     
     public Medico(String nombre, String CMP, List<Especialidad> especialidades) throws Exception {
        this.nombre = nombre;
        this.Cmp = CMP;
        this.especialidades = especialidades;
        if(especialidades==null){
            throw new Exception("No se puede crear");
        }
    }
     
    public void agregarEspecialidad(Especialidad especialidad){
     
        this.especialidades.add(especialidad);
    } 
    
     public String getDatosMostrar(){
      return this.nombre + " | CMP: "+this.Cmp;
     }
    /**
     * @return the Cmp
     */
    public String getCmp() {
        return Cmp;
    }

    /**
     * @param Cmp the Cmp to set
     */
    public void setCmp(String Cmp) {
        this.Cmp = Cmp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    /* agrega una lista de especialidades 
    */
    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
}
