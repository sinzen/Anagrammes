import java.util.*;

/**
 * Created by yassirhessane on 10/09/16.
 */
public class AnagrammesImpl {

    //je remplie une liste avec chaque mot de la chaine de caractères
    public List<String> anagrammesMethode(String s)
    {
        List<String> mList = new ArrayList<String>();
        String  val= "";
        for (int i=0;i< s.length();i++)
        {
            val = val + s.charAt(i);
            if (s.charAt(i) == ' ' )
            {
                mList.add(val);
                val = "";
            }
        }
        return mList;
    }

    //je supprime les mots unique dans la liste
    public void suppressionElementUnique(List list)
    {
        for(int i=0;i<list.size();i++)
        {
            for (int j=i+1;j<list.size();j++)
                if(list.get(i).equals(list.get(j)))
                {
                    list.removeAll(Arrays.asList(list.get(j)));
                }
        }
    }

    //je trie les mots par ordre alphabetique et trie chaque mot charactères par charactères
    public void trieListeEtMot(List<String> list,List listeTrier)
    {

        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            char[] c = list.get(i).trim().toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            listeTrier.add(sorted);
        }
    }
    //je creer un liste et ajoute les anagrammes dans la liste
    public ArrayList listeAnagrammesChaineChar(List<String> list)
    {
        Collections.sort(list);
        ArrayList listeAnagrammes = new ArrayList() ;// int i=0;
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    listeAnagrammes.add(list.get(i));
                }
            }

        }
        return listeAnagrammes;
    }

    //je supprime les doublon dans les anagrammes et fait le compte de mot
    public int suppressionDoublonAnagrammeEtCalcluNbAnagramme(List list)
    {
        int cpt=0;
        Set set = new HashSet() ;
        set.addAll(list) ;
        ArrayList distinctList = new ArrayList(set);
        for(int i = 0;i<distinctList.size();i++)
        {
            cpt++;
        }
        return cpt;
    }
}
