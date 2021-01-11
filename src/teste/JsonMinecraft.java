package teste;

public class JsonMinecraft {

    private String text;
    private JsonMinecraftClickEvent clickEvent;
    private JsonMinecraftHoverEvent hoverEvent;

    public JsonMinecraft createText(String text){
        this.text = text;
        return this;
    }

    public JsonMinecraft createClickEvent(JsonMinecraftClickEvent clickEvent){
        this.clickEvent = clickEvent;
        return this;
    }

    public JsonMinecraft createHoverEvent(JsonMinecraftHoverEvent hoverEvent){
        this.hoverEvent = hoverEvent;
        return this;
    }
}
