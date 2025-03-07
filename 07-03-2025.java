// 2523. Closest Prime Numbers in Range

class Solution {
    public boolean isPrime(int num){
        if (num <= 1) return false;
        if (num == 2) return true;  
        if (num % 2 == 0) return false;  
        for (int i = 3; i * i <= num; i += 2) {  
            if (num % i == 0) {
                return false;  
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] res = new int[2];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = left; i <= right; i++){
            if(isPrime(i)){
                temp.add(i);
            }
        }
        if(temp.size() <= 1){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        int mindiff = Integer.MAX_VALUE;
        for(int i = 0; i < temp.size() -1; i++){
            int prime1 = temp.get(i);
            int prime2 = temp.get(i+1);
            int diff = prime2 - prime1;
            if(diff < mindiff){
                mindiff = diff;
                res[0] = prime1;
                res[1] = prime2;
                
            }
        }
        return res;
    }
}
