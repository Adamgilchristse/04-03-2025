public class Reverseas {
    public static void main(String[] args) {
        String str="I love  Java Programming";
        String[] words=str.trim().split("\\s+");
        StringBuilder build =new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
           build.append(words[i]);
            if(i>0){
                build.append(" ");
            }
        }
        System.out.print(build.toString());
    }
}
