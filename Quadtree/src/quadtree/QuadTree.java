package quadtree;
public class QuadTree {
    private nodo raiz;
    private boolean isRoot;

    public QuadTree() {
        isRoot = true;
    }

    public QuadTree(nodo raiz) {
        this.raiz = raiz;
        isRoot = true;
    }

    public nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }
    public boolean isIsRoot() {
        return isRoot;
    }
    @Override
    public String toString() {
        return "QuadTree{" + "raiz=" + raiz + '}';
    }
}
