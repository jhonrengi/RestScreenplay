package tasks;

import interactions.Servicios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static utils.Constantes.URLGET;
import static utils.Constantes.URLGET_ID;

public class ConsumirServioGet implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Servicios.restGet(String.format(URLGET))
                //Servicios.restGet(String.format(URLGET_ID,1))
        );
    }
}
