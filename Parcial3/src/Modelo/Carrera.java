/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Olivera
 */
public class Carrera {

    public static Carrera get(Integer index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String materia;
    private Integer parcial;
    private String tema;
    private Rol tutor;
    private Integer npreguntas;
    private Integer pregARealizar;
    private Integer intentos;
    
    public Carrera (String materia, int parcial, String tema, Rol tutor,int npreguntas,int pregARelizar,int intentos){
        this.materia = materia;
        this.parcial = parcial;
        this.tema = tema;
        this.tutor = tutor;
        this.npreguntas = npreguntas;
        this.pregARealizar = pregARelizar;
        this.intentos = intentos;
    }

    public Carrera() {
        
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Integer getParcial() {
        return parcial;
    }

    public void setParcial(Integer parcial) {
        this.parcial = parcial;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public Rol getTutor() {
        return tutor;
    }

    public void setTutor(Rol tutor) {
        this.tutor = tutor;
    }

    public Integer getNpreguntas() {
        return npreguntas;
    }

    public void setNpreguntas(Integer npreguntas) {
        this.npreguntas = npreguntas;
    }
    
    
    
    public String toString(){
         return  ("\nMateria: "+getMateria() + "\n" +"Parcial: "+getParcial() + "\n" +"Tema: "+getTema()+"\n"+"Tutor: "+getTutor()+"\n"+"Preguntas :"+getNpreguntas()+"\n");
    }

    /**
     * @return the pregARealizar
     */
    public Integer getPregARealizar() {
        return pregARealizar;
    }

    /**
     * @param pregARealizar the pregARealizar to set
     */
    public void setPregARealizar(Integer pregARealizar) {
        this.pregARealizar = pregARealizar;
    }

    /**
     * @return the intentos
     */
    public Integer getIntentos() {
        return intentos;
    }

    /**
     * @param intentos the intentos to set
     */
    public void setIntentos(Integer intentos) {
        this.intentos = intentos;
    }
    
    
}
