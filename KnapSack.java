
public class KnapSack 
{
	static String line="81 : (1,53.38,$45) (2,88.62,$98) (3,78.48,$3) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)";
   public static void main(String[] args)
   {
	   int j=0;
	   StringBuilder total_w=new StringBuilder();
	   while (line != null) {
		      //System.out.println(line);
		      while(line.charAt(j)!=':')
		      {
		        total_w.append(line.charAt(j));
		        j++;
		      }
		      while(j!=line.length())
		      {
		    	 /* String formattedString = myArrayList.toString()
		    			    .replace(",", "")  //remove the commas
		    			    .replace("[", "")  //remove the right bracket
		    			    .replace("]", "")  //remove the left bracket
		    			    .trim(); */
		      }
		    }
   }
}
