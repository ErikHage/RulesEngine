package com.tfr.rulesEngine.example.beer.code;

import com.tfr.rulesEngine.rule._Rule;
import com.tfr.rulesEngine.rule.Rule;

import java.util.Optional;

import static com.tfr.rulesEngine.example.beer.code.Styles.*;

/**
 *
 * Created by Erik on 6/27/2017.
 */
public interface StyleRules {

    _Rule<Beer,String> IS_IPA_STYLE = new Rule.RuleBuilder<Beer,String>(
            "IPA_RULE",
            (b) -> b.isStyle(IPA),
            (b) -> Optional.of(IPA.getName()))
            .nextGroup("Amber")
            .build();

    _Rule<Beer,String> IS_NOT_IPA_STYLE = new Rule.RuleBuilder<Beer,String>(
            "NOT_IPA_RULE",
            (b) -> !b.isStyle(IPA),
            (b) -> Optional.empty())
            .nextGroup("Amber")
            .build();




    _Rule<Beer,String> IS_AMBER_STYLE = new Rule.RuleBuilder<Beer,String>(
            "AMBER_RULE",
            (b) -> b.isStyle(AMBER),
            (b) -> Optional.of(AMBER.getName()))
            .group("Amber")
            .nextGroup("Red")
            .build();

    _Rule<Beer,String> IS_NOT_AMBER_STYLE = new Rule.RuleBuilder<Beer,String>(
            "NOT_AMBER_RULE",
            (b) -> !b.isStyle(AMBER),
            (b) -> Optional.empty())
            .group("Amber")
            .nextGroup("Red")
            .build();


    _Rule<Beer,String> IS_RED_STYLE = new Rule.RuleBuilder<Beer,String>(
            "RED_RULE",
            (b) -> b.isStyle(RED),
            (b) -> Optional.of(RED.getName()))
            .group("Red")
            .build();

    _Rule<Beer,String> IS_NOT_RED_STYLE = new Rule.RuleBuilder<Beer,String>(
            "NOT_RED_RULE",
            (b) -> !b.isStyle(RED),
            (b) -> Optional.empty())
            .group("Red")
            .build();


}