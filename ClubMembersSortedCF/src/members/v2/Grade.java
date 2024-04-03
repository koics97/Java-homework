package members.v1;

public enum Grade {
    NOVICE, INTERMEDIATE, PROFICIENT, MASTER;

    @Override
    public String toString() {
        switch (this) {
            case NOVICE -> {
                return "kezdő";
            }
            case INTERMEDIATE -> {
                return "középhaladó";
            }
            case PROFICIENT -> {
                return "haladó";
            }
            case MASTER -> {
                return "profi";
            }
        }
        return "";
    }
}
