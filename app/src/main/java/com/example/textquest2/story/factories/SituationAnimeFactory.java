package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationAnimeFactory  implements ISituationFactory {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Аниме норм", new SituationSkyFactory());
        ways.put("Помойка это ваше аниме", new SituationDarkFactory());

        return new SituationWithWays("Выбирай, самурай", "Это конец.\nНо каким он будет?", ways, new int[]{0, 0, 0});
    }
}
