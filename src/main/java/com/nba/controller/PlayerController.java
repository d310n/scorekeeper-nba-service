package com.nba.controller;

import com.nba.model.Player;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PlayerController
{
    @Value(value = "${x.rapidapi.host}")
    private String rapidApiHost;

    @GetMapping(value = "/playerId")
    private Player getPlayerId()
    {
        String uri = "http://" + rapidApiHost + "/players/playerId";
        RestTemplate restTemplate = new RestTemplate();
        Player result = restTemplate.getForObject(uri, Player.class);
        return result;
    }
}
