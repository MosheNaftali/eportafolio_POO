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
abstract public class Operaciones {
    
    static long suma(long m, long n){
        return m + n;
    }
    
    static long producto(long m, long n){
        return m * n;
    }
    
    static long factorial(int x){
        long y = 1;
        if (x == 0){
            return 1; 
        } else {
            for (int i = 1 ; i <= x; i++) {
                y = producto(y,suma(0,i));
            }
        return y;    
        }
    }
}
