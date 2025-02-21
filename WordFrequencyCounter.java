import java.io.*;
import java.util.*;
public class WordFrequencyCounter{
public static void main(String[] args){
String filePath="textfile.txt";
HashMap<String, Integer> wordCount=new HashMap<>();
try(BufferedReader reader=new BufferedReader(new FileReader(filePath))){
String line;
while((line=reader.readLine())!=null){
String[] words=line.split("\\W+");
for(String word:words){
if(!word.isEmpty()){
word=word.toLowerCase();
wordCount.put(word,wordCount.getOrDefault(word,0)+1);
}}}}catch(IOException e){
System.out.println("Error reading the file: "+e.getMessage());
return;}
List<Map.Entry<String, Integer>> sortedWords=new ArrayList<>(wordCount.entrySet());
sortedWords.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));
System.out.println("Top 5 most frequent words:");
for(int i=0;i<Math.min(5,sortedWords.size());i++){
Map.Entry<String, Integer> entry=sortedWords.get(i);
System.out.println(entry.getKey()+": "+entry.getValue());}}}
