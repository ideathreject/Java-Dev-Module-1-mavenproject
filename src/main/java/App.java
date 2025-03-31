import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {
    public static class User {
        private String name;
        private String surname;

        public User(String name, String surname){
            this.name = name;
            this.surname = surname;
        }
    }

    public static void main(String[] args) {
        User user = new User("Vladyslav", "Demchenko");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(user));
    }
}
