package br.com.sevencomm.cobrancainterna.application.dto;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class SignUpDTO {
    private String login;
    private String senha;
    private String nomeCompleto;
    private String email;
}
