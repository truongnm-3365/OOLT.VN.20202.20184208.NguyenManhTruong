package hust.soict.hedspi.aims.media;

import java.util.*;

public class Book extends Media {

    private List<String> authors = new ArrayList<String>();
    private String content;
    private List<String> contentTokens = new ArrayList<String>();
    private Map<String,Integer> wordFrequency =  new TreeMap<String,Integer>();
    public Book(String title) {
        super(title);
    }

    public Book(String title, List<String> authors, String content, List<String> contentTokens, Map<String, Integer> wordFrequency) {
        super(title);
        this.authors = authors;
        this.content = content;
        this.contentTokens = contentTokens;
        this.wordFrequency = wordFrequency;
    }

    public Book(int id, String title) {
        super(title,id);

    }

    public Map<String,Integer> getWordFrequency() {
        return wordFrequency;
    }

    public void setWordFrequency(Map<String,Integer> wordFrequency) {
        this.wordFrequency = wordFrequency;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getContentTokens() {
        return contentTokens;
    }

    public void setContentTokens(List<String> contentTokens) {
        this.contentTokens = contentTokens;
    }

    public Book(String title, String category, List<String> authors){
        super(title,category);
        this.authors=authors;
    }
    public void addAuthor (String authorName){
        if(authors.indexOf(authorName) == -1)
        {
            authors.add(authorName);
            System.out.println("Đã thêm vào");
        }else{
            System.out.println("Đã tồn tại không thể thêm vào");
        }
    }

    public void removeAuthor(String authorName){
        if(authors.size()>0)
            if(authors.indexOf(authorName) != -1){
                authors.remove(authorName);
                System.out.println("Đã xóa");
            }else{
                System.out.println("Không tồn tại không thể xóa");
            }
    }


    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    @Override
    public int compareTo(Object o) {
            if (o instanceof Book) {
                Book another = (Book) o;
                if(another!=null)
                return this.getTitle().compareTo(another.getTitle());
            }

        return -1;
    }
    public void addWord(Map<String, Integer> wordMap, StringBuilder sb) {
        String word = sb.toString();
        if (word.length() == 0) {
            return;
        }
        if (wordMap.containsKey(word)) {
            int count = wordMap.get(word) + 1;
            wordMap.put(word, count);
        } else {
            wordMap.put(word, 1);
        }
    }
    public Map<String, Integer> countWords(String input) {
        // khởi tạo wordMap
        Map<String, Integer> wordMap = new TreeMap<String, Integer>();
        if (input == null) {
            return wordMap;
        }
        int size = input.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (input.charAt(i) != ' ' && input.charAt(i) != '\t'
                    && input.charAt(i) != '\n') {

                // build một từ
                sb.append(input.charAt(i));
            } else {
                // thêm từ vào wordMap
                addWord(wordMap, sb);
                sb = new StringBuilder();
            }
        }
        // thêm từ cuối cùng tìm được vào wordMap
        addWord(wordMap, sb);
        return wordMap;
    }
    
    public void processContent(){
        String []words = this.content.split(" ");
        for (String w : words){
            this.contentTokens.add(w);
        }
        Arrays.sort(words);
        this.wordFrequency = countWords(String.join(" ", words));

    }

    public String toString(){
        processContent();
        System.out.println("Author: ");
        for (String s : this.authors) {
            System.out.println(s);
        }
        System.out.println("Title: "+this.getTitle());
        System.out.println("Category: "+this.getCategory());
        System.out.println("Content: "+ this.content);
        System.out.println("So luong token: " + this.contentTokens.size());
        System.out.println("Token list");
        for (String key : this.wordFrequency.keySet()) {
            System.out.print("Tan suat:" + this.wordFrequency.get(key) + " Tu:"  + key  + "\n");
        }
        return "\n";

    }
}
