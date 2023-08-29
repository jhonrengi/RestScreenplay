package tasks;

import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ConsumirServicios {
    public ConsumirServicios() {
    }

    public static Task get(){
        return instrumented(ConsumirServioGet.class);
    }

    public static Task post(){
        return instrumented(ConsumirServicioPost.class);
    }
    public static Task put(){
        return instrumented(ConsumirServicioPut.class);
    }

    public static Task delete(){
        return instrumented(ConsumirServicioDelete.class);
    }
}
