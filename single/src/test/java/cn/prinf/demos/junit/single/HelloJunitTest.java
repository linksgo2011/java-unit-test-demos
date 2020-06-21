package cn.prinf.demos.junit.single;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloJunitTest {

    @Test
    public void should_return_world_as_string() {
        assertEquals("World", HelloJunit.hello());
    }
}
