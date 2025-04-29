package com.suaempresa.controleponto.model;

import lombok.*;
import javax.persistence.*;
import org.hibernate.envers.Audited;

@Entity
@Audited
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cargo;
}
