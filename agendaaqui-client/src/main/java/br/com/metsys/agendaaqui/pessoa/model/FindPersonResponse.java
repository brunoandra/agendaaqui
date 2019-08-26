package br.com.metsys.agendaaqui.pessoa.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FindPersonResponse implements Serializable {


    private static final long serialVersionUID = -3310321732623629347L;
    Long id;

    String nome;

    String sobrenome;

    String email;

    List<ContactPersonRequest> contatos;
}
