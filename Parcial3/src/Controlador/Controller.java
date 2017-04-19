/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
/**
 *
 * @author Olivera
 */

import Modelo.Carrera;
import Modelo.Rol;
import java.util.ArrayList;


public class Controller {
    
    private ArrayList<Carrera> estudiantes;
     private CarreraModelo tabla;
    
    
    public void modificar(Integer index,String Materia,Integer Parcial,String Tema,Integer TotalPreg,int PregAReal,String Maestro){
        Carrera editar=Carrera.get(index);
        editar.setMateria(Materia);
        editar.setParcial(Parcial);
        editar.setTema(Tema);
        editar.setNpreguntas(TotalPreg);
        editar.setPregARealizar(PregAReal);
        editar.setTutor(Rol.valueOf(Maestro));
        tabla.fireTableRowsUpdated(index,index);
        tabla.fireTableChanged(null);
    }
    
}
