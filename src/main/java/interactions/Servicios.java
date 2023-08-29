package interactions;

import net.serenitybdd.screenplay.Interaction;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Servicios {
    public Servicios() {
    }
    public static Interaction restGet(String resources){
        return instrumented(Get.class,resources);
    }

    public static Interaction restPost(String resources, String body){
        return instrumented(Post.class,resources,body);
    }

    public static Interaction restPut(String resources, String body){
        return instrumented(Put.class,resources,body);
    }

    public static Interaction restDelete(String resources){
        return instrumented(Delete.class,resources);
    }
}
