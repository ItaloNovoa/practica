import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problem1 {
	
	
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		String a, b;
		while( (linea = br.readLine()) != null ){
			StringTokenizer st = new StringTokenizer(linea);
			a = (st.nextToken()).toLowerCase();
			br = new BufferedReader(new InputStreamReader(System.in));
			linea = br.readLine();
			st = new StringTokenizer(linea);
			b = (st.nextToken()).toLowerCase();
			System.out.println(problem(a,b));
		}
	}

	private static String problem(String a, String b) {
		if ( a.length()!=b.length() ) {
			return "Not Anagrams";
		}
		ArrayList<String> aa = new ArrayList<String>(), bb=new ArrayList<String>();
		
		for (int i=0;i<a.length();i++) {
			aa.add(a.charAt(i)+"");				
			bb.add(b.charAt(i)+"");				
			//System.out.println(a.charAt(i)+" "+b.charAt(si));			
		}
		
		Collections.sort(aa);
		Collections.sort(bb);
		
		if(aa.equals(bb)) {
			return "anagrams";
		}
		return "Not Anagrams";
	}*/
	
	static boolean isAnagram(String a, String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
        if ( a.length()!=b.length() ) {
            return false;
        }
        ArrayList<String> aa = new ArrayList<String>(), bb=new ArrayList<String>();
        
        for (int i=0;i<a.length();i++) {
            aa.add(a.charAt(i)+"");                
            bb.add(b.charAt(i)+""); 
                        
        }
        
        Collections.sort(aa);
        Collections.sort(bb);
        
        if(aa.equals(bb)) {
            return true;
        }
        return false;
    }

    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}


