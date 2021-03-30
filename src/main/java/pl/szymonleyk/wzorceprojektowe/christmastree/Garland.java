package pl.szymonleyk.wzorceprojektowe.christmastree;

public class Garland extends TreeDecorator{

    public Garland(ChristmasTree christmasTree) { //konstruktor
        super(christmasTree);
    }
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }
    private String decorateWithGarland() {
        return " with Garland";
    }
}
