class Solution {
    public int maxProfit(int[] a) {
        int buy = a[0];int maxProfit=0;
		for(int i=1;i<a.length;i++) {
			if(buy>a[i]) {
				buy=a[i];
			}
			else if(a[i]-buy>maxProfit){
				maxProfit=a[i]-buy;
			}
		}
        return maxProfit;
    }
}