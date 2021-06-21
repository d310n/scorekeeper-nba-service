package com.nba.controller;

import com.nba.model.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TeamController
{
    @Value(value = "${x.rapidapi.host}")
    private String rapidApiHost;

    @GetMapping(value = "/teamId")
    private Team getTeamId()
    {
        String uri = "http://" + rapidApiHost + "/teams/teamId";
        RestTemplate restTemplate = new RestTemplate();
        Team result = restTemplate.getForObject(uri, Team.class);
        return result;
    }
}
