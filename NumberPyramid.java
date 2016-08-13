class NumberPyramid{
	public static void main(String[]args){
		String x = "";
		for(int ctr=1;ctr<=9;ctr++){
			x = x + Integer.toString(ctr);
			int y = Integer.parseInt(x) * 8 + ctr;
			System.out.println(x + "=" + y);
		}
	}
}
