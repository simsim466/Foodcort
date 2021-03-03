package model;

import model.menu.Meal;

public class Restaurant extends AbstractNamedEntity {
    private Meal current;

    public Restaurant(int id, String name) {
        super(id, name);
    }
}
