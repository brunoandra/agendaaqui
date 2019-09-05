package br.com.metsys.agendaaqui.pessoa.gateway.feign;
import br.com.metsys.agendaaqui.pessoa.model.FindPersonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "findPersonFeignApi", url = "http://localhost:8080")
public interface FindPersonFeignApi {
    @GetMapping("person")
    FindPersonResponse findPerson(@RequestParam Long id);
}
