package Chapter5;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class asteriskGenerator {
    @Test
    public void inputNuber(){
        //given that
        Asterisk asteriskGeneratorProgram  = new Asterisk();
        //when
       asteriskGeneratorProgram.num();
        //assert
        assertEquals(1,asteriskGeneratorProgram.num());
    }
@Test
    public void asteriskProgram(){

}

}

