package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationGagarinFactory  implements ISituationFactory  {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Учёба", new SituationStudyFactory());
        ways.put("КГБ", new SituationKGBFactory());
        ways.put("ФБР", new SituationFBRFactory());

        return new SituationWithWays("За Гагарина! За СССР!", "Молодец, пролетариат! Активные граждане - двигатель прогресса!\n" +
                "Осталось совсем немножко. Просто сделай правильный выбор!", ways, new int[]{50,-20,30});
    }
}
