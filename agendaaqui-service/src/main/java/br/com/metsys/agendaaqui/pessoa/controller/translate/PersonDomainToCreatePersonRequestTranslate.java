package br.com.metsys.agendaaqui.pessoa.controller.translate;

import br.com.metsys.agendaaqui.pessoa.model.CreatePersonRequest;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.modelmapper.ModelMapper;

public class PersonDomainToCreatePersonRequestTranslate {
    public static CreatePersonRequest translator(PersonDomain personDomain) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(personDomain, CreatePersonRequest.class);
    }
}
