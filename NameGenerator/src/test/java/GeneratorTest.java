/**
 * Created by szkol_000 on 8/23/2015.
 */

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GeneratorTest {

    private Generator testedObject;

    private final String IMIE_1 = "Adam";
    private final String IMIE_2 = "Klaudia";
    private final String IMIE_3 = "Janusz";
    private final String IMIE_4 = "Stanis?awa";
    private final String IMIE_5 = "Wojciech";
    private final String IMIE_6 = "Alicja";

    @Before
    public void Initialize(){
        testedObject = new Generator();
    }

    @Test
    public void GeneratorIsNotNull() {
        assertNotNull(testedObject.getRandomCredential());
    }

    @Test
    public void GeneratorGeneratesCorrectName(){

        String imie = testedObject.getRandomCredential().getName();

        assertThat(imie,
                either(is(IMIE_1))
                        .or(is(IMIE_2))
                        .or(is(IMIE_3))
                        .or(is(IMIE_4))
                        .or(is(IMIE_5))
                        .or(is(IMIE_6)));
    }

}
