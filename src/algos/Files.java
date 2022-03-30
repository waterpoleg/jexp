package algos;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Files {

    public static void main(String[] args) throws IOException, InterruptedException {
        final Path path = Paths.get("d:\\projects");
        FileWatcher watcher = new FileWatcher();

        File file = new File("d:\\projects");
        if (!file.exists()) {
            throw new IllegalArgumentException(String.format("Not exist %s", file.getAbsoluteFile()));
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(String.format("Not directory %s", file.getAbsoluteFile()));
        }
        System.out.println(String.format("size : %s", file.getTotalSpace()));
        for (File subfile : file.listFiles()) {
            System.out.println(String.format("%s - %s", subfile.getName(), subfile.length()));
        }
        watcher.watchFolder(path);
    }
}
