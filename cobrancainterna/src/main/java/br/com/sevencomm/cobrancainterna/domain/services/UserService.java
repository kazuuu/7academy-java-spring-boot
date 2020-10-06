package br.com.sevencomm.cobrancainterna.domain.services;

import br.com.sevencomm.cobrancainterna.application.dto.SignUpDTO;
import br.com.sevencomm.cobrancainterna.data.repositories.UserRepository;
import br.com.sevencomm.cobrancainterna.domain.interfaces.IUserService;
import br.com.sevencomm.cobrancainterna.domain.models.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;

    public UserService(UserRepository _userRepository) {
        userRepository = _userRepository;
    }

    public User getUser(Integer userId) {
        Optional<User> fndUser = userRepository.findById(userId);

        if (!fndUser.isPresent()) throw new IllegalArgumentException("User not found");

        return fndUser.get();
    }

    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User currentUser = (User) authentication.getPrincipal();

        Optional<User> fndUser = userRepository.findById(currentUser.getId());

        if (!fndUser.isPresent()) throw new IllegalArgumentException("User not found");

        return fndUser.get();
    }

    public User SignUp(SignUpDTO signUpDTO) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        User user = new User();
        user.setNomeCompleto(signUpDTO.getNomeCompleto());
        user.setLogin(signUpDTO.getLogin());
        user.setEmail(signUpDTO.getEmail());
        user.setSenha(bCryptPasswordEncoder.encode(signUpDTO.getSenha()));

        User newUser = userRepository.save(user);

        return newUser;
    }

}
