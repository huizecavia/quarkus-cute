package io.matthijs.tja;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


//https://hantsy.medium.com/interacting-with-rest-apis-in-quarkus-56d3b6199ac2

@Path("/contentful")
public class RestResource {

    String targeturl = "https://cdn.contentful.com/spaces/gvfxre3jlkjm/entries?access_token=_39Gt27-U1xYE9IUJDDlsj2Lv9A2R9PrrjZsK4AV9T4";
//    String targeturl = "https://cdn.contentful.com/spaces/gvfxre3jlkjm/entries";
    private final Client client = ClientBuilder.newClient();

    @GET
    @Path("/get")
//    @ClientHeaderParam(name = "access_token", value = "_39Gt27-U1xYE9IUJDDlsj2Lv9A2R9PrrjZsK4AV9T4")
    @Produces(MediaType.TEXT_PLAIN)
    public String getContent() {

        WebTarget target = client.target(targeturl);

        Response response = target.request(MediaType.APPLICATION_FORM_URLENCODED)
                .get();

        return response.toString();

    }

}
