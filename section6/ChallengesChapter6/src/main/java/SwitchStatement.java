public class SwitchStatement {


    public static void main(String[] args) {
        int switchValue = 2;

        switch (switchValue){
            case 1:
                System.out.println("Value 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;
            case 3:
                System.out.println("Value 3");
                break;
            default:
                System.out.println("No default value");
                break;
        }

        String month = "APRIL";
        System.out.println(month+ " is in the "+getQuarter(month)+" quarter");
    }


    public static String getQuarter(String month){

        switch (month){
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                return "1st";
            case "APRIL":
            case "MAY":
            case "JUNE":
                return "2nd";
            case "JULY":
            case "AUGUST":
            case "SEPTEMBER":
                return "3rd";
            case "OCTOBER":
            case "NOVEMBER":
            case "DECEMBER":
                return "4th";
        }

        return  "Invalid month";
    }
}
