import control.TiendaFetcher;
import views.Dashboard;

public class Main {
    public static void main(String[] args) {
        
        try {
            String urlApi = "https://jsonplaceholder.typicode.com/posts/4";
            String respuesta = TiendaFetcher.obtenerProductos(urlApi);
            
            System.out.println(" DATOS DE LA API: ");
            
            // Buscar el título directamente
            int inicioTitulo = respuesta.indexOf("\"title\":\"") + 9;
            int finTitulo = respuesta.indexOf("\"", inicioTitulo);
            String titulo = respuesta.substring(inicioTitulo, finTitulo);
            
            // Buscar el cuerpo directamente  
            int inicioCuerpo = respuesta.indexOf("\"body\":\"") + 8;
            int finCuerpo = respuesta.indexOf("\"", inicioCuerpo);
            String cuerpo = respuesta.substring(inicioCuerpo, finCuerpo);
            
            System.out.println("📌 Título: " + titulo);
            System.out.println("📌 Descripción: " + cuerpo);
            
            // Dashboard normal
            Dashboard funcion = new Dashboard(titulo, cuerpo);
            
            // Después de obtener la respuesta, verificar que no esté vacía
        if (respuesta.contains("\"title\":\"") && respuesta.contains("\"body\":\"")) {
            // Extraer los datos como arriba
        } else {
            System.out.println("La API no devolvió los datos esperados");
            System.out.println("Respuesta recibida: " + respuesta);
        }

        } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
        }
        
    }
}