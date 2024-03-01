package servicios;

import java.util.Scanner;

/*Interfaz la cual se encarga de mostrar las opcciones del menú
 * 
 * 01032024 - leig
 */
public interface MenuInterfaz {

	/*Interfaz que se encarga de mostrar el menú principal
	 * 
	 * 01032024 - leig
	 */
	public int mostrarMenuYSeleccion();
	
	/*Interfaz que se encarga de mostrar el menú de la gerencia
	 * 
	 * 01032024 - leig
	 */
	public int mostrarGerenciaYSeleccion();
	
	/*Interfaz que se encarga de mostrar el menú de los empleados
	 * 
	 * 01032024 - leig
	 */
	 public int mostrarEmpleadoYSeleccion();
}
