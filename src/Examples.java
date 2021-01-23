public class Examples {
    public static void main(String[] args) {
        // Przykład 1
        char[] chars = {'O','l','a',' ','i','d','z','i','e',' ','n','a',' ','s','p','a','c','e','r'};
        StringBuilder sentence = new StringBuilder();
        for(char c : chars){
            sentence.append(c);
        }
        System.out.println(sentence);

        // Przykład 2
        String text = "Ola idzie na spacer";
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        System.out.println(sb);
    }
}
