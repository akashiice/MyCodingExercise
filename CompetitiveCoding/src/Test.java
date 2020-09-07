import java.util.*;
public class Test
{
    List<String> retrieveMostFrequentlyUsedWords(String helpText,
                                                 List<String> wordsToExclude)
    {
        HashMap<String, Integer> mostFrequentMap = new HashMap<>();
        HashMap<String, Integer> commonWordsMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        int overall_max = 0;
        try{
            System.out.println(helpText);
            for(int i=0; i<wordsToExclude.size(); i++){
                commonWordsMap.put(wordsToExclude.get(i).toLowerCase(), 0);
            }
            String[] stringArray = helpText.split(" ");
          /* for(String value: stringArray){
               String word = value.toLowerCase();
               if(!commonWordsMap.containsKey(word))
               {
                   if(mostFrequentMap.containsKey(word)){
                       mostFrequentMap.put(word, 1);
                   }else{
                       mostFrequentMap.put(word, mostFrequentMap.get(word)+1);
                   }
               int current_max = mostFrequentMap.get(word);
               if(current_max>overall_max){
                   overall_max = current_max;
               } 
               }
           }*/
            System.out.println(stringArray.length);
            for(int j =0; j<stringArray.length; j++){

                String word = stringArray[j].toLowerCase();
                if(!commonWordsMap.containsKey(word))
                {
                    if(mostFrequentMap.containsKey(word)){
                        mostFrequentMap.put(word, 1);
                    }else{
                        mostFrequentMap.put(word, mostFrequentMap.get(word)+1);
                    }
                    int current_max = mostFrequentMap.get(word);
                    if(current_max>overall_max){
                        overall_max = current_max;
                    }
                    Math.pow()
                }
            }
            System.out.println(stringArray.length);
           
          
          /* for(String key: mostFrequentMap.keySet()){
               int value = mostFrequentMap.get(key);
               if(value == overall_max){
                   result.add(key);
               }
           }
           return result;*/
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}