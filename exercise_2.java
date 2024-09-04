import java.text.Normalizer;

public class exercise_2 {
    
    // Escreveremos a string de busca e a string a buscar aqui, pode ser implementado com um Scanner se preferível.
    public static void main(String[] args){
        /*
         * Scanner sc = new Scanner(system.in);
         * String searcherString = sc.next();
         * etc.
         */
        final String searcherString = "a";
        String exampleString = "Aquela lua que brilha lá no céu";

        containResearch(searcherString, exampleString);
    }

    // Está é a função responsável por fazer a pesquisa e exibir o resultado(idealmente o resultado seria exibido em outra func, mas pelo escopo deixei aqui para não criar funções demais)
    public static void containResearch(String research, String phrase){
        String normalizedPhrase = removeAccent(phrase);
        int count = 0;
        if(containTheChar(research, normalizedPhrase)){
            count = howManyChar(research, normalizedPhrase);
        }
        if(count == 0){
            System.out.println("A letra '"+research+"' não está presente na frase: "+phrase);
            return;
        }
        System.out.println("A letra '"+research+"' ocorre "+count+" vezes na frase: "+phrase);
    }
    
    // Aqui eu removo os acentos e caracteres especiais para termos uma maior precisão nas letras em si, não diferenciando um á de um a, pois são a mesma letra.
    public static String removeAccent(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }
    
    // Aqui ele confirma se existe a guia de busca na frase.
    public static boolean containTheChar(String research, String phrase){
        return phrase.toLowerCase().contains(research);
    }

    // Esta parte do código é responsável por contar a reincidência do char. Se for aumentar a string terá que ser adaptado.
    public static int howManyChar(String research, String phrase){
        int count = 0;
        
        phrase = phrase.toLowerCase();
        for(int index = 0; index < phrase.length(); index++){
            if(phrase.charAt(index) == research.charAt(0)){
                count++;
            }
        }
        return count;
    }

}
