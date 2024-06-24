package nfa.examples;

import nfa.NFA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomatonCTest implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA fa = new NFA(1, "AutomatonC");
        fa.addRule(1, '0', 2);
        fa.addRule(1, '1', 1);
        fa.addRule(2, '0', 2);
        fa.addRule(2, '1', 3);
        fa.addRule(3, '0', 4);
        fa.addRule(3, '1', 1);
        fa.addRule(4, '0', 4);
        fa.addRule(4, '1', 4);
        fa.addAcceptState(1);
        fa.addAcceptState(2);
        fa.addAcceptState(3);
        return fa;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0", "1", "00", "11", "000", "111", "001", "100", "101", "110", "0001", "1110" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "010", "1010", "0010", "10010" };
    }
}