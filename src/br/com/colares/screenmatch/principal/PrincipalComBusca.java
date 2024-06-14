package br.com.colares.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual filme você deseja?");
        String filme = sc.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + filme + "&apikey=e8f674bb";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("HTTP Endpoint: "+request.uri());
        System.out.println("HTTP Response: "+ response.body());
    }
}
