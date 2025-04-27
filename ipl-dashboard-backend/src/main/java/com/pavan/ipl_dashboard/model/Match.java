package com.pavan.ipl_dashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@Entity
public class Match {
    @Id
    private long id;
//    private String season;
    private String city;
    private LocalDate date;
    private String playerOfMatch;
    private String venue;
    private String team1;
    private String team2;
    private String tossWinner;
    private String tossDecision;
    private String matchWinner;
    private String result;
    private String resultMargin;
//    private String targetRuns;
//    private String targetOvers;
//    private char superOver;
//    private String method;
    private String umpire1;
    private String umpire2;
}
