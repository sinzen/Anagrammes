import java.util.*;

public class Main {

    public static void main(String[] args) {


        String chaineDeChar = "le chien marche vers sa niche et trouve une limace de chine nue pleine de malice qui lui fait du charme ";
        AnagrammesImpl anagrammes = new AnagrammesImpl();
        List<String> a2 = new ArrayList<String>();
        List<String> aSource = anagrammes.anagrammesMethode(chaineDeChar);
        anagrammes.suppressionElementUnique(aSource);
        anagrammes.trieListeEtMot(aSource,a2);
        List listeAnag =  anagrammes.listeAnagrammesChaineChar(a2);
        System.out.println(anagrammes.suppressionDoublonAnagrammeEtCalcluNbAnagramme(listeAnag));
    }
}
