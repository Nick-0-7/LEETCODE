class Solution {
    public boolean makeEqual(String[] words) {

        int [] arr=new int[26];

        for(int i=0;i<words.length;i++){

            String word=words[i];

            for(int j=0;j<word.length();j++){

                char ch=word.charAt(j);
                int idx=(int)(ch-'a');
                    arr[idx]+=1;

            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%words.length!=0){
                return false;
            }
        }
        return true;
    }
}