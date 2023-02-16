public class ServerNameGenerator {
    public static String getRandom(String[] array) {
        int random = (int) (Math.random() * array.length);
        return array[random];
    }

    public static void  main(String[] args) {
        String[] adjectives = {"happy", "sad", "angry", "excited", "bored", "tired", "hungry", "sleepy", "silly", "funny"};
        String[] nouns = {"dog", "cat", "bird", "fish", "mouse", "rat", "snake", "lizard", "frog", "toad"};

        System.out.println("Here is your server name:");
        System.out.println(getRandom(adjectives) + "-" + getRandom(nouns));

    }
}
