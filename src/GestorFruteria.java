import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Roxana
 * @date 25/01/2024
 */
public class GestorFruteria {
    private ArrayList<Fruta> frutas = new ArrayList<Fruta>();
    private int id = 1;

    public void agregarFruta(Fruta fruta) {
        fruta.setId(id++);
        frutas.add(fruta);
    }

    public ArrayList<Fruta> listarFruta() {
        ArrayList<Fruta> frutasNoBorradas = new ArrayList<>();
        for (Fruta nombreFruta : frutas) {
            if (!nombreFruta.isBorrado()) {
                frutasNoBorradas.add(nombreFruta);
            }
        }
        return frutasNoBorradas;
    }

    public ArrayList<Fruta> busquedaFruta(String nombreFruta) {
        ArrayList<Fruta> listaPorNombre = new ArrayList<Fruta>();
        for (Fruta fruta : frutas) {
            if (nombreFruta.equalsIgnoreCase(fruta.getNombreFruta())) {
                listaPorNombre.add(fruta);
            }
        }
        return listaPorNombre;
    }

    public ArrayList<Fruta> busquedaFrutaCant(int cantidad) {
        ArrayList<Fruta> listaPorCantidad = new ArrayList<Fruta>();
        for (Fruta fruta : frutas) {
            if (fruta.getCantidad() == cantidad) {
                listaPorCantidad.add(fruta);
            }
        }
        return listaPorCantidad;
    }

    public void borrarFruta(int id) {
        for (Fruta fruta : frutas) {
            if (fruta.getId() == id) {
                if (!fruta.isBorrado()) {
                    fruta.setBorrado(true);
                }
            }
        }
    }
}
