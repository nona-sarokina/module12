package jmp.module12.service;

import jmp.module12.domain.Module12Data;
import junit.framework.TestCase;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Properties;

/**
 * Created by user on 11.10.2016.
 */

public class Module12DataFillerTest extends TestCase {
    public void testFill() {
        Module12DataFiller filler = new Module12DataFiller();
        filler.fill();
        assertEquals(9, filler.getData().getItemDescriptions().size());
    }
}