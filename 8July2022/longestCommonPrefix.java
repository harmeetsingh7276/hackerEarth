class Solution {
    public String longestCommonPrefix(String[] strs) {
		String answer = "";
		String subs = strs[0];
		int flag=0;
		int j = subs.length();
        if(strs.length==1) {
			return strs[0];
		}
		while (j > 0) {
			for (int i = 0; i < strs.length; i++) {
				if (!strs[i].startsWith(subs)) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			if(flag==0) {
				j--;
				subs = subs.substring(0, j);
				//answer = "There is no common prefix among the input strings.";
                answer="";
			}
			else {
				answer=subs;
				break;
			}
			
		}
		return answer;
	}
    
}