package me.greenleaf;

import java.util.ArrayList;
import java.util.Random;

public class Legolas {
    private SASS_LEVEL sass;
    private static Legolas legolasInstance;

    private Legolas() {
        sass = SASS_LEVEL.HIGH;
    }

    public static Legolas getInstance() {
        if (legolasInstance == null) {
            legolasInstance = new Legolas();
        }
        return legolasInstance;
    }

    public String queryMind(String question) {
        Random rand = new Random();
        return responses.get(rand.nextInt(responses.size()));
    }

    public void setSass(SASS_LEVEL sass) {
        if (sass != SASS_LEVEL.HIGH) {
            throw new IllegalArgumentException("Sass cannot be set lower than HIGH");
        }
        this.sass = sass;
    }

    private static final ArrayList<String> responses = new ArrayList<>();
    static {
        responses.add("7");
        responses.add("No");
        responses.add("I can't hear you I have my head in the cloud");
        responses.add("WOooOooOooOoOoo");
        responses.add("Torchys?");
    }

    public enum SASS_LEVEL {
        LOW, MEDIUM, HIGH
    }
}
