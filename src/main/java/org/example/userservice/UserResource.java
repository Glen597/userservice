package org.example.userservice;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.*;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class UserResource {
    private static final Map<Integer, User> users = new HashMap<>();
    private static int idCounter = 1;

    @GET

    public Collection<User> getAllUsers(){
        return users.values();
    }

    @GET
    @Path("/{id}")
    public User getUserById(@PathParam("id") int id){
        return users.get(id);
    }

    @POST
    public User createUser(User user){
        user.setId(idCounter++);
        users.put(user.getId(), user);
        return user;
    }

    @DELETE
    @Path("/{id}")
    public void deletUser(@PathParam("id") int id){
        users.remove(id);
    }
}