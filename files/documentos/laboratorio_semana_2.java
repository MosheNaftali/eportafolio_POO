class Empleado{
    private int clave;
    private String nombre;
    private double monto;
    
    public void setClave(int clave){
        this.clave = clave;
    }
    public int getClave(){
        return this.clave;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setMonto(double monto){
        this.monto = monto;
    }
    public double getMonto(){
        return this.monto;
    }
    double calculaPercepcionIVA(){
        return this.monto * 0.15;
    }
    double calculaSubTotal(){
        return this.monto + this.calculaPercepcionIVA();
    }
    double calculaRetencionIVA(){
        return this.monto * 0.10;
    }
    double calculaRetencionISR(){
        return this.monto * 0.10;
    }
    double calculaTotal(){
        return this.calculaSubTotal() - this.calculaRetencionISR() - this.calculaRetencionIVA();
    }
}

public class RevisionSalarial{
    public static void main(String[]arguments){
        Empleado empleado1 = new Empleado();
        empleado1.setClave(1001);
        empleado1.setNombre("James Mago");
        empleado1.setMonto(8000);
        
        Empleado empleado2 = new Empleado();
        empleado2.setClave(1002);
        empleado2.setNombre("Santana Ulálume");
        empleado2.setMonto(10000);
        
        Empleado empleado3 = new Empleado();
        empleado3.setClave(1003);
        empleado3.setNombre("Zuleikan Omar");
        empleado3.setMonto(15000);
        
        
        System.out.println("=================================================");
        System.out.println("Clave del empleado: \t" + empleado1.getClave());
        System.out.println("Nombre: \t\t" + empleado1.getNombre());
        System.out.println("Honorarios: \t\t$" + empleado1.getMonto());
        System.out.println("+ IVA: \t\t\t$" + empleado1.calculaPercepcionIVA());
        System.out.println("= Subtotal: \t\t$" + empleado1.calculaSubTotal());
        System.out.println("- Retencion ISR: \t$" + empleado1.calculaRetencionISR());
        System.out.println("- Retencion IVA: \t$" + empleado1.calculaRetencionIVA());
        System.out.println("-------------------------------------------------");
        System.out.println("= Total: \t\t$" + empleado1.calculaTotal());
        System.out.println();
        
        System.out.println("Clave del empleado: \t" + empleado2.getClave());
        System.out.println("Nombre: \t\t" + empleado2.getNombre());
        System.out.println("Honorarios: \t\t$" + empleado2.getMonto());
        System.out.println("+ IVA: \t\t\t$" + empleado2.calculaPercepcionIVA());
        System.out.println("= Subtotal: \t\t$" + empleado2.calculaSubTotal());
        System.out.println("- Retencion ISR: \t$" + empleado2.calculaRetencionISR());
        System.out.println("- Retencion IVA: \t$" + empleado2.calculaRetencionIVA());
        System.out.println("-------------------------------------------------");
        System.out.println("= Total: \t\t$" + empleado2.calculaTotal());
        System.out.println();
        
        System.out.println("Clave del empleado: \t" + empleado3.getClave());
        System.out.println("Nombre: \t\t" + empleado3.getNombre());
        System.out.println("Honorarios: \t\t$" + empleado3.getMonto());
        System.out.println("+ IVA: \t\t\t$" + empleado3.calculaPercepcionIVA());
        System.out.println("= Subtotal: \t\t$" + empleado3.calculaSubTotal());
        System.out.println("- Retencion ISR: \t$" + empleado3.calculaRetencionISR());
        System.out.println("- Retencion IVA: \t$" + empleado3.calculaRetencionIVA());
        System.out.println("-------------------------------------------------");
        System.out.println("= Total: \t\t$" + empleado3.calculaTotal());
        System.out.println("=================================================");
    }
}