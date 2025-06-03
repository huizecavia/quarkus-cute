package io.matthijs.start;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.reactive.RestQuery;

import java.util.Set;
import java.util.concurrent.CompletionStage;

@Path("/extensions")
@RegisterRestClient(configKey = "extensions-api")
public interface ExtensionsService {


//    http://localhost:8080/extension/id/io.quarkus:quarkus-rest-client

    @GET
    Set<Extension> getById(@RestQuery String id);

    @GET
    Set<Extension> getByShortname(@RestQuery String shortname);

    @GET
    CompletionStage<Set<Extension>> getByIdAsync(@RestQuery String id);

    @GET
    Uni<Set<Extension>> getByIdAsUni(@RestQuery String id);
}
