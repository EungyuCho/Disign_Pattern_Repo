<h2>2. Flyweight</h2><br/> 

Singleton은 1개의 인스턴스를 공유하는 반면에 Flyweight는 여러개의 인스턴스를 공유하는 패턴이다.<br>
<h4>1-1. 단점</h4><hr>
<blockquote>
    특정 인스턴스의 공유 컴포넌트를 다르게 하는것이 불가능하다.
</blockquote>

<h4>구현 코드</h4><hr>
<pre><code>public class TreeModel {
    Mesh mesh;
    Texture bark;
    Texture leaves;<br>
    public TreeModel() {
        mesh = new Mesh();
        bark = new Texture("bark");
        leaves = new Texture("leaves");
    }
}<br>
class Mesh { }<br>
class Texture {
    private String name;<br>
    public Texture(String name) {
        this.name = name;
    }
}<br>
public class TreeFactory {
    private static final TreeModel sharedTreeModel = new TreeModel();
    static public Tree create(double height, double thickness) {
        Tree tree = new Tree();
        tree.setHeight(height);
        tree.setThickness(thickness);
        tree.setTreeModel(sharedTreeModel);

        return tree;
    }
}</code></pre>
<h3><a href=" https://github.com/EungyuCho/Disign_Pattern_Repo">목차로 돌아가기 🏃</a></h3> 