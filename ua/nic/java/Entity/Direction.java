package Entity;

public enum  Direction {
    FORWARD("Вперед"),
    BACK("Назад"),
    TO_THE_LEFT("Вліво"),
    TO_THE_RIGHT("Вправо");

    private String title;

    Direction (String title) {
        this.title = title;
    }

    @Override
    public String toString () {
        return "Direction{" +
                "title='" + title + '\'' +
                "} " + super.toString();
    }
}
