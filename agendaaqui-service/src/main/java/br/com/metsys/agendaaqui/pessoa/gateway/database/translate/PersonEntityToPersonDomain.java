package br.com.metsys.agendaaqui.pessoa.gateway.database.translate;

import br.com.metsys.agendaaqui.pessoa.gateway.database.model.PersonEntity;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.modelmapper.ModelMapper;

public class PersonEntityToPersonDomain {
    public static PersonDomain translator(PersonEntity personEntity){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(personEntity, PersonDomain.class);
    }
}
