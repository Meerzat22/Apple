package gorest.models;


import gorest.utils.JsonUtils;

public class BaseModel {

    public String toJson(){
        return JsonUtils.toJson(this);
    }
}
