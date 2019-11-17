class Cuenta{  

	double 	balance;              
	
	void deposito(double cantidad){   
		balance = balance + cantidad;
	}
		
	void retiro(double cantidad){   
		balance-=cantidad;
	}
}

class TestCuentaProblematica{  
	public static void main(String [ ] arguments){  
		
		Cuenta otraCuenta;  
		otraCuenta = new Cuenta();  
		otraCuenta.deposito(1000.0);  
		otraCuenta.retiro(2750.0);   //Se provoca un sobregiro
		otraCuenta.balance+= (-1500.0);  //Mala práctica: se accede directamente al atrbuto balance
		
		//Se despliega en pantalla :	El balance de otraCuenta es: -3250.0 ; con un balance inconsistente 
		System.out.println("El balance de otraCuenta es: " + otraCuenta.balance );
		
	}
}