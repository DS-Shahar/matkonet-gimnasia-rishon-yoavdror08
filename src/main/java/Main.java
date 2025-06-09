package yesodot;
public class RISHON {
	public static void main(String[] args) {
	    System.out.println(seriesNum(3692));  // true
	    System.out.println(seriesNum(1234));  // true
	    System.out.println(seriesNum(147));   // true
	    System.out.println(seriesNum(135));   // true
	    System.out.println(seriesNum(1357));  // true
	    System.out.println(seriesNum(9));     // false
	    
	    
	}
	    
	    public static String findExpPremium(DigitalGadget [] arr) {
    		int maxPrice = 0;
    		String best ="";
	    	for (int i=0; i<arr.length ;i++) {
	    		if (arr[i].isPremium()) {
	    			if (maxPrice < arr[i].getPrice()) {
	    			maxPrice = arr[i].getPrice();
	    			best = arr[i].getModelName();
	    		}	
	    	}
	    	}
	    	return best;
	    }
	    
	    	
	    
	
	    public static DigitalGadget []  build(DigitalGadget [] arr) {
	    	DigitalGadget [] arr2 = new DigitalGadget[arr.length];
	    	int j =0;
	    	for (int i= 0; i<arr.length; i++) {
	    		if (arr[i].isPremium())
	    			arr2[j] = arr[i];
	    			j++;
	    	}
	    	for (int i= 0; i<arr.length; i++) {
	    		if (!arr[i].isPremium())
	    			arr2[j] = arr[i];
	    			j++;
	    	}
	    	return arr2;
	    }
	
	
//question 2	
	public static boolean seriesNum(int Number){
		if (Number<10)
			return false;
		int dis = 0;
		int length = numLength(Number);
		int first = Number % 10;
		Number /= 10;
		int second = Number % 10;
		Number /= 10;
		length-=2;
		if (second > first)
		    first += 10;
		dis = first - second;
		for (int j = 0; j<length; j++) {
	        int x = Number % 10;
	        Number /= 10;
	        if (x > second) 
	            x += 10;
	        if (x + dis != second) 
	            return false;
	        second = x;
		}
		return true;	
	}
		
	public static int numLength(int num) {
    if (num == 0) return 1; 
    int length = 0;
    while (num > 0) {
        num /= 10;
        length++;
    }
    return length;
	}
			
	public static int getMaxSeriesNum(int [] arr) {
		int max = 0;
		for (int i=0; i<arr.length; i++) {
			if (seriesNum(arr[i])) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
			}
		}
		return max;
	}
	
	
	
	
			
}
