import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    
    
    @Test
    public void getLinksTest() throws IOException {
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);

        /** Path fileName2 = Path.of("lab5_test.md");
        String content2 = Files.readString(fileName2);
        ArrayList<String> links2 = MarkdownParse.getLinks(content2);
        ArrayList<String> expected2 = new ArrayList<>();
        expected2.add("www.google.com");
        assertEquals(expected2, links2);
        */
    }
}
