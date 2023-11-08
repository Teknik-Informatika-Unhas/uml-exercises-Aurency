class Student extends Person {
    private String campus;

    protected void setCampus(String campus) {
        this.campus = campus;
    }

    protected String getCampus() {
        return campus;
    }
}