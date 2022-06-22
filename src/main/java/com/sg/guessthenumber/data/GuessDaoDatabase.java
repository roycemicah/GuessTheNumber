/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Guess;
import java.sql.Timestamp;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author roycerabanal
 */
@Repository
@Profile("database")
public class GuessDaoDatabase implements GuessDao {
    
    private final JdbcTemplate jdbc;
    
    @Autowired
    public GuessDaoDatabase(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    @Override
    public List<Guess> getGuessesByGameId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Guess addGuess(Guess guess) {
        final String sql = "INSERT INTO Guess (Time, Answer, Result, GameId) VALUES (?,?,?,?);";
        final String sqlGuessCount = "SELECT COUNT* FROM Guess WHERE GameId = ?;";
        jdbc.update(sql, Timestamp.valueOf(guess.getTime()), guess.getAnswer(), guess.getResult(), guess.getGameId());
        return guess;
    }
    
}