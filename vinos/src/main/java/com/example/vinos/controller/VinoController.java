package com.example.vinos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.vinos.model.Vino;
import com.example.vinos.service.VinoService;

@RestController
@RequestMapping({"vino"})
public class VinoController {
    private final VinoService vinoService;

    public VinoController(VinoService vinoService) {
        this.vinoService = vinoService;
    }

    @GetMapping("")
    public List<Vino> getAll()
    {
        return vinoService.getAll();
    }    

    @GetMapping("/{vinoId}")
    public Vino get(@PathVariable String vinoId)
    {
        return vinoService.get(vinoId);
    }

    @PostMapping("")
    public Vino addVino(@RequestBody Vino vino)
    {
        return vinoService.addVino(vino);
    }

    @PutMapping("/{vinoId}")
    public Vino addVino(@PathVariable String vinoId, @RequestBody Vino vino)
    {
        return vinoService.updateVino(vinoId, vino);
    }

    @DeleteMapping("/{vinoId}")
    public Vino addVino(@PathVariable String vinoId)
    {
        return vinoService.deleteVino(vinoId);
    }

    
}
