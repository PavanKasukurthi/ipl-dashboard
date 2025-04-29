package com.pavan.ipl_dashboard.repository;

import com.pavan.ipl_dashboard.model.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface TeamRepository extends JpaRepository<Team, Long> {

    Team findByTeamName(String teamName);

}
