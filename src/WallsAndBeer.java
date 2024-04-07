public class WallsAndBeer {
    public static void space(){
        System.out.println();
    }

    public static void EndOfSong(){
        System.out.println("No bottles of beer on the wall,\n" +
                "no bottles of beer,\n" +
                "ya’ can’t take one down, ya’ can’t pass it around,cause there are no more bottles of beer on the wall");
    }
    public static void Lyrics(int n){
        String s1=" bottles of beer on the wall";
        String s2=" bottles of beer";
        String s3= "ya' take one down, ya' pass it around, ";
        if (n==0){
            EndOfSong();
        }
        else if (n>0){
            System.out.println(n+ s1+',');
            System.out.println(n+s2+',');
            System.out.println(s3+n+s1+'.');
            space();
            Lyrics(n-1);
        }
    }
    public static void main(String[] args) {
Lyrics(99);
    }
}
