package quadtree;

import java.awt.Color;

public class nodo {
    private Color color;
    private nodo parent;
    private nodo LeftBrother;
    private nodo RightBrother;
    
    public nodo() {
    }

    public nodo(Color color) {
        this.color = color;
    }

    
    public nodo(Color color, nodo parent, nodo LeftBrother, nodo RightBrother) {
        this.color = color;
        this.parent = parent;
        this.LeftBrother = LeftBrother;
        this.RightBrother = RightBrother;
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

    public nodo getLeftBrother() {
        return LeftBrother;
    }

    public void setLeftBrother(nodo LeftBrother) {
        this.LeftBrother = LeftBrother;
    }

    public nodo getRightBrother() {
        return RightBrother;
    }

    public void setRightBrother(nodo RightBrother) {
        this.RightBrother = RightBrother;
    }
    
    

    @Override
    public String toString() {
        return "nodo{" + "color=" + color + '}';
    }
    
    
}
