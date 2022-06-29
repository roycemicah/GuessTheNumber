/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.guessthenumber.servicelayer;

import com.sg.guessthenumber.models.Game;
import com.sg.guessthenumber.models.Guess;
import java.util.List;

/**
 *
 * @author roycerabanal
 */
public interface GuessTheNumberServiceLayer {

    public Game addGame() throws InvalidGameException;
    public Guess addGuess(Guess guess) throws InvalidGameException, InvalidGuessException;
    public List<Game> getAllGames() throws InvalidGameException;
    public Game getGameById(int id) throws InvalidGameException;
    public List<Guess> getGuessesByGameId(int gameId) throws InvalidGameException;
    
}