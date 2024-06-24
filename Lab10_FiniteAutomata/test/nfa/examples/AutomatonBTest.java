package nfa.examples;

import nfa.NFA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomatonBTest implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA fa = new NFA(1, "AutomatonB");
        fa.addRule(1, '0', 2);
        fa.addRule(1, '1', 4);
        fa.addRule(2, '0', 1);
        fa.addRule(2, '1', 3);
        fa.addRule(3, '0', 4);
        fa.addRule(3, '1', 2);
        fa.addRule(4, '0', 3);
        fa.addRule(4, '1', 1);
        fa.addAcceptState(2);
        fa.addAcceptState(4);
        return fa;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "1", "01100", "01010101010", "11100", "0111100", "00000000100000100", "101010101010101010101010101010" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "11", "01", "0101", "100100100100", "0000101001", "0100000000000000000010" };
    }
}