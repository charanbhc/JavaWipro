package PizzaHut.PizzaHut;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pizzas")
public class StoreInfo {

    public ArrayList<String> pizzasList = new ArrayList<>();

    public StoreInfo() {
        pizzasList.add("Exotica");
        pizzasList.add("FarmHouse");
        pizzasList.add("Margherita");
        pizzasList.add("Barbeque");
        pizzasList.add("PannerExotica");
        pizzasList.add("GarlicBread");
    }

    @RequestMapping(value = "/info")
    public ResponseEntity<ArrayList<String>> getStoreInfo(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("Sent the list of pizzas");
        return new ResponseEntity<>(pizzasList, HttpStatus.OK);
    }
}
