package br.com.metsys.agendaaqui.pessoa;

import br.com.metsys.agendaaqui.pessoa.exception.UseCaseException;
import br.com.metsys.agendaaqui.pessoa.model.FindPersonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RequestMapping("person")
public interface FindPersonApi {
    @GetMapping
    ResponseEntity<FindPersonResponse> execute(@RequestParam Long id, @RequestHeader Map<String, String> headers) throws UseCaseException;
}
