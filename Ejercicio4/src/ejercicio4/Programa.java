package ejercicio4;

//Import Utilidades Java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Import Funciones Programa
import static ejercicio4.FuncionesPrograma.ListarMiembros.listarComerciales;
import static ejercicio4.FuncionesPrograma.ListarMiembros.listarEmpresas;
import static ejercicio4.FuncionesPrograma.ListarMiembros.listarUsuarios;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarUsuarioEmail;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.borrarUsuarioPorEmail;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarEmpresaCif;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.borrarEmpresaPorCif;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.borrarComercialPorEmail;
import static ejercicio4.FuncionesPrograma.ComprobarExistencia.comprobarComercialEmail;
import static ejercicio4.FuncionesPrograma.ClientesCompran.usuarioCompra;
import static ejercicio4.FuncionesPrograma.ClientesCompran.empresaCompra;
import static ejercicio4.FuncionesPrograma.ListarVentasComercial.listarVentasComercial;


public class Programa {

  public static void main(String[] args) {
    
    //_Variables
    Scanner s = new Scanner(System.in);
    String respuestaLetras;
    
    String correoUsuario = null;
    boolean comprobarUsuarioEmail;
    
    String correoComercial;
    boolean comprobarComercialEmail;
    
    boolean comprobarEmpresaCif;
    String cifEmpresa = null;
    
    int tipoCompra;
    String nombreArticulo;
    int cantidadArticulo = 0;
    
    //_Arrays de Objetos (Miembros de la aplicación)
    List<Usuario> listaUsuarios = new ArrayList();
    List<Empresa> listaEmpresas = new ArrayList();
    List<Comercial> listaComerciales = new ArrayList();
    
    
    //_Precargar Datos Muestra
      //_Miembros Muestra
      listaUsuarios.add(new Usuario("Pepe", "pepe@yahoo.com", "555123456"));
      listaUsuarios.add(new Usuario("Ana", "ana@outlook.es", "456129994"));
      listaUsuarios.add(new Usuario("Pedro", "pedro@gmail.com", "780127456"));
      listaUsuarios.add(new Usuario("Ana María", "anamar@outlook.es", "456128394"));
      
      listaEmpresas.add(new Empresa("874503", "EmpreMálaga", "000192656"));
      listaEmpresas.add(new Empresa("923694", "EmpreAndalucía", "000659361"));
      
      listaComerciales.add(new Comercial("Paca", "paca@paquita.com", "Vendedora Profesional"));
      listaComerciales.add(new Comercial("Mario", "mario@marioneta.com", "Vendedor Becario"));
      listaComerciales.add(new Comercial("Luis", "luis@luisiana.com", "Jefe de Ventas Globales"));
      
      
    //_Bucle Operaciones Principales
    int respuestaNumerica = 0;
    do {
      
      System.out.println();
      System.out.println("==========================================================================================");
      System.out.println("       Gestor de Empresas, Compradores, Vendedores y Productos por terminal (GECVP)       ");
      System.out.println("==========================================================================================");
      System.out.println("                                   Seleccione Operación                                   ");
      System.out.println("==========================================================================================");
      System.out.println("                         |1.Consultar Ventas Comerciales |2.Listar                        ");
      System.out.println("------------------------------------------------------------------------------------------");
      System.out.println("                |3.Comprar a Comercial |4.Añadir/Borrar Perfiles |5.Salir                 ");
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
          
          //_Mensaje Introducción
          System.out.println();
          System.out.print("Introduzca el Email del comercial del cual quiere consultar las ventas: ");
          correoComercial = s.nextLine();
          
          //Imprimir Ventas Comercial
          listarVentasComercial(listaComerciales, correoComercial);
          
          
          //_Confirmar para salir
          do {
            System.out.print("Introduzca X para salir: ");
            respuestaLetras = s.nextLine();       
          } while (!respuestaLetras.equalsIgnoreCase("x")) ;
          
          

        break;
        
        //_Listar Miembros
        case 2:
          
          listarUsuarios(listaUsuarios);
          listarEmpresas(listaEmpresas);
          listarComerciales(listaComerciales);
          
          //_Confirmar para salir
          do {
            System.out.print("Introduzca X para salir: ");
            respuestaLetras = s.nextLine();       
          } while (!respuestaLetras.equalsIgnoreCase("x")) ;
          
        break;
        
        //_Comprar a Comercial
        case 3:
          do {
            //_Mensaje Introducción
            System.out.println();
            System.out.println("Para realizar una compra, deberá introducir primero un correo de usuario");
            System.out.println("o el CIF de la empresa existente, seguido del correo del comercial.");
            System.out.println();
            System.out.println("Elija el tipo de Cliente que desea realizar la compra: ");
            System.out.println("            |1.Usuario |2.Empresa |3.Salir             ");
            System.out.println();
            System.out.print("==>Escoja número: ");

            //_Controlar Valores que no sean numéricos
            try {
              respuestaNumerica = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
              System.out.println("Debe introducir un valor numérico.");
            }
            
          } while (respuestaNumerica < 1 || respuestaNumerica > 3);
          
          tipoCompra = respuestaNumerica;
          boolean rompeOperacion = false;
            
            //_Usuario
            if (respuestaNumerica == 1) {

              //_Comprobar Correo Usuario existe
              do {
                System.out.print("Introduzca un correo de usuario válido: ");
                correoUsuario = s.nextLine();
                comprobarUsuarioEmail = comprobarUsuarioEmail(listaUsuarios,correoUsuario);

                if (comprobarUsuarioEmail == false) {
                  System.out.println("El correo de usuario no existe.");
                }

              } while (comprobarUsuarioEmail == false);
              
            }
            
            //_Empresa
            if (respuestaNumerica == 2) {
              
              //_Comprobar Cif Empresa existe
              do {
                System.out.print("Introduzca un CIF válido: ");
                cifEmpresa = s.nextLine();
                comprobarEmpresaCif = comprobarEmpresaCif(listaEmpresas, cifEmpresa);

                if (comprobarEmpresaCif == false) {
                  System.out.println("El CIF de la empresa no existe.");
                }

              } while (comprobarEmpresaCif == false);
              
            }
            
            //_Salir
            if (respuestaNumerica == 3) {
              rompeOperacion = true;
              break;
              
              
            //_Comercial
            } else {
              
              //_Comprobar Correo Comercial existe
              do {
                System.out.print("Introduzca un correo de comercial válido: ");
                correoComercial = s.nextLine();
                comprobarComercialEmail = comprobarComercialEmail(listaComerciales,correoComercial);

                if (comprobarComercialEmail == false) {
                  System.out.println("El correo del comercial no existe.");
                }

              } while (comprobarComercialEmail == false);
              
              
              //_Comprar Artículo
              
                //_Nombre Artículo
                System.out.print("Introduzca el nombre del Artículo: ");
                nombreArticulo = s.nextLine();
              
              
                //_Cantidad Artículo | Controlar Valores que no sean numéricos
                do {
                  System.out.print("Introduzca la cantidad que desee comprar: ");
                  try {
                    cantidadArticulo = Integer.parseInt(s.nextLine());
                  } catch (NumberFormatException e) {
                    System.out.println("Debe introducir un valor numérico.");
                  }
                  
                } while (cantidadArticulo < 1);
                
                //_Comprar
                
                  //_Usuario a Comercial
                  if (tipoCompra == 1) {
                    usuarioCompra(listaUsuarios, listaComerciales, correoUsuario, correoComercial, nombreArticulo, cantidadArticulo);
                  }
                  
                  //_Empresa a Comercial
                  if (tipoCompra == 2) {
                    empresaCompra(listaEmpresas, listaComerciales, cifEmpresa, correoComercial, nombreArticulo, cantidadArticulo);
                  }
              
            }
          
        break;
        
        //_Añadir/Borrar Perfiles
        case 4:
          
          //_Controlar Valores no numéricos y fuera del rango 1..4
          do {
            
            //_Seleccionar tipo miembro
            System.out.println("¿A qué tipo de miembro le quiere aplicar la operación?");
            System.out.println(" |1.Usuario    |2.Empresa    |3.Comercial   |4.Salir  ");
            System.out.println();
            System.out.print("==>Escoja número: ");
            
            try {
              respuestaNumerica = Integer.parseInt(s.nextLine());
            } catch (NumberFormatException e) {
              System.out.println("Debe introducir un valor numérico.");
            }

            switch (respuestaNumerica){

              //_Usuario
              case 1:
                
                //_Seleccionar Operación
                System.out.println("           ¿Qué operación desea realizar?           ");
                System.out.println("               |1.Añadir    |2.Borrar               ");
                System.out.println();
                System.out.print("==>Escoja número: ");

                try {
                  respuestaNumerica = Integer.parseInt(s.nextLine());
                } catch (NumberFormatException e) {
                  System.out.println("Debe introducir un valor numérico.");
                }
                
                switch (respuestaNumerica){

                  //_Añadir
                  case 1:
                    
                    //_Nombre Usuario
                    System.out.print("Introduzca el nombre: ");
                    String nombreUsuario = s.nextLine();
                    
                    //_Correo Usuario
                    do {
                      System.out.print("Introduzca un correo válido: ");
                      correoUsuario = s.nextLine();
                      comprobarUsuarioEmail = comprobarUsuarioEmail(listaUsuarios,correoUsuario);
                      
                      if (comprobarUsuarioEmail == true) {
                        System.out.println("El correo ya existe.");
                      }
                      
                    } while (comprobarUsuarioEmail == true);
                    
                    //_Telefono Usuario
                    System.out.print("Introduzca un teléfono: ");
                    String telefonoUsuario = s.nextLine();
                    
                    //Registrar Usuario
                    listaUsuarios.add(new Usuario(nombreUsuario, correoUsuario, telefonoUsuario));
                    System.out.println();
                    System.out.println(nombreUsuario + " fue añadido con éxito.");
                    
                  break;

                  //_Borrar
                  case 2:
                    
                    //_Correo Usuario
                    System.out.print("Introduzca el correo del usuario que se desee borrar: ");
                    correoUsuario = s.nextLine();
                    borrarUsuarioPorEmail(listaUsuarios,correoUsuario);
               
                  break;

                }

                
              break;

              //_Empresa
              case 2:
                
                //_Seleccionar Operación
                System.out.println("           ¿Qué operación desea realizar?           ");
                System.out.println("               |1.Añadir    |2.Borrar               ");
                System.out.println();
                System.out.print("==>Escoja número: ");

                try {
                  respuestaNumerica = Integer.parseInt(s.nextLine());
                } catch (NumberFormatException e) {
                  System.out.println("Debe introducir un valor numérico.");
                }
                
                switch (respuestaNumerica){

                  //_Añadir
                  case 1:
                    
                    //_Nombre Empresa
                    System.out.print("Introduzca el nombre: ");
                    String nombreEmpresa = s.nextLine();
                    
                    //_Cif Empresa
                    do {
                      System.out.print("Introduzca un CIF válido: ");
                      cifEmpresa = s.nextLine();
                      comprobarEmpresaCif = comprobarEmpresaCif(listaEmpresas, cifEmpresa);
                      
                      if (comprobarEmpresaCif == true) {
                        System.out.println("La empresa ya existe.");
                      }
                      
                    } while (comprobarEmpresaCif == true);
                    
                    //_Telefono Empresa
                    System.out.print("Introduzca un teléfono: ");
                    String telefonoEmpresa = s.nextLine();
                    
                    //Registrar Empresa
                    listaEmpresas.add(new Empresa(cifEmpresa, nombreEmpresa, telefonoEmpresa));
                    System.out.println();
                    System.out.println("La empresa " + nombreEmpresa + " fue añadida con éxito.");
                    
                  break;

                  //_Borrar
                  case 2:
                    
                    //_Correo Usuario
                    System.out.print("Introduzca el CIF de la empresa que se desee borrar: ");
                    cifEmpresa = s.nextLine();
                    borrarEmpresaPorCif(listaEmpresas,cifEmpresa);
               
                  break;

                }

              break;

              //_Comercial
              case 3:
                
                //_Seleccionar Operación
                System.out.println("           ¿Qué operación desea realizar?           ");
                System.out.println("               |1.Añadir    |2.Borrar               ");
                System.out.println();
                System.out.print("==>Escoja número: ");

                try {
                  respuestaNumerica = Integer.parseInt(s.nextLine());
                } catch (NumberFormatException e) {
                  System.out.println("Debe introducir un valor numérico.");
                }
                
                switch (respuestaNumerica){

                  //_Añadir
                  case 1:
                    
                    //_Nombre Comercial
                    System.out.print("Introduzca el nombre: ");
                    String nombreComercial = s.nextLine();
                    
                    //_Correo Comercial
                    do {
                      System.out.print("Introduzca un correo válido: ");
                      correoComercial = s.nextLine();
                      comprobarComercialEmail = comprobarComercialEmail(listaComerciales,correoComercial);
                      
                      if (comprobarComercialEmail == true) {
                        System.out.println("El correo ya existe.");
                      }
                      
                    } while (comprobarComercialEmail == true);
                    
                    //_Cargo Comercial
                    System.out.print("Introduzca un cargo asignado al comercial: ");
                    String cargoComercial = s.nextLine();
                    
                    //Registrar Usuario
                    listaComerciales.add(new Comercial(nombreComercial, correoComercial, cargoComercial));
                    System.out.println();
                    System.out.println(nombreComercial + " fue añadido con éxito.");
                    
                  break;

                  //_Borrar
                  case 2:
                    
                    //_Correo Comercial
                    System.out.print("Introduzca el correo del comercial que se desee borrar: ");
                    correoComercial = s.nextLine();
                    borrarComercialPorEmail(listaComerciales, correoComercial);
               
                  break;

                }

              break;

              //_Salir
              case 4:
                System.out.println("Volviendo al menú principal...");
              break;

            }
            
          } while ((respuestaNumerica < 1) || (respuestaNumerica > 4));
          
        break;
        
        
      }
      
    } while (respuestaNumerica != 5);
    
    
  }
         
}
