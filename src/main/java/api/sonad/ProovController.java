package api.sonad;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProovController{

    @RequestMapping("/proov")
    public Proov proov (){
        return new Proov( "proov","proov1" );
    }

}
