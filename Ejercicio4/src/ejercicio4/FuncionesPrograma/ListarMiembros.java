package ejercicio4.FuncionesPrograma;
import ejercicio4.Comercial;
import ejercicio4.Empresa;
import ejercicio4.Usuario;
import java.util.List;

public class ListarMiembros {
  
  
  //_Listar Usuarios
  public static List<Usuario> listarUsuarios(List<Usuario> listaUsu){
    
    int contador = 0;
    
    System.out.println();
    System.out.println("-----------------------------");
    System.out.println("|      Lista de Usuarios    |");
    System.out.println("-----------------------------");
    
    for (Usuario usuario : listaUsu) {
      System.out.println((contador + 1) + "| " + usuario);
      contador++;
    }
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
    System.out.println("Hay " + contador + " Usuarios registrados.");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
    return null;
  }
  
  //_Listar Empresas
  public static List<Empresa> listarEmpresas(List<Empresa> listaEmp){
    
    int contador = 0;
    
    System.out.println();
    System.out.println("-----------------------------");
    System.out.println("|      Lista de Empresas    |");
    System.out.println("-----------------------------");
    
    for (Empresa empresa : listaEmp) {
      System.out.println((contador + 1) + "| " + empresa);
      contador++;
    }
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
    System.out.println("Hay " + contador + " Empresas registradas.");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - ");
    return null;
  }
  
  //_Listar Comerciales
  public static List<Comercial> listarComerciales(List<Comercial> listaCom){
    
    int contador = 0;
    
    System.out.println();
    System.out.println("-----------------------------");
    System.out.println("|     Lista de Comerciales   |");
    System.out.println("-----------------------------");
    
    for (Comercial comercial : listaCom) {
      System.out.println((contador + 1) + "| " + comercial);
      contador++;
    }
    
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println("Hay " + contador + " Comerciales registrados.");
    System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
    System.out.println();
    return null;
  }
  
  
  
}
