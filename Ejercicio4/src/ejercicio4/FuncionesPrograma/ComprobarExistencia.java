package ejercicio4.FuncionesPrograma;
import ejercicio4.Comercial;
import ejercicio4.Empresa;
import java.util.List;
import ejercicio4.Usuario;

public class ComprobarExistencia {

  //_Comprobar Usuario existente
  
    //_Comprobar Email Usuario
    public static boolean comprobarUsuarioEmail (List<Usuario> listaUsu, String email){
      
      boolean coincideEmailUsuario;
      coincideEmailUsuario = listaUsu.contains(new Usuario ("",email,""));
      
      //System.out.println(coincideEmailUsuario);
      return coincideEmailUsuario;
    }
    

    //_Borrar Usuario por Email
    public static void borrarUsuarioPorEmail (List<Usuario> listaUsu, String emailInicial){
      String emailObtenido;
      boolean emailUsuarioEncontrado;
      
      for (Usuario usuario : listaUsu) {
        
        //_Obtiene el email del objeto usuario
        emailObtenido = usuario.getEmailPersona();
        
        //_Comprueba que el usuario con parámetro emailInicial exista
        emailUsuarioEncontrado = comprobarUsuarioEmail (listaUsu, emailInicial);
        if (emailUsuarioEncontrado == true) {
          
          if (emailInicial.equals(emailObtenido)){
           listaUsu.remove(usuario);
           System.out.println("Usuario borrado con éxito.");
           System.out.println();
           //_Añadido Break para parar bucle for y dejar de leer de listaUsu (si no da error)
           break;
          }
          
        } else {
          System.out.println("Email de usuario no encontrado.");
          System.out.println();
          //_Añadido Break para para abandonar el bucle y dar por finalizada la búsqueda
          break;
        }
        
      }

    }
    
    
    
  
  //_Comprobar Empresa existente
    
    //_Comprobar CIF Empresa
    public static boolean comprobarEmpresaCif (List<Empresa> listaEmp, String cif){
      
      boolean coincideCifEmpresa;
      coincideCifEmpresa = listaEmp.contains(new Empresa (cif,"",""));
      
      //System.out.println(coincideEmailUsuario);
      return coincideCifEmpresa;
    }
    
    
    //_Borrar Empresa por CIF
    public static void borrarEmpresaPorCif (List<Empresa> listaEmp, String cifInicial){
      String cifObtenido;
      boolean cifEmpresaEncontrado;
      
      for (Empresa empresa : listaEmp) {
        
        //_Obtiene el CIF del objeto empresa
        cifObtenido = empresa.getCifEmpresa();
        
        //_Comprueba que la empresa con parámetro cif Inicial exista
        cifEmpresaEncontrado = comprobarEmpresaCif (listaEmp, cifInicial);
        if (cifEmpresaEncontrado == true) {
          
          if (cifInicial.equals(cifObtenido)){
           listaEmp.remove(empresa);
           System.out.println("Empresa borrada con éxito.");
           System.out.println();
           //_Añadido Break para parar bucle for y dejar de leer de listaEmp (si no da error)
           break;
          }
          
        } else {
          System.out.println("CIF de empresa no encontrado.");
          System.out.println();
          //_Añadido Break para para abandonar el bucle y dar por finalizada la búsqueda
          break;
        }
        
      }

    }
    
    
    
  //_Comprobar Comercial existente
  
    //_Comprobar Email Comercial
    public static boolean comprobarComercialEmail (List<Comercial> listaCom, String email){
      
      boolean coincideEmailComercial;
      coincideEmailComercial = listaCom.contains(new Comercial ("",email,""));
      
      //System.out.println(coincideEmailUsuario);
      return coincideEmailComercial;
    }
    

    //_Borrar Comercial por Email
    public static void borrarComercialPorEmail (List<Comercial> listaCom, String emailInicial){
      String emailObtenido;
      boolean emailComercialEncontrado;
      
      for (Comercial comercial : listaCom) {
        
        //_Obtiene el email del objeto comercial
        emailObtenido = comercial.getEmailPersona();
        
        //_Comprueba que el comercial con parámetro emailInnicial exista
        emailComercialEncontrado = comprobarComercialEmail (listaCom, emailInicial);
        if (emailComercialEncontrado == true) {
          
          if (emailInicial.equals(emailObtenido)){
           listaCom.remove(comercial);
           System.out.println("Comercial borrado con éxito.");
           System.out.println();
           //_Añadido Break para parar bucle for y dejar de leer de listaCom (si no da error)
           break;
          }
          
        } else {
          System.out.println("Email de comercial no encontrado.");
          System.out.println();
          //_Añadido Break para para abandonar el bucle y dar por finalizada la búsqueda
          break;
        }
        
      }

    }

  
}
