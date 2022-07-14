package ch03;

public class TestBlockTest {

    public static void main(String[] args) {

        String testBlocks = """
                Hello,
                hi,
                how r u""";

        System.out.println(testBlocks);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>""";

    }

}
