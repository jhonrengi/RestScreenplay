package tasks;

import interactions.Servicios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static utils.Constantes.URLPOST;

public class ConsumirServicioPost implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Servicios.restPost(URLPOST,"")
        );
    }
}
