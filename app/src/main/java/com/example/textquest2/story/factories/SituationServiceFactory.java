package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationServiceFactory implements ISituationFactory  {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Не саня, опять журнальчики цветные покупать будешь!", new SituationDarkFactory());
        ways.put("Нус, кредит оформлять будем?", new SituationSuccessFactory());

        return new SituationWithWays("Окажи услугу, друг", "Понимаешь тут такое дело...\n" +
                "Сам понимаешь, времена такие...\n" +
                "В общем, дай тыщу в долг.", ways, new int[]{0,0,40});
    }
}
