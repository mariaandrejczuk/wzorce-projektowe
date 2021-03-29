package pl.szymonleyk.wzorceprojektowe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class ManagementTest {

    @Test
    public void checkIsSame(){
        //given
        Management management1 = Management.getInstance();
        Management management2 = Management.getInstance();

        assertSame(management1, management2);
    }
}
