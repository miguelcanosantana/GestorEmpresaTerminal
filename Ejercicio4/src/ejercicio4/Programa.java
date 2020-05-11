package ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;


public class Programa {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    String respuestaTeclado;
    
    
    //_Arrays
    ArrayList<Cliente> listaUsuarios = new ArrayList();
    ArrayList<Comercial> listaComerciales = new ArrayList();
    
    //_Introducción y Preguntas Iniciales
    System.out.println("==========================================================================================");
    System.out.println("Bienvenido al Gestor de Empresas, Compradores, Vendedores y Productos por terminal (GECVP)");
    System.out.println("==========================================================================================");
    
      //_Precargar Datos Muestra
        //_Datos Muestra
        Usuario pepe = new Usuario("Pepe", "pepe@yahoo.com", "555 123456");
        listaUsuarios.add(new Usuario("Pepe", "pepe@yahoo.com", "555 123456"));
        listaUsuarios.add(new Usuario("Pablo", "pablo@gmail.com", "555 112233"));
        Usuario pablo = new Usuario("Pablo", "pablo@gmail.com", "555 112233");
        listaUsuarios.add(new Usuario("Laura", "laura@outlook.com", "565 114933"));
        Usuario laura = new Usuario("Laura", "laura@outlook.com", "565 114933");

        listaComerciales.add(new Comercial("Luis", "luis@gmail.com", "Coordinador de ventas"));
        Comercial luis = new Comercial("Luis", "luis@gmail.com", "Coordinador de ventas");
        listaComerciales.add(new Comercial("Margarita", "margarita@flower.com", "Coordinador de teletienda"));
        Comercial margarita = new Comercial("Margarita", "margarita@flower.com", "Coordinador de teletienda");
        listaComerciales.add(new Comercial("Paca", "paca@outlook.com", "Coordinador de teletienda"));
        Comercial paca = new Comercial("Paca", "paca@outlook.com", "Coordinador de teletienda");
        
        //_Ventas Muestra
        pablo.compra(luis, new Articulo("Clasificador anillas", 12));
        pepe.compra(luis, new Articulo("Paquete de folios", 50));
        pablo.compra(luis, new Articulo("Mesa escritorio", 6));
        
        //System.out.println(juan);
        //System.out.println();
        //System.out.println(luis);
        
        System.out.println("<Datos de muestra cargados con éxito>");

      
    //_Bucle Operaciones Principales
    int respuestaNumerica = 0;
    do {
      
      System.out.println();
      System.out.println("==========================================================================================");
      System.out.println("       Gestor de Empresas, Compradores, Vendedores y Productos por terminal (GECVP)       ");
      System.out.println("==========================================================================================");
      System.out.println("                                   Seleccione Operación                                   ");
      System.out.println("==========================================================================================");
      System.out.println("          |1.Consultar Ventas Comerciales |2.Consultar Compras Clientes |3.Listar         ");
      System.out.println("------------------------------------------------------------------------------------------");
      System.out.println("          |4.Comprar a Comercial |5.Modificar/Añadir/Borrar Perfiles |6.Salir             ");
      System.out.println("==========================================================================================");
      System.out.print("Escoja número: ");
      
      //_Controlar Valores que no sean numéricos
      try {
        respuestaNumerica = Integer.parseInt(s.nextLine());
      } catch (NumberFormatException e) {
        System.out.println("Debe introducir un valor numérico.");
      }
      
      
      
      //_Funciones del programa
      switch (respuestaNumerica){
        
        //_Consultar Ventas a Comerciales
        case 1:

        break;
        
        //_Consultar Compras Clientes
        case 2:
          
        break;
        
        //_Listar
        case 3:
          
          for (Cliente nombre : listaUsuarios) {
            System.out.println(nombre);
          }
          
        break;
        
        //_Comprar a Comercial
        case 4:
          
        break;
        
        //_Modificar/Añadir/Borrar Perfiles
        case 5:
          
        break;
        
        
      }
      
    } while (respuestaNumerica != 6);
    
  }
         
}
