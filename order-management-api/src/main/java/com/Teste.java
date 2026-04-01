import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.micaela.ordermanagementapi.model.User;

@Component
public class Teste implements CommandLineRunner {

    @Autowired
    private UserRepositorykk userRepository;

    @Override
    public void run(String... args) {

        User user = new User("Micaela", "micaela@email.com", "123456");

        userRepository.save(user);

        System.out.println("Usuário salvo com sucesso!");
    }
}