package servicios;

import java.util.List;

import ClienteDto.ClienteDto;


/*Interfaz la cual se encarga de mostrar las opcciones del empleado
 * 
 * 01032024 - leig
 */
public interface EmpleadosInterfaz {
	

/*Interfaz la cual se encarga de añadir la venta y guardarla
 * 
 * 01032024 - leig
 */
	public int añadirVenta(List<ClienteDto> listaClientes);

}
