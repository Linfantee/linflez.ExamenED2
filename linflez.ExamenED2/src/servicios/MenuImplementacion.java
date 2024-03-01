package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ClienteDto.ClienteDto;

/*Implementación la cual se encarga de tener el desarrollo de los métodos
 * 
 * 01032024 - leig
 */
public class MenuImplementacion implements MenuInterfaz {
	
	List<ClienteDto> listaClientes = new ArrayList<ClienteDto>();
	    Scanner sc = new Scanner(System.in);
		public int mostrarMenuYSeleccion(){
			
			int opcion;
			System.out.println("------------------");
			System.out.println("0. Cerrar Menú");
			System.out.println("1. Entrar en gerencia");
			System.out.println("2. Entrar en empleados");
			System.out.println("------------------");
			opcion = sc.nextInt();
			return opcion;
		}
		
		
		public int mostrarGerenciaYSeleccion() {
			
			int opcion;
			
			System.out.println("------------------");
			System.out.println("Has entrado en gerencia");
			System.out.println("0. Volver al inicio");
			System.out.println("1. Mostrar ventas del día");
			System.out.println("2. Crear pedido para proveedores");
			System.out.println("------------------");
				
			opcion = sc.nextInt();
			return opcion;
			
		}
		
		public void entrarGerencia() {
			
			GerenciaInterfaz gi = new GerenciaImplementacion();
			int opcionSeleccionada;
			boolean cerrarMenu = false;
			
			while(!cerrarMenu) {
				
				
			
			opcionSeleccionada = sc.nextInt();
			switch(opcionSeleccionada){
				
				case 0:
					System.out.println("Se ha cerrado el menú");
					cerrarMenu= true;
					break;
				case 1:
					System.out.println("Mostrar ventas del día");
					
					break;
				case 2:
					System.out.println("Crear pedido para proveedores");
							
					break;
			    default: 
			    	System.out.println("La opción introducida no existe introduzca otra");
					break;
			}
				
			
		}
		
	}
		
		
        public int mostrarEmpleadoYSeleccion() {
			
			int opcion;
			
			System.out.println("------------------");
			System.out.println("Has entrado en empleados");
			System.out.println("0. Volver al inicio");
			System.out.println("1. Añadir venta");
			System.out.println("2. Calculo total de ventas diario");
			System.out.println("------------------");
				
			opcion = sc.nextInt();
			return opcion;
			
		}
		
           public void entrarEmpleados() {
			
			EmpleadosInterfaz ei = new EmpleadosImplementacion();
			int opcionSeleccionada;
			boolean cerrarMenu = false;
			
			while(!cerrarMenu) {
				
				
			
			opcionSeleccionada = sc.nextInt();
			switch(opcionSeleccionada){
				
				case 0:
					System.out.println("Se ha cerrado el menú");
					cerrarMenu= true;
					break;
				case 1:
					System.out.println("Añadir venta");
					ei.añadirVenta(listaClientes);
					break;
				case 2:
					System.out.println("Calculo total de ventas diario");
							
					break;
			    default: 
			    	System.out.println("La opción introducida no existe introduzca otra");
					break;
			}
					
		}	
    }
}

		
		
		
	
	
