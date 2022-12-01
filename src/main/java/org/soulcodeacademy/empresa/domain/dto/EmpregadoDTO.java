package org.soulcodeacademy.empresa.domain.dto;

import javax.validation.constraints.NotBlank;

public class EmpregadoDTO {
    private Integer idAluno;
    @NotBlank(message = "Nome e obrigatorio")
    private String nome;
}

