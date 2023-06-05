package com.example.springstore.Servise;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.Set;

@Service
@SessionScope
public class ServiseStore {
    private final Set<Integer> item;

    public ServiseStore(Set<Integer> item) {
        this.item = item;
    }
    public void add(Set<Integer> id){
        item.addAll(id);
    }
    public Set<Integer> get(){
        return Collections.unmodifiableSet(item);
    }
}
