package com.example.textquest2.story;

import java.util.HashMap;
import java.util.Map;

public class SituationEnd extends ISituation{

    public SituationEnd(String title, String story, int[] changedValues) {
        super(title, story, new HashMap<>(), changedValues);
    }
}
