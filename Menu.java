import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
     static BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        Menu menu=new Menu();

        System.out.println("Sistema de Gestion de prestamo equipos electronicos San Juan de Dios" );

        int opcion;

        do {
            
            String menuP= "\n--- Menu Principal ---\n" 
                                
            +"1. Estudiantes de Ingeniería\n" 
            +"2. Estudiantes de Diseño\n"                   
            +"3. Imprimir Inventario Total\n"                   
            +"4. Salir del Programa\n" 
                                
            +"Seleccione una opción : ";
            System.out.print(menuP);
            opcion = Integer.parseInt(cp.readLine());
            switch (opcion) {  
            case 1:
            menu=menu.MenuIngenieria();
            break;
            case 2:
            menu=menu.MenuDiseño();
            break;
            case 3:
            break;
            case 4:
            break;

            }
            }while (opcion != 4);
        }
        public Menu MenuIngenieria() throws IOException {
            int opcion;
            do {
                System.out.println("\nBienvenido al Menú de Ingenierías");
                String menuI = "\n--- SUB-MENÚ ---\n"
                    + "1. Registrar préstamo de equipo\n"
                    + "2. Modificar préstamo de equipo (Por serial o cédula)\n"
                    + "3. Devolución de equipo (se elimina el registro)\n"
                    + "4. Buscar equipo (Por serial o cédula)\n"
                    + "5. Volver al menú principal\n"
                    + "Ingrese la opción deseada: ";
                
                System.out.print(menuI);
                opcion = Integer.parseInt(cp.readLine());
    
                switch (opcion) {
                    case 1:
                        System.out.println("Registrando préstamo...");
                        break;
                    case 2:
                        System.out.println("Modificando préstamo...");
                        break;
                    case 3:
                        System.out.println("Procesando devolución...");
                        break;
                    case 4:
                        System.out.println("Buscando equipo...");
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } while (opcion != 5);
            return this;
        }
        public Menu MenuDiseño() throws IOException {
            int opcion;
            do {
                System.out.println("\nBienvenido al Menú de Diseño");
                String menuD = "\n--- SUB-MENÚ ---\n"
                    + "1. Registrar préstamo de equipo\n"
                    + "2. Modificar préstamo de equipo (Por serial o cédula)\n"
                    + "3. Devolución de equipo (se elimina el registro)\n"
                    + "4. Buscar equipo (Por serial o cédula)\n"
                    + "5. Volver al menú principal\n"
                    + "Ingrese la opción deseada: ";
                
                System.out.print(menuD);
                opcion = Integer.parseInt(cp.readLine());
    
                switch (opcion) {
                    case 1:
                        System.out.println("Registrando préstamo...");
                        break;
                    case 2:
                        System.out.println("Modificando préstamo...");
                        break;
                    case 3:
                        System.out.println("Procesando devolución...");
                        break;
                    case 4:
                        System.out.println("Buscando equipo...");
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            } while (opcion != 5);
            return this;
        }
    }

