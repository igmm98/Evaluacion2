package main;
/**
 * 
 * @author mr_ig
 *
 */
public class Electrodomestico {
	
	private double precioBase;
	
	private String color; // Colores disponibles "Blanco", "Negro", "Rojo", "Azul", "Gris"
	
	private char consumoEnergetico; //'A', 'B', 'C', 'D', 'E', 'F'
	
	private double peso; // En Kg.
	
	public Electrodomestico() 
	{
		this.precioBase = 100000;
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.peso = 5;
	}
	
	public Electrodomestico(double precioBase, double peso)
	{
		this.precioBase = precioBase;
		this.peso = peso;
		/*
		 *  Por defecto
		 */
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
	}
	
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) 
	{
		this.precioBase = precioBase;
		this.color = ComprobarColor(color);
		this.consumoEnergetico = ComprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
	}
	
	/**
	 * @param precioBase
	 * @Setter
	 */
	public void SetPrecioBase(double precioBase) 
	{
		this.precioBase = precioBase;
	}
	/**
	 * @param color
	 * @Setter
	 */
	public void SetColor(String color)
	{
		this.color = ComprobarColor(color);
	}
	/**
	 * @param consumoEnergetico
	 * @Setter
	 */
	public void SetConsumoEnergetico(char consumoEnergetico)
	{
		this.consumoEnergetico = ComprobarConsumoEnergetico(consumoEnergetico);
	}
	/**
	 * @param peso
	 * @Setter
	 */
	public void SetPeso(double peso)
	{
		this.peso = peso;
	}
	
	/**
	 * @return precioBase
	 */
	public double GetPrecioBase() 
	{
		return precioBase;
	}
	/**
	 * @return color
	 */
	public String GetColor() {
		return color;
	}
	/**
	 * @return consumoEnergetico
	 */
	public char GetConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**
	 * @return peso
	 */
	public double GetPeso() {
		return peso;
	}
	
	private char ComprobarConsumoEnergetico(char consumoEnergetico)
	{
		if(Character.toUpperCase(consumoEnergetico) == 'A' || Character.toUpperCase(consumoEnergetico) == 'B' || 
		   Character.toUpperCase(consumoEnergetico) == 'C' || Character.toUpperCase(consumoEnergetico) == 'D' || 
		   Character.toUpperCase(consumoEnergetico) == 'E' || Character.toUpperCase(consumoEnergetico) == 'F')
		{
			
		}else
		{
			consumoEnergetico = 'F';
		}
		return Character.toUpperCase(consumoEnergetico);
	}
	
	private String ComprobarColor(String color)
	{
		if(color.toUpperCase().equals("NEGRO") || color.toUpperCase().equals("ROJO") ||
		   color.toUpperCase().equals("AZUL") || color.toUpperCase().equals("GRIS"))
		{
			
		}else
		{
			color = "BLANCO";
		}
		return color.toUpperCase();
	}
	
	public double PrecioFinal()
	{
		switch(this.consumoEnergetico)
		{
		case 'A':
			this.precioBase += 100;
			break;
		case 'B':
			this.precioBase += 80;
			break;
		case 'C':
			this.precioBase += 60;
			break;
		case 'D':
			this.precioBase += 50;
			break;
		case 'E':
			this.precioBase += 30;
			break;
		case 'F':
			this.precioBase += 10;
			break;
		}
		if(this.peso >= 0 && this.peso <= 19)
		{
			this.precioBase += 10;
		}else if(this.peso >= 20 && this.peso <= 49)
		{
			this.precioBase += 50;
		}else if(this.peso >= 50 && this.peso <= 79)
		{
			this.precioBase += 80;
		}else if(this.peso >= 80)
		{
			this.precioBase += 100;
		}
		return this.precioBase;
	}
	
	public void ToString()
	{
		System.out.println("Color: "+this.color+
						   "\nConsumo energetico: "+this.consumoEnergetico+
						   "\nPeso: "+this.peso);
	}

}
