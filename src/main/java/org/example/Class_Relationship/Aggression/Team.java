package org.example.Class_Relationship.Aggression;

import java.util.ArrayList;
import java.util.List;

public class Team {

    String teamName;
    List<Player> players = new ArrayList<>();

    Team(String teamName){
        this.teamName = teamName;
    }

    void addPlayer(Player player){
        players.add(player);
    }

    void showTeam() {
        System.out.println("Team " +  teamName  + " has players: ");
        for(Player p:players){
            System.out.println(" - "+ p.name);
        }
    }

}
