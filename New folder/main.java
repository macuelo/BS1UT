
package main;

import dao.UsuarioDAO;
import modelo.Usuario;
import dao.JuegoDAO;
import modelo.Juego;

public class main {

    public static void main(String[] args) {
        
           try {
            UsuarioDAO dao = new UsuarioDAO();

            // Crear usuario
            Usuario nuevo = new Usuario("Carlos", "carlos@mail.com", "clave123");
            dao.registrarUsuario(nuevo);
            System.out.println("✅ Usuario registrado");

            // Listar usuarios
            for (Usuario u : dao.listarUsuarios()) {
                System.out.println(u.getId() + " - " + u.getNombre() + " - " + u.getCorreo());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
           
            try {
            JuegoDAO juegoDAO = new JuegoDAO();

            // Insertar juegos
            juegoDAO.agregarJuego(new Juego("Minecraft", "Sandbox", 4.8, 1000000));
            juegoDAO.agregarJuego(new Juego("GTA V", "Acción", 4.7, 950000));

            // Listar juegos
            for (Juego j : juegoDAO.listarJuegos()) {
                System.out.println(j.getId() + " - " + j.getNombre() +
                                   " (" + j.getGenero() + ") - " +
                                   j.getRating() + "⭐ - " +
                                   j.getDescargas() + " descargas");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
           
           
           
    }
}
        
        
// falta hacer menu para todas las opciones del programa 