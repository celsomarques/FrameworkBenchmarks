package hello;

import javax.inject.*;
import javax.ws.rs.*;

@Singleton
@Path("/plaintext")
public class PlaintextResource
{
  @GET
  @Produces("text/plain")
  public String plaintext()
  {
    return "Hello, World!";
  }
}
