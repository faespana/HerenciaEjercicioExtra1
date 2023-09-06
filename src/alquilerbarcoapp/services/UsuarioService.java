package alquilerbarcoapp.services;

import alquilerbarcoapp.entities.Usuario;
import java.util.Scanner;

public class UsuarioService {

    private final Scanner leer;

    public UsuarioService() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public Usuario crearAlquiler() {

        Usuario user = new Usuario();

        System.out.print("Bienvenido estimado cliente, ingrese su nombre de usuario: ");
        user.setNombre(leer.next());
        System.out.println("");

        System.out.print("Por favor, ingrese su numero de identidad: ");
        user.setDocumentoCliente(leer.next());
        System.out.println("");

        System.out.print("Estimado " + user.getNombre() + " ingrese el dia de su fecha de alquiler: ");
        int dia = leer.nextInt();

        
        
        return user;
    }
}
