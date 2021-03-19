package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationKGBFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("За коммунизм! За СССР!", new SituationWarFactory());

        return new SituationWithWays("Правильный выбор", "Враг не дремлет." +
                "Пора дать отпор!", ways, new int[]{50,-15,-20});
    }
}
