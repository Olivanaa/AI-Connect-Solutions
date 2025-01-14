package br.com.fiap.AiConnectSolutions.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Feedback {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String avaliacao;

    @Size(min=5, max=300)
    private String comentario;

    @NotBlank
    @PastOrPresent
    private LocalDate dtFeedBack;

    // private Lead lead;

    // private Cliente cliente;

    
}

