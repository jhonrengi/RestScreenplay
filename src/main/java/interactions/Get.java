package interactions;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.rest.interactions.RestInteraction;
public class Get extends RestInteraction{
    private String resources;

    public Get(String resources) {
        this.resources = resources;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        rest().contentType(ContentType.JSON).relaxedHTTPSValidation().when().get(resources);
    }

}
