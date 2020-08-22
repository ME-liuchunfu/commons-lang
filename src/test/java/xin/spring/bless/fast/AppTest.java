package xin.spring.bless.fast;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        String s = "aaaa.bbb";
        System.out.println(s.substring(s.lastIndexOf(".")+1));
    }
}
