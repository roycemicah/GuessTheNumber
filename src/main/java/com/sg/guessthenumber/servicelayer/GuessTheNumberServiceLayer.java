/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.guessthenumber.servicelayer;

import com.sg.guessthenumber.models.Game;
import java.util.List;

/**
 *
 * @author roycerabanal
 */
public interface GuessTheNumberServiceLayer {

    public Game addGame() throws InvalidGameException;
    public List<Game> getAllGames() throws InvalidGameException;
    public Game getGameById(int id) throws InvalidGameException;
    
}
