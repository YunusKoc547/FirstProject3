package replpractice;

public class EducationalInstitution {
    private int years;

    public EducationalInstitution(int duration) {
        this.years = duration;
    }

    public String graduationRequirements() {
        return years + " years of study";
    }
}
