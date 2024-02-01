import java.util.ArrayList;

/**
 * @author Roxana
 * @date 01/02/2024
 */
public class GestorCoche {
    private ArrayList<Coche> coches = new ArrayList<Coche>();
    private int id =1;


    public void agregarCoche(Coche coche){
        coche.setId(id++);
        coches.add(coche);
    }

    public ArrayList<Coche> listarCoches() {
        ArrayList<Coche> cochesNoBorrados = new ArrayList<Coche>();
        for(Coche coche : coches){
            if(!coche.isBorrado()){
                cochesNoBorrados.add(coche);
            }
        }
        return cochesNoBorrados;
    }
    public ArrayList<Coche> busquedaXColor(String colorX){
        ArrayList<Coche> listaPorColor = new ArrayList<Coche>();
        for (Coche coche : coches) {
            if (colorX.equalsIgnoreCase(coche.getColor())) {
               listaPorColor.add(coche);
            }
        }
        return listaPorColor;
    }
    public ArrayList<Coche> busquedaXMarca(String marcaX){
        ArrayList<Coche> listaPorMarca = new ArrayList<Coche>();
        for(Coche coche : coches){
            if(marcaX.equalsIgnoreCase(coche.getMarca())){
                listaPorMarca.add(coche);
            }
        }
        return listaPorMarca;
    }
   public ArrayList<Coche> busquedaXAnio(int anio){
        ArrayList<Coche> listaPorAnio = new ArrayList<Coche>();
        for(Coche coche : coches){
            if(coche.getAnio()==anio){
                listaPorAnio.add(coche);
            }
        }
        return listaPorAnio;
    }
    public ArrayList<Coche> busquedaXModelo(String modeloX){
        ArrayList<Coche> listarPorModelo = new ArrayList<Coche>();
        for(Coche coche : coches){
            if(modeloX.equalsIgnoreCase(coche.getModelo())) {
                listarPorModelo.add(coche);
            }
        }
        return listarPorModelo;
    }

    public void borrarCoche(int id){
        for(Coche coche :coches){
            if(coche.getId()==id){
                if(!coche.isBorrado()){
                    coche.setBorrado(true);
                }
            }
        }
    }
}
