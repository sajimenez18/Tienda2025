import control.TiendaFecher;
import views.Dashboard;

public class Main {
    
    public static void main(String[] args) {

        try {

        String urlApi = "https://jsonplaceholder.typicode.com/posts";
        String respuesta = TiendaFecher.obtenerProductos(urlApi);
        System.out.println("Respuesta de la API");

        //Dashboard dashboard = new Dashboard(respuesta);

        //
        for (int i = 0; i < respuesta.length(); i++) {
            String letra = "" + respuesta.charAt(i);
            if (letra.equalsIgnoreCase(",")) {
                System.out.println(respuesta.charAt(i));
            }
        }
        } catch (Exception e) {
            //
        }
    }
}