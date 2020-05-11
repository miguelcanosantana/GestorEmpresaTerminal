package ejercicio4;

public class Articulo {

  //_Variables
  private String nombreArticulo;
  private int cantidadArticulo;
 
  
  //_Constructor
  public Articulo(String nombreArticulo, int cantidadArticulo) {
    this.nombreArticulo = nombreArticulo;
    this.cantidadArticulo = cantidadArticulo;
  }

  //_Getters y Setters
  public String getNombreArticulo() {
    return nombreArticulo;
  }

  public void setNombreArticulo(String nombreArticulo) {
    this.nombreArticulo = nombreArticulo;
  }

  public int getCantidadArticulo() {
    return cantidadArticulo;
  }

  public void setCantidadArticulo(int cantidadArticulo) {
    this.cantidadArticulo = cantidadArticulo;
  }

  //_Override (para imprimir)
  @Override
  public String toString() {
    return "\nNombre del Artículo: " + nombreArticulo + " | Cantidad del artículo " + cantidadArticulo;
  }
  
  
  
  
  
  
}
