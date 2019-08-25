package br.com.metsys.agendaaqui.pessoa.controller;

import br.com.metsys.agendaaqui.pessoa.CreatePersonApi;
import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.model.CreatePersonRequest;
import org.springframework.http.ResponseEntity;

public class CreatePersonController implements CreatePersonApi {
    @Override
    public ResponseEntity<Long> execute(CreatePersonRequest createPersonRequest) throws UseCaseException {
        return null;
    }
}
