class Majors {
    private String [] businessDivision = {"ACC", "CIS"};
    private String [] scienceDivision = {"CHEM", "PHYS"};
    private String [] humanitiesDivision = {"ENG", "HIS"};

    public Majors(String[] businessDivision, String[] scienceDivision, String[] humanitiesDivision) {
        this.businessDivision = businessDivision;
        this.scienceDivision = scienceDivision;
        this.humanitiesDivision = humanitiesDivision;
    }

    public boolean equals(Object obj){
        if(obj instanceof Majors){
            Majors m = (Majors) obj;
            boolean isEqual = m.equals(this);
            return isEqual;
        } else return false;

    }

    void majors (String input){
        if(input.equals(businessDivision[1]) || input.equals(businessDivision[0])){
            System.out.println("The Major is in the Business Division!");
        } else if (input.equals(scienceDivision[1]) || input.equals(scienceDivision[0])){
            System.out.println("The Major is in the Science Division!");
        } else if (input.equals(humanitiesDivision[1]) || input.equals(humanitiesDivision[0])){
            System.out.println("The Major is in the Humanities Division!");
        } else System.out.println("We don't have this type of Major!");
    }
}
