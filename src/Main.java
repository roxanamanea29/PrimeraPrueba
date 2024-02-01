
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Roxana
 * @date 01/02/2024
 */
public class Main {
    static Scanner scanFrut = new Scanner(System.in);
    static Scanner scanNum = new Scanner(System.in).useLocale(Locale.US);
    static GestorFruteria gf = new GestorFruteria();

    public static void main(String[] args) {
        //variables
        int opcion;
        System.out.println("Fruteria");
        boolean salir = false;
        //forulario
        do {
            menu();
            opcion = scanNum.nextInt();
            switch (opcion) {
                case 1:
                    ingresarFruta();
                    break;
                case 2:
                    mostrarFruta();
                    break;
                case 3:
                    buscarFruta();
                    break;
                case 4:
                    buscarCantidadFruta();
                    break;
                case 5:
                    frutasAlmacen();
                    break;
                case 6:
                    borrarFruta();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida.Por favor intente de nuevo.");
            }
        } while (!salir);

    }

    private static void buscarFruta() {
        String frutaX;
        System.out.println("   Filtro de busqueda de furta por nombre");
        System.out.println("===============================================");
        System.out.println(" Ingrese el  nombre de la fruta que buscas");
        System.out.println("================================================");
        frutaX = scanFrut.nextLine();
        System.out.println("La fruta que escogio es: " + frutaX);
        cabeceraListaFruta();
        for (Fruta f : gf.busquedaFruta(frutaX)) {
            System.out.println(f.toString());
        }
        pausa();
    }
    private static void buscarCantidadFruta(){
        int cantidadX;
        System.out.println("   Filtro de busqueda de furta por cantidad");
        System.out.println("===============================================");
        System.out.println(" Ingrese el  nombre de la fruta que buscas");
        System.out.println("================================================");
        cantidadX = scanNum.nextInt();
        cabeceraListaFruta();
        for (Fruta f : gf.busquedaFrutaCant(cantidadX)) {
            System.out.println(f.toString());
        }
        pausa();
    }


    private static void menu() {
        System.out.println("\n=====================================");
        System.out.println( "Menu de opciones");
        System.out.println(" ======================================");
        System.out.println(" 1. Introduce fruta en la lista.");
        System.out.println(" 2. Listar las frutas.");
        System.out.println(" 3. Buscar Fruta. ");
        System.out.println(" 4. Buscar cantidad fruta.");
        System.out.println(" 5. Listar fruta almacén.");
        System.out.println(" 6. Borrar fruta");
        System.out.println(" Ingresa 0 para salir del menu.");
    }

    private static void ingresarFruta() {
        String fruta;
        int cantidad;
        System.out.println("Nombre fruta: ");
        fruta = scanFrut.nextLine();
        System.out.println("Cantidad: ");
        cantidad = scanNum.nextInt();
        gf.agregarFruta(new Fruta(fruta, cantidad));
        System.out.println("\nFruta agregada con exito... ");
        pausa();
    }

    private static void pausa() {
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        scanFrut.nextLine();
    }

    private static void cabeceraListaFruta() {
        System.out.println("""
                               
                      Listado de frutas
                ======================================
                ID      Nombre          Cantidad kg
                ======================================
                """);
    }
    private static void mostrarFruta() {
        cabeceraListaFruta();
        for (Fruta f : gf.listarFruta()) {
            System.out.println(f.toString());
        }
        pausa();

    }
    private static void  borrarFruta(){
    int idX;
        System.out.println("            Borra la fruta");
        System.out.println("===============================================");
        System.out.println("  Ingrese el id de la fruta que queres borrrar");
        System.out.println("===============================================");
        idX = scanNum.nextInt();
        System.out.println("El id escogido es: " + idX + "\n");
        gf.borrarFruta(idX);
    pausa();
}
    private static void frutasAlmacen(){
        gf.agregarFruta(new Fruta("manzana", 15 ));
        gf.agregarFruta(new Fruta("cereza", 20 ));
        gf.agregarFruta(new Fruta("pera", 13 ));
        gf.agregarFruta(new Fruta("platano", 23 ));
        gf.agregarFruta(new Fruta("kiwi", 7 ));
        gf.agregarFruta(new Fruta("naranja", 30 ));
        gf.agregarFruta(new Fruta("manzana", 15 ));
        gf.agregarFruta(new Fruta("limon", 17 ));
        gf.agregarFruta(new Fruta("mango", 25 ));
        System.out.println("\nLos 10 registros del almacén agregados ... ");
        pausa();
    }
}