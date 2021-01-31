public class Domain {
    public static void main(String[] args) {
        String [] domain = new String [5];

        domain[0] = "http://kurczaki.pl/blog/kura-w-miescie";
        domain[1] = "http://kurczaki.pl/blog/powrot-kury";
        domain[2] = "http://kurczaki.pl/blog/wyscig-smierci";
        domain[3] = "http://kurczaki.pl/blog/domowe-ognisko";
        domain[4] = "http://kurczaki.pl/blog/szybcy-sie-wsciekli";

        for (int i = 0; i < domain.length ; i++) {

            StringBuilder domainT = new StringBuilder(domain[i]);
            domainT.delete(0, 18);
            domainT.insert(0, "http://naukajavy.pl");
            String domainT2 = new String(domainT);
            domain[i] = domainT2;
            System.out.println(domain[i]);

        }
    }
}
