import java.time.localDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@entity
public class User{
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id;
    private String name;
    private String email;
    private String password;
    private LocalDateTime createdAt;



}
