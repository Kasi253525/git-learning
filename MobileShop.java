import java.util.*; 
class Implementation{ 
 public ArrayList<String> changeOccurrence(ArrayList<String> list,String a, String b){ 
  for(int i=0;i<list.size();i++){ 
   if(list.get(i).equals(a)){ 
    list.set(i,b); 
   } 
 
  } 
 
  return list; 
 } 
 public String getIndex(ArrayList<String> list){ 
  return list.get(0).toString(); 
 } 
 public ArrayList<String> addAfter(ArrayList<String> list ,String a,String b){ 
  for(int i=0;i<list.size();i++){ 
   if((list.get(i).toString()).equals(a)){ 
    list.add(i+1,b); 
    break; 
   } 
  } 
  return list; 
 } 
} 
 
public class Source{ 
 public static void main(String[] args) { 
  Scanner sc=new Scanner(System.in); 
  int size=sc.nextInt(); 
  ArrayList<String> list=new ArrayList<String>(); 
  for(int i=0;i<size;i++){ 
   String input=sc.next(); 
            list.add(input); 
  } 
           
   String m11=sc.next(); 
   String m12=sc.next(); 
         String m21=sc.next(); 
         String m22=sc.next(); 
        Implementation obj1=new Implementation(); 
        System.out.println(obj1.changeOccurrence(list,m11,m12)); 
        System.out.println(obj1.getIndex(list)); 
        System.out.println(obj1.addAfter(list,m21,m22)); 
 
 } 
}