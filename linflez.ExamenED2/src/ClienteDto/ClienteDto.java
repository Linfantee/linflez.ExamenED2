package ClienteDto;

import java.sql.Date;

/*Clase la cual se encarga de almacenar las cosas de la lista
 * 
 * 01032024 - leig
 */
public class ClienteDto {

	int idproducto;
	String nombreProducto = "aaaaa";
	String cantidadProducto = "9999999";
	Date fechaDeseadaEntrega;
	
	
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(String cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public Date getFechaDeseadaEntrega() {
		return fechaDeseadaEntrega;
	}
	public void setFechaDeseadaEntrega(Date fechaDeseadaEntrega) {
		this.fechaDeseadaEntrega = fechaDeseadaEntrega;
	}
	
	@Override
	public String toString() {
		return "ClienteDto [idproducto=" + idproducto + ", nombreProducto=" + nombreProducto + ", cantidadProducto="
				+ cantidadProducto + ", fechaDeseadaEntrega=" + fechaDeseadaEntrega + "]";
	}
	
}
