
public class Pr141 {
    void yechim() {
        String str = "Salom";
        int indeks = 2;
        if (indeks >= 0 && indeks < str.length()) {
            System.out.println(str.charAt(indeks));
        } else {
            System.out.println("Bunday indeks yo'q");
        }
    }

    public static void main(String[] args) {
        Pr141 obj = new Pr141();
        obj.yechim();
    }
}
