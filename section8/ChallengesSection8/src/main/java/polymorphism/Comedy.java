package polymorphism;

public class Comedy {

    private String title;

    public Comedy(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title+" is a "+instanceType+" film");
    }
}
