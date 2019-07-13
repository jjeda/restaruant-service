package me.jjeda.restaruant.interfaces;

import me.jjeda.restaruant.domain.Restaruant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RestaruantController {

    @GetMapping("/restaruant")
    public List<Restaruant> list() {
        List<Restaruant> restaruants = new ArrayList<Restaruant>();
        restaruants.add(new Restaruant(1004L, "Bob Zip", "Seoul"));
        return restaruants;
    }

    @GetMapping("/restaruant/{id}")
    public Restaruant detail(@PathVariable Long id) {
        Restaruant restaruant = new Restaruant(1L, "one", "Seoul");
        return restaruant;
    }
}
