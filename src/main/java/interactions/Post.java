package interactions;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;
import net.thucydides.core.annotations.Step;

public class Post extends RestInteraction {

    private String resources;
    private String body;
    public Post(String resources,String body) {
        this.resources = resources;
        this.body = body;
    }


    @Step("{0} executes a POST on the resource #resource")
    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().contentType(ContentType.JSON).relaxedHTTPSValidation().body(body).when().post(resources);
    }
}
