package Flyweight;

public class Tree {
    TreeModel treeModel;        //공유하는 객체
    double height;
    double thickness;

    public void setTreeModel(TreeModel treeModel) {
        this.treeModel = treeModel;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }
}
