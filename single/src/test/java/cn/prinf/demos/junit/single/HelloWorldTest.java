package cn.prinf.demos.junit.single;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void should_return_world_as_string() {
        System.out.println( HelloWorld.hello());
    }
}
