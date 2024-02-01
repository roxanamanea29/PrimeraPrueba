
import java.util.Locale;
import java.util.Scanner;

/**
 * @author Roxana
 * @date 01/02/2024
 */
public class Main {
    static Scanner scanNum = new Scanner(System.in).useLocale(Locale.US);
    static Scanner scanStr = new Scanner(System.in);
    static GestorCoche gc = new GestorCoche();

    public static void main(String[] args) {

        int opcion;
        System.out.println("Crud de coches");
        boolean salir = false;
        do {
            menu();
            opcion = scanNum.nextInt();
            switch (opcion) {
                case 1:
                    ingresarCoche();
                    break;
                case 2:
                    mostrarCoche();
                    break;
                case 3:
                    filtrarXColor();
                    break;
                case 4:
                    filtrarXMarca();
                    break;
                case 5:
                    filtrarXAnio();
                    break;
                case 6:
                    filtrarXModelo();
                    break;
                case 7:
                    borrarCoche();
                    break;
                case 9:
                    mocearCoche();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (!salir);
        System.out.println("Adios!");
    }

    private static void menu() {
        System.out.println("Menu de Opciones");
        System.out.println("==================\n");
        System.out.println("1. Ingresar coche");
        System.out.println("2. Listar coche");
        System.out.println("3. Filtrar por color");
        System.out.println("4. Filtrar por marca");
        System.out.println("5. Filtrar por año");
        System.out.println("6. Filtrar por modelo");
        System.out.println("7. Eliminar coche");
        System.out.println("9. Agregar coche en masa");
        System.out.println("0. Salir");
        System.out.println();
        System.out.println("Ingrese una opcion");
    }

    private static void ingresarCoche() {
        String marca;
        String modelo;
        int anio;
        String color;
        System.out.println("Formulario de ingres de coche");
        System.out.println("=============================\n");
        System.out.println("Marca: ");
        marca = scanStr.nextLine();
        System.out.println("Modelo: ");
        modelo = scanStr.nextLine();
        System.out.println("Año: ");
        anio = scanNum.nextInt();
        System.out.println("Color: ");
        color = scanStr.nextLine();
        gc.agregarCoche(new Coche(marca, modelo, anio, color));
        System.out.println("\nCoche agregado con exito...!");
        pausa();

    }

    private static void pausa() {
        System.out.println();
        System.out.println("Presione ENTER para continuar...");
        scanStr.nextLine();
    }

    private static void cabeceraListarCoche() {
        System.out.println("        Listado de coche");
        System.out.println("============================================================\n");
        System.out.println("ID   Marca               Modelo           Año    Color");
        System.out.println("============================================================\n");
    }

    private static void mocearCoche() {
        gc.agregarCoche(new Coche("Toyota", "Corolla", 2020, "Rojo"));
        gc.agregarCoche(new Coche("Honda", "Civic", 2019, "Negro"));
        gc.agregarCoche(new Coche("Chevrolet", "Camaro", 2020, "Amarillo"));
        gc.agregarCoche(new Coche("Nissan", "Sentra", 2021, "Blanco"));
        gc.agregarCoche(new Coche("Volkswagen", "Golf", 2017, "Verde"));
        gc.agregarCoche(new Coche("BMW", "Serie 3", 2022, "Gris"));
        gc.agregarCoche(new Coche("Audi", "A4", 2016, "Plata"));
        gc.agregarCoche(new Coche("Mercedes-Benz", "Clase C", 2023, "Negro"));
        gc.agregarCoche(new Coche("Subaru", "Impreza", 2015, "Rojo"));
        gc.agregarCoche(new Coche("Mazda", "3", 2014, "Azul"));
        System.out.println("\n10 registros agrados con exito.......!");
        pausa();
    }

    private static void mostrarCoche() {
        cabeceraListarCoche();
        for (Coche c : gc.listarCoches()) {
            System.out.println(c.toStr());
        }
        pausa();
    }

    private static void filtrarXColor() {
        String myColor;
        String colorX;
        System.out.println("""
                     Filtro de color
                =============================
                 Ingrese el color que buscas
                =============================""");
        myColor = scanStr.nextLine();
        colorX = myColor.substring(0, 1).toUpperCase() + myColor.substring(1).toLowerCase();
        System.out.println("El color escogido es: " + colorX + "\n");
        cabeceraListarCoche();
        for (Coche c : gc.busquedaXColor(colorX)) {
            System.out.println(c.toStr());
        }
        pausa();
    }

    private static void filtrarXMarca() {
        String marca;
        String marcaX;
        System.out.println("""
                     Filtro de marca
                =============================
                 Ingrese la marca que buscas
                =============================""");
        marca = scanStr.nextLine();
        marcaX = marca.substring(0, 1).toUpperCase() + marca.substring(1).toLowerCase();
        System.out.println("La marca escogida es: " + marcaX + "\n");
        cabeceraListarCoche();
        for (Coche c : gc.busquedaXMarca(marcaX)) {
            System.out.println(c.toStr());
        }
        pausa();
    }

    private static void filtrarXAnio() {
        int anioX;
        System.out.println("""
                     Filtro de año
                =============================
                  Ingrese el año que buscas
                =============================""");
        anioX = scanNum.nextInt();
        System.out.println("El año escogido es: " + anioX + "\n");
        cabeceraListarCoche();
        for (Coche c : gc.busquedaXAnio(anioX)) {
            System.out.println(c.toStr());
        }
        pausa();
    }

    private static void filtrarXModelo() {
        String modelo;
        String modeloX;
        System.out.println("""
                     Filtro de modelo
                ================================
                  Ingrese el modelo que buscas
                ================================""");
        modelo = scanStr.nextLine();
        modeloX = modelo.substring(0, 1).toUpperCase() + modelo.substring(1).toLowerCase();
        System.out.println("El modelo escogido es: " + modeloX);
        for (Coche c : gc.busquedaXModelo(modeloX)) {
            System.out.println(c.toStr());
        }
        pausa();
    }
    private static void borrarCoche(){
        int idX;
        System.out.println("""
                                Borra un coche
                ===============================================
                  Ingrese el id del coche  que queres borrrar
                ===============================================""");
        idX = scanNum.nextInt();
        System.out.println("El id escogido es: " + idX + "\n");
        gc.borrarCoche(idX);
        pausa();
        }

    }

