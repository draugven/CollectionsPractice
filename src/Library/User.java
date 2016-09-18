package Library;

/**
 * Created by Elizaveta Naimark on 13.09.2016.
 */
public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof User)){
            return false;
        }
        User that = (User) obj;
        return this.name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
