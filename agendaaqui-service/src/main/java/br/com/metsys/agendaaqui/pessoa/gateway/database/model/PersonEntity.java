package br.com.metsys.agendaaqui.pessoa.gateway.database.model;

import br.com.metsys.agendaaqui.pessoa.model.PersonContactDomain;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity(name = "person")
public class PersonEntity implements Serializable {

    private static final long serialVersionUID = 5786802975804066626L;
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    long id;

    String nome;

    String sobrenome;

    String email;

    List<PersonContactDomain> contatos;
}
