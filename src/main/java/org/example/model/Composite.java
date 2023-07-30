package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public void add(Component child) {
        components.add(child);
    }

    public List<Component> getChildren() {
        return components;
    }

    public void setChildren(List<? extends Component> components) {
        components.clear();
        //тут надо переписать, потому что
        this.components.addAll(components);
    }

    public int getChildrenNumber() {
       return components.size();
    }

    @Override
    public Object getChild(int index) {
        return null;
    }

    @Override
    public void operation() {

    }

    @Override
    public Component get(int number) {
        return null;
    }

    @Override
    public void remove(Component component) {

    }


}