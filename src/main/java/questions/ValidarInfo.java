package questions;

import model.RespuestaPost;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarInfo implements Question<String> {

    public static Question<String> estado(){
        return  new ValidarInfo();
    }
    @Override
    public String answeredBy(Actor actor) {
        return SerenityRest.lastResponse().as(RespuestaPost.class).getStatus();
    }
}
