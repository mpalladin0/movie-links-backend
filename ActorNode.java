import java.util.UUID;

public class ActorNode {
    private UUID uuid = UUID.randomUUID();
    private String name;

    public ActorNode(String name) {
        this.name = name;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public String getName() {
        return name;
    }

}
