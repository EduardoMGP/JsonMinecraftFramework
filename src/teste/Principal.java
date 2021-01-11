package teste;


public class Principal {

    public static void main(String[] args) {

        JsonMinecraftBuilder json = new JsonMinecraftBuilder();
        json.addJson().createText("passe o mouse em um nome ");
        json.addJson()
                .createText("§cUma mensagem teste")
                .createClickEvent(
                        new JsonMinecraftClickEvent()
                                .setAction(JsonMinecraftClickEvent.ACTION.RUN_COMMAND)
                                .setValue(" um comando ao clicar :)")
                ).createHoverEvent(
                new JsonMinecraftHoverEvent()
                        .setAction(JsonMinecraftHoverEvent.ACTION.SHOW_TEXT)
                        .setValue(
                                new JsonMinecraftValue()
                                        .setText("oie vc esta no §cmeu github")
                        )
        );
        json.addJson()
                .createText(" §b EduardoMGP")
                .createClickEvent(
                        new JsonMinecraftClickEvent()
                                .setAction(JsonMinecraftClickEvent.ACTION.RUN_COMMAND)
                                .setValue(" um comando ao clicar :)")
                ).createHoverEvent(
                new JsonMinecraftHoverEvent()
                        .setAction(JsonMinecraftHoverEvent.ACTION.SHOW_TEXT)
                        .setValue(
                                new JsonMinecraftValue()
                                        .setText("oie vc esta no §bgithub de EduardoMGP")
                        )
        );

        json.sendJsonMessage();


    }

}
