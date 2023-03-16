package edu.sabanciuniv.calismakerem1.controller;

import edu.sabanciuniv.calismakerem1.model.Team;
import edu.sabanciuniv.calismakerem1.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    TeamService teamService;

    @GetMapping("/team")
    public List<Team> getAllTeams(){
        return teamService.getAllTeams();
    }

    @PostMapping("/team")
    public Team ekleTeam(@RequestBody Team team){
        return teamService.ekleTeam(team);
    }
}
