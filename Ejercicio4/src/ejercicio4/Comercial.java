package ejercicio4;
import java.util.ArrayList;
import java.util.Objects;

public class Comercial extends Persona {

  //_Variables
  private String cargoComercial;
  private ArrayList<Articulo> listaVentaObjetos = new ArrayList();


  //_Constructor
  public Comercial(String nombrePersona, String emailPersona, String cargoComercial) {
    super(nombrePersona, emailPersona);
    this.cargoComercial = cargoComercial;
  }

  //_Getters y Setters
  public String getCargoComercial() {
    return cargoComercial;
  }

  public ArrayList<Articulo> getListaVentaObjetos() {
    return listaVentaObjetos;
  }

  public void setListaVentaObjetos(ArrayList<Articulo> listaVentaObjetos) {
    this.listaVentaObjetos = listaVentaObjetos;
  }
  
  
  //_toString (Para imprimir)
  @Override
  public String toString() {
    //return "Nombre: " + this.getNombrePersona() + "\n" + "Email: " + this.getEmailPersona() + "\n" + "Cargo: " + cargoComercial + "\n" + "==========<Ventas Realizadas>==========" + this.getListaVentaObjetos();
    return this.getNombrePersona() + " | " + this.getEmailPersona() + " | " + cargoComercial;
  }

  
  //_Compara emails usuario (se hace casting de objeto a usuario)
  @Override
  public boolean equals(Object c) {
    return this.getEmailPersona().equals(((Comercial)c).getEmailPersona());
  }

  
  //_Venta Artículo
  void vendeArticulo(Articulo articulo) {
    
    if (listaVentaObjetos.contains(articulo)) {
      int indice = listaVentaObjetos.indexOf(articulo);     
      int cantidadInicialArticuloPasado = articulo.getCantidadArticulo();
      int cantidadInicialArticuloListado = listaVentaObjetos.get(indice).getCantidadArticulo();
      int suma = cantidadInicialArticuloPasado + cantidadInicialArticuloListado;
      
      listaVentaObjetos.set(indice, new Articulo (articulo.getNombreArticulo(),suma));
      
    } else {
      listaVentaObjetos.add(articulo);
    }
    
  }
  
  
  
}
