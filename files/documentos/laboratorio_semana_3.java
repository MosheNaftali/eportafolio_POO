/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moshe
 */
public class ProgramaJavaOO {
    public static void main(String[] args){
        Mujer blackWidow;
        Hombre bruceBanner;
        Hulk theHulk;
        Avion cazaII;
        cazaII = new Avion("Caza 2");
        blackWidow = new Mujer("Black Widow");
        bruceBanner = new Hulk("Hulk");
        theHulk = (Hulk) bruceBanner;
        blackWidow.habla("Socorro");
        blackWidow.corre();
        theHulk.corre();
        theHulk.salta();
        theHulk.vuela();
        cazaII.vuela();
        Humano personaje;
        personaje = blackWidow;
        personaje.corre();
        personaje = theHulk;
        personaje.corre();
    }
}

class Humano{
    protected String nombre;
    public Humano(String nombre){
        this.nombre = nombre;
    }
    public void corre(){
        System.out.println(nombre + " corre: lento");
    }
    public void salta(){
        System.out.println(nombre + " salta: bajo");
    }
    public void habla(String palabras){
        System.out.println(nombre + " habla: " + palabras);
    }
}

class Mujer extends Humano {
    private Object cuerpoFemenino;
    
    public Mujer(String nombre){
        super(nombre);
    }
}

class Hombre extends Humano {
    private Object cuerpoMasculino;
    
    public  Hombre(String nombre){
        super(nombre);
    }
}

class Hulk extends Hombre{
    private Object grandesMusculos;
    
    public Hulk(String nombre){
        super(nombre);
    }
    public void corre(){
        System.out.println(nombre + " corre: veloz");
    }
    public void salta(){
        System.out.println(nombre + " salta: alto");
    }
    public void vuela(){
        System.out.println(nombre + " vuela cuando:");
        this.salta();
    }
}

class Avion {
    public String nombre;
    public Avion(String nombre){
        this.nombre = nombre;
    }
    public void vuela(){
        System.out.println("El avion " + nombre + " vuela: con motor a chorro");
    }
}