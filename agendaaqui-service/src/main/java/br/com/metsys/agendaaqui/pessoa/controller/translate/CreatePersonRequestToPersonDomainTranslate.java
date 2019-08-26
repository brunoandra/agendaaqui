package br.com.metsys.agendaaqui.pessoa.controller.translate;

import br.com.metsys.agendaaqui.pessoa.model.CreatePersonRequest;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.modelmapper.ModelMapper;

public class CreatePersonRequestToPersonDomainTranslate {
    public static PersonDomain translator(CreatePersonRequest createPersonRequest) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(createPersonRequest, PersonDomain.class);
    }
}
