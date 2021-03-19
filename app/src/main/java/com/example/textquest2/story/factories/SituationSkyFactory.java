package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationEnd;

public class SituationSkyFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        return new SituationEnd("Небо, смотрел бы на него вечно", "А вот реально смотрел, ну и крякнул в конце-концов", new int[]{1,1,1});
    }
}
