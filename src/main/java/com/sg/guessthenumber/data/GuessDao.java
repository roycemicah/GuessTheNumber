/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.data;

import com.sg.guessthenumber.models.Guess;
import java.util.List;

/**
 *
 * @author roycerabanal
 */
public interface GuessDao {

    List<Guess> getGuessesByGameId(int id);
    Guess addGuess(Guess guess);
            
}