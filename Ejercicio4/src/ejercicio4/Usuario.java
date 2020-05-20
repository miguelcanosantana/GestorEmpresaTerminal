package ejercicio4;

public class Usuario extends Persona implements Cliente{

  //_Variables
  private String telefonoUsuario;
  
  //_Constructor
  public Usuario(String nombrePersona, String emailPersona, String telefonoUsuario) {
    super(nombrePersona, emailPersona);
    this.telefonoUsuario = telefonoUsuario;
  }
  
  //_Getters y Setters

  public String getTelefonoUsuario() {
    return telefonoUsuario;
  }

  public void setTelefonoUsuario(String telefonoUsuario) {
    this.telefonoUsuario = telefonoUsuario;
  }
  

  //_Override de la función compra() en la interfaz Cliente
  @Override
  public void compra(Comercial comercial, Articulo articulo) {
    comercial.vendeArticulo(articulo);
    //comercial.listaVentaObjetos.add(articulo);
  }
  
  
  //toString
  @Override
  public String toString() {
    //return  telefonoUsuario + ", listaObjetosComprados=" + listaObjetosComprados + '}';
    return this.getNombrePersona() + " | " + this.getEmailPersona()+ " | " + this.getTelefonoUsuario();
  }
  
  //_Compara emails usuario (se hace casting de objeto a usuario)
  @Override
  public boolean equals(Object u) {
    return this.getEmailPersona().equals(((Usuario)u).getEmailPersona());
  }
  
  
}
