package ejercicio4;

public class Empresa implements Cliente {

  //_Variables
  private String cifEmpresa;
  private String nombreEmpresa;
  private String telefonoEmpresa;

  
  //_Constructor
  public Empresa(String cifEmpresa, String nombreEmpresa, String telefonoEmpresa) {
    this.cifEmpresa = cifEmpresa;
    this.nombreEmpresa = nombreEmpresa;
    this.telefonoEmpresa = telefonoEmpresa;
  }
  
  //Getters y Setters

  public String getCifEmpresa() {
    return cifEmpresa;
  }

  public void setCifEmpresa(String cifEmpresa) {
    this.cifEmpresa = cifEmpresa;
  }

  public String getNombreEmpresa() {
    return nombreEmpresa;
  }

  public void setNombreEmpresa(String nombreEmpresa) {
    this.nombreEmpresa = nombreEmpresa;
  }

  public String getTelefonoEmpresa() {
    return telefonoEmpresa;
  }

  public void setTelefonoEmpresa(String telefonoEmpresa) {
    this.telefonoEmpresa = telefonoEmpresa;
  }
  

  //_Override de la interfaz Cliente
  @Override
  public void compra(Comercial comercial, Articulo articulo) {
    comercial.listaVentaObjetos.add(articulo);
  }

  //_tostring
  @Override
  public String toString() {
    return cifEmpresa + " | " + nombreEmpresa + " | " + telefonoEmpresa;
  }
  
  //_Compara CIFS empresa (se hace casting de objeto a empresa)
  @Override
  public boolean equals(Object e) {
    return this.getCifEmpresa().equals(((Empresa)e).getCifEmpresa());
  }
  
  
  
}
