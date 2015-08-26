package quadtree;

import java.awt.Color;

public class nodo {
    private Color color;
    private nodo parent;
    private Object[] sons;
    
    public nodo() {
    }

    public nodo(Color color) {
        this.color = color;
    }

    public nodo(Color color, nodo parent, Object[] sons) {
        this.color = color;
        this.parent = parent;
        this.sons = sons;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public nodo getParent() {
        return parent;
    }

    public void setParent(nodo parent) {
        this.parent = parent;
    }

    public Object[] getSons() {
        return sons;
    }

    public void setSons(Object[] sons) {
        this.sons = sons;
    }

    @Override
    public String toString() {
        return "nodo{" + "color=" + color + '}';
    }
}