import java.util.Iterator;
import java.util.List;

/**
 * @author Roxana
 * @ date 21/01/2024
 */
public class Fruta {
    private String nombreFruta;
    private int cantidad;
    private int id = 0;
    private boolean borrado = false;
    // CONSTRUCOTR CON PARAMETROS
    public Fruta(String nombreFruta, int cantidad) {
        this.nombreFruta = nombreFruta;
        this.cantidad = cantidad;
    }

    public boolean isBorrado(){
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
public String toString(){
        return String.format("%-4d %8s %12s",id,nombreFruta,cantidad);
}
    // metodo getter para optener el ombre de la fruta
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNombreFruta() {
        return nombreFruta;
    }

    //metodo setter para cambiar el nombre de la fruta
    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


}