package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ValidarActualizacion;
import questions.ValidarBorrado;
import questions.ValidarEstado;
import questions.ValidarInfo;
import tasks.ConsumirServicios;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinitions {

    private Actor actor;
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        actor = Actor.named("actor");
    }
    @Cuando("se consume el servicio get")
    public void seConsumeElServicioGet() {
        actor.attemptsTo(
                ConsumirServicios.get()
        );

    }
    @Entonces("trae la data del empleado")
    public void traeLaDataDelEmpleado() {
        actor.should(
                seeThat(
                        ValidarEstado.estadoExitoso(),equalTo(200)
                )
        );
    }

    @Cuando("se consume el servicio post")
    public void seConsumeElServicioPost() {

        actor.attemptsTo(
                ConsumirServicios.post()
        );
    }

    @Entonces("se crea el empleado y se recive un estado {string}")
    public void seCreaElEmpleadoYSeReciveUnEstado(String estado) {
        actor.should(
                seeThat(ValidarInfo.estado(),equalTo(estado))
        );
    }

    @Cuando("se consume el servicio put")
    public void seConsumeElServicioPut() {
        actor.attemptsTo(
                ConsumirServicios.put()
        );
    }

    @Entonces("se actualiza el empleado y se recibe un estado {string}")
    public void seActualizaElEmpleadoYSeRecibeUnEstado(String estado) {
        actor.should(
                seeThat(ValidarActualizacion.mensaje(),equalTo(estado))

        );
    }

    @Cuando("se consume el servicio Delete")
    public void seConsumeElServicioDelete() {
        actor.attemptsTo(
                ConsumirServicios.delete()
        );
    }

    @Entonces("se elimina la data del empleado y se recibe un estado {string}")
    public void seEliminaLaDataDelEmpleadoYSeRecibeUnEstado(String estado) {
        actor.should(
                seeThat(ValidarBorrado.estado(),equalTo(estado))
        );
    }
}
