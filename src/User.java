import java.util.Objects;

public class User {

    public String name;
    public String data;
    public String work;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(data, user.data) && Objects.equals(work, user.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
