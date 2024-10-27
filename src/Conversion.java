import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversion{
    String base_code;
    String target_code;

    public void pedirDatos(String base_code, String target_code){
        this.base_code = base_code;
        this.target_code = target_code;
    }

    public Moneda convertirMoneda(double cantidad){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/3b122b56c3db3bd5f6eccc35/pair/"
                +base_code+"/"+target_code+"/"+cantidad);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(),Moneda.class);
        } catch (Exception  e) {
            throw new RuntimeException("No encontre esa pelicula.");
        }

    }



}
