package unidad3.tarea4;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ BoaTest.class, FridgeTest.class, PilaTest.class, SubscripcionTest.class })
public class AllTests {

}
