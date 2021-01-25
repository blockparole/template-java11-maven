package not.hub.project;

import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {
        Logger.debug("Starting");
        Logger.info(args.length > 0 ? String.join(", ", args) : "💩");
    }

}
