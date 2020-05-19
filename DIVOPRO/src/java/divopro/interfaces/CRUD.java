/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divopro.interfaces;

import java.util.List;

/**
 *
 * @author Robinson
 */
public interface CRUD<CualquierCosa> { //DEFINICION DE METODO 
    
    public boolean create(CualquierCosa x);
    public CualquierCosa read(Object key);
    public boolean update(CualquierCosa x);
    public boolean delete(Object key);
    public List<CualquierCosa> readAll();
    
    
}


