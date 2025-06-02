package io.matthijs.start;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.Set;

@Path("/contentful")
@RegisterRestClient(configKey = "contentful-api")
public interface ContentService {

    @GET
    Set<Content> getByLimit(@RestQuery String limit);
}
