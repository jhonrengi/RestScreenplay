package interactions;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;

public class Put extends RestInteraction {
    private String resources;
    private String body;

    public Put(String resources, String body) {
        this.resources = resources;
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().contentType(ContentType.JSON).relaxedHTTPSValidation().body(body).when().put(resources);
    }
}
