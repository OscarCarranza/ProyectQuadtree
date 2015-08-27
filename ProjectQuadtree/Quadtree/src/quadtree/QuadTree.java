package quadtree;
public class QuadTree {
    private nodo raiz;

    public QuadTree() {
        raiz = new nodo();
    }

    public QuadTree(nodo raiz) {
        this.raiz = raiz;
    }

    public nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }
    @Override
    public String toString() {
        return "QuadTree{" + "raiz=" + raiz + '}';
    }
}
