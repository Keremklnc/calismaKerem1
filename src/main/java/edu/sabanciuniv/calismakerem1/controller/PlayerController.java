package edu.sabanciuniv.calismakerem1.controller;

import edu.sabanciuniv.calismakerem1.model.Player;
import edu.sabanciuniv.calismakerem1.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @GetMapping ("/player")
    public List<Player> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping ("/player")
    public Player eklePlayer(@RequestBody Player player){
        return playerService.eklePlayer(player);
    }

    @GetMapping ("/player/{id}")
    public Player getirPlayer(@PathVariable String id){
        return playerService.getirPlayer(id);
    }

}
