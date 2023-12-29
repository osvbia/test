import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class FileTransformer {

    public static void main(String[] args) {
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        try {
            // Read content from the input file
            Path inputPath = Paths.get(inputFilePath);
            String content = Files.lines(inputPath)
                                  .map(String::toUpperCase)
                                  .collect(Collectors.joining("\n"));

            // Write the transformed content to the output file
            Path outputPath = Paths.get(outputFilePath);
            Files.write(outputPath, content.getBytes());

            System.out.println("File transformation completed successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}