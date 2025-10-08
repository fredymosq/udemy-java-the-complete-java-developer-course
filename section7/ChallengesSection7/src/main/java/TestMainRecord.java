public class TestMainRecord {

    public static void main(String[] args) {

        for (int i = 1; i <= 5 ; i++) {
            LPAStudent student = new LPAStudent(
                    "Lp00" + i,
                    "Perensejo_"+i,
                    "1990/01/01",
                    "Java MasterClass"
            );

            System.out.println(student);
        }
    }
}
