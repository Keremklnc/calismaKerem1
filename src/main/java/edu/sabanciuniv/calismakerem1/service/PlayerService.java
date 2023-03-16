package edu.sabanciuniv.calismakerem1.service;

import edu.sabanciuniv.calismakerem1.model.Player;
import edu.sabanciuniv.calismakerem1.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public Player eklePlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player getirPlayer(String id) {
        return playerRepository.findPlayerById(id);
    }
}
