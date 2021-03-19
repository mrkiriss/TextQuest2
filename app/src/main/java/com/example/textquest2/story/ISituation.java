package com.example.textquest2.story;

import java.util.Map;

public class ISituation {
    private final int[] changedValues;
    private final String title;
    private final String content;
    private final Map<String, ISituationFactory> ways;

    ISituation(String title, String content, Map<String, ISituationFactory> ways, int[] changedValues){
        this.title=title;
        this.content=content;
        this.ways=ways;
        this.changedValues=changedValues;
    }

    public int[] getChangedValues() {
        return changedValues;
    }
    public Map<String, ISituationFactory> getWays() {
        return ways;
    }
    public String getContent() {
        return content;
    }
    public String getTitle(){return title;}
    public String[] getButtonContent(){return ways.keySet().toArray(new String[ways.size()]);}
}
