class Remove_Element27 {
    public static void main(String[] args) {
        int []nums={0,1,2,2,3,0,4,2};
        int val=2;
        int flag=0;
        for(int i=0;i<nums.length;i++){
            if(val==nums[i]){
                nums[i]='_';
                flag++;
            }

        }
        int k=nums.length-flag;
        System.out.print(k);
    }
}