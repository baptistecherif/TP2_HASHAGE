import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFile file = new ReadFile("minidico.txt");
        System.out.println(file.getContent());
    }
}
