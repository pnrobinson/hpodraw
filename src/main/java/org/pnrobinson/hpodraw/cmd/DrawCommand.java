package org.pnrobinson.hpodraw.cmd;

import org.monarchinitiative.phenol.ontology.data.Ontology;

import picocli.CommandLine;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;

@CommandLine.Command(name = "download",
        mixinStandardHelpOptions = true,
        description = "Download files for isopret analysis")
public class DrawCommand implements Callable<Integer> {
    @CommandLine.Option(names = {"-d", "--data"}, description = "directory to download data (default: ${DEFAULT-VALUE})")
    private String datadir = "data";
    @CommandLine.Option(names = {"-w", "--overwrite"}, description = "overwrite previously downloaded files (default: ${DEFAULT-VALUE})")
    private boolean overwrite;

    public DrawCommand() {
    }


    @Override
    public Integer call() {
        System.out.println("draw");
        Path hpo_path = Paths.get(datadir).resolve("hp.json");
       // Ontology hpo = OntologyLoader.loadOntology(hpo_path);
        return 0;
    }
}
