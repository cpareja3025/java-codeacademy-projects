public class Language {
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String name, int numSpeakers, String regionsSpoken, String wordOrder ) {
        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
    }

    public void getInfo() {
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken +".");
        System.out.println("The language follows the word order: " + this.wordOrder + ".");
    }
    public static void main(String[] args) {
        Language spanish = new Language("Spanish", 302, "Latin America", "subject-verb-object");
        //spanish.getInfo();
        Mayan chontal = new Mayan("Chontal", 36000);
        //chontal.getInfo();
        SinoTibetan chinese = new SinoTibetan("Mandarin Chinese", 50000);
        SinoTibetan nonChinese = new SinoTibetan("Burmese", 2000);

        chinese.getInfo();
        nonChinese.getInfo();


    }
    
}
