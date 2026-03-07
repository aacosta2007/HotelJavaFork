package application.domain;

import java.util.List;
import java.util.Scanner;

public class Employe {

    Scanner in = new Scanner(System.in);
    private int id = 0;
    private String name = "";
    private String lastName = "";
    private String email = "";
    private String password = "";
    private boolean state = true;
    private String rol = "";
    private double salario = 0;

    // CONTRUCTORES
    public Employe(){}

    public Employe(int id, String name, String lastName, String email, String password, boolean state, String rol, double salario) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.state = state;
        this.rol = rol;
        this.salario = salario;
    }

    // GET AND SETTER
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName()
    { return name; }

    public void setName(String name){
        this.name = name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Boolean getState(){
        return state;
    }
    public void setState(Boolean state){
        this.state = state;
    }
    public String getRol(){
        return rol;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
    public double getSalario(){
        return salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    // METODOS
    public Employe createEmploye(Employe employe){
        System.out.println("Ingrese el id del empleado");
        int id = in.nextInt();
        employe.id = id;
        in.nextLine();

        System.out.println("Ingrese el nombre del empleado");
        String name = in.nextLine();
        employe.name = name;

        System.out.println("Ingrese el apellido del empleado");
        String lastName = in.nextLine();
        employe.lastName = lastName;

        System.out.println("Ingrese el email del empleado");
        String email = in.nextLine();
        employe.email = email;

        System.out.println("Ingrese la contraseña del empleado");
        String password = in.nextLine();
        employe.password = password;

        System.out.println("Ingrese el rol del empleado");
        String rol = in.nextLine();
        employe.rol = rol;

        System.out.println("Ingrese el salario del empleado");
        double salario = in.nextDouble();
        employe.salario = salario;
        in.nextLine();

        System.out.println("Ingrese/seleccione el estado del empleado");
        boolean state = in.nextBoolean();
        employe.state = state;
        in.nextLine();

        return employe;
    }


    public void updateEmploye(int id, Employe employe) {
        if(this.id == id) {

            System.out.println("Ingrese el nuevo nombre del empleado");
            String name = in.nextLine();
            employe.name = name;

            System.out.println("Ingrese el nuevo apellido del empleado");
            String lastName = in.nextLine();
            employe.lastName = lastName;

            System.out.println("Ingrese el nuevo email del empleado");
            String email = in.nextLine();
            employe.email = email;

            System.out.println("Ingrese la nueva contraseña del empleado");
            String password = in.nextLine();
            employe.password = password;

            System.out.println("Ingrese el nuevo rol del empleado");
            String rol = in.nextLine();
            employe.rol = rol;

            System.out.println("Ingrese el nuevo salario del empleado");
            double salario = in.nextDouble();
            employe.salario = salario;
            in.nextLine();

            System.out.println("Ingrese el nuevo estado del empleado");
            boolean state = in.nextBoolean();
            employe.state = state;
            in.nextLine();

        } else {
            System.out.println("El empleado con ID: " + id + ", no existe.");
        }
    }


    public void getEmployeById(int id, Employe employe){
        if(this.id == id){
            System.out.println(
            "Empleado: "  + "\n" +
            "Id: " + employe.id + "\n" +
            "Nombre: " + employe.name + "\n" +
            "Apellido: " + employe.lastName + "\n" +
            "Email: " + employe.email + "\n" +
            "Rol: " + employe.rol + "\n" +
            "Salario: " + employe.salario + "\n" +
            "Estado: " + employe.state + "\n"
            );
        }
    }


    public List<Employe> getAllEmploye(Employe employe) {
        if(employe.state == true) {
            System.out.println(
            "Empleados: " + "\n" +
            "****************************" + "\n" +
            "Id: " + employe.id + "\n" +
            "Nombre: " + employe.name + "\n" +
            "Apellido: " + employe.lastName + "\n" +
            "Email: " + employe.email + "\n" +
            "Rol: " + employe.rol + "\n" +
            "Salario: " + employe.salario + "\n" +
            "Estado: " + employe.state + "\n"
            );
        }
        return null;
    }


    public void deleteEmploye(int id, Employe employe) {
        if(this.id == id) {
            this.state = false;
        } else {
            System.out.println("El empleado con ID: " + id + ", no existe.");
        }
    }



}