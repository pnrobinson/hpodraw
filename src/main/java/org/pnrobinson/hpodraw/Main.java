package org.pnrobinson.hpodraw;

import org.pnrobinson.hpodraw.cmd.DownloadCommand;
import org.pnrobinson.hpodraw.cmd.DrawCommand;
import picocli.CommandLine;

import java.util.concurrent.Callable;

@CommandLine.Command(name = "hpodraw", mixinStandardHelpOptions = true, version = "0.0.4",
        description = "Draw HPO related SVG images.")
public class Main implements Callable<Integer> {
    public static void main(String[] args) {
        if (args.length == 0) {
            // if the user doesn't pass any command or option, add -h to show help
            args = new String[]{"-h"};
        }
        CommandLine cline = new CommandLine(new Main())
                .addSubcommand("download", new DownloadCommand())
                .addSubcommand("draw", new DrawCommand());
        int exitCode = cline.execute(args);
        System.exit(exitCode);
    }
    @Override
    public Integer call() {
        // work done in subcommands
        return 0;
    }

}
