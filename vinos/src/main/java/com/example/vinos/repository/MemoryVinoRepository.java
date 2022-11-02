package com.example.vinos.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.vinos.model.Vino;

@Repository
public class MemoryVinoRepository implements IVinoRepository {
    private Map<String, Vino> vinosMap;

    MemoryVinoRepository() {
        vinosMap = new HashMap<>();
    }

    @Override
    public List<Vino> getAll() {
        List<Vino> ret = new ArrayList<>();
        ret.addAll(vinosMap.values());
        return ret;
    }

    @Override
    public Vino get(String vinoId) {
        return vinosMap.get(vinoId);
    }

    @Override
    public Vino save(Vino vino) {
        if (vino.getVinoId() == null)
        {
            vino.setVinoId(String.valueOf(System.currentTimeMillis()));
        }
        return vinosMap.put(vino.getVinoId(), vino);
    }

    @Override
    public Vino delete(String vinoId) {
        return vinosMap.remove(vinoId);
    }
    
}
