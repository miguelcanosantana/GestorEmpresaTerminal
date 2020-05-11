package ejercicio4;
import java.util.ArrayList;

public class Usuario extends Persona implements Cliente {

  //_Variables
  private String telefonoUsuario;
  ArrayList<Articulo> listaObjetosComprados = new ArrayList();
  
  //_Constructor
  public Usuario(String nombrePersona, String emailPersona, String telefonoUsuario) {
    super(nombrePersona, emailPersona);
  }
  

  //_Override de la función compra() en la interfaz Cliente
  @Override
  public void compra(Comercial comercial, Articulo articulo) {
    comercial.listaVentaObjetos.add(articulo);
    listaObjetosComprados.add(articulo); 
  }

  //_Getters y Setters
  public String getNombrePersona() {
    return nombrePersona;
  }

  public void setNombrePersona(String nombrePersona) {
    this.nombrePersona = nombrePersona;
  }

  public String getEmailPersona() {
    return emailPersona;
  }

  public void setEmailPersona(String emailPersona) {
    this.emailPersona = emailPersona;
  }
  
  //toString
  @Override
  public String toString() {
    return  telefonoUsuario + ", listaObjetosComprados=" + listaObjetosComprados + '}';
  }
  
  
}
