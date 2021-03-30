package pl.szymonleyk.wzorceprojektowe.christmastree;

public class TreeDecorator implements ChristmasTree{
    ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
