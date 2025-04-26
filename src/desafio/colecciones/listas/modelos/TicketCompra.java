package desafio.colecciones.listas.modelos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TicketCompra {
    private int numeroTicket;
    private List<Producto> listaProductos;
    private double totalCompra;
    Random random = new Random();

    public TicketCompra(){
        listaProductos=new ArrayList<>();
        numeroTicket=random.nextInt(345);
    }

    public void calcularTotal(){
        double nuevoTotal=0;
        for(Producto producto : listaProductos){
            nuevoTotal+=producto.getPrecioProducto()*producto.getCantidadProducto();
        }
        setTotalCompra(nuevoTotal);
    }

    public void agregarProducto(Producto unProducto){
        listaProductos.add(unProducto);
    }

    public List<Producto> getAll(){
        return listaProductos;
    }
    public void setTotalCompra(double totalCompra){
        this.totalCompra=totalCompra;
    }

    public double getTotalCompra(){
        return totalCompra;
    }
    public int getNumeroTicket(){
        return this.numeroTicket;
    }

}
