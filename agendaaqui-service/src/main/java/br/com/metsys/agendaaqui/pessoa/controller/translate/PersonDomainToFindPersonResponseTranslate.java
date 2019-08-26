package br.com.metsys.agendaaqui.pessoa.controller.translate;

import br.com.metsys.agendaaqui.pessoa.model.FindPersonResponse;
import br.com.metsys.agendaaqui.pessoa.model.PersonDomain;
import org.modelmapper.ModelMapper;

public class PersonDomainToFindPersonResponseTranslate {
    public static FindPersonResponse translator(PersonDomain personDomain) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(personDomain, FindPersonResponse.class);
    }
}
