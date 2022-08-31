package it.unikey;

public class BubbleLight extends TreeDecorator{
    public BubbleLight(ChristmasTree tree) {
        super(tree);
    }
    public String decorate() {
        return super.decorate() + decorateWithBubbleLights();
    }
    public String decorate2() {
        return super.decorate2() + decorateWithBubbleLights();
    }
    private String decorateWithBubbleLights() {
        return " with Bubble Lights";
    }

}
