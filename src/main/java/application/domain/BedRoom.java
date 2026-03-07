package application.domain;

import java.util.List;
import java.util.Scanner;

public class BedRoom {


    Scanner sc = new Scanner(System.in);


    private int roomId;
    private String room;
    private String roomType;
    private double price;
    private boolean state;

    // ***********************************
    // Constructores
    // ***********************************
    public BedRoom(){}

    public BedRoom(int roomId, String room, String roomType, double price, boolean state) {
        this.roomId = roomId;
        this.room = room;
        this.roomType = roomType;
        this.price = price;
        this.state = state;
    }

    // ***********************************
    // Getter and Setter
    // ***********************************
    public int getRooId() {
        return roomId;
    }

    public void setRooId(int rooId) {
        this.roomId = rooId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }


    // ***********************************
    // Methods
    // ***********************************
    public BedRoom createBedRoom(BedRoom bedRoom){
        System.out.println("Ingrese el id de la habitación");
        int id = sc.nextInt();
        bedRoom.roomId = id;
        sc.nextLine();

        System.out.println("Ingrese el Nro de la habitación");
        String room = sc.nextLine();
        bedRoom.room = room;

        System.out.println("Ingrese/seleccione el tipo de la habitación");
        String roomType = sc.nextLine();
        bedRoom.roomType = roomType;

        System.out.println("Ingrese el precio por persona");
        double price = sc.nextDouble();
        bedRoom.price = price;
        sc.nextLine();

        System.out.println("Ingrese/seleccione el estado de la habitación");
        boolean state = sc.nextBoolean();
        bedRoom.state = state;
        sc.nextLine();


        return bedRoom;
    }


    public void updateBedRoom(int id, BedRoom bedRoom) {
        if(this.roomId == id) {
            System.out.println("Ingrese el Nuevo nro de la habitación");
            String room = sc.nextLine();
            bedRoom.room = room;

            System.out.println("Ingrese el Nuevo tipo de la habitación");
            String roomType = sc.nextLine();
            bedRoom.roomType = roomType;

            System.out.println("Ingrese el Nuevo precio por persona");
            double price = sc.nextDouble();
            bedRoom.price = price;
            sc.nextLine();

            System.out.println("Ingrese el Nuevo estado de la habitación");
            boolean state = sc.nextBoolean();
            bedRoom.state = state;
            sc.nextLine();
        } else {
            System.out.println("La habitación con ID: " + id + ", no existe.");
        }
    }


    public void getBeRoomById(int id, BedRoom bedRoom){

        if(this.roomId == id){
            System.out.println(
                    "Habitación: "  + "\n" +
                            "Id: " + bedRoom.roomId + "\n" +
                            "Habitación: " + bedRoom.room + "\n" +
                            "Tipo de habitación: " + bedRoom.roomType + "\n" +
                            "Precio: " + bedRoom.price + "\n" +
                            "Estado: " + bedRoom.state + "\n"
            );
        }
    }


    public List<BedRoom> getAllBedRoom(BedRoom bedRoom) {
        if(bedRoom.state == true) {
            System.out.println(
                    "Habitaciones: " + "\n" +
                            "****************************" + "\n" +
                            "Id: " + bedRoom.roomId + "\n" +
                            "Habitación: " + bedRoom.room + "\n" +
                            "Tipo de habitación: " + bedRoom.roomType + "\n" +
                            "Precio: " + bedRoom.price + "\n" +
                            "Estado: " + bedRoom.state + "\n"
            );
        }
        return null;
    }


    public void deleteBedRoom(int id, BedRoom bedRoom) {
        if(this.roomId == id) {
            this.state = false;
        } else {
            System.out.println("La habitación con ID: " + id + ", no existe.");
        }
    }









}