/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package maquina_contadora;

/**
 *
 * @author DMG
 */
public class Combinacion extends Permutacion{

    public Combinacion(int n, int r) {
        super(n, r);
        
    }
    
    public long combinacion(){
        return permutacion()/Operaciones.factorial(r);
    }
    
}
