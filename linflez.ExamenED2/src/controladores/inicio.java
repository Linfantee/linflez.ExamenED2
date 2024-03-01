package controladores;

import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
/*La clase principal de nuestra aplicación de la cual saldran todos los métodos
 * 
 * 01032024 - leig
 */
public class inicio {
	/*Método principal de la aplicación de este iremos a los demas
	 * 
	 * 01032024 - leig
	 */
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		MenuInterfaz mi = new MenuImplementacion();
		
		int opcionSeleccionada;
		boolean cerrarMenu = false;
		
		while(!cerrarMenu) {
			
			mi.mostrarMenuYSeleccion();
			opcionSeleccionada = sc.nextInt();
		switch(opcionSeleccionada){
			
			case 0:
				System.out.println("Se ha cerrado el menú");
				cerrarMenu= true;
				break;
			case 1:
				System.out.println("Se ha entrado en la gerencia");
				mi.mostrarGerenciaYSeleccion();
				break;
			case 2:
				System.out.println("Se ha entrado en los empleados");
				mi.mostrarEmpleadoYSeleccion();	
				break;
		    default: 
		    	System.out.println("La opción introducida no existe introduzca otra");
				break;
				
	  }			
    }	
  }
}
