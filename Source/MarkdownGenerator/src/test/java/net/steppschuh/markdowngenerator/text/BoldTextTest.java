package net.steppschuh.markdowngenerator.text;

import net.steppschuh.markdowngenerator.DummyObject;

import org.junit.Test;

/**
 * Created by steppschuh on 15/12/2016.
 */
public class BoldTextTest {

    @Test
    public void example1() throws Exception {
        Text text = new BoldText("I am bold text");
        System.out.println(text);
    }

    @Test
    public void example2() throws Exception {
        Text text = new BoldText(new DummyObject());
        System.out.println(text);
    }

}