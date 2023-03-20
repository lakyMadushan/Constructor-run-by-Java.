public class Language {
    String languages;
    Language(String a){
        languages = a;
        System.out.println(languages + " is language.");

    }
    public static void main(String[] args) {
        Language l =new Language("Sinhala");
        Language l2 =new Language("Sinhala");
        Language l3 =new Language("Sinhala");
    }
}
