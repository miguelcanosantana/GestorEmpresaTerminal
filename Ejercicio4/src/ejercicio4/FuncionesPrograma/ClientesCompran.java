package ejercicio4.FuncionesPrograma;
import ejercicio4.Articulo;
import ejercicio4.Comercial;
import ejercicio4.Empresa;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarComercialEmail;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarEmpresaCif;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarUsuarioEmail;
import ejercicio4.Usuario;
import java.util.List;

public class ClientesCompran {
  //_Variables compartidas por varias funciones
  static Comercial vendedor;
  static Articulo item;
  
    //_Usuario Compra
    public static void usuarioCompra (List<Usuario> listaUsu, List<Comercial> listaCom, String emailInicialUsuario, String emailInicialComercial, String nombreArt, int cantidadArt){
      String emailObtenidoUsuario;
      boolean emailUsuarioEncontrado;
      
      String emailObtenidoComercial;
      boolean emailComercialEncontrado;
      
      
      //_Localizar Comercial
      for (Comercial comercial : listaCom) {
        
        //_Obtiene el email del objeto comercial
        emailObtenidoComercial = comercial.getEmailPersona();
        
        //_Comprueba que el comercial con parámetro emailInicialComercial exista
        emailComercialEncontrado = comprobarComercialEmail (listaCom, emailInicialComercial);
        if (emailComercialEncontrado == true) {
          
          if (emailInicialComercial.equals(emailObtenidoComercial)){
           //_Asignar comercial encontrado a la variable vendedor
           vendedor = comercial;
           //_Añadido Break para parar bucle for y dejar de leer de listaCom (si no da error)
           break;
          }
          
        }
      }
      
      
      //_Localizar Usuario
      for (Usuario usuario : listaUsu) {
        
        //_Obtiene el email del objeto usuario
        emailObtenidoUsuario = usuario.getEmailPersona();
        
        //_Comprueba que el usuario con parámetro emailInicialUsuario exista
        emailUsuarioEncontrado = comprobarUsuarioEmail (listaUsu, emailInicialUsuario);
        if (emailUsuarioEncontrado == true) {
          
          if (emailInicialUsuario.equals(emailObtenidoUsuario)){
           //_Crear Artículo
           item = new Articulo(nombreArt, cantidadArt);
           //_Realizar Compra
           usuario.compra(vendedor, item);
           System.out.println("Compra Realizada con éxito.");
           //_Añadido Break para parar bucle for y dejar de leer de listaUsu (si no da error)
           break;
          }
          
        }
        
      }

    }
    
    
    
    //_Empresa Compra
    public static void empresaCompra (List<Empresa> listaEmp, List<Comercial> listaCom, String cifInicialEmpresa, String emailInicialComercial, String nombreArt, int cantidadArt){
      String cifObtenidoEmpresa;
      boolean cifEmpresaEncontrado;
      
      String emailObtenidoComercial;
      boolean emailComercialEncontrado;
      
      
      //_Localizar Comercial
      for (Comercial comercial : listaCom) {
        
        //_Obtiene el email del objeto comercial
        emailObtenidoComercial = comercial.getEmailPersona();
        
        //_Comprueba que el comercial con parámetro emailInicialComercial exista
        emailComercialEncontrado = comprobarComercialEmail (listaCom, emailInicialComercial);
        if (emailComercialEncontrado == true) {
          
          if (emailInicialComercial.equals(emailObtenidoComercial)){
           //_Asignar comercial encontrado a la variable vendedor
           vendedor = comercial;
           //_Añadido Break para parar bucle for y dejar de leer de listaCom (si no da error)
           break;
          }
          
        }
      }
      
      
      //_Localizar Empresa
      for (Empresa empresa : listaEmp) {
        
        //_Obtiene el cif del objeto empresa
        cifObtenidoEmpresa = empresa.getCifEmpresa();
        
        //_Comprueba que la empresa con parámetro cifInicialEmpresa exista
        cifEmpresaEncontrado = comprobarEmpresaCif (listaEmp, cifInicialEmpresa);
        if (cifEmpresaEncontrado == true) {
          
          if (cifInicialEmpresa.equals(cifObtenidoEmpresa)){
           //_Crear Artículo
           item = new Articulo(nombreArt, cantidadArt);
           //_Realizar Compra
           empresa.compra(vendedor, item);
           System.out.println("Compra Realizada con éxito.");
           //_Añadido Break para parar bucle for y dejar de leer de listaUsu (si no da error)
           break;
          }
          
        }
        
      }

    }
  
}
