package desafio.colecciones.listas.Principal;

import desafio.colecciones.listas.modelos.Producto;
import desafio.colecciones.listas.modelos.Tarjeta;
import desafio.colecciones.listas.modelos.TicketCompra;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreProducto="";
        double precioProducto=0;
        int cantidadProducto=0;
        double limiteTarjeta=0;
        TicketCompra ticketCompra = null;
        System.out.println("Ingrese límite de tarjeta: ");
        limiteTarjeta=teclado.nextDouble();
        double saldoActual=0;
        double precioActual=0;
        Tarjeta tarjeta = new Tarjeta(limiteTarjeta);
        int continuarCompra=1;
        while(continuarCompra==1)
        {
            System.out.println("Ingrese nombre producto: ");
            nombreProducto=teclado.next();
            System.out.println("Ingrese el precio del producto: ");
            precioProducto = teclado.nextDouble();
            System.out.println("Ingrese cantidad del producto: ");
            cantidadProducto = teclado.nextInt();

            Producto unProdcuto = new Producto(nombreProducto, precioProducto,cantidadProducto);
            if(ticketCompra==null){
                ticketCompra=new TicketCompra();
            }
            precioActual= unProdcuto.getPrecioProducto()*unProdcuto.getCantidadProducto();
            if(tarjeta.getSaldoActual()>precioActual){
                tarjeta.descontarSaldo(precioActual);
                ticketCompra.agregarProducto(unProdcuto);

            }else{
                System.out.println("¡Error! Tiene poco saldo en su tarjeta, operacion cancelada.");
            }
            System.out.println("¿Desea agregar otro producto? 1 para si, 0 para no");
            continuarCompra=teclado.nextInt();
        }
        System.out.println("\tTicket de compra");
        System.out.println("Numero de ticket: "+ticketCompra.getNumeroTicket());
        System.out.println("Fecha: "+ticketCompra.getFechaActual());
        List<Producto> productos = ticketCompra.getAll();
        productos.forEach(producto -> {
            System.out.println(producto);
        });
        System.out.print("Total de la compra: $");
        ticketCompra.calcularTotal();
        System.out.println(ticketCompra.getTotalCompra());
        teclado.close();
    }
}
