package Flyweight;

public class TreeFactory {
    private static final TreeModel sharedTreeModel = new TreeModel();
    static public Tree create(double height, double thickness) {
        Tree tree = new Tree();
        tree.setHeight(height);
        tree.setThickness(thickness);
        tree.setTreeModel(sharedTreeModel);

        return tree;
    }
}
