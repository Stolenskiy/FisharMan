package Entity;

public class InvevtoryManager {
    private static Integer id;

    public Integer getNewId () {
        if (id == null || id <= 0)
            id = 0;
        else id++;
        return id;
    }

    public Integer getId () {
        return id;
    }

    public boolean decrement () {
        if (id != null && id > 0) {
            id--;
            return true;
        } else return false;
    }

}
