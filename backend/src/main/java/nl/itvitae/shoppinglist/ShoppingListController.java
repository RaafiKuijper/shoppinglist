package nl.itvitae.shoppinglist;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/shopping-list-items")
public class ShoppingListController {
    @GetMapping
    public List<String> get() {
        return List.of(
                // this is a comment
                "boter",
                "kaas",
                "scharreleieren",
                "biologische sinaasappelsap"
        );
    }
}
