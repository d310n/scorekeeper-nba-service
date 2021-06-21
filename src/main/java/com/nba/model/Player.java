package com.nba.model;

public class Player
{
    private String firstName;

    private String lastName;

    private String country;

    private String league;

    private String teamId;

    private int playerId;

    public Player()
    {
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getLeague() {
        return league;
    }

    public String getTeamId() {
        return teamId;
    }

    public int getPlayerId()
    {
        return playerId;
    }
}