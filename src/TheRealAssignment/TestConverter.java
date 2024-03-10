package TheRealAssignment;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestConverter {
    @Test
    public void testGetMorseOrTextA(){
        String testdata = "A";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "*-";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextAReverse(){
        String testdata = "*-";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "A";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextE(){
        String testdata = "E";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "*";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextEReverse(){
        String testdata = "*";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "E";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextComma(){
        String testdata = "--**--";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = ",";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextCommaReverse(){
        String testdata = ",";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "--**--";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextDot(){
        String testdata = "*-*-*-";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = ".";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextDotReverse(){
        String testdata = ".";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "*-*-*-";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextQuestionMark(){
        String testdata = "**--**";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "?";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextQuestionMarkReverse(){
        String testdata = "?";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "**--**";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextNull(){
        String testdata = "&";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = null;
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextNumber(){
        String testdata = "--***";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "7";
        assertEquals(expected, actual);
    }
    @Test
    public void testGetMorseOrTextNumberReverse(){
        String testdata = "7";
        Converter converter = new Converter();
        String actual = converter.getMorseorText(testdata);
        String expected = "--***";
        assertEquals(expected, actual);
    }
}
