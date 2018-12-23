package explore.interview.card.topInterviewQuestionsEasy;


public class Solution {

    /**
     * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/5/strings/38/
     * @param haystack
     * @param needle
     * @return
     */
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0){
        	return 0;
        }
        int str = 0;
        int j = 0;
        int opt = needle.length();
        for (int i = 0; i < haystack.length(); i++) {
        	str = 0;
			if(haystack.charAt(i) == needle.charAt(j)) {
				int ii = i;
				int jj = j;
				while(ii < haystack.length() && jj < needle.length() && haystack.charAt(ii) == needle.charAt(jj)){
					str++;
					if(str == opt) {
						return ii - opt +1;
					}
					ii++;
					jj++;
					
				}
			}
		}
        return -1;
    }

    class ListNode {
	  int val;
	  ListNode next;
	  ListNode(int x) { val = x; }
    }

	public void deleteNode(ListNode node) {


	}

//	public int myAtoi1(String str) {
//
//    	if(str == null || str.trim().length() == 0) {
//    		return 0;
//		}
//		str = str.trim();
//
//		char first = str.charAt(0);
//		String newStr = "";
//		if(first != '+' && first != '-' && (first < '0' || first > '9')) {
//			return 0;
//		} else if(str.length() == 1) {
//			return 0;
//		}
//		if(first == '+' || first == '-') {
//			while(str.charAt(1) == '0') {
//				str = str.substring(1);
//			}
//			if(str.length() == 1) {
//				return 0;
//			}
//		} else {
//			while(str.charAt(0) == '0') {
//				str = str.substring(1);
//			}
//			if(str.length() == 0) {
//				return 0;
//			}
//		}
//    	for (int i = 0;i < str.length();i++) {
//			if(i == 0 && (str.charAt(0) == '+' || str.charAt(0) =='-')) {
//				continue;
//			}
//    		if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
//				newStr = newStr + str.charAt(i);
//			} else {
//    			break;
//			}
//		}
//
//		String MAX_VALUE = Integer.MAX_VALUE +"";
//		String MIN_VALUE = (Integer.MIN_VALUE + "").substring(1);
//		if(newStr.length() == 0) {
//			return 0;
//		} else if(first == '-') {
//			if(newStr.length() > 10) {
//				return Integer.MIN_VALUE;
//			} else if(newStr.length() < 10) {
//				return 0 - Integer.parseInt(newStr);
//			} else {
//				for (int i = 0,j = 0;i < MIN_VALUE.length(); i++) {
//					if(MAX_VALUE.charAt(i) < newStr.charAt(j)) {
//						return Integer.MIN_VALUE;
//					}
//				}
//				return 0 - Integer.parseInt(newStr);
//			}
//
//		} else {
//			if(newStr.length() > 10) {
//				return Integer.MAX_VALUE;
//			} else if(newStr.length() < 10) {
//				return Integer.parseInt(newStr);
//			} else {
//				for (int i = 0,j = 0;i < MAX_VALUE.length(); i++) {
//					if(MAX_VALUE.charAt(i) < newStr.charAt(j)) {
//						return Integer.MAX_VALUE;
//					}
//				}
//				return Integer.parseInt(newStr);
//			}
//		}
//	}


	public int myAtoi(String str) {

    	str = str.trim();

    	String newStr = "";
    	char first = ' ';

		String MAX_VALUE = Integer.MAX_VALUE +"";
		String MIN_VALUE = (Integer.MIN_VALUE + "").substring(1);
		if(newStr.length() == 0) {
			return 0;
		} else if(first == '-') {
			if(newStr.length() > 10) {
				return Integer.MIN_VALUE;
			} else if(newStr.length() < 10) {
				return 0 - Integer.parseInt(newStr);
			} else {
				for (int i = 0,j = 0;i < MIN_VALUE.length(); i++) {
					if(MAX_VALUE.charAt(i) < newStr.charAt(j)) {
						return Integer.MIN_VALUE;
					}
				}
				return 0 - Integer.parseInt(newStr);
			}

		} else {
			if(newStr.length() > 10) {
				return Integer.MAX_VALUE;
			} else if(newStr.length() < 10) {
				return Integer.parseInt(newStr);
			} else {
				for (int i = 0,j = 0;i < MAX_VALUE.length(); i++) {
					if(MAX_VALUE.charAt(i) < newStr.charAt(j)) {
						return Integer.MAX_VALUE;
					}
				}
				return Integer.parseInt(newStr);
			}
		}
	}
    public static void main(String[] args) {
    	
    	//2018年12月19日22:52:02
    //	System.out.println(new Solution().strStr("hello","ll"));

		System.out.println(new Solution().myAtoi("-0000003472332"));


	//	System.out.println( (Integer.MIN_VALUE + "").substring(1));

	}
}
