package com.example.vinos.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.vinos.model.Vino;
import com.example.vinos.repository.IVinoRepository;

@Service
public class VinoService {
    private final IVinoRepository vinoRepository;

    public VinoService(IVinoRepository vinoRepository) {
        this.vinoRepository = vinoRepository;
    }

    public List<Vino> getAll()
    {
        return vinoRepository.getAll();
    }

    public Vino get(String vinoId)
    {
        return vinoRepository.get(vinoId);
    }

    public Vino addVino(Vino vino)
    {
        vino.setVinoId(null);
        return vinoRepository.save(vino);
    }

    public Vino updateVino(String vinoId, Vino vino)
    {
        Vino vinoR = vinoRepository.get(vinoId);
        if (vinoR == null)
        {
            return null;
        }
        vino.setVinoId(vinoId);
        return vinoRepository.save(vino);
    }

    public Vino deleteVino(String vinoId)
    {
        return vinoRepository.delete(vinoId);
    }

}
