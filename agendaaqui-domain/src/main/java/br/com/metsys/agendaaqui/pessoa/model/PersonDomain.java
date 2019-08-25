package br.com.metsys.agendaaqui.pessoa.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class PersonDomain implements Serializable {

    private static final long serialVersionUID = -1510086314768726870L;

    Long id;

    String nome;

    String sobrenome;

    String email;

    List<ContactDomain> contatos;





}
