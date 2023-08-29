package tasks;

import interactions.Servicios;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static utils.Constantes.URLPUT;

public class ConsumirServicioPut implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Servicios.restPut(String.format(URLPUT,21),"{\"name\":\"test\",\"salary\":\"123\",\"age\":\"23\"}")
        );
    }
}
