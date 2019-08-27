package br.com.metsys.agendaaqui.pessoa.gateway.database.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Builder
@Getter
@EqualsAndHashCode
@ToString
@Entity(name = "personcontact")
public class PersonContactEntity implements Serializable {

    private static final long serialVersionUID = 7288244280436242799L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String ddd;
    String numero;
    boolean principal;

}
