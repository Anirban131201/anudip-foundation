package myMavenProjectPackage2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringReverserTest {

    @Test
    public void testReverse() {
        StringReverser reverser = new StringReverser();
        Assert.assertEquals("dlroW olleH", reverser.reverse("Hello World"));
    }

    @Test
    public void testReverseEmptyString() {
        StringReverser reverser = new StringReverser();
        Assert.assertEquals("", reverser.reverse(""));
    }
}

