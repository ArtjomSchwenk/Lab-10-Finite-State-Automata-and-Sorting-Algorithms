package nfa.examples;

import nfa.NFA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomatonDTest implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA fa = new NFA(0, "AutomatonD");
        fa.addRule(0, '0', 1);
        fa.addRule(0, '1', 4);
        fa.addRule(1, '0', 2);
        fa.addRule(1, '1', 4);
        fa.addRule(2, '0', 3);
        fa.addRule(2, '1', 4);
        fa.addRule(3, '0', 7);
        fa.addRule(3, '1', 4);
        fa.addRule(4, '0', 1);
        fa.addRule(4, '1', 5);
        fa.addRule(5, '0', 1);
        fa.addRule(5, '1', 6);
        fa.addRule(6, '0', 1);
        fa.addRule(6, '1', 7);
        fa.addRule(7, '0', 7);
        fa.addRule(7, '1', 7);
        fa.addAcceptState(0);
        fa.addAcceptState(1);
        fa.addAcceptState(2);
        fa.addAcceptState(3);
        fa.addAcceptState(4);
        fa.addAcceptState(5);
        fa.addAcceptState(6);
        return fa;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0", "1", "00", "11", "000", "111", "001", "100", "101", "110", "0001", "1110" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "0000", "1111", "00000", "11111", "00001", "11110" };
    }
}