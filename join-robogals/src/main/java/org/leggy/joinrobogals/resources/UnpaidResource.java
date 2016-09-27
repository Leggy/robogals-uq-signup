package org.leggy.joinrobogals.resources;

import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.leggy.joinrobogals.api.Saying;

import java.util.concurrent.atomic.AtomicLong;
import java.util.Optional;

@Path("/get/unpaid")
@Produces(MediaType.APPLICATION_JSON)
public class UnpaidResource {
    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public UnpaidResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Saying sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.orElse(defaultName));
        return new Saying(counter.incrementAndGet(), value);
    }
}