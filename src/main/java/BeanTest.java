public class BeanTest {
    public static void main(String[] args) {
        Album playlist = new Album();
        playlist.setArtist("Lil Wayne");

        System.out.println(playlist.getArtist());

        Quotes wiseWords = new Quotes();
        wiseWords.setText("I never lose, I win or I learn");

        System.out.println(wiseWords.getText());

        Author author = new Author();
        author.setFirstName("Dr.");
        author.setLastName(" Suess");
        System.out.println(author.getFirstName() + author.getLastName());
    }
}
