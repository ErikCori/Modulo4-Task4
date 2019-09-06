package com.codeoftheweb.salvo;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Set;


import static java.util.stream.Collectors.toList;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    private Set<GamePlayer> gamePlayers;

    private String username;

    //Constructor
    public Player(){}

    public Player(String username){

        this.username = username;
    }

    //Getters
    public long getId(){
        return id;
    }
    public String getUsername() {
        return username;
    }
    public Set<GamePlayer> getGamePlayers() {
        return gamePlayers;
    }
}
