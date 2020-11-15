package Flyweight;

public class TreeModel {
    Mesh mesh;
    Texture bark;
    Texture leaves;

    public TreeModel() {
        mesh = new Mesh();
        bark = new Texture("bark");
        leaves = new Texture("leaves");
    }
}

class Mesh { }

class Texture {
    private String name;

    public Texture(String name) {
        this.name = name;
    }
}