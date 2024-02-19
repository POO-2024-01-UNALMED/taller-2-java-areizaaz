package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos(){
		
		int cantidadAsientos = 0;
		for (int i = 0; i < asientos.length; i++){
			
			if (asientos[i] != null){
				
				cantidadAsientos++;
				
			}
		}
	return cantidadAsientos;
	}
	
	String verificarIntegridad() {
		
		if(this.registro == this.motor.registro ) {
			
			for (int i = 0; i < asientos.length; i++) {
				
				if(this.asientos[i].registro != this.registro && asientos[i] != null) {
					
					return "Las piezas no son originales";
					
				}
				
				else {
					
					return "Auto original";
					
				}
				
			}
		}
		
		else {
			
			return "Las piezas no son originales"; 
			
		}
		
	}
	
}
