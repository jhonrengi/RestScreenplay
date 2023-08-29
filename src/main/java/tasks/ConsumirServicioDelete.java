package tasks;

import interactions.Servicios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static utils.Constantes.URLDELETE;

public class ConsumirServicioDelete implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Servicios.restDelete(String.format(URLDELETE,2))
        );
    }
}
