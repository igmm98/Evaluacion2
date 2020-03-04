package main;
/**
 * 
 * @author mr_ig
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Object[] listado = new Object[10];
		
		Electrodomestico electrodomestico;
		
		double sumaLavadora = 0;
		double sumaTelevision = 0;
		double total = 0;
		
		listado[0] = new Electrodomestico(90000, 10);
		listado[1] = new Lavadora();
		listado[2] = new Lavadora(50000, 21);
		listado[3] = new Lavadora(31);
		listado[4] = new Television();
		listado[5] = new Television(200000, 51);
		listado[6] = new Television(42, true);
		listado[7] = new Lavadora(120000, 81);
		listado[8] = new Television(50, false);
		listado[9] = new Electrodomestico(10000, "Azul", 'A', 19);
		
		for(int i = 0; i < listado.length; i++)
		{
			if(listado[i] instanceof Electrodomestico)
			{
				electrodomestico = (Electrodomestico) listado[i];
				try
				{
					if(listado[i] instanceof Lavadora) {System.out.println("Lavadora");}
					else if(listado[i] instanceof Television) {System.out.println("Television");}
					else {System.out.println("General");}
					
				}catch(Exception e) {}
				electrodomestico.ToString();
				System.out.println("Precio final $"+electrodomestico.PrecioFinal()+"\n");
				total += electrodomestico.PrecioFinal();
			}
			try
			{
				electrodomestico = (Electrodomestico) listado[i];
				
				if(listado[i] instanceof Lavadora)sumaLavadora += electrodomestico.PrecioFinal();
				
				if(listado[i] instanceof Television)sumaTelevision += electrodomestico.PrecioFinal();
			}catch(Exception e) {}
		}
		System.out.println("-------------------------------------------------");
		System.out.println("La suma de valores de lavadoras es: "+sumaLavadora);
		System.out.println("La suma de valores de televisores es: "+sumaTelevision);
		System.out.println("La suma total de electrodomesticos es: "+total);
		
		

	}

}
