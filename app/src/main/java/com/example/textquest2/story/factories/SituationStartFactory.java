package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationStartFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Аниме", new SituationAnimeFactory());
        ways.put("Поехли!", new SituationGoFactory());
        ways.put("Небо", new SituationSkyFactory());

        return new SituationWithWays("Начало", "Это только начало!\n\n \n \n  ...сочуствую", ways, new int[]{0,0,0});
    }
}
