package ejercicio4;
import java.util.ArrayList;

public class Empresa implements Cliente {

  //_Variables
  private String cifEmpresa;
  private String nombreEmpresa;
  private String telefonoEmpresa;
  ArrayList<Articulo> listaObjetosComprados = new ArrayList();

  
  //_Constructor
  public Empresa(String cifEmpresa, String nombreEmpresa, String telefonoEmpresa) {
    this.cifEmpresa = cifEmpresa;
    this.nombreEmpresa = nombreEmpresa;
    this.telefonoEmpresa = telefonoEmpresa;
  }

  //_Override de la interfaz Cliente
  @Override
  public void compra(Comercial comercial, Articulo articulo) {
    comercial.listaVentaObjetos.add(articulo);
    listaObjetosComprados.add(articulo);
  }
}
