package services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class httpApiRequest {

    public void cambioMoneda(String origen, String destino, double cantidad) {

        String url = "API_URL" +
                "pair/" +
                origen +
                "/" + destino +
                "/" + cantidad;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("url"))
                    .build();

        } catch (Throwable e)
            {
            e.printStackTrace();
            }
    }
}
