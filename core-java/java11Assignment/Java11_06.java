package java11Assignment;

import java.net.URI;
import java.net.http.*;
import java.util.Map;

public class Java11_06 {
	public static void main(String[] args) {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://httpbin.org/get"))
                .build();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            
            int statusCode = response.statusCode();
            System.out.println(statusCode);

           
            HttpHeaders headers = response.headers();
            for (Map.Entry<String, java.util.List<String>> header : headers.map().entrySet()) {
                System.out.println(header.getKey() + ": " + header.getValue());
            }

        
            String responseBody = response.body();
            System.out.println(responseBody);
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}




