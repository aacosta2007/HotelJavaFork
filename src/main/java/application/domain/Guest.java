package application.domain;
import java.util.List;
import java.util.Scanner;

public class Guest {
    Scanner in = new Scanner(System.in);

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String origen;
    private String typeGuest;
    private boolean state;

    // CONSTRUCTORES
    public Guest(){
    }

    public Guest(Scanner in, int id, String name, String lastName, String email, String password, String origen, String typeGuest, boolean state) {
        this.in = in;
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.origen = origen;
        this.typeGuest = typeGuest;
        this.state = state;
    }

    //GET AND SETTERS
    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getTypeGuest() {
        return typeGuest;
    }

    public void setTypeGuest(String typeGuest) {
        this.typeGuest = typeGuest;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    //METODOS
    public Guest createGuest(Guest guest){
        System.out.print("Ingrese el id: ");
        int id = in.nextInt();
        guest.id=id;
        in.nextLine();
        System.out.print("Ingrese el nombre: ");
        String name = in.nextLine();
        guest.name=name;
        System.out.print("Ingrese el apellido: ");
        String lastName = in.nextLine();
        guest.lastName = lastName;
        System.out.print("Ingrese el email: ");
        String email = in.nextLine();
        guest.email = email;
        System.out.print("Ingrese la contraseña: ");
        String password = in.nextLine();
        guest.password = password;
        System.out.println("Ingrese el orige: ");
        String origen = in.nextLine();
        guest.origen = origen;
        System.out.print("Ingrese el tipo de guest: ");
        String typeGuest = in.nextLine();
        guest.typeGuest = typeGuest;
        System.out.print("ingrese el estado: ");
        boolean state = in.nextBoolean();
        guest.state = state;
        return guest;
    }
    public Guest updateGuest (int id, Guest guest){
        if (this.id==id) {
            in.nextLine();
            System.out.print("Ingrese el nuevo nombre: ");
            String newName = in.nextLine();
            guest.name = newName;
            System.out.print("Ingrese el nuevo apellido: ");
            String newLastName = in.nextLine();
            guest.lastName = newLastName;
            System.out.print("Ingrese el nuevo email: ");
            String newEmail = in.nextLine();
            guest.email = newEmail;
            System.out.print("Ingrese la nuevo contraseña: ");
            String newPassword = in.nextLine();
            guest.password = newPassword;
            System.out.println("Ingrese el orige: ");
            String newOrigen = in.nextLine();
            guest.origen = newOrigen;
            System.out.print("Ingrese el tipo de guest: ");
            String newTypeGuest = in.nextLine();
            guest.typeGuest = newTypeGuest;
            System.out.print("Ingrese el nuevo estado: ");
            boolean newState = in.nextBoolean();
            guest.state = newState;
        }else{
            System.out.println("Validar el id ingresado");
        }
        return guest;
    }
   public List<Guest> getUsers(Guest guest){
        if(guest.state==true){
            System.out.print("Person\n" +
                    "Id: "+guest.id+"\n"+
                    "Name: "+guest.name+"\n"+
                    "LastName: "+guest.lastName+"\n"+
                    "Email: "+guest.email+"\n"+
                    "Password: "+guest.password+"\n"+
                    "State: "+guest.state+"\n");
        }else{
            System.out.println("No hay usuarios registrados");
        }
        return null;
    }

    public  Guest getGuestById(int id, Guest guest){
        if (this.id==id){
            System.out.print("Guest\n" +
                    "Id: "+guest.id+"\n"+
                    "Name: "+guest.name+"\n"+
                    "LastName: "+guest.lastName+"\n"+
                    "Email: "+guest.email+"\n"+
                    "Password: "+guest.password+"\n"+
                    "State: "+guest.state+"\n");
        }else{
            System.out.println("Validar el id ingresado");
        }
        return null;
    }
    public  void deleteGuest(int id, Guest guest){
        if (this.id==id){
            guest.state=false;
        }else{
            System.out.println("Validar el id ingresado");
        }
    }
}
