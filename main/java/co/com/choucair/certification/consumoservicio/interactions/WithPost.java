package co.com.choucair.certification.consumoservicio.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.choucair.certification.consumoservicio.utils.enums.RestService.CREATE_USER;

public class WithPost implements Interaction {
    private String body;

    public WithPost(String body) {
        this.body = body;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(CREATE_USER.toString()).with(requestSpecification -> requestSpecification.headers("Content-Type", "application/json").body(body)));
    }
}