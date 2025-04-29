package com.pavan.ipl_dashboard.controller;

import com.pavan.ipl_dashboard.model.Team;
import com.pavan.ipl_dashboard.repository.MatchRepository;
import com.pavan.ipl_dashboard.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private MatchRepository matchRepository;

    @GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        Team team = this.teamRepository.findByTeamName(teamName);
        // team.setMatches(this.matchRepository.getByTeam1OrTeam2(teamName, teamName));
        return team;
    }
}
