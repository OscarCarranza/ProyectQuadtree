package quadtree;

import java.awt.Color;

public class nodo {
    private Color color;
    private nodo parent;
    private Object[] sons;
    private boolean isRoot;
    
    public nodo() {
        isRoot = false;
    }

    public nodo(Color color) {
        this.color = color;
        isRoot = false;
    }

    public nodo(Color color, nodo parent, Object[] sons) {
        this.color = color;
        this.parent = parent;
        this.sons = sons;
        isRoot = false;
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

    public boolean isIsRoot() {
        return isRoot;
    }
    
    @Override
    public String toString() {
        return "nodo{" + "color=" + color + '}';
    }
}