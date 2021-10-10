package jfv.basis;

public class MainClass {
    public static void main(String[] args) {
        String tekst = "Buiten de methode";
        boolean condition = true;
        int i = 0;
        for (System.out.println("Start");condition; System.out.println("ophoging")){
            System.out.println("code");
            if(i>5){
                break;
            }
            i++;
        }
        System.out.println(tekst);
        writeTekst();
        System.out.println(tekst);
        FamilyDocter joop = new FamilyDocter("Joop","de Boer","halsemastraat","12345","OLVG");

        System.out.println(joop.info());

        System.out.println(joop.getFirstName());
    }

    public static void writeTekst(){
        String tekst = "Binnen de methode";
        System.out.println(tekst);
    }
}
