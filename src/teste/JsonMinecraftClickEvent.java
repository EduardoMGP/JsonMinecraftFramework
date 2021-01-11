package teste;

public class JsonMinecraftClickEvent {

    private String action;
    private String value;

    public JsonMinecraftClickEvent setAction(ACTION action){
        this.action = action.action.toLowerCase();
        return this;
    }

    public JsonMinecraftClickEvent setValue(String value){
        this.value = value;
        return this;
    }

    public enum ACTION{
        OPEN_URL("OPEN_URL"),
        OPEN_FILE("OPEN_FILE"),
        RUN_COMMAND("RUN_COMMAND"),
        SUGGEST_COMMAND("SUGGEST_COMMAND"),
        CHANCE_PAGE("CHANCE_PAGE");
        private String action;
        ACTION(String action){
            this.action = action;
        }
    }
}
