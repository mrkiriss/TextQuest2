package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationEnd;

public class SituationSuccessFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        return new SituationEnd("Успех", "Конец.\n Нет. Успешный конец!", new int[]{1000, 1000, 1000});
    }
}
