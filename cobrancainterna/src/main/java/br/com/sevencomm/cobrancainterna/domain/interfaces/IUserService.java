package br.com.sevencomm.cobrancainterna.domain.interfaces;

import br.com.sevencomm.cobrancainterna.application.dto.SignUpDTO;
import br.com.sevencomm.cobrancainterna.domain.models.User;

public interface IUserService {
    User getUser(Integer userId);
    User getCurrentUser();
    User SignUp(SignUpDTO signUpDTO);
}
