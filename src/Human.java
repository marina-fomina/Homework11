import java.time.LocalDate;

public class Human {

    private int yearOfBirth;
    private String name;
    private String town;

    private String job;

    private static final String DEFAULT_VALUE = "* Информация не указана *";

    public Human(String name, String town, int yearOfBirth, String job) {
        setName(name);
        setTown(town);
        setJob(job);
        setYearOfBirth(yearOfBirth);
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности "
                + job + ". Будем знакомы!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = ValidationUtils.validOrDefault(name, DEFAULT_VALUE);
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = ValidationUtils.validOrDefault(town, DEFAULT_VALUE);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = ValidationUtils.validOrDefault(job, DEFAULT_VALUE);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = Math.max(yearOfBirth, 0);
    }

    public int getAgeInYears() {
        int currentYear = LocalDate.now().getYear();
        return currentYear - getYearOfBirth();
    }
}
