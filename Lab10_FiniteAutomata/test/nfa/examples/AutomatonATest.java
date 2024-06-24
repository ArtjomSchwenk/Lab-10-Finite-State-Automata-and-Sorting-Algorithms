package nfa.examples;

import nfa.NFA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomatonATest implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA fa = new NFA(0, "AutomatonA");
        fa.addRule(0, '0', 0);
        fa.addRule(0, '1', 1);
        fa.addRule(1, '0', 2);
        fa.addRule(1, '1', 3);
        fa.addRule(2, '0', 0);
        fa.addRule(2, '1', 1);
        fa.addRule(3, '0', 2);
        fa.addRule(3, '1', 3);
        fa.addAcceptState(0);
        return fa;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0", "0100", "000000", "11100", "01100", "000000001000000100", "1010101010101010101010101010100" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "1", "01", "010", "10010010010", "0000101001", "0100000000000000000010" };
    }
}