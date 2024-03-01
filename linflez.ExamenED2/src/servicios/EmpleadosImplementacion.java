package servicios;

import java.util.List;
import java.util.Scanner;

import ClienteDto.ClienteDto;

/*Implementación la cual se encarga de tener el desarrollo de los métodos del empleado
 * 
 * 01032024 - leig
 */
public class EmpleadosImplementacion implements EmpleadosInterfaz {
	
	Scanner sc = new Scanner(System.in);
	public int añadirVenta(List<ClienteDto> listaClientes) {
		
		int venta;
		System.out.println("Introduzca el importe de la venta realizada");
		venta = sc.nextInt();
		System.out.println("");
			
		
		venta = sc.nextInt();
		return venta;
	}

}
