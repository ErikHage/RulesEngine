package com.tfr.rulesEngine.rule.simple;

import com.tfr.rulesEngine.rule.RuleSet;
import com.tfr.rulesEngine.rule.RuleSetBuilder;

/**
 *
 * Created by Erik on 6/25/2017.
 */
public class SimpleRuleSetBuilder<I,O> extends RuleSetBuilder<I,O, SimpleRule> {

    public SimpleRuleSetBuilder(String name) {
        super(name);
    }

    @Override
    public RuleSet<I,O, SimpleRule> build() {
        return new SimpleRuleSet<>(name, rules);
    }

}