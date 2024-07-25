package part3.chapter8;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheExample {

    private MessageDigest messageDigest;

    public static void main(String[] args) throws NoSuchAlgorithmException {
        new CacheExample().main();
    }

    public CacheExample() throws NoSuchAlgorithmException {
        messageDigest = MessageDigest.getInstance("SHA-256");
    }

    public void main() {
        List<String> lines = Arrays.asList(
                " Nel   mezzo del cammin  di nostra  vita ",
                "mi  ritrovai in una  selva oscura",
                " che la  dritta via era   smarrita "
        );
        Map<String, byte[]> dataToHash = new HashMap<>();
        lines.forEach(line->
                dataToHash.computeIfAbsent(line,this::calculateDigest));
    }

    private byte[] calculateDigest(String key) {
        return messageDigest.digest(key.getBytes(StandardCharsets.UTF_8));
    }
}
