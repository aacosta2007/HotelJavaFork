package application.domain;

import java.util.List;
import java.util.Scanner;

public class Booking {
    Scanner in = new Scanner(System.in);
    int id;
    String fecha;
    int cantidad;
    int idGuest;
    int idService;
    int idBedRoom;


    // CONTRUCTORES
    public Booking() {}

    public Booking(int id, String fecha, int cantidad, int idGuest, int idService, int idBedRoom) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.idGuest = idGuest;
        this.idService = idService;
        this.idBedRoom = idBedRoom;
    }

    //GET AND SETTER

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFecha() { return fecha; }

    public void setFecha(String fecha) { this.fecha = fecha; }

    public int getCantidad() { return cantidad; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public int getIdGuest() { return idGuest; }

    public void setIdGuest(int idGuest) { this.idGuest = idGuest; }

    public int getIdService() { return idService; }

    public void setIdService(int idService) { this.idService = idService; }

    public int getIdBedRoom() { return idBedRoom; }

    public void setIdBedRoom(int idBedRoom) { this.idBedRoom = idBedRoom; }

    //METODOS
    public Booking createBooking(Booking booking){
        System.out.println("Ingrese el id de la reserva");
        int id = in.nextInt();
        booking.id = id;
        in.nextLine();
        System.out.println("Ingrese la fecha de la reserva");
        String fecha = in.nextLine();
        booking.fecha = fecha;
        System.out.println("Ingrese la cantidad");
        int cantidad = in.nextInt();
        booking.cantidad = cantidad;
        in.nextLine();
        System.out.println("Ingrese el id del huésped");
        int idGuest = in.nextInt();
        booking.idGuest = idGuest;
        in.nextLine();
        System.out.println("Ingrese el id del servicio");
        int idService = in.nextInt();
        booking.idService = idService;
        in.nextLine();
        System.out.println("Ingrese el id de la habitación");
        int idBedRoom = in.nextInt();
        booking.idBedRoom = idBedRoom;
        in.nextLine();
        return booking;
    }
    public void updateBooking(int id, Booking booking) {
        if(this.id == id) {
            System.out.println("Ingrese la nueva fecha de la reserva");
            String fecha = in.nextLine();
            booking.fecha = fecha;
            System.out.println("Ingrese la nueva cantidad");
            int cantidad = in.nextInt();
            booking.cantidad = cantidad;
            in.nextLine();
            System.out.println("Ingrese el nuevo id del huésped");
            int idGuest = in.nextInt();
            booking.idGuest = idGuest;
            in.nextLine();
            System.out.println("Ingrese el nuevo id del servicio");
            int idService = in.nextInt();
            booking.idService = idService;
            in.nextLine();
            System.out.println("Ingrese el nuevo id de la habitación");
            int idBedRoom = in.nextInt();
            booking.idBedRoom = idBedRoom;
            in.nextLine();

        } else {
            System.out.println("La reserva con ID: " + id + ", no existe.");
        }
    }
    public void getBookingById(int id, Booking booking){
        if(this.id == id){
            System.out.println(
                    "Reserva: "+"\n"+
                    "Id: "+booking.id+"\n" +
                    "Fecha: "+booking.fecha+"\n" +
                    "Cantidad: "+booking.cantidad+"\n"+
                    "Id huésped: " +booking.idGuest+"\n"+
                    "Id servicio: " +booking.idService+"\n" +
                    "Id habitación: "+booking.idBedRoom +"\n"
            );
        }
    }
    public List<Booking> getAllBooking(Booking booking) {
        System.out.println(
                "Reservas: " + "\n" +
                "Id: " + booking.id + "\n" +
                "Fecha: " + booking.fecha + "\n" +
                "Cantidad: " + booking.cantidad + "\n" +
                "Id huésped: " + booking.idGuest + "\n" +
                "Id servicio: " + booking.idService + "\n" +
                "Id habitación: " + booking.idBedRoom + "\n"
        );
        return null;
    }
    public void deleteBooking(int id, Booking booking) {
        if(this.id == id) {
            System.out.println("La reserva con ID: " + id + " ha sido eliminada.");
        }else{
            System.out.println("Validar el id ingresado");
        }
        }

}