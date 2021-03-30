package pl.szymonleyk.wzorceprojektowe.christmastree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChristmasTreeTest {

    @Test
    public void christmasTreeWithGarland(){
        //given
        ChristmasTreeImpl christmasTreeImpl = new ChristmasTreeImpl();
        //when
        ChristmasTree tree1 = new Garland();

        assertEquals(tree1.decorate(),
                "Christmas tree with Garland");
    }
    @Test
    public void christmasTreeWithGarlandWithGarlandWithBubbleLights(){
        //when
        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        //then
        assertEquals(tree2.decorate(),
                "Christmas tree with Garland with Garland with Bubble Lights");
    }
}
