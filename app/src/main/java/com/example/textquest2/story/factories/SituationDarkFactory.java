package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationEnd;

public class SituationDarkFactory implements ISituationFactory {
    @Override
    public ISituation create() {
        return new SituationEnd("Темно. Сильная тряска", "Ты находишься в асболютной тьме.\n" +
                "Руки и ноги заблокированы.\n" +
                "Но почему так трясёт?\n"+
                "А. Ясно. Багажник.\n"+
                "Грёбаные анимешники", new int[]{-666,-666,-666});
    }
}
