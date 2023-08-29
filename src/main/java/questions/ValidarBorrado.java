package questions;

import model.RespuestaDelete;
import model.RespuestaPut;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarBorrado implements Question<String> {

    public static Question<String> estado(){
        return  new ValidarBorrado();
    }
    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(RespuestaDelete.class).getStatus();
    }
}
