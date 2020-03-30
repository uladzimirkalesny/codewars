package digitalRoot;

import org.junit.Test;

import static org.junit.Assert.*;

public class DRootTest {
    @Test
    public void Tests() {
        assertEquals( "Nope!" , 7, DRoot.digital_root(16));
        assertEquals( "Nope!" , 6, DRoot.digital_root(456));
        assertEquals( "Nope!" , 6, DRoot.digital_root(942));
        assertEquals( "Nope!" , 6, DRoot.digital_root(132189));
        assertEquals( "Nope!" , 2, DRoot.digital_root(493193));
    }
}