public class paraCons {
    int Id;
    String Name;

    paraCons(int id, String name) {
        Id = id;
        Name = name;
    }

    void display() {
        System.out.println(Id + " " + Name);
    }

    public static void main(String[]args) {
        paraCons myObj = new  paraCons(01, "Piumi");
        paraCons myObj1 = new  paraCons(02, "Sachinthi");

        myObj.display();
        myObj1.display();
}
}
