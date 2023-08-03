package StringQuestions;

public class replaceStringWordWithoutReplaceMethod {
	
	public static void main(String[] args) {
		String s = "cisco a good company wssise";
		replaceString(s,"is","in");
	}
	
	
	public static void replaceString(String s, String replace,String replaceTo) {
		String split[] = s.split(" ");
		String rev = "";
		
		for(String str: split) {
			if(str.length()<=1 && replace.length()>2) {
				rev = rev+str+" ";
			}else if(str.indexOf(replace) != -1){
				int position = str.indexOf(replace);//1
		        int len = replace.length();//2
		        String new_string = str.substring(0, position) + replaceTo + str.substring(position+len);		        
				rev = rev+new_string+" ";        //(0,1)+in+(1+2)//cinco
			} else {
				rev = rev+str+" ";
			}
		}
		System.out.println(rev.trim());
	}
}
