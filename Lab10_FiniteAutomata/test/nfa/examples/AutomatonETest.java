package nfa.examples;

import nfa.NFA;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomatonETest implements NFAWithExamples {

    @Override
    public NFA getFA() {
        NFA fa = new NFA(0, "AutomatonE");
        fa.addRule(0, '0', 0);
        fa.addRule(0, '1', 1);
        fa.addRule(1, '0', 2);
        fa.addRule(1, '1', 0);
        fa.addRule(2, '0', 1);
        fa.addRule(2, '1', 2);
        fa.addAcceptState(0);
        return fa;
    }

    @Override
    public String[] inLanguage() {
        return new String[] { "0", "11", "110", "1001", "1010", "1111", "11010" };
    }

    @Override
    public String[] notInLanguage() {
        return new String[] { "1", "10", "101", "1101", "1110", "10001" };
    }
}