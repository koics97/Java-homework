package library;

public enum Genre {
    HORROR, ADVENTURE, ROMANTIC;

    @Override
    public String toString() {
        //return this.toString().toLowerCase();
        switch (this) {
            case HORROR -> {
                return "horrorsztori";
            }
            case ADVENTURE -> {
                return "kalandregény";
            }
            case ROMANTIC -> {
                return "romantikus könyv";
            }
        }
        return "";
    }
}
