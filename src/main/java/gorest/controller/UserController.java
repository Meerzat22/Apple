package gorest.controller;

import gorest.HttpRequest;
import gorest.endPoint.EndPoint;
import gorest.models.UserRequest;
import gorest.models.UserResponse;
import io.restassured.response.Response;


public class UserController extends HttpRequest {

    public UserController(String url) {
        super(url);
    }

    public UserResponse[] getAllUsers(){
        return super.get(getEndPoint(EndPoint.PUBLIC, EndPoint.V2, EndPoint.USERS)).as(UserResponse[].class);
    }

    public UserResponse createNewUser(UserRequest user){
        return super.post(getEndPoint(EndPoint.PUBLIC, EndPoint.V2, EndPoint.USERS), user.toJson()).as(UserResponse.class);
    }

    public UserResponse getUser(String userId){
        return super.get(getEndPoint(EndPoint.PUBLIC, EndPoint.V2, EndPoint.USERS, userId)).as(UserResponse.class);
    }

    public UserResponse partialUserUpdate(String userId, UserRequest body){
        return super.patch(getEndPoint(EndPoint.PUBLIC, EndPoint.V2, EndPoint.USERS, userId), body.toJson()).as(UserResponse.class);
    }

    public UserResponse updateAllUserDetails(String userId, UserRequest body){
        return super.put(getEndPoint(EndPoint.PUBLIC, EndPoint.V2, EndPoint.USERS, userId), body.toJson()).as(UserResponse.class);
    }

    public Response deleteUser(String userId){
        return super.delete(getEndPoint(EndPoint.PUBLIC, EndPoint.V2, EndPoint.USERS, userId));
    }
}
