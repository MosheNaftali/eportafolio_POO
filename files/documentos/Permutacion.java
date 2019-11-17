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
public class Permutacion extends Operaciones {
    protected int n,r;
    public Permutacion(int n, int r){
        super();
        this.n = n;
        this.r = r;
    }
    
    public long permutacion(){
        return Operaciones.factorial(n)/Operaciones.factorial(n-r);
    }
}
