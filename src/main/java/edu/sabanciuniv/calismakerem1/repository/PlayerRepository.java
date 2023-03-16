package edu.sabanciuniv.calismakerem1.repository;

import edu.sabanciuniv.calismakerem1.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query("select p from Player p where p.id=:id")
    Player findPlayerById(String id);
}


