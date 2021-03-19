package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationSleepFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Ещё 5 минут", new SituationSleepFactory());
        ways.put("Я же дед. Мне некуда идти", new SituationSleepFactory());

        return new SituationWithWays("Охх, как же я устал", "А кроватка такааая мягкая!", ways, new int[]{-10,-10,-10});
    }
}
