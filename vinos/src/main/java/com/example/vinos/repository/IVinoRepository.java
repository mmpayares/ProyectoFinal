package com.example.vinos.repository;

import java.util.List;

import com.example.vinos.model.Vino;

public interface IVinoRepository {
    public List<Vino> getAll();
    public Vino get(String vinoId);
    public Vino save(Vino vino);
    public Vino delete(String vinoId);
}
