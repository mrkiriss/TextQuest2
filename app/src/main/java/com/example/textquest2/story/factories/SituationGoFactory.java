package com.example.textquest2.story.factories;

import com.example.textquest2.story.ISituation;
import com.example.textquest2.story.ISituationFactory;
import com.example.textquest2.story.SituationWithWays;

import java.util.HashMap;

public class SituationGoFactory  implements ISituationFactory {
    @Override
    public ISituation create() {
        HashMap<String, ISituationFactory> ways = new HashMap<>();
        ways.put("Гагарин топ", new SituationGagarinFactory());
        ways.put("Услуга", new SituationServiceFactory());
        ways.put("Wasted", new SituationWastedFactory());

        return new SituationWithWays("Приехали", "Чтож. Первый серьёзный выбор.\n А может быть и последний, кто знает?", ways, new int[]{30,30,30});
    }
}
