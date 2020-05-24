package by.gsu.pms;

import java.util.ArrayList;
import java.util.List;

public class PartOfSentence {
    private List<Symbol> symbolList = new ArrayList<>();

    public PartOfSentence(String charList) {
        parseForSymbols(charList);
    }

    private void parseForSymbols(String charList) {
        for (char ch : charList.toCharArray()) {
            symbolList.add(new Symbol(ch));
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Symbol symb : symbolList) {
            result.append(symb.toString());
        }
        return result.toString();
    }
}