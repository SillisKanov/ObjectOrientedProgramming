public class Post {

    private FormDate birthday;
    private String name;
    private String passport;
    private String patronymic;
    private String phone;
    private String surname;
    private boolean subscription;


    public Post(FormDate birthday, String name, String passport, String patronymic, String phone, String surname, boolean subscription) {
        this.birthday = birthday;
        this.name = name;
        this.passport = passport;
        this.patronymic = patronymic;
        this.phone = phone;
        this.surname = surname;
        this.subscription = subscription;
    }


}
