package main;

public class Television extends Electrodomestico {
	
	private double precioBase;
	
	private String color; //"Blanco", "Negro", "Rojo", "Azul", "Gris"
	
	private char consumoEnergetico; //'A', 'B', 'C', 'D', 'E', 'F'
	
	private double peso; // En Kg.
	
	private int resolucion; // En pulgadas
	
	private boolean sintonizadorTDT; // TDT
	
	public Television()
	{
		super();
		this.precioBase = 100000;
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.peso = 5;
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	public Television(double precio, double peso)
	{
		super();
		this.precioBase = precio;
		this.peso = peso;
		/*
		 * Por defecto
		 */
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	
	public Television(int resolucion, boolean sintonizadorTDT)
	{
		super();
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		this.precioBase = 100000;
		this.color = "BLANCO";
		this.consumoEnergetico = 'F';
		this.peso = 5;
	}
	
	
	/**
	 * @param resolucion
	 * @Setter
	 */
	public void SetResolucion(int resolucion)
	{
		this.resolucion = resolucion;
	}
	/**
	 * @param sintonizadorTDT
	 * @Setter
	 */
	public void SetSintonizadorTDT(boolean sintonizadorTDT)
	{
		this.sintonizadorTDT = sintonizadorTDT;
	}
	/**
	 * @param precioBase
	 * @Setter
	 */
	public final void SetPrecioBase(double precioBase) 
	{
		this.precioBase = precioBase;
	}
	/**
	 * @param color
	 * @Setter
	 */
	public final void SetColor(String color)
	{
		this.color = ComprobarColor(color);
	}
	/**
	 * @param consumoEnergetico
	 * @Setter
	 */
	public final void SetConsumoEnergetico(char consumoEnergetico)
	{
		this.consumoEnergetico = ComprobarConsumoEnergetico(consumoEnergetico);
	}
	/**
	 * @param peso
	 * @Setter
	 */
	public final void SetPeso(double peso)
	{
		this.peso = peso;
	}
	
	/**
	 * @return precioBase
	 */
	public final double GetPrecioBase() 
	{
		return precioBase;
	}
	/**
	 * @return color
	 */
	public final String GetColor() {
		return color;
	}
	/**
	 * @return consumoEnergetico
	 */
	public final char GetConsumoEnergetico() {
		return consumoEnergetico;
	}
	/**
	 * @return peso
	 */
	public final double GetPeso() {
		return peso;
	}
	/**
	 * @return resolucion
	 */
	public int GetResolucion()
	{
		return this.resolucion;
	}
	/**
	 * @return sintonizadorTDT
	 */
	public boolean GetSintonizadorTDT()
	{
		return this.sintonizadorTDT;
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
		if(this.resolucion > 40 )
		{
			this.precioBase += ((30*this.precioBase)/100);
		}
		if(this.sintonizadorTDT)
		{
			this.precioBase += 50;
		}
		return this.precioBase;
	}
	
	public void ToString()
	{
		System.out.println("Color: "+this.color+
						   "\nConsumo energetico: "+this.consumoEnergetico+
						   "\nPeso: "+this.peso+
						   "\nResolucion (Pulgadas): "+this.resolucion+
						   "\nSintonizador TDT: "+this.sintonizadorTDT);
	}

}
