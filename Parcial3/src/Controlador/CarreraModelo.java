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
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class CarreraModelo extends AbstractTableModel{
    private ArrayList<Carrera> oEstudiantes;
    
    
    public CarreraModelo(ArrayList<Carrera>oE){
        oEstudiantes = oE;  
    }

    
    @Override
    public int getRowCount() {
        return oEstudiantes.size();
    }

    
    @Override
    public int getColumnCount() {
        return 7;
    }

    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Carrera personita = oEstudiantes.get(rowIndex);
        switch (columnIndex){
            case 0: return personita.getMateria();
            case 1: return personita.getParcial();
            case 2: return personita.getTema();  
            case 3: return personita.getTutor(); 
            case 4: return personita.getNpreguntas(); 
            case 5: return personita.getPregARealizar();
            case 6: return personita.getIntentos();

        }
        return null;
    }
    
    public String getColumnName(int i) {
        switch(i){
            case 0: return "Materia";
            case 1: return "Parcial";
            case 2: return "Tema";
            case 3: return "Tutor"; 
            case 4: return "Preguntas"; 
            case 5: return "Preg. a realizar";
            case 6: return "Intentos"; 

        }
        return null;
    }
}
