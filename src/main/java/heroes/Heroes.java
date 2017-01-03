package heroes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TLein77 on 12/30/16.
 */
public class Heroes {
    private List<Hero> heroesList = new ArrayList<>();

    public Heroes() {}

    public List<Hero> getHeroesList() {
        if (heroesList.isEmpty()) {
            loadHeroes();
        }
        return heroesList;
    }

    public Hero getHero(long id) {
        List<Hero> heroList = new ArrayList<>();
        heroesList.forEach(hero -> {
            if (hero.getId() == id) {
                heroList.add(hero);
            }
        });
        return heroList.get(0);
    }

    public List<Hero> addHero(Hero newHero) {
        if (!heroesList.contains(newHero)) {
            heroesList.add(newHero);
        }
        return heroesList;
    }

    private void loadHeroes() {
        heroesList.add(new Hero(11, "Mr. Nice"));
        heroesList.add(new Hero(12, "Narco"));
        heroesList.add(new Hero(13, "Bombasto"));
        heroesList.add(new Hero(14, "Celeritas"));
        heroesList.add(new Hero(15, "Magneta"));
        heroesList.add(new Hero(16, "RubberMan"));
        heroesList.add(new Hero(17, "Dynama"));
        heroesList.add(new Hero(18, "Dr IQ"));
        heroesList.add(new Hero(19, "Magma"));
        heroesList.add(new Hero(20, "Tornado"));

    }
}
