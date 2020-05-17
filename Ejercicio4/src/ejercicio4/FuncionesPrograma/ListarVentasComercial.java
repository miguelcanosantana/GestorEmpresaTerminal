package ejercicio4.FuncionesPrograma;
import ejercicio4.Articulo;
import ejercicio4.Comercial;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarComercialEmail;
import java.util.List;

public class ListarVentasComercial {
  
  //_Listar Ventas Comerciales
  public static void listarVentasComercial(List<Comercial> listaCom, String emailInicial){
    
    String emailObtenidoComercial;
    boolean emailComercialEncontrado;
    
    
    //_Localizar Comercial
      for (Comercial comercial : listaCom) {
        
        //_Obtiene el email del objeto comercial
        emailObtenidoComercial = comercial.getEmailPersona();
        
        //_Comprueba que el comercial con parámetro emailInicialComercial exista
        emailComercialEncontrado = comprobarComercialEmail (listaCom, emailInicial);
        if (emailComercialEncontrado == true) {
          
          if (emailInicial.equals(emailObtenidoComercial)){
            
            //_Imprimir Artículos
            for (Articulo item : comercial.getListaVentaObjetos()) {
              System.out.println(item);
            }
            
           //_Añadido Break para parar bucle for y dejar de leer de listaCom (si no da error)
           break;
          }
          
        } else {
          System.out.println("El comercial introducido no existe");
          break;
        }
      }
      
      System.out.println();
      
      
  }
  
  
  
}
