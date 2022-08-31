package it.unikey;

public abstract class TreeDecorator implements ChristmasTree{
    private ChristmasTree tree;
    public TreeDecorator(ChristmasTree tree) {
        this.tree = tree;
    }
    @Override
    public String decorate() {
        return tree.decorate();
    }
    @Override
    public String decorate2() {
        return tree.decorate2();
    }
}
