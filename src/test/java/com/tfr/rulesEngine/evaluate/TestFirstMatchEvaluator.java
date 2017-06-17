package com.tfr.rulesEngine.evaluate;

import com.tfr.rulesEngine.rule.ExampleRules;
import com.tfr.rulesEngine.rule.Rule;
import com.tfr.rulesEngine.rule.RuleSet;
import com.tfr.rulesEngine.rule.simple.SimpleRuleSet;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * Created by Erik Hage on 6/16/2017.
 */
public class TestFirstMatchEvaluator {

    private ExampleRules exampleRules = new ExampleRules();

    @Test
    public void testIntToStringRules() {
        RuleSet<Rule<Integer, String>> ruleSet = new SimpleRuleSet<>("intRules");
        ruleSet.add(exampleRules.smallInt);
        ruleSet.add(exampleRules.mediumInt);
        ruleSet.add(exampleRules.hugeInt);
        ruleSet.add(exampleRules.largeInt);

        FirstMatchEvaluator<Integer, String, Rule<Integer, String>> firstMatchEvaluator
                = new FirstMatchEvaluator<>(ruleSet);

        assertEquals("int<10", firstMatchEvaluator.evaluate(1));
        assertEquals("int<100", firstMatchEvaluator.evaluate(10));
        assertEquals("int<1000", firstMatchEvaluator.evaluate(100));
        assertEquals("int<10000", firstMatchEvaluator.evaluate(1000));
    }


}
