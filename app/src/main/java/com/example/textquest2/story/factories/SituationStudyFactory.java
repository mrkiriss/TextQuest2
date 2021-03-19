package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationStudyFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Успех", new SituationSuccessFactory());

        return new SituationWithWays("Тяжёлый путь", "Несчитанное количество трудностей ты встретишь на своём пути!\n" +
                "Ад бесполезных предметов и путь саморазвития.\n" +
                "Терпи.\n" +
                "И \"свободная касса\" останеться позади", ways, new int[]{-50,-50,-50});
    }
}
