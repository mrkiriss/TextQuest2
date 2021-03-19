package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationWastedFactory  implements ISituationFactory  {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("На учёбу, разумеется!", new SituationStudyFactory());
        ways.put("Здоровье превыше всего! Так что я спать", new SituationSleepFactory());

        return new SituationWithWays("Время - ценная вещь?", "На что же ты тратищь своё время, товарищь?", ways, new int[]{-20,-20,-20});
    }
}
