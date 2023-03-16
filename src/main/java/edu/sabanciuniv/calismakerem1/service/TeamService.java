package edu.sabanciuniv.calismakerem1.service;

import edu.sabanciuniv.calismakerem1.model.Player;
import edu.sabanciuniv.calismakerem1.model.Team;
import edu.sabanciuniv.calismakerem1.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Team ekleTeam(Team team) {
        return teamRepository.save(team);
    }
}
