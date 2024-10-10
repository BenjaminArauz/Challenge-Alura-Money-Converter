package com.aluracursos.moneyconverter.network;

import com.aluracursos.moneyconverter.models.MoneyConverter;
import com.aluracursos.moneyconverter.utils.Constants;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MoneyApi {
    private String url = "https://v6.exchangerate-api.com/v6/" + Constants.API_KEY + "/latest/";
    MoneyConverter moneyConverter;

    public void getData(String from, float quantity){
        url += from;
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            String json = response.body();
            moneyConverter = gson.fromJson(json, MoneyConverter.class);
        } catch (Exception e) {
            System.out.println("Error!");
            System.out.println(e.getMessage());
        }
    }

    public float convertData(String from, String to, float quantity){
        getData(from, quantity);
        float rate = moneyConverter.getConversionRates().get(to);
        return rate * quantity;
    }
}
