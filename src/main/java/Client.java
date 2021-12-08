import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private String age;
    private String sex;
    private String email;


    public Client(String name, String age, String sex, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        this.id = counterId.nextId();
    }

    private static class counterId {
        private static int counter = 0;
        public static int nextId() {
            counter+=1;
            return counter;
        }
    }
}