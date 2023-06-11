package service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Service
@SessionScope
public class CartService {
    private final List<Integer> storage = new ArrayList<>();


    public void add(Set<Integer> ids) {
        storage.addAll(ids);
    }

    public List<Integer> get() {
        return Collections.unmodifiableList(storage);
    }

}
