public class DomainWp {
    public static void main(String[] args) {


        String[] domain = new String[5000000];
        for (int j = 0; j < domain.length; j++) {
            domain[j] = "http://wp.pl/wiadomosci";
        }

        for (int i = 0; i < domain.length; i++) {

            StringBuilder domainWp = new StringBuilder(domain[i]);
            domainWp.delete(0, 12);
            domainWp.insert(0, "http://wirualnapolska.pl");
            String domainWp2 = new String(domainWp);
            domain[i] = domainWp2;
            System.out.println(domain[i]);
        }
    }
}

