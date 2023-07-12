package PhraseOMatic;

public class PhraseOMatic {

    static int randomIntNum(int arg) {
        return (int) (Math.random() * arg);
    }

    public static void main(String[] arg) {
        String[] wordListOne = { "24/7", "multiTier", "30,000 foot", "B-to-B", "win-win", "frontend", "web-based",
                "pervasive", "smart", "sixsigma", "critical-path", "dynamic" };
        String[] wordListTwo = { "empowered", "sticky",
                "valu-added", "oriented", "centric", "distributed",
                "clustered", "branded", "outside-the-box", "positioned",
                "networked", "focused", "leveraged", "aligned",
                "targeted", "shared", "cooperative", "accelerated" };
        String[] wordListThree = {
                "process", "tippingpoint", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision",
                "paradigm", "mission"
        };

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int ranOne = randomIntNum(oneLength);
        int ranTwo = randomIntNum(twoLength);
        int ranThree = randomIntNum(threeLength);

        String phrase = wordListOne[ranOne] + " " + wordListThree[ranTwo] + " " + wordListThree[ranThree];

        System.out.printf("What we need is a: " + phrase);

    }
}
