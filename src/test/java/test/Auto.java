package test;
public class Auto {
	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	int cantidadAsientos()
	{
		int cantidadAsientos;
		for (int i = 0; i < asientos.length; i++)
		{
			cantidadAsientos = i;
		}
	return cantidadAsientos;
	}
}