package quadtree;

import java.awt.Color;

public class nodo {
    private Color color;
    private nodo[] sons;
    private boolean isRoot;
    
    public nodo() {
        sons = new nodo[4];
        for (int i = 0; i < 4; i++) {
            sons[i] = null;
        }
        isRoot = false;
    }

    public nodo(Color color) {
        this.color = color;
        isRoot = false;
    }

    public nodo(Color color, nodo[] sons) {
        this.color = color;
        for(int i = 0; i < 4; i++){
           this.sons[i] = sons[i];
        }
        isRoot = false;
        
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public nodo getSon(int index) {
        return sons[index];
    }

    public void setSons(nodo[] sons) {
        this.sons = sons;
    }

    public void setPartition(boolean b) {
        isRoot = b;
        if(b){
            for (int i = 0; i < 4; i++) {
                sons[i] = new nodo();
            }
        }
    }
    public boolean isRoot(){
        if (sons != null) {
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "nodo{" + "color=" + color + '}';
    }
}