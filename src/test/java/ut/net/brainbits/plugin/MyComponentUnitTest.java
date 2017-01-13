package ut.net.brainbits.plugin;

import org.junit.Test;
import net.brainbits.plugin.api.MyPluginComponent;
import net.brainbits.plugin.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}