class Majors {
    private final String [] businessDivision = {"ACC", "CIS"};
    private final String [] scienceDivision = {"CHEM", "PHYS"};
    private final String [] humanitiesDivision = {"ENG", "HIS"};

    public Majors() {

    }

    public boolean equals(Object obj){
        if(obj instanceof Majors){
            Majors m = (Majors) obj;
            boolean isEqual = m.businessDivision.equals(this.businessDivision)
                    && m.scienceDivision.equals(this.scienceDivision)
                    && m.humanitiesDivision.equals(this.humanitiesDivision);
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
