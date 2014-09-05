package com.patmullins.soccerleague.repository;

import com.patmullins.soccerleague.domain.PlayerPayCheck;

import java.util.ArrayList;
import java.util.List;

public interface PayCheckRepository {
    public void save(PlayerPayCheck playerPayCheck);

    public List<PlayerPayCheck> findAllPayChecks();
}
