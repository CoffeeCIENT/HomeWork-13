public class App {
    public static void main(String[] args) {

        Author elWhiteFace = new Author("Эл'", "Белоликий");
        Author ciceroViy = new Author("Цицерон", "Вий");
        Book iceToolset = new Book("Ледяной инструментарий", elWhiteFace, 1988);
        Book amberWill = new Book("Янтарная воля", ciceroViy, 1980);

        iceToolset.setPublishingYear(2000);

        System.out.println("Книга: " + iceToolset.getName() + "; Автор: " + elWhiteFace.getName() + " " +
                elWhiteFace.getSurname() + "; Год публикации: " + iceToolset.getPublishingYear());
        System.out.println("Книга: " + amberWill.getName() + "; Автор: " + ciceroViy.getName() + " " +
                ciceroViy.getSurname() + "; Год публикации: " + amberWill.getPublishingYear());
    }
}