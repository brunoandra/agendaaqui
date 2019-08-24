package br.com.metsys.agendaaqui.pessoa.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Builder
@Getter
@EqualsAndHashCode
@ToString
public class ContactDomain implements Serializable {

    private static final long serialVersionUID = 7288244280436242799L;

    String ddd;
    String numero;
    boolean principal;

}
