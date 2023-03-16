package edu.sabanciuniv.calismakerem1.Initilazer;

import edu.sabanciuniv.calismakerem1.model.Player;
import edu.sabanciuniv.calismakerem1.model.Team;
import edu.sabanciuniv.calismakerem1.repository.PlayerRepository;
import edu.sabanciuniv.calismakerem1.repository.TeamRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestDataInitialezer implements CommandLineRunner {
    private final PlayerRepository playerRepository;
    private final TeamRepository teamRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        if (teamRepository.count() == 0) {
            Player player1 = new Player("Alex", 32, "OOM");
            Player player2 = new Player("Ricardo", 34, "MR");
            Player player3 = new Player("Hagi", 36, "FW");
            Player player4 = new Player("Nobre", 29, "ST");


            Team team1 = new Team("Fenerbahce");
            Team team2 = new Team("Besiktas");
            Team team3 = new Team("Galatasaray");

            team1.getSquad().add(player1);
            team2.getSquad().add(player2);
            team3.getSquad().add(player3);
            team1.getSquad().add(player4);

            player1.setTeam(team1);
            player2.setTeam(team2);
            player3.setTeam(team3);
            player4.setTeam(team1);

            teamRepository.save(team1);
            teamRepository.save(team2);
            teamRepository.save(team3);

            playerRepository.save(player1);
            playerRepository.save(player2);
            playerRepository.save(player3);
            playerRepository.save(player4);



    }
}

}
