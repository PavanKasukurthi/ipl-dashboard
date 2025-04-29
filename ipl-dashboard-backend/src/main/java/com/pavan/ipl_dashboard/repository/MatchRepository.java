package com.pavan.ipl_dashboard.repository;

import com.pavan.ipl_dashboard.model.Match;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatchRepository extends CrudRepository<Match, Long> {

    List<Match> getByTeam1OrTeam2(String teamName1, String teamName2);
}
