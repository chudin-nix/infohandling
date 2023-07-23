package org.example.model;

public interface Component {
    void add(Component component);
    Object getChild(int index);
    void operation();

    void remove (Component component);
}
