package com.example.springstore.Controller;

import com.example.springstore.Servise.ServiseStore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/order")
public class ControllerStore {
    private final ServiseStore serviseStore;

    public ControllerStore(ServiseStore serviseStore) {
        this.serviseStore = serviseStore;
    }

    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> id) {
        serviseStore.add(id);
    }

    @GetMapping("/get")
    public Set<Integer> get() {
        return serviseStore.get();
    }
}