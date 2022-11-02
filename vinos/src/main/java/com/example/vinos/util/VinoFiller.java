package com.example.vinos.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.vinos.model.Vino;
import com.example.vinos.service.VinoService;

@Component
public class VinoFiller {
    private final VinoService vinoService;
    
   
    public VinoFiller(VinoService vinoService) {
        this.vinoService = vinoService;
    }

    @PostConstruct
    public void init()
    {
        Vino vino1 = new Vino("Marqués De Murrieta Rioja", "Tinto", "Tempranillo", "Reserva", "España");
        vinoService.addVino(vino1);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Vino vino2 = new Vino("Mar De Frades", "Blanco", "Albariño", "Reserva", "España");
        vinoService.addVino(vino2);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Vino vino3 = new Vino("Muga", "Rosado", "Garnacha", "Crianza", "España");
        vinoService.addVino(vino3);
        try {Thread.sleep(1000);} catch (InterruptedException e){}
        Vino vino4 = new Vino("Gato Negro", "Rosado", "Cabernet Sauvignon", "Reserva", "Chile");
        vinoService.addVino(vino4);
    }
}
