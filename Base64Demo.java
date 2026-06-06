import java.util.Base64;

public class Base64Demo {

    void sagar() {
        String mime = "https://www.google.com";

s
        // String encode
        String  mimeencode = Base64.getEncoder().encodeToString(mime.getBytes());
        System.out.println("Encoded String: " + mimeencode);

        // String decode
        String mimedecode = new String(Base64.getDecoder().decode(mimeencode));
        System.out.println("Decoded String: " + mimedecode);
    }

    public static void main(String[] args) {
        Base64Demo b = new Base64Demo();
        b.sagar();
    }
}
