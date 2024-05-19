public class StudyProgramme {
    private String name;
    private String description;
    private int totalSemesters;
    private int maxFailsBeforePromotion;

    public StudyProgramme(String name, String description, int totalSemesters, int maxFailsBeforePromotion) {
        this.name = name;
        this.description = description;
        this.totalSemesters = totalSemesters;
        this.maxFailsBeforePromotion = maxFailsBeforePromotion;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTotalSemesters() {
        return totalSemesters;
    }

    public void setTotalSemesters(int totalSemesters) {
        this.totalSemesters = totalSemesters;
    }

    public int getMaxFailsBeforePromotion() {
        return maxFailsBeforePromotion;
    }

    public void setMaxFailsBeforePromotion(int maxFailsBeforePromotion) {
        this.maxFailsBeforePromotion = maxFailsBeforePromotion;
    }
}
