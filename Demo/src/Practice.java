class Practice {

	public static void main(String[] args) {

	String a="ablvw125( *^^&$dfbzcVsdeadcqdtb";
	int count=0;
	
      for (int i=0; i < a.length(); i++) {
		int b=a.charAt(i);
		if (b>=65 && b<=90 ) {
			
			continue;
		}
		else if (b>=97 && b<=122) {
			continue;
		}
		else if (b==32) {
			break;
		}
		System.out.println(a.charAt(i));
		count++;
	}
      
      System.out.println(count);


	}

}
