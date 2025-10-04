public class SwitchNATOAlphabetChallenge {

    public static void main(String[] args) {

        char value = 'A';

        switch (value){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
                break;
            default:
                System.out.println("Letter "+value+ " was not found");
                break;
        }
    }
}
