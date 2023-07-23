package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private String name;
    private List<Component> children = new ArrayList<Component>();
    public void add(Component child) {
        children.add(child);
    }

    public Composite(String name) {
        this.name = name;
    }

    public Composite() {
    }

    @Override
    public Object getChild(int index) {
        return null;
    }

    @Override
    public void operation() {

    }

    @Override
    public void remove(Component component) {

    }
}