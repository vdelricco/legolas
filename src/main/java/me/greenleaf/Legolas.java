package me.greenleaf;

public class Legolas {
    private SASS_LEVELS sass;

    public static void main(String[] args) {
        Legolas.getInstance().setSass(SASS_LEVELS.LOW);
    }

    public static Legolas getInstance() {
        return new Legolas();
    }

    public void setSass(SASS_LEVELS sass) {
        if (sass != SASS_LEVELS.HIGH) {
            throw new IllegalArgumentException("Sass cannot be set lower than HIGH");
        }
        this.sass = sass;
    }

    public enum SASS_LEVELS {
        LOW, MEDIUM, HIGH
    }
}
