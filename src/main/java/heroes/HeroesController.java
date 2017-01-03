package heroes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TLein77 on 12/30/16.
 */
@RestController
public class HeroesController {

    private Heroes heroes = new Heroes();

    @CrossOrigin(origins = "http://localhost:8181")
    @RequestMapping(value="/heroes", method=RequestMethod.GET)
    public List<Hero> getHeroes() {
        return heroes.getHeroesList();
    }

    @CrossOrigin(origins = "http://localhost:8181")
    @RequestMapping(value="/heroes/{id}", method=RequestMethod.GET)
    public Hero getHero(@PathVariable("id") long id) {
        return heroes.getHero(id);
    }
}
