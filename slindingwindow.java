class slindingwindow {
    public static void main(String[] args) {
        String s="xyzzaz";
        int l=0;
        int r=2;
        int count=0;
        while(r<s.length()){
            if(s.charAt(l)!=s.charAt(l+1) && s.charAt(l+1)!=s.charAt(r)&&s.charAt(l)!=s.charAt(r)){
                count++;
            }
                l++;
                r++;
    }
            System.out.print(count);
}
}