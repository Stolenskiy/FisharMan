package Entity;

public enum StateFood {
    RAW("Сирий"),
    FRIED("Смажений"),
    ROTTEN("Гнилий"),
    DRIED("Сушений"),
    SMOKED("Копчений");

    private String title;

    StateFood (String title) {
        this.title = title;
    }

    public String getTitle () {
        return title;
    }

    @Override
    public String toString () {
        return "Entity.StateFood{" +
                "title='" + title + '\'' +
                '}';
    }
    }
