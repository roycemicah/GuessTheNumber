/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.guessthenumber.controllers;

import com.sg.guessthenumber.servicelayer.GuessTheNumberServiceLayer;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author roycerabanal
 */
@RestController
public class GuessTheNumberController {
    
    private final GuessTheNumberServiceLayer serviceLayer;
    
    public GuessTheNumberController(GuessTheNumberServiceLayer serviceLayer) {
        this.serviceLayer = serviceLayer;
    }
    
    
    
}
