package teste;

public class JsonMinecraftHoverEvent {

    private String action;
    private JsonMinecraftValue value;

    public JsonMinecraftHoverEvent setAction(ACTION action){
        this.action = action.action.toLowerCase();
        return this;
    }

    public JsonMinecraftHoverEvent setValue(JsonMinecraftValue value){
        this.value = value;
        return this;
    }


    public enum ACTION{
        SHOW_TEXT("SHOW_TEXT"),
        SHOW_ITEM("SHOW_ITEM"),
        SHOW_ENTITY("SHOW_ENTITY");
        private String action;
        ACTION(String action){
            this.action = action;
        }
    }
}
