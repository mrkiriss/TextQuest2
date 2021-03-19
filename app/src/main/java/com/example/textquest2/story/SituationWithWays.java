package com.example.textquest2.story;

import java.util.Map;

public class SituationWithWays extends ISituation{
    public SituationWithWays(String title, String content, Map<String, ISituationFactory> ways, int[] changedValues) {
        super(title, content, ways, changedValues);
    }
}
