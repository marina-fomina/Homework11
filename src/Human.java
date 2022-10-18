public class Human {

    private int yearOfBirth;
    private String name;
    private String town;

    private String job;

    public Human(String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.job = job;
        this.yearOfBirth = yearOfBirth;
        checkConditions();
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!";
    }

    public void checkConditions() {
        if (name == null || name.isBlank()) {
            this.name = "* Информация не указана *";
        } else {
            this.name = name;
        }

        if (town == null || town.isBlank()) {
            this.town = "* Информация не указана *";
        } else {
            this.town = town;
        }

        if (job == null || job.isBlank()) {
            this.job = "* Информация не указана *";
        } else {
            this.job = job;
        }

        if (yearOfBirth <= 0) {
            this.yearOfBirth = Math.abs(yearOfBirth);
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }
}
