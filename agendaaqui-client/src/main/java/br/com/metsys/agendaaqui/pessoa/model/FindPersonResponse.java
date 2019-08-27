package br.com.metsys.agendaaqui.pessoa.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FindPersonResponse implements Serializable {


    private static final long serialVersionUID = -3310321732623629347L;
    private Long id;

    private String nome;

    private String sobrenome;

    private String email;

    private List<ContactPersonRequest> contatos;
}
