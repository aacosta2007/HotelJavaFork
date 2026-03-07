package application.domain;

import java.util.List;
import java.util.Scanner;

public class Person {
    Scanner in = new Scanner(System.in);
    // Person Atributes

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Boolean state;


    // Constructors

    public Person() {
    }

    public Person(String email){
        this.email = email;
    }

    public Person(int id, String name, String lastName, String email, String password, Boolean state) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
    }

    // Getters and Setters

    public int getId(){
        return id;
    }

    public void setId(int id){
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    // Class Methods

    public Person createUser(Person person){
        System.out.print("Ingrese el id: ");
        int id = in.nextInt();
        person.id=id;
        in.nextLine();
        System.out.print("Ingrese el nombre: ");
        String name = in.nextLine();
        person.name=name;
        System.out.print("Ingrese el apellido: ");
        String lastName = in.nextLine();
        person.lastName = lastName;
        System.out.print("Ingrese el email: ");
        String email = in.nextLine();
        person.email = email;
        System.out.print("Ingrese la contraseña: ");
        String password = in.nextLine();
        person.password = password;
        System.out.print("ingrese el estado: ");
        boolean state = in.nextBoolean();
        person.state = state;
        return person;
    }


    public Person updateUser(int id ,Person person){
        if (this.id==id) {
            in.nextLine();
            System.out.print("Ingrese el nuevo nombre: ");
            String newName = in.nextLine();
            person.name = newName;
            System.out.print("Ingrese el nuevo apellido: ");
            String newLastName = in.nextLine();
            person.lastName = newLastName;
            System.out.print("Ingrese el nuevo email: ");
            String newEmail = in.nextLine();
            person.email = newEmail;
            System.out.print("Ingrese la nuevo contraseña: ");
            String newPassword = in.nextLine();
            person.password = newPassword;
            System.out.print("Ingrese el nuevo estado: ");
            boolean newState = in.nextBoolean();
            person.state = newState;
        }else{
            System.out.println("Validar el id ingresado");
        }
        return person;
    }

    public List<Person> getUsers(Person person){
        if(person.state==true){
            System.out.print("Person\n" +
                    "Id: "+person.id+"\n"+
                    "Name: "+person.name+"\n"+
                    "LastName: "+person.lastName+"\n"+
                    "Email: "+person.email+"\n"+
                    "Password: "+person.password+"\n"+
                    "State: "+person.state+"\n");
        }else{
            System.out.println("No hay usuarios registrados");
        }
        return null;
    }

    public Person getUserById(int id, Person person){
        if (this.id==id){
            System.out.print("Person\n" +
                    "Id: "+person.id+"\n"+
                    "Name: "+person.name+"\n"+
                    "LastName: "+person.lastName+"\n"+
                    "Email: "+person.email+"\n"+
                    "Password: "+person.password+"\n"+
                    "State: "+person.state+"\n");
        }else {
            System.out.println("Validar el id ingresado");
        }
        return null;
    }

    public void deleteUser(int id, Person person){
        if (this.id==id){
            person.state=false;
        }else{
            System.out.println("Validar el id ingresado");
        }
        }




}
