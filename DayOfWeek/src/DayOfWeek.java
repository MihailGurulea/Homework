class DayOfWeek {
    private final String[] weekDays = {"MONDAY", "TUESDAY", "WEDNESDAY",
            "THURSDAY", "FRIDAY"};
    private final String[] weekEnds = {"SATURDAY", "SUNDAY"};

    String[] getWeekDays() {
        return weekDays;
    }

    String[] getWeekEnds() {
        return weekEnds;
    }

    void workingHours(String dayOfTheWeek) {
        for (String day : weekDays) {
            if (day.equals(dayOfTheWeek)) {
                System.out.println("Working hours are from 9AM until 9PM!");
            }
        }
        if (dayOfTheWeek.equals("SATURDAY")) {
            System.out.println("Working hours are from 10AM until 6PM!");
        }
        if (dayOfTheWeek.equals("SUNDAY")) {
            System.out.println("Working hours are from 11AM until 5PM!");
        }

    }
}
