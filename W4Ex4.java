public class W4Ex4 {

    public static void main(String[] args) {

	System.out.println("Please enter either decimal or hexdecimal (start the hexdecimal with 0x):");
	System.out.print("> ");
	String str = System.console().readLine();

	String first2Chars = str.substring(0,2);
	String restChars = str.substring(2);

	if (first2Chars.equals ("0x")) { 
        	int decimal = hex2dec(restChars);
        	System.out.println ("The hexdecimal " + restChars + " in decimal is " + decimal);
	} else {
		int decimal = Integer.parseInt(str);
		String hDec = dec2hex(decimal);
        	System.out.println ("The decimal number " + decimal + " in hexdecimal is " + hDec);
	}	
    }

    public static int hex2dec(String s) {
        String hexDigits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = hexDigits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }

    public static String dec2hex(int d) {
        String hexDigits = "0123456789ABCDEF";
        if (d == 0) return "0";
        String hex = "";
        while (d > 0) {
            int digit = d % 16;               
            hex = hexDigits.charAt(digit) + hex;
            d = d / 16;
        }
        return hex;
    }

}
