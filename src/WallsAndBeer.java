public class WallsAndBeer {

    public static void main(String[] args) {
        singSong(99);
    }

    public static void singSong(int bottles) {
        if (bottles == 0) {
            System.out.println("No bottles of beer on the wall,\n" +
                    "no bottles of beer,\n" +
                    "ya’ can’t take one down, ya’ can’t pass it around,\n" +
                    "’cause there are no more bottles of beer on the wall!");
        } else {
            System.out.println(bottles + " bottles of beer on the wall,\n" +
                    bottles + " bottles of beer,\n" +
                    "ya’ take one down, ya’ pass it around,\n" +
                    (bottles - 1) + " bottles of beer on the wall.");
            singSong(bottles - 1);
        }
    }
}
