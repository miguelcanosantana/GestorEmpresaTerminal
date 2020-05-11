package ejercicio4;

public class Persona {

  //Variables
  protected String nombrePersona;
  protected String emailPersona;

  //_Constructor
  public Persona(String nombrePersona, String emailPersona) {
    this.nombrePersona = nombrePersona;
    this.emailPersona = emailPersona;
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
  

  //toString genérico (Usado en Comercial con datos variantes)
  /*
  
  @Override
  public String toString() {
    return "Nombre: " + nombrePersona + "\n"+ "Email: " + emailPersona;
  }

  */

}
