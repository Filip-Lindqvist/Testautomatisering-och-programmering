package TheRealAssignment;

import java.util.HashMap;

public class Converter {

    private HashMap<String, String> letterOrMorse;
    public Converter() {
        letterOrMorse = new HashMap<>();
        letterOrMorse.put("*-", "A");
        letterOrMorse.put("-***", "B");
        letterOrMorse.put("-*-*", "C");
        letterOrMorse.put("-**", "D");
        letterOrMorse.put("*", "E");
        letterOrMorse.put("**-*", "F");
        letterOrMorse.put("--*", "G");
        letterOrMorse.put("****", "H");
        letterOrMorse.put("**", "I");
        letterOrMorse.put("*---", "J");
        letterOrMorse.put("-*-", "K");
        letterOrMorse.put("*-**", "L");
        letterOrMorse.put("--", "M");
        letterOrMorse.put("-*", "N");
        letterOrMorse.put("---", "O");
        letterOrMorse.put("*--*", "P");
        letterOrMorse.put("--*-", "Q");
        letterOrMorse.put("*-*", "R");
        letterOrMorse.put("***", "S");
        letterOrMorse.put("-", "T");
        letterOrMorse.put("**-", "U");
        letterOrMorse.put("***-", "V");
        letterOrMorse.put("*--", "W");
        letterOrMorse.put("-**-", "X");
        letterOrMorse.put("-*--", "Y");
        letterOrMorse.put("--**", "Z");
        letterOrMorse.put("*----", "1");
        letterOrMorse.put("**---", "2");
        letterOrMorse.put("***--", "3");
        letterOrMorse.put("****-", "4");
        letterOrMorse.put("*****", "5");
        letterOrMorse.put("-****", "6");
        letterOrMorse.put("--***", "7");
        letterOrMorse.put("---**", "8");
        letterOrMorse.put("----*", "9");
        letterOrMorse.put("-----", "0");
        letterOrMorse.put("*-*-*-", ".");
        letterOrMorse.put("--**--", ",");
        letterOrMorse.put("**--**", "?");
        letterOrMorse.put("A", "*-");
        letterOrMorse.put("B", "-***");
        letterOrMorse.put("C", "-*-*");
        letterOrMorse.put("D", "-**");
        letterOrMorse.put("E", "*");
        letterOrMorse.put("F", "**-*");
        letterOrMorse.put("G", "--*");
        letterOrMorse.put("H", "****");
        letterOrMorse.put("I", "**");
        letterOrMorse.put("J", "*---");
        letterOrMorse.put("K", "-*-");
        letterOrMorse.put("L", "*-**");
        letterOrMorse.put("M", "--");
        letterOrMorse.put("N", "-*");
        letterOrMorse.put("O", "---");
        letterOrMorse.put("P", "*--*");
        letterOrMorse.put("Q", "--*-");
        letterOrMorse.put("R", "*-*");
        letterOrMorse.put("S", "***");
        letterOrMorse.put("T", "-");
        letterOrMorse.put("U", "**-");
        letterOrMorse.put("V", "***-");
        letterOrMorse.put("W", "*--");
        letterOrMorse.put("X", "-**-");
        letterOrMorse.put("Y", "-*--");
        letterOrMorse.put("Z", "--**");
        letterOrMorse.put("1", "*----");
        letterOrMorse.put("2", "**---");
        letterOrMorse.put("3", "***--");
        letterOrMorse.put("4", "****-");
        letterOrMorse.put("5", "*****");
        letterOrMorse.put("6", "-****");
        letterOrMorse.put("7", "--***");
        letterOrMorse.put("8", "---**");
        letterOrMorse.put("9", "----*");
        letterOrMorse.put("0", "-----");
        letterOrMorse.put(".", "*-*-*-");
        letterOrMorse.put(",", "--**--");
        letterOrMorse.put("?", "**--**");
    }
    public String getMorseorText(String text) {
            return letterOrMorse.get(text);
        }
    }


