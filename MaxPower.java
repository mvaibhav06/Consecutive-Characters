class MaxPower {
    public int maxPower(String s) {
        int out = Integer.MIN_VALUE;
        int max = 1;

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                max++;
            }else{
                out = Math.max(max,out);
                max = 1;
            }
        }
        return Math.max(max,out);
    }
}
