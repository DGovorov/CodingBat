/**
 * Created by Dim on 05.03.2016.
 */
public class WarmingUpExamplesMain {

    public static void main(String[] args) {
        WarmingUp word = new WarmingUp();
        String newString = word.frontBack("GOVOROV");
        System.out.println(newString);

        System.out.println(word.delDel("adelqw"));

        System.out.println(word.in3050(33,50));

        System.out.println(word.endUp("ELO WHO"));

    }
}
