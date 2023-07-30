package org.example.model;

public interface Component {
    void add(Component component);
    Object getChild(int index);
    void operation();

    Component get(int number);

    void remove (Component component);
}
