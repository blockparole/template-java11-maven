package cc.neckbeard.project;

import org.apache.commons.cli.*;
import org.tinylog.Logger;

public class Main {

    public static void main(String[] args) {

        Options options = new Options();
        Option optionB = new Option("b", "bar", false, "bar example");
        options.addOption(optionB);
        Option optionA = new Option("f", "foo", true, "foo example (required)");
        optionA.setRequired(true);
        options.addOption(optionA);

        CommandLine cmd;
        try {
            cmd = ((CommandLineParser) new DefaultParser()).parse(options, args);
        } catch (ParseException e) {
            Logger.error(e.getMessage());
            new HelpFormatter().printHelp(
                new java.io.File(
                    Main
                        .class
                        .getProtectionDomain()
                        .getCodeSource()
                        .getLocation()
                        .getPath()
                ).getName(),
                options);
            System.exit(1);
            return;
        }

        Logger.info("Hello World!");
        Logger.debug("foo: " + cmd.getOptionValue("foo"));
        Logger.debug("bar: " + Boolean.valueOf(cmd.hasOption("bar")).toString());

    }

}
