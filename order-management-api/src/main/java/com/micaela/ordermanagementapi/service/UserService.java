package com.micaela.ordermanagementapi.service;
import com.micaela.ordermanagementapi.model.User;
import com.micaela.ordermanagementapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private  UserRepository userRepository;

    //Busca todos usuários
    public List<User> findAll() {
        return userRepository.findAll();

    }
    //Busca usuário pelo id
    public User findById(Long id){
       return userRepository.findById(id)
               .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    //Salvar usuário
    public User save(User user){
        return userRepository.save(user);
    }

    // Deletar usuário
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}

