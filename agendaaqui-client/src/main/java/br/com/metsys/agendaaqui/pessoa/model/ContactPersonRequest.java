package br.com.metsys.agendaaqui.pessoa.model;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ContactPersonRequest implements Serializable {

    private static final long serialVersionUID = -1882343528221488567L;

    String ddd;
    String numero;
    boolean principal;
}
