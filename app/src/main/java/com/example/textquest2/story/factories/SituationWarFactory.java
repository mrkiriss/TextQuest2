package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationEnd;

public class SituationWarFactory  implements ISituationFactory {
    @Override
    public ISituation create() {
        return new SituationEnd("Смех да и только!", "Ну прям как дети." +
                "Кто же так проблемы решает?\n" +
                "Капут!", new int[]{-200,-200,-200});
    }
}
