/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Game;
import java.util.List;

/**
 *
 * @author roycerabanal
 */
public interface GameDao {

    Game addGame(Game game);    
    List<Game> getAllGames();  
    Game getGameById(int id);
    boolean updateGame(Game game);
    boolean deleteGameById(int id);
    
}
