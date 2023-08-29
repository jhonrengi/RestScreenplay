package questions;

import model.RespuestaPut;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarActualizacion implements Question<String> {

    public static Question<String> mensaje(){
        return  new ValidarActualizacion();
    }
    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(RespuestaPut.class).getStatus();
    }
}
