package teste;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class JsonMinecraftBuilder {

    private List<JsonMinecraft>  array = new ArrayList<>();
    private JsonMinecraft last;

    public String sendJsonMessage(){
        Gson json = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(json.toJson(array));
        return "";
    }

    public JsonMinecraft addJson(){
        last = new JsonMinecraft();
        array.add(last);
        return last;
    }
}
