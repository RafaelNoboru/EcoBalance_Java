package br.com.fiap.globalsolution.thingerio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.http.ResponseEntity;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public class ThingerService {

    @Value("${thinger.io.api.token}")
    private String token;

    @Value("${thinger.io.api.userId}")
    private String userId;

    @Value("${thinger.io.api.deviceId}")
    private String deviceId;

    private final RestTemplate restTemplate;

    public ThingerService() {
        this.restTemplate = new RestTemplate();
    }

    public JsonNode getConsumoEnergia() {
        String url = UriComponentsBuilder.fromHttpUrl("https://backend.thinger.io/v3/users/" + userId + "/devices/" + deviceId + "/callback/data")
                .queryParam("authorization", token)
                .toUriString();

        ResponseEntity<JsonNode> response = restTemplate.getForEntity(url, JsonNode.class);

        System.out.println("Consumo de Energia: " + response.getBody());

        return response.getBody();
    }

    public JsonNode getProducaoEnergia() {
        String url = UriComponentsBuilder.fromHttpUrl("https://backend.thinger.io/v3/users/" + userId + "/devices/" + deviceId + "/callback/data")
                .queryParam("authorization", token)
                .toUriString();

        ResponseEntity<JsonNode> response = restTemplate.getForEntity(url, JsonNode.class);

        System.out.println("Produção de Energia: " + response.getBody());

        return response.getBody();
    }
}
