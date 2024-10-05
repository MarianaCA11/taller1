import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    BufferedReader cp=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        

        System.out.println("Sistema de Gestion de prestamo equipos electronicos San Juan de Dios" );

        int opcion;

        do {
            
            String menu= "\n--- Menu Principal ---"
            +"1. Estudiantes de Ingeniería"
            +"2. Estudiantes de Diseño"
            +"3. Imprimir Inventario Total"
            +"4. Salir del Programa"
            +"Seleccione una opción: ";
            System.out.println(menu);
            opcion = Integer.parseInt(cp.readLine());
            switch (opcion) {  
            case 1:
            break;
            case 2:
            break;
            case 3:
            break;
            case 4:
            break;

            }
            }while (opcion != 4);
        }
        public Menu MenuIngenieria(int opcion)throws IOException{
            do {
                System.out.println("Bienvenido al Menu de Ingenierias");

                String menuI= "\n--- SUB-MENU ---"
                +"1. Registrar préstamo de equipo"  

                +  "2 Modificar préstamo de equipo. (Por serial o cedula)"
                                        
                 +"3 Devolución de equipo (se elimina el registro). (Por serial o cedula)"
                                        
                 +"4 Buscar equipo (Por serial o cedula)"
                                    
                  +"5 Volver al menú principal."
                  +" Ingrese la opcion deseada";
                System.out.println(menuI);
                opcion=Integer.parseInt(cp.readLine());

                switch(opcion){
                    case 1:
                    break;
                    case 2:
                    break;
                    case 3:
                    break;
                    case 4:
                    break;
                    case 5:
                    break;
                    
                    default:
                    break;

                }
            
            } while (opcion !=5);

            return null;

        }
        public Menu MenuDiseño(int opcion)throws IOException{
            System.out.println("Bienvenido al Menu de Diseño");

            String menuD="\n--- SUB-MENU ---"
            +" 1 Registrar préstamo de equipo." 

            +"2 Modificar préstamo de equipo (Por serial o cedula)"

            +"3 Devolución de equipo (se elimina el registro). (Por serial o cedula)."

            +"4 Buscar equipo (Por serial o cedula) "

             +"5 Volver al menú principal"

            +"Ingrese la opcion deseada";
        System.out.println(menuD);

        opcion=Integer.parseInt(cp.readLine());
        switch (opcion) {
            case 1:
                
                break;
            
            case 2:
            break;

            case 3:
            break;

            case 4:
            break;

            case 5:
            break;
        
            default:
                break;
        }
            return null;

        }
    }


