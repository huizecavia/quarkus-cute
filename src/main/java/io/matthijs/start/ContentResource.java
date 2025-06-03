package io.matthijs.start;
import io.smallrye.common.annotation.Blocking;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.Set;

@Path("/contentful")
public class ContentResource {


//    https://www.contentful.com/developers/docs/concepts/apis/#content-delivery-api
//  https://www.contentful.com/developers/docs/references/content-delivery-api/
//    https://www.contentful.com/developers/docs/references/content-delivery-api/#/reference/entries/entry/get-a-single-entry/console/java


    @RestClient
    ContentService contentService;

    @GET
    @Path("/limit/{limit}")
    public Set<Content> limit(String limit) {
        return contentService.getByLimit(limit);
    }


}
