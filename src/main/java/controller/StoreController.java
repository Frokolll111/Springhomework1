package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import service.CartService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/order")
public class StoreController {

    private final CartService service;

    public StoreController(CartService service) {
        this.service = service;
    }
    @GetMapping("/add")
    public void add(@RequestParam("ID") Set<Integer> ids) {
        service.add(ids);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return service.get();
    }
}
