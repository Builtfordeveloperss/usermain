1)checksum 

public class Main {

	public static void main(String[] args) {
		Scanner  s=new  Scanner(System.in);
		int  n=s.nextInt();
		int  r=UserMainCode.checkSum(n);
		if(r==1)
		{
		
			System.out.println("The  sum  of  odd  digits  are  odd");
		}
		else
		{
			System.out.println("The  sum  of  odd  digits  are  even");
		}
		
		s.close();
	}

}
Usermaincode:
public class UserMainCode {
	public  static  int  checkSum(int  n)
	{
	int  n1;  int  sum=0; int r; while(n!=0)
	{
	n1=n%10;
	if(n1%2!=0)
	{
	sum=sum+n1;
	
	}
	n=n/10;
	}
	if(sum%2==0)
	{
	
		r=-1;
	}
	else
	{
		r=1;

	}
	
	 return r;
	}

	}


2) validatenumber
public class Main {

	public static void main(String[] args) {
		Scanner  s=new  Scanner(System.in); String  number=s.next();
		int  r=UserMainCode.validateNumber(number);
		if(r==1)
		{
		System.out.println("Valid number format");
		}
		
		else
		{
			System.out.println("Invalid number format");
			
		}
		


		
		s.close();

	}

}
USERMAINCODE:

public class UserMainCode {
	public  static  int  validateNumber(String  number)
	{
	int  b;
	if(number.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
	{
		b=1;

	}
	else
	{
		b=0;
	}
	
	return  b;
	}

	}


3) sumofsquaresofevendigits

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  s=new  Scanner(System.in);
		int  n=s.nextInt(); 
		System.out.println(UserMainCode.sumOfSquaresOfEvenDigits(n)); 
		s.close();
	}

}
USERMAINCODE:
public class UserMainCode {
	public  static  int  sumOfSquaresOfEvenDigits(int  n)
	{
	int  n1=0; int  sum=0; while(n!=0)
	{
	n1=n%10;
	if(n1%2==0)
	{
	sum+=n1*n1;
	}
	n=n/10;
	}
	return  sum;
	}

	}

4) getmiddlechars	
       import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner  s=new  Scanner(System.in); String  str=s.nextLine();
		System.out.println(UserMainCode.getMiddleChars(str));
		s.close();

	}

}
USERMAINCODE:
public class UserMainCode {
	public  static  String  getMiddleChars(String  str)
	{
	StringBuffer  sb=new  StringBuffer();
	if(str.length()%2==0)
	{
	sb.append(str.substring((str.length()/2)-1,(str.length()/2)+1));
	}
	return  sb.toString();
	}


	}


5) checkcharacters

public class Main {

	public static void main(String[] args) {
		Scanner  s=new  Scanner(System.in); String  input=s.nextLine();
		int  r=UserMainCode.checkCharacters(input);
		if(r==1)
		{
			System.out.println("Valid");

		}
		else
		{

			System.out.println("Invalid");
			

		}

		s.close();


	}
USERMAINCODE:

public class UserMainCode {
	public  static  int  checkCharacters(String  input)
	{
	int r=0;
/*	StringTokenizer  t  =  new  StringTokenizer(input,"  "); String  s  =  t.nextToken();
	String  s1  =s  ;
	while(t.hasMoreTokens())
	{
	s1  =  t.nextToken();
	}*/
	if(input.charAt(0)  ==  input.charAt(input.length()-1))
	{ 
		r=1;
	}
	else{
	r=0;
	}
	return r;
	}

	}
6) formnewword
      public class Main {

	public static void main(String[] args) {
		
		Scanner  s=new  Scanner(System.in); String  s1=s.nextLine();
		int n1=s.nextInt(); System.out.println(UserMainCode.formNewWord(s1,n1));   s.close();

	}

}
USERMAINCODE:

public class UserMainCode {
	public  static  String  formNewWord(String  s1,int  n)
	{
	String  s  =  new  String();
	if(s1.length()>n)
	{
	s  =  s1.substring(0,n)  +  s1.substring(s1.length()-n,  s1.length());
	return s;
	}
	else
	return  null;
	}
	}

7)reversenumber


public class Main {

	public static void main(String[] args) {
		
		Scanner  s=new  Scanner(System.in);
		int  n=s.nextInt(); System.out.println(UserMainCode.reverseNumber(n)); s.close();


	}

}
USERMAINCODE:

public class UserMainCode {
	public  static  int  reverseNumber(int  n)
	{
	int  a,r=0;
	while(n!=0)
	{
	a=n%10;
	r=r*10+a; n=n/10;
	}
	return r;
	}
}

8) sortmergedarraylist


Sample Input 1:
3
1
17
11
19
5
2
7
6
20
Sample Output 1:
3
11
19
Sample Input 2:
1
2
3
4
5
6
7
8
9
10
Sample Output 2:
3
7
9
Main:
import  java.util.*;
public  class  Main  {
public  static  void  main(String[]  arg 
{
Scanner  s=new  Scanner(System.in);  ArrayList<Integer>  list1=new  ArrayList<Integer>(); ArrayList<Integer>  list2=new  ArrayList<Integer>(); ArrayList<Integer>  newlist=new  ArrayList<Integer>(); for  (int  i  =  0;  i  <  5;  i++)
{
list1.add(s.nextInt());
}
for  (int  i  =  0;  i  <  5;  i++)
{
list2.add(s.nextInt());
}
newlist=UserMainCode.sortMergedArraylist(list1,list2);
for  (int  i  =  0;  i  <  3;  i++)
{
System.out.println(newlist.get(i));
}
s.close();
}

}


UERMAINCODE:

import  java.util.*;
public  class  UserMainCode  {
public  static  ArrayList<Integer>  sortMergedArraylist(ArrayList<Integer> list1,ArrayList<Integer>  list2)
{
list1.addAll(list2); Collections.sort(list1);
ArrayList<Integer>  ans=new  ArrayList<Integer>(); ans.add(list1.get(2));
ans.add(list1.get(6));
ans.add(list1.get(8));
return  ans;
}
9)validating date format   validatedate
Sample Input 1:
12/06/19 
Sample Output 1: Valid date format Sample Input 2: 03/1/1987
Sample Output 2:
Invalid date format

public class Main {

	public static void main(String[] args) {
		Scanner  sc=new  Scanner(System.in); String  s1=sc.nextLine();
		int  b=UserMainCode.ValidateDate(s1);
		if(b==1){
		System.out.println("Valid  date  format");
		
		}
		else{
			System.out.println("Invalid  date  format");
		}
		
		sc.close();


	}

}
UERMAINCODE:
public class UserMainCode {
	static int b=0;
	public static int ValidateDate(String s1)
	{ 
		
		if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
		{
			 b=1;
		}
		else
		{
			b=-1;
		}
		return b;
	}
	}



10) validate time   validatetime

Input and Output Format:
Input is a string . Output is a string . Sample Input 1:
09:59 pm
Sample Output 1:
Valid time
Sample Input 2:
10:70 AM
Sample Output 2:
Invalid time
Main:

import  java.util.*;
public  class  Main{
public  static  void  main(String  []args){ Scanner  sc=new  Scanner(System.in); String  str=sc.nextLine();
int  b=UserMainCode.ValidateTime(str);
if(b==1){
System.out.println("Valid  time");

}
else{

}



System.out.println("Invalid  time");

sc.close();
}}
UserMainCode:

import   java.text.*; import     java.util.*; public class UserMainCode{
public static int ValidateTime(String str){ StringTokenizer st=new StringTokenizer(str,":"); if(st.countTokens()==3)
{
SimpleDateFormat sdf1 = new SimpleDateFormat("h:mm:ss a"); sdf1.setLenient(false);
try
{
Date d2=sdf1.parse(str); return 1;
}
catch(Exception e)
{
return -1;
}}
else
{
SimpleDateFormat sdf = new SimpleDateFormat("h:mm a"); sdf.setLenient(false);
try
{
Date d1=sdf.parse(str); return 1;

catch(Exception e){
return -1;
}}}}














11).string encryption  string  encrypt
Input and Output Format: Input is a string .
Output is a string. Sample Input 1: curiosity
Sample Output 1:
dusipsjtz
Sample Input 2:
zzzz
Sample Output 2:
Azaz
Main:

import  java.util.*;
public  class  Main  {
public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);
String  s1=s.next(); System.out.println(UserMainCode.encrypt(s1)); s.close();
}
}
UserMainCode:
public  class  UserMainCode{
public  static  String  encrypt(String  s1)  { StringBuffer  sb=new  StringBuffer(); for(int  i=0;i<s1.length();i++){
char  c=s1.charAt(i); if(i%2==0){ if(c==122) if((c==122)&&(i==0)){ c='A';}
else
c=(char)  (c-25);
else{

c=(char)  (c+1);}
sb.append(c);} else sb.append(c);}
return  sb.toString();
}}
	
12) password validation   validatepassword
input and Output Format:

Input consists of a string.

Output is a string Valid or Invalid.

Refer sample output for formatting specifications.

Sample Input 1:

ashok_23

Sample Output 1:

Valid

Sample Input 2:

1980_200

Sample Output 2:

Invalid
Main:
import  java.util.*;
public  class  Main  {
public  static  void  main(String[]  args){ Scanner  s=new  Scanner(System.in);
String  password=s.next();
int  b=UserMainCode.ValidatePassword(password);
if(b==1){
System.out.println("Valid  Password");
}
else{
System.out.println("Invalid  Password");
}
s.close();
}}

UserMainCode:

public  class  UserMainCode{
public  static  int  ValidatePassword(String  password){ if(password.matches(".*[0-9]{1,}.*")  &&  password.matches(".*[@#$]{1,}.*") &&  password.length()>=6  &&  password.length()<=20)
{

return 1;
}
else
{
return -1;
}}}






13. removeevenvowels         removing vowels from string
Sample Input 1: commitment Sample Output 1: cmmitmnt
Sample Input 2:
capacity
Sample Output 2:
Cpcty

Main:
import  java.util.*;
public  class  Main  {
public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  s1=s.nextLine();
System.out.println(UserMainCode.removeEvenVowels(s1)); s.close();
}}

UserMainCode:
public  class  UserMainCode{
public  static  String  removeEvenVowels(String  s1)  { StringBuffer  sb1=new  StringBuffer();
for(int  i=0;i<s1.length();i++)
if((i%2)==0)
sb1.append(s1.charAt(i));
else  if((i%2)!=0)
if(s1.charAt(i)!='a'  &&  s1.charAt(i)!='e'  && s1.charAt(i)!='i'  &&  s1.charAt(i)!='o'  &&  s1.charAt(i)!='u') if(s1.charAt(i)!='A'  &&  s1.charAt(i)!='E'  && s1.charAt(i)!='I'  &&  s1.charAt(i)!='O'  &&  s1.charAt(i)!='U') sb1.append(s1.charAt(i));
return  sb1.toString();
}}

14.    getsumofpower      sum of powers of elements in an array
Sample Input 1:
4
3
6
2
1
Sample Output 1:
12
Sample Input 2:
4
5
3
7
2
Sample Output 2:
61

Main:
import  java.util.Scanner;
public  class  Main{
public  static  void  main(String  args[]){ Scanner  sc=new  Scanner(System.in);
int  n=sc.nextInt(); int  a[]=new  int[n]; for(int  i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.getSumOfPower(n,a)); sc.close();
}}

UserMainCode:
public  class  UserMainCode{
public  static  int  getSumOfPower(int  n,int[]a)
{{
int  sum=0;
for(int  i=0;i<n;i++)

sum=(int)(sum+Math.pow(a[i],  i));
return  sum;
}}}


15. getbigdiff
Sample Input 1:
4
3
6
2
1
Sample Output 1:
5
Sample Input 2:
4
5
3
7
2
Sample Output 2:
5

Main:
import  java.util.*;
public  class  Main  {
public  static  void  main(String  args[]){ Scanner  sc=new  Scanner(System.in); int n=sc.nextInt();
int  a[]=new  int[n]; for(int  i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.println(UserMainCode.getBigDiff(a,n)); sc.close();

}}
UserMainCode:
import  java.util.*;
public  class  UserMainCode{
public  static  int  getBigDiff(int  []  a,int  n)
{
Arrays.sort(a);
int  n1=a[a.length-1]-a[0];
return  n1;
}}



16. getelementposition

Input and Output Format:
Input is an string array. First element in the input represents the size the array Assume the position of first element is 1.
Output is an integer which is the position of the string variable
Sample Input 1:
4
red green blue ivory ivory
Sample Output 1:
2
Sample Input 2:
3
grape mango apple apple
Sample Output 2:
3

Main:
import  java.util.*;
public  class  Main  {
public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in);
int  fr=sc.nextInt();

String  a[]=new  String[fr];
for(int  i=0;i<fr;i++)
{
a[i]=sc.next();
}
String  ba=sc.next(); UserMainCode.getElementPosition(a,ba); sc.close();
}}
UserMainCode: import  java.util.*;
public  class  UserMainCode{
public  static  void  getElementPosition(String[]  a,  String  b)  { ArrayList<String>al=new  ArrayList<String>();
for(int  i=0;i<a.length;i++)
{
al.add(a[i]);
}
Collections.sort(al); Collections.reverse(al); for(int  i=0;i<al.size();i++)
{
if(b.equals(al.get(i)))
{
System.out.println(i+1);
}}}}





17. generate the series   addSeries
Input and Output Format:

Input consists of a positive integer n. Output is a single integer .

Refer sample output for formatting specifications.

Sample Input 1:

9

Sample Output 1:

-3

Sample Input 2:

11

Sample Output 2:

8

Main

import  java.util.*;

public  class  Main  {



public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);
int  n=s.nextInt(); System.out.println(UserMainCode.addSeries(n)); s.close();
}

}

UserMainCode

import  java.util.ArrayList;

import  java.util.List;





public  class  UserMainCode  {

public  static  int  addSeries(int  n){ List<Integer>  l1=new  ArrayList<Integer>(); for(int  i=1;i<=n;i++)
if(i%2!=0) l1.add(i);
int  n1=l1.get(0);

for(int  i=1;i<l1.size();i++)

if(i%2!=0) n1=n1+l1.get(i); else
n1=n1-l1.get(i);

return  n1;

}

}

18.calculate electricity bill   calculateelectricitybill
                     Sample Input 1: ABC2012345 ABC2012660
4

Sample Output 1:

1260

Sample Input 2: ABCDE11111 ABCDE11222
3

Sample Output 2:

333

Main

import  java.util.Scanner;

public  class  Main  {



public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  input1=s.next();
String  input2=s.next();

int  input3=s.nextInt();

System.out.println(UserMainCode.calculateElectricityBill(input1,input2,inpu
t3));

s.close();

}



}

UserMainCode

public  class  UserMainCode  {

public  static  int  calculateElectricityBill(String  input1,  String  input2,
int  input3)

{

int  n1=Integer.parseInt(input1.substring(5,  input1.length())); int  n2=Integer.parseInt(input2.substring(5,  input2.length())); int  n=Math.abs((n2-n1)*input3);
return  n;

}

}

19.sum of digits in a string       sumofdigits


Sample Input 1: good23bad4 Sample Output 1:
9

Sample Input 2:

good

Sample Output 2:

-1

Main:
import  java.util.Scanner;

public  class  Main  {



public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  s1=s.next(); UserMainCode.sumOfDigits(s1);  s.close();
}



}
UserMainCode

public  class  UserMainCode  {

public  static  void  sumOfDigits(String  s1)  {

int  sum=0;

for(int  i=0;i<s1.length();i++)

{

char  a=s1.charAt(i);

if(Character.isDigit(a))

{

int  b=Integer.parseInt(String.valueOf(a)); sum=sum+b;
}

}

if(sum==0)

{

System.out.println(-1);

}

else

System.out.println(sum);

}

}
20.string concatenation   concatstring

Sample Input 1:

Hello hi
Sample Output 1:

lohi

Sample Input 2:

Hello Delhi
Sample Output 2:

HelloDelhi



Main


import  java.util.Scanner;

public  class  Main  {



public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  s1=s.next();
String  s2=s.next(); UserMainCode.concatstring(s1,s2); s.close();

}



} 

UserMainCode

public  class  UserMainCode  {

public  static  void  concatstring(String  s1,  String  s2)  { StringBuffer  sb=new  StringBuffer();
int  l1=s1.length(); int  l2=s2.length(); if(l1==l2)
{

sb.append(s1).append(s2);

}

else if(l1>l2)

{

sb.append(s1.substring(s1.length()- s2.length(),s1.length())).append(s2);

}

else if(l1<l2)

{

sb.append(s1).append(s2.substring(s2.length()- s1.length(),s2.length()));

}

System.out.println(sb);

}

}

21.color code      validatecolorcode

input and Output Format:

Input consists of a string.

Output consists of a string (Valid or Invalid). Refer sample output for formatting specifications. Sample Input 1:
#FF9922

Sample Output 1:

Valid

Sample Input 2:

#FF9(22

Sample Output 2:

Invalid

Main


import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  s1=s.next();
int  b=UserMainCode.validateColorCode(s1);

if(b==1) System.out.println("Valid"); else System.out.println("Invalid"); s.close();
}

}



UserMainCode:
public  class  UserMainCode  {

public  static  int  validateColorCode(String  s1)  {

int b=0,b1=0;

String  s2=s1.substring(1,s1.length()); if(s1.length()==7) if(s1.charAt(0)=='#')
b1=1;

if(b1==1){

/*for(int  i=0;i<s2.length();i++){

char  c=s2.charAt(i); if(c!='#')
{*/

if(s2.matches("[A-F0-9]{1,}"))



b=1;

else

b=-1;

//break;

}

return  b;

}

}


22.three digits     validatestrings

input and Output Format:

Input consists of a string.

Output consists of a string (Valid or Invalid). Refer sample output for formatting specifications. Sample Input 1:
CTS-215

Sample Output 1:

Valid

Sample Input 2:

CTS-2L5

Sample Output 2:

Invalid

Main:

import  java.util.Scanner;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  s1=s.next();
int  b=UserMainCode.validatestrings(s1);

if(b==1){

System.out.println("Valid");} else System.out.println("Invalid"); s.close();


}

}	


UserMainCode

public  class  UserMainCode  {

public  static  int  validatestrings(String  s1)  {

int  res=0;

if(s1.matches("(CTS)[-]{1}[0-9]{3}"))

{

res=1;

}

else

res=-1;

return  res;

}
}
23.removing keys from hashmap   sizeofresultandhashmap 


Input and Output Format:
First input corresponds to the size of the hashmap. Input consists of a hashmap<integer,string>.
Output is an integer which is the size of the hashmap. Refer sample output for formatting specifications.
Sample Input 1:

3

2

hi 4
hello 12

hello world

Sample Output 1:

1

Sample Input 2:

3

2

hi 4
sdfsdf 3
asdf

Sample Output 2:

2


Main

import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in);
int  s=sc.nextInt();

HashMap<Integer,  String>hm=new  HashMap<Integer,  String>();

for(int  i=0;i<s;i++){

hm.put((sc.nextInt()),(sc.next()));

}

System.out.println(UserMainCode.sizeOfResultandHashMap(hm));

sc.close();



} }




UserMainCode

import  java.util.HashMap;

import  java.util.Iterator;





public  class  UserMainCode  {

public  static  int  sizeOfResultandHashMap(HashMap<Integer,  String>  hm)  {

int  count=0;



Iterator<Integer>itr=hm.keySet().iterator();

while(itr.hasNext())

{

int  n=itr.next();

if(n%4!=0)

{

count++;

}

}

return  count;

}

}


24.largest element   checklargestamongcorner

sample Input 1:

5

2

3

8

4

5

Sample Output 1:

8

Main

import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in); int  n=s.nextInt();
int  a[]=new  int[n]; for(int  i=0;i<n;i++){
a[i]=s.nextInt();

}

System.out.println(UserMainCode.checkLargestAmongCorner(a)); s.close();
}

}
UserMainCode

public  class  UserMainCode  {

public  static  int  checkLargestAmongCorner(int  []a)

{

int  max=0;

int  x,y,z;

x=a[0];

y=a[a.length/2]; z=a[a.length-1]; if(x>y && x>z) max=x;
else  if(y>x  &&  y>z) max=y;

else  if(z>x  &&  z>y) max=z;
return  max;

}

}

25. ncr    calculatencr

Sample Input 1:

4

3

Sample Output 1:

4

Main

import  java.util.*;

public  class  Main  {



public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);
int  n=s.nextInt();

int  r=s.nextInt(); System.out.println(UserMainCode.calculateNcr(n,r));
}
}

UserMainCode
public  class  UserMainCode  {

public  static  int  calculateNcr(int  n, int  r)  {

int  fact=1,fact1=1,fact2=1;

for(int  i=1;i<=n;i++)

{

fact=fact*i;

}

//System.out.println(fact);

for(int  i=1;i<=r;i++)

{

fact1=fact1*i;

}

//System.out.println(fact1);

for(int  i=1;i<=(n-r);i++)

{

fact2=fact2*i;

}
return fact2;

//System.out.println(fact2); int  res=fact/(fact1*fact2); return  res;


}

}

26.sum of common elements   getsumofintersection
Sample Input 1:

4

3

2

3

5

1

1

3

9

Sample Output 1:

4

Sample Input 2:

4

3

2

3

5

1

12

31

9

Sample Output 2:

No common elements



Main

import  java.util.Scanner;

public  class  Main  {

public  static  void  main(String[]  args)

{

Scanner  sc=new  Scanner(System.in);

int  n=sc.nextInt(); int  m=sc.nextInt(); int[]  a=new  int[n]; int[]  b=new  int[m]; for(int  i=0;i<n;i++){ a[i]=sc.nextInt();} for(int  i=0;i<m;i++){ b[i]=sc.nextInt();}
int  u=UserMainCode.getSumOfIntersection  (a,b,n,m);

if(u==-1)

System.out.println("No  common  elements");

else

System.out.println(u); sc.close();
}}

UserMainCode

public  class  UserMainCode  {
	
public  static  int  getSumOfIntersection(int  a[],int  b[],int  n,int  m)

{

int  sum=0;

for(int  i=0;i<a.length;i++)

{

for(int  j=0;j<b.length;j++)

{if(a[i]==b[j]) sum=sum+a[i];
}}

if(sum==0) return -1; else return  sum;
}

}


27. validating input password      validatepassword


Input and Output Format:

Input consists of a string.

Output is a string Valid or Invalid.

Refer sample output for formatting specifications.

Sample Input 1:

ashok_23

Sample Output 1:

Valid

Sample Input 2:

1980_200

Sample Output 2:

Invalid

Main

public  static  void  main(String[]  args)

{

Scanner  sc=new  Scanner(System.in); String  a=sc.next();
int  e=UserMainCode.validatePassword(a);

if(e==1){ System.out.println("Valid");
}

else

{

System.out.println("Invalid");

}

sc.close();

}}



UserMainCode

public  class  UserMainCode  {

public  static  int  validatePassword(String  a){

int  d=0;

if(a.length()>=8){

if(a.contains("#")  ||  a.contains("@")  ||  a.contains("_"))

{

char  c=  a.charAt(0);

//System.out.println(c);

if(Character.isAlphabetic(c))

{

char  dd=a.charAt(a.length()-1);

//System.out.println(dd);

if((Character.isAlphabetic(dd))||(Character.isDigit(dd)))

{

if(a.matches(".*[0-9]{1,}.*")||a.matches(".*[a-zA-Z]{1,}.*")){ d=1;
}

}

}

}

}

else

d=-1;

return  d;

}}


28.	id validation  validateidlocations 

Sample Input 1:

CTS-hyd-1234

hyderabad

Sample Output 1:

Valid id

Sample Input 2:

CTS-hyd-123

hyderabad

Sample Output 2:

Invalid id

Main

import  java.util.*;

public  class  Main3  {

public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in);
String  s1=sc.next(); String  s2=sc.next();
boolean  b=UserMainCode3.validateIDLocations(s1,s2);

if(b==true) System.out.println("Valid  id"); else
System.out.println("Invalid  id");



sc.close();

}

}



UserMainCode

import  java.util.StringTokenizer;





public  class  UserMainCode3  {

public  static  boolean  validateIDLocations(String  s1,  String  s2)  { String  s3=s2.substring(0,  3);
boolean  b=false;

StringTokenizer  t=new  StringTokenizer(s1,"-"); String  s4=t.nextToken();
String  s5=t.nextToken(); String  s6=t.nextToken();
if(s4.equals("CTS")  &&  s5.equals(s3)  &&  s6.matches("[0-9]{4}")) b=true;
else{ b=false;} return  b;
}

}











29.remove elements  removeelements
  Sample Input 1:

5

a bb b ccc ddd 2
Sample Output 1:

4


Main
import  java.util.*;

public  class  Main

{

public  static  void  main(String[]  args)

{

Scanner  sc=new  Scanner(System.in);  int  n=Integer.parseInt(sc.nextLine()); String[]  a=new  String[n];
for(int  i=0;i<n;i++) a[i]=sc.nextLine();
int  m=Integer.parseInt(sc.nextLine()); System.out.println(UserMainCode.removeElements(a,m)); sc.close();
}

}

UserMainCode

public  class  UserMainCode  {



public  static  int  removeElements(String[]  a,int  m){

int  u=a.length;

for(int  i=0;i<a.length;i++)

{

if(a[i].length()==m) u--;
}

return  u;

}

}


30. find the difference between dates in months   getmonthdifference

Sample Input 1:

2012-03-01

2012-04-16

Sample Output 1:

1

Sample Input 2:

2011-03-01

2012-04-16

Sample Output 2:



Main


import  java.text.*;

import  java.util.*;

public  class  Main  {



public  static  void  main(String[]  args)  throws  ParseException  { Scanner  sc=new  Scanner(System.in);
String  s1=sc.next(); String  s2=sc.next();
System.out.println(UserMainCode.getMonthDifference(s1,s2)); sc.close();
}}	


UserMainCode
import  java.util.Date;

public  class  UserMainCode  {

public  static  int  getMonthDifference(String  s1,  String  s2)  throws
ParseException {

SimpleDateFormat  sdf=new  SimpleDateFormat("yyyy-MM-dd"); Date  d1=sdf.parse(s1);
Date  d2=sdf.parse(s2);

Calendar  cal=Calendar.getInstance();

cal.setTime(d1);

int  months1=cal.get(Calendar.MONTH); int  year1=cal.get(Calendar.YEAR); cal.setTime(d2);
int  months2=cal.get(Calendar.MONTH);

int  year2=cal.get(Calendar.YEAR);

int  n=((year2-year1)*12)+(months2-months1);

return  n;

}

}


31.sum of cubes and squares of elements in an array  addevenodd

Sample Input 1:

5

2

6

3

4

5



Sample Output 1:

208

Main:

import  java.util.Scanner;



public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in); int  n=sc.nextInt();
int  a[]=new  int[n]; for(int  i=0;i<n;i++){
a[i]=sc.nextInt();

}

System.out.println(UserMainCode.addEvenOdd(a)); sc.close();
}

}

UserMainCode

public  class  UserMainCode  {

public  static  int  addEvenOdd(int[]  a)  {

int  n1=0,n2=0;

for(int  i=0;i<a.length;i++) if(a[i]%2==0) n1+=(a[i]*a[i]);
else n2+=(a[i]*a[i]*a[i]); return  n1+n2;


}

}




32.ip validator:   ipvalidator


Sample Input 1:

132.145.184.210

Sample Output 1:

Valid

Sample Input 2:

132.145.184.290

Sample Output 2:

Invalid


Main

import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in);
String  ipAddress=sc.next();

boolean  b=UserMainCode.validateIpAddress(ipAddress);

if(b==true) System.out.println("Valid"); else System.out.println("Invalid"); sc.close();
}


}

UserMainCode



import  java.util.StringTokenizer;

public  class  UserMainCode {

public  static  boolean  validateIpAddress(String  ipAddress)  {

boolean  b1=false;

StringTokenizer  t=new  StringTokenizer(ipAddress,".");

int  a=Integer.parseInt(t.nextToken()); int  b=Integer.parseInt(t.nextToken()); int  c=Integer.parseInt(t.nextToken()); int  d=Integer.parseInt(t.nextToken());
if((a>=0  &&  a<=255)&&(b>=0  &&  b<=255)&&(c>=0  &&  c<=255)&&(d>=0 && d<=255))
b1=true;

return  b1;

}
}

33.difference between two dates in days   getdatedifference


Sample Input 1:

2012-03-12

2012-03-14

Sample Output 1:

2

Sample Input 2:

2012-04-25

2012-04-28

Sample Output 2:

3

Main
import  java.text.ParseException;

import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  throws  ParseException

{

Scanner  s=new  Scanner(System.in); String s1=s.nextLine();
String s2=s.nextLine();

int  output=UserMainCode.getDateDifference(s1,s2); System.out.println(output);
s.close();

}

}

UserMainCode
import  java.text.ParseException; import  java.text.SimpleDateFormat; import  java.util.*;
public  class  UserMainCode  {

public  static  int  getDateDifference(String  s1,String  s2)  throws  ParseException

{

SimpleDateFormat sd=new  SimpleDateFormat("yyyy-MM-dd"); Date d=sd.parse(s1);
Calendar  c=Calendar.getInstance(); c.setTime(d);
long  d1=c.getTimeInMillis(); d=sd.parse(s2); c.setTime(d);
long  d2=c.getTimeInMillis();

int  n=Math.abs((int)  ((d1-d2)/(1000*3600*24)));

return  n;

}

}


34.file extension     fileidentifier

Sample Input 1:

sun.gif

Sample Output 1:

Gif

Main
import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in); System.out.println("enter  the  string"); String s1=s.nextLine();
String  output=UserMainCode.fileIdentifier(s1); System.out.println(output);

s.close();

}

}

UserMainCode

public  class  UserMainCode  {

public  static  String  fileIdentifier(String  s1)

{

StringTokenizer t=new StringTokenizer(s1,"."); t.nextToken();
String s2=t.nextToken();

return  s2;

}

}


35.find common characters and unique characters in string     commonchars

Sample Input 2:

australia sri lanka
Sample Output 2:

4

Main

import  java.util.Scanner;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in); String s1=sc.nextLine();
String s2=sc.nextLine();

StringBuffer  sb1=new  StringBuffer(s1.replace("  ",""));

StringBuffer  sb2=new  StringBuffer(s2.replace("  ","")); int  output=UserMainCode.commonChars(s1,s2,sb1,sb2); System.out.println(output);
sc.close();

}

}
UserMainCode


import  java.util.*;

import  java.util.*;

public  class  UserMainCode  {

public  static  int  commonChars(String  s1,String  s2,StringBuffer  sb1,StringBuffer sb2) {

for(int  i=0;i<sb1.length();i++){

int  c=0;

for(int  j=i+1;j<sb1.length();j++){ if(sb1.charAt(i)==sb1.charAt(j)){ sb1.deleteCharAt(j);
c++;

}

}

if(c>=1){ sb1.deleteCharAt(i);
}

}

for(int  i=0;i<sb2.length();i++){

int  c=0;

for(int  j=i+1;j<sb2.length();j++){ if(sb2.charAt(i)==sb2.charAt(j)){ sb2.deleteCharAt(j);

c++;

}

}

if(c>=1){ sb2.deleteCharAt(i);
}

}

int  count=0;

for(int  i=0;i<sb1.length();i++){ for(int  j=0;j<sb2.length();j++){ if(sb1.charAt(i)==sb2.charAt(j)){ count++;
}

}

}

return  (count);

}

}

36.initial format     nameformatter

Sample Input : Jessica Miller Sample Output: Miller, J
Main
import  java.util.*;

public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String s1=s.nextLine();
String  output=UserMainCode.nameFormatter(s1); System.out.println(output);
s.close();

}

}


UserMainCode
import  java.util.*;

public  class  UserMainCode  {

public  static  String  nameFormatter(String  s1)  { StringBuffer  sb=new  StringBuffer(); StringTokenizer  st=new  StringTokenizer(s1,"  "); String s2=st.nextToken();
String s3=st.nextToken();

sb.append(s3).append(","); sb.append(s2.substring(0,1).toUpperCase()); return  sb.toString();
}

}



37.character cleaning      removecharacter

Sample Input :

elephant e
Sample Output:

Lphant

Main
import java.util.*; public class Main {
	
public static void main(String[] args) { Scanner s=new Scanner(System.in); String s1=s.nextLine();
String c=s.nextLine();

String output=UserMainCode.removeCharacter(s1,c); System.out.println(output);
}

}


UserMainCode

import  java.util.*;

public  class  UserMainCode  {

public  static  String  removeCharacter(String  s1,String  c)

{

String d=s1.replace(c,"");

return  d;

}

}



38.vowel check    getvowels

Sample Input 1: abceiduosp Sample Output 1: yes
Sample Input 2:

bceiduosp

Sample Output 2:

No

Main

import  java.util.*;

public  class  Main {

public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String s1=s.nextLine();
String s2=s1.toLowerCase();

int  output=UserMainCode.getVowels(s2);

//System.out.println(output);

if(output==1)

{

System.out.println("yes");

}

else

System.out.println("no");

s.close();

}

}



UserMainCode

import  java.util.*;

public  class  UserMainCode  {

public  static  int  getVowels(String  s2)  {

if(s2.contains("a")  &&  s2.contains("e")  &&  s2.contains("i")  &&  s2.contains("o")  && s2.contains("u") )

{

return  1;

}

else return -1;
}

}



39.swap characters   swapcharacter

Sample Input 1:

TRAINER

Sample Output 1:

RTIAENR

Sample Input 2:

TOM ANDJERRY

Sample output 2:

OT MNAJDREYR

Main
import  java.util.*;

public class Main

{

public  static  void  main(String[]  args)  {
	Scanner  s=new  Scanner(System.in);  
	String s1=s.nextLine();
}
String  output=UserMainCode.swapCharacter(s1);
System.out.println(output);
s.close();

}

}


UserMainCode

import  java.util.*;

public  class  UserMainCode  {

public  static  String  swapCharacter(String  s1)

{

StringBuffer  sb=new  StringBuffer();

int  l=s1.length();

if(l%2==0)

{

for(int  i=0;i<s1.length()-1;i=i+2)

{

char  a=s1.charAt(i); char  b=s1.charAt(i+1); sb.append(b).append(a);
}

return  sb.toString();

}

else

{

for(int  i  =  0;i<s1.length()-1;i=i+2)

{

char  a=s1.charAt(i); char  b=s1.charAt(i+1); sb.append(b).append(a);
}

sb.append(s1.charAt(l-1));

return  sb.toString();

}

}

}

40.average of elements in hashmap   avgofeven


Sample Input 1:

3

1

2.3

2

4.1

6

6.2

Sample Output 1:

5.15

Sample Input 2:

3

9

3.1

4

6.3

1

2.6

Sample Output 2:

6.3

Main
import  java.util.HashMap; import  java.util.Scanner; public  class  Main  {
public  static  void  main(String  []args){ Scanner  sc=new  Scanner(System.in);
int  s=sc.nextInt();

HashMap<Integer,Float>hm=new  HashMap<Integer,Float>();

for(int  i=0;i<s;i++)

{

int  r=sc.nextInt(); Float j=sc.nextFloat(); hm.put(r,j);
}

System.out.println(UserMainCode.display(hm)); sc.close();

}

}

UserMainCode

import  java.text.DecimalFormat;

import  java.util.*;

public  class  UserMainCode

{

public  static  String  display(HashMap<Integer,Float>hm)

{

float  sum=0;

int  count=0;

DecimalFormat  df=new  DecimalFormat("#.00"); Iterator<Integer>  it=hm.keySet().iterator(); while(it.hasNext())
{

int  y=it.next();

if(y%2==0)

{

sum=(float)  (sum+hm.get(y)); count++;
}}

float  d=sum/count;

return  df.format(d);

}

}




41.calculate average – hash map      calculateaverage

Sample Input :
4
1
3.41
2
4.1
3
1.61
4
2.5
Sample Output :
2.51




Main

import  java.util.*; import  java.text.*; public  class  Main  {
public  static  void  main(String[]  arg)
{
HashMap<Integer,Double>  hm=new  HashMap<Integer,Double>(); Scanner  sc=new  Scanner(System.in);
int  n=sc.nextInt();
for(int  i=0;i<n;i++)
{
int  a=sc.nextInt(); double  s=sc.nextDouble(); hm.put(a,s);
}
System.out.println(UserMaincode.dis(hm));
}}


UserMainCode

class  UserMaincode
{
public  static  double  dis(HashMap<Integer,Double>  h1)

{
double  avg=0.0,sum=0.0;
int k=0;
for(Map.Entry  m:h1.entrySet())
{
int  a=(Integer)m.getKey();
if(a%2!=0)
{
Double  d=(Double)  m.getValue(); sum=sum+d;
k++;
}
}
avg  =  (double)sum/k;
DecimalFormat  df  =  new  DecimalFormat(".##"); String  b1  =  df.format(avg);
double  b  =  Double.parseDouble(b1);
return b;
}
}



42.count sequential characters	               countsequentialchars


Sample Input 1:
abcXXXabc
Sample Output 1:
1
Sample Input 2: aaaxxyzAAAx Sample Output 2:
2
Main

import  java.util.*; import  java.text.*; public  class  Main  {
public  static  void  main(String[]  arg)
{
HashMap<Integer,Double>  hm=new  HashMap<Integer,Double>(); Scanner  sc=new  Scanner(System.in);
int  n=sc.nextInt();
for(int  i=0;i<n;i++)
{
int  a=sc.nextInt(); double  s=sc.nextDouble(); hm.put(a,s);
}
System.out.println(UserMaincode.dis(hm));
}}


UserMainCode

class  UserMaincode
{
public  static  double  dis(HashMap<Integer,Double>  h1)

{
double  avg=0.0,sum=0.0;
int k=0;
for(Map.Entry  m:h1.entrySet())
{
int  a=(Integer)m.getKey();
if(a%2!=0)
{
Double  d=(Double)  m.getValue(); sum=sum+d;
k++;
}
}
avg  =  (double)sum/k;
DecimalFormat  df  =  new  DecimalFormat(".##"); String  b1  =  df.format(avg);
double  b  =  Double.parseDouble(b1);
return b;
}
}




43. length of the largest chunk     largestchunk


Sample Input 1: You are toooo good Sample Output 1:
4
(Because the largest chunk is letter 'o' which is repeating 4 times) Sample Input 2:
who are u
Sample Output 2:
No chunks
Main

import  java.util.*; import  java.text.*; public  class  Main  {
public  static  void  main(String[]  arg)
{
HashMap<Integer,Double>  hm=new  HashMap<Integer,Double>(); Scanner  sc=new  Scanner(System.in);
int  n=sc.nextInt();
for(int  i=0;i<n;i++)
{
int  a=sc.nextInt(); double  s=sc.nextDouble(); hm.put(a,s);
}
System.out.println(UserMaincode.dis(hm));
}}


UserMainCode


class  UserMaincode
{
public  static  double  dis(HashMap<Integer,Double>  h1)

{
double  avg=0.0,sum=0.0;
int k=0;
for(Map.Entry  m:h1.entrySet())
{
int  a=(Integer)m.getKey();
if(a%2!=0)
{
Double  d=(Double)  m.getValue(); sum=sum+d;
k++;
}
}
avg  =  (double)sum/k;
DecimalFormat  df  =  new  DecimalFormat(".##"); String  b1  =  df.format(avg);
double  b  =  Double.parseDouble(b1);
return b;
}
}

44.unique characters in a string     uniquecounter

Input and Output Format:
Input consists a string.
Output is an getFormatedString integer.
Refer sample output for formatting specifications.
Sample Input 1: HelloWorld Sample Output 1:
5
Sample Input 2:
coco
Sample Output 2:
-1
Main:

import  java.util.*;
import  java.text.*;


public  class  Main  {

public  static  void  main(String[]  args)  throws  ParseException  { Scanner  sc  =  new  Scanner(System.in);
String  s1  =  sc.nextLine(); System.out.println(UserMaincode.uniqueCounter(s1));
}}
Usermaincode:
class  UserMaincode
{
public  static  int  uniqueCounter(String  s1)
{

StringBuffer sb = new StringBuffer(s1); for  (int  i  =  0;  i  <  sb.length();  i++)  { int  count  =  0;
for  (int  j  =  i  +  1;  j  <  sb.length();  j++)  { if  (sb.charAt(i)  ==  sb.charAt(j))  { sb.deleteCharAt(j);
j--;
count++;
}
}
if  (count  >=  1)  { sb.deleteCharAt(i); i--;
}
}
return  sb.length();
}
}

45.name shrinking   getformatedstring
Input and Output Format:
Input consists of a string. Output consists of a String.
Refer sample output for formatting specifications.
Sample Input:
Sachin Ramesh Tendulkar Sample Output: Tendulkar R.S

Main:
import  java.text.*;
import  java.util.*;

public  class  Main  {
public  static  void  main(String[]  args)  { Scanner  sc=new  Scanner(System.in);
String  s1=sc.nextLine(); System.out.println(UserMainCode.getFormatedString(s1));
}
}

UserMainCode:
class  UserMainCode
{


public  static  String  getFormatedString(String  s1)  { StringBuffer  sb=new  StringBuffer();
StringTokenizer  st=new  StringTokenizer(s1,"  "); String  s2=st.nextToken();
String  s3=st.nextToken(); String  s4=st.nextToken(); sb.append(s4).append("  "); sb.append(s3.substring(0,1)); sb.append("."); sb.append(s2.substring(0,1)); return  sb.toString();
}
}


46. odd digit sum  odddigitsum

Sample Input :
3
cog2nizant1 al33k d2t4H3r5
Sample Output :
15
(1+3+3+3+5)

Main:

import  java.util.Scanner;
public  class  Main  {
public  static  void  main(String[]  args)  { Scanner  sc  =  new  Scanner(System.in);
int  s1=sc.nextInt();
String[]  s2  =  new  String[s1]; for  (int  i  =  0;  i  <  s1;  i++)  { s2[i]  =  sc.next();
}
System.out.println(UserMainCode. oddDigitSum(s2));
}}

UserMainCode:

public  class  UserMainCode  {
public  static  int  oddDigitSum  (String[]  s1)  {
int  sum=0;
for(int  i=0;i<s1.length;i++) for(int  j=0;j<s1[i].length();j++){ char  c=s1[i].charAt(j); if(Character.isDigit(c)){ if(c%2!=0)
{
String  t=String.valueOf(c); int  n=Integer.parseInt(t); sum=sum+n; } }}
return  sum;
}
}



47. unique number     getunique

Sample Input 1:
123
Sample Output 1:
Unique
Sample Input 2:
33
Sample Output 2:
Not Unique

Main:
import  java.util.*;
import  java.text.*;

public  class  Main{
public  static  void  main(String[]args)
{int  j=0;
Scanner  sc=new  Scanner(System.in); int  n=sc.nextInt(); j=UserMainCode.getUnique(n); if(j>0)
{
System.out.println("Not  Unique");
}
else  if(j==0)
{
System.out.println("Unique");
}
}}

UserMainCode

class  UserMainCode
{
public  static  int  getUnique(int  n)
{
int  []a=new  int[100]; int  i=0,count=0; while(n!=0)
{
int num=n%10; a[i]=num; i++;
n=n/10;
}
for(int  j=0;j<=i-1;j++)
{
for(int  k=j+1;k<=i-1;k++)
{
if(a[j]==a[k]){ count++;
}
}}
return  count;
}

}




48.sum of lowest marks     getlowest

Sample Input 1:
5
1
54
2
85
3
74
4
59
5
57
Sample Output 1:
170
Sample Input 2:
4
10
56
20
58
30
87
40
54
Sample Output 2:
168
Main
import  java.util.*;

public  class  Main  {
public  static  void  main(String  args[]){ Scanner  sc  =  new  Scanner(System.in); int  n=Integer.parseInt(sc.nextLine());
HashMap<Integer,Integer>h1=new  HashMap<Integer,Integer>();
for(int  i=0;i<n;i++)
{
h1.put(sc.nextInt(),sc.nextInt());
}
System.out.println(UserMainCode.getLowest(h1));

}
}

UserMainCode

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;





class  UserMainCode  {
public  static  int  getLowest(HashMap<Integer,Integer>h1)
{
ArrayList<Integer>a1=new  ArrayList<Integer>();
int m=0;
Iterator<Integer>it=h1.keySet().iterator();
while(it.hasNext())
{
int  x=it.next(); a1.add(h1.get(x));
}
Collections.sort(a1); m=a1.get(0)+a1.get(1)+a1.get(2); return  m;
}}



49.color code validation same as 21                validatecolourcode


Sample Input 1:
#99FF33
Sample Output 1:
true
Sample Input 2:
#CCCC99#
Sample Output 2:
False

Main


import  java.util.*;
public  class  Main  {
public  static  void  main(String[]  args)  { Scanner  s=new  Scanner(System.in);  String  s1=s.next();
boolean  b=UserMainCode. validateColourCode  (s1);
if(b==true)
{
System.out.println("valid  color  code");
}
else{
System.out.println("invalid  color  code");
}}
}

UserMainCode 
class  UserMainCode{
public  static  boolean  validateColourCode  (String  s1)
{

boolean  b=false;
if(s1.length()==7&&s1.matches("#[A-F0-9]{1,}"))
{
	b=true;


}

return  b;

} 
}



50.repeating set of characters in a string   getstring

Sample Input 1:
Cognizant 3
Sample Output 1: Cognizantantantant Sample Input 2: myacademy
2
Sample Output 2:
Myacademymymy

Main
import  java.util.*;
public  class  Main  {

public  static  void  main(String[]  args)  { Scanner  s=  new  Scanner(System.in); String  input=  s.next();

int  n=s.nextInt(); System.out.println(userMainCode.getString(input,n));

}

}
userMainCode

class  userMainCode  {

public  static  String  getString(String  input,  int  n){ StringBuffer  sb=new  StringBuffer();
sb.append(input);
for  (int  i=0;i<n;i++){
sb.append(input.substring(input.length()-n,input.length()));
}
return  sb.toString();
}
}

51.finding the day of birth
Sample Input 1: 29-07-2013
 Sample Output 1: MONDAY
 Sample Input 2: 14-12-1992
 Sample Output 2: : MONDAY
Main
package level1;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String input= s.next();  
		try {
			System.out.println(userMainCode.calculateBornDay(input));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}

Usermaincode
package level1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class userMainCode {

	public static String calculateBornDay(String input)throws ParseException {
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");  
		SimpleDateFormat sdf1= new SimpleDateFormat("EEEEE");
		Date d= sdf.parse(input);  
		String s1= sdf1.format(d); 
		return s1; 
	}

}

52.removing elements from hashmap	
Sample Input 1: 4 339 RON 1010 JONS 3366 SMITH 2020 TIM Sample Output 1: 2 Sample Input 2: 5 1010 C2WE 6252 XY4E 1212 
M2ED 7070 S2M41ITH 8585 J410N Sample Output 2: 3  
Main
package afterdelete;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
			Scanner s= new Scanner(System.in); 
			HashMap<Integer, String>hm=new HashMap<Integer, String>(); 
			int n= s.nextInt();
			for(int i=0;i<n;i++){ 
				hm.put(s.nextInt(),s.next());
				}           
			System.out.println(UserMainCode.afterDelete(hm));      
		s.close();  }  
	}


Usermaincode
package afterdelete;

import java.util.HashMap;
import java.util.Iterator;

public class UserMainCode {
	public static int afterDelete(HashMap<Integer, String> hm) {
		int count=0;  
		Iterator<Integer>itr=hm.keySet().iterator(); 
		while(itr.hasNext()) 
		{  
			int n=itr.next(); 
		if(n%3!=0)   {
			count++; 
			} 
		}  
		return count;    
		}
	}
	
	
	
53.experience calculator
Sample Input 1: 11/01/2010 01/09/2014 4 Sample Output 1: true Sample Input 2: 11/06/2009 01/09/2014 4 Sample Output 2: False
 Main
package exp;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws ParseException {
		Scanner sc=new Scanner(System.in);  
		String a=sc.next();  
		String b=sc.next();  
		int c=sc.nextInt(); 
		long res=(userMainCode.calculateExperience(a,b,c));  
		if(res==c)  
		{  
			System.out.println("true"); 
			}  
		else   
			System.out.println("false");   }   
	}
Usermaincode
package exp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class userMainCode {

	public static long calculateExperience(String a, String b, int c)throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
		Date d=new Date(); 
		Date d1=new Date();  
		d=sdf.parse(a);  
		d1=sdf.parse(b);   
		long t=d.getTime(); 
		long t1=d1.getTime();  
		long t3=t1-t;  
		long l1=(24 * 60 * 60 * 1000); 
		  long l=l1*365; 
		  long res=t3/l;  
		  return res;  
		  }    
	}
54.flush characters
Sample Input : cogniz$#45Ant Sample Output : $#45
Main
package flush;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	  Scanner s= new Scanner(System.in); 
	  String input=s.nextLine(); 
	
	  System.out.println(UserMainCode.getSpecialChar(input));  
		 } 
}
Usermaincode
package flush;



public class UserMainCode {

	public static String getSpecialChar(String input) {
		input=input.replaceAll("[a-z]","");
		input=input.replaceAll("[A-Z]","");
		input=input.replaceAll(" ","");
		return input;   
		} 
	}

55.string repetition 
Sample Input 1: COGNIZANT 4 Sample Output 1: COG COG COG COG 
Sample Input 2: COGNIZANT 2 Sample Output 2: CO CO
Main
package repeatstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		System.out.println("enter a String");  
		String input= s.next();   
		int n= s.nextInt(); 
		System.out.println(UserMainCode.repeatString(input, n)); 
	}

}
Usermaincode
package repeatstring;

public class UserMainCode {

	public static String repeatString(String input, int n) {
		StringBuffer sb= new StringBuffer(); 
		String s1= new String(); 
		if (n==1)
		{    
			s1=input.substring(0,1);   
			sb.append(s1).append(" "); 
			}
		if(n==2){   
 s1=input.substring(0,2);   
		for(int i=0;i<n;i++)  
			sb.append(s1).append(" ");  
		}   if(n>=3){ 
			   s1=input.substring(0,3);  
			   for(int i=0;i<n;i++)   
				   sb.append(s1).append(" "); 
			   }   
		return sb.toString(); 
			   }
	}
56.average of prime locations
Sample Input 1: 8 4 1 7 6 5 8 6 9 Sample Output 1: 7.5  
Main
package averageofprimelocations;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);


		int []a=new int[20];
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		                a[i]=sc.nextInt();
		}

		System.out.print(UserMainCode.display(n,a));
		


	}

}
UserMainCode
package averageofprimelocations;

import java.text.DecimalFormat;

public class UserMainCode {

	public static double display(int n, int[] a) {
		int count=0,sum=0,n1=0,d=0,count1=0;
		double avg=0;

		for(int i=2;i<n;i++)
		{
		count=0;
		for(int j=1;j<=i;j++)
		{
		if(i%j==0)
		{
		count++;
		}
		}
		if(count==2)
		{
		sum=sum+a[i];
		count1++;
		}
		}
		 avg=(double)(sum)/count1;
		 DecimalFormat df=new DecimalFormat("#.00");
		double ddd=Double.parseDouble(df.format(avg));
		return ddd;
		}}

57.common elements
Sample Input 1:   4  1  2  3  4  2 
 3  6  7  Sample Output 1:  5  
Main
package commonele;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in); 
		int n = s.nextInt(); 
		int a[] = new int[n]; 
		int b[] = new int[n]; 
		for(int i=0;i<n;i++) 
		{ a[i] = s.nextInt(); } 
		for(int i=0;i<n;i++) {
			b[i] = s.nextInt(); }
		System.out.println(UserMainCode.sumCommonElements(a, b)); 
	}

}
Usermaincode
package commonele;

public class UserMainCode {

	public static int sumCommonElements(int[] a, int[] b) {
		int sum = 0 ; 
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
		{
				if(a[i]==b[j]) 
			sum = sum + a[i];} }
		if(sum==0) 
			return -1;
		else
			return sum; }
	} 
	
	
58. middle of array     
Sample Input 1:  5  1  5  23  64  9  Sample Output 1:  23  
Main
package middlearray;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
         int n = s.nextInt(); 
         int[] a = new int[n]; 
         for(int i=0;i<n;i++){ 
                a[i] = s.nextInt(); 
         } 
         System.out.println(UserMainCode.getMiddleElement(a)); 
  } 

	}
Usermaincode
package middlearray;

public class UserMainCode {

	public static int getMiddleElement(int[] a) {
		int n = a.length; 
        return a[n/2]; 
 } 
}



59. simple string manipulation	
Sample Input 1:  hello  Sample Output 1:  llo  
Sample Input 2:  java  Sample Output 2:  Jva   
Main
package stringmanipulation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
	      String s1 = s.next();  
	      System.out.println(UserMainCode.getString(s1)); 
	}

}
Usermaincode
package stringmanipulation;

public class UserMainCode {

	public static String getString(String s1) {
		 StringBuffer sb=new StringBuffer(); 
         char a=s1.charAt(0); 
         char b=s1.charAt(1); 
         if(a!='j'&& b!='b') 
         sb.append(s1.substring(2)); 
         else if(a=='j' && b!='b') 
         sb.append("j").append(s1.substring(2)); 
         else if(a!='j' && b=='b') 
         sb.append(s1.substring(1)); 
         else 
         sb.append(s1.substring(0)); 
         return sb.toString(); 

	}

}
60. date validation
Sample Input 1:  03.12.2013  Sample Output 1:  valid    
Sample Input 2:  03$12$2013  Sample Output 2:  Invalid
Main
package datevalidation;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 String s= sc.next(); 
		     int b = UserMainCode.getvalues(s); 
		     if(b==1) 
		        System.out.println("Valid"); 
		     else 
		        System.out.println("Invalid"); 

	}

}
Usermaincode
package datevalidation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {

	public static int getvalues(String s) {
		 if(s.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}")) 
         { 
         SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy"); 
         sdf.setLenient(false); 
         try 
         { 
         Date d1=sdf.parse(s); 
         return 1; 
         } catch (ParseException e) { 
         return -1; 
         } 
         } 
         else if(s.matches("[0-9]{2}[/]{1}[0-9]{2}[/][0-9]{4}")) 
         { 
         SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
         sdf.setLenient(false); 
         try 
         { 
         Date d1=sdf.parse(s); 
         return 1; 
         } catch (ParseException e) { 
         return -1; 
         } 
         } 
         else if(s.matches("[0-9]{2}[-]{1}[0-9]{2}[-][0-9]{4}")) 
         { 
         SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy"); 
         sdf.setLenient(false); 
         try 
         { 
         Date d1=sdf.parse(s); 
         return 1; 
         } catch (ParseException e) { 
         return -1; 
         } 
         } 
         else 
         return -1; 
         } 
}  

61. boundary average
Sample Input : 6 
3 6 9 4 2 5 Sample Output:  5.5   
Main
package boundaryavg;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int s = sc.nextInt(); 
		int a[] = new int[s]; 
		for (int i = 0; i < s; i++) 
		a[i] = sc.nextInt(); 
		System.out.println(UserMainCode.getBoundaryAverage(a)); 
		} 
		
	}
Usermaincode
package boundaryavg;

import java.util.Arrays;

public class UserMainCode {

	public static float getBoundaryAverage(int[] a) {
		 Arrays.sort(a); 
         int sum = a[0] + a[a.length - 1]; 
         float avg = (float) sum / 2; 
         return avg; 

	}

}
62. count vowels   
Sample Input:  avinash    Sample Output:  3  
Main
package countvowels;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		Scanner s = new Scanner(System.in); 
	String s1= s.next(); 
	System.out.println(UserMainCode.countVowels(s1)); 

}
UserMainCode
package countvowels;

public class UserMainCode {

	public static int countVowels(String s1) {
		String s2=s1.toLowerCase();
		String s3="aeiou";
		int count=0;
		for(int i=0;i<s2.length();i++)
		{ 
			for(int j=0;j<s3.length();j++) 
		{ 
				if(s2.charAt(i)==s3.charAt(j))
				{ 
					count++;
					} } } 
		return count; 
		} 
	} 
	
63. month name
Sample Input:  01-06-82    Sample Output:  JUNE
Main
package monthname;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws ParseException {
		Scanner sc=new Scanner(System.in); 
		String s1=sc.nextLine(); 
		System.out.println(UserMainCode.calculateBornDay(s1)); 
		sc.close(); 
	}

}
UserMainCode
package monthname;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {

	public static String calculateBornDay(String s1) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yy"); 
		SimpleDateFormat sdf1=new SimpleDateFormat("MMMM");
		Date d=sdf.parse(s1);
		String s=sdf1.format(d);
		return s; 
	}

}

64. reverse substring
Sample Input:  rajasthan  
2  3    Sample Output: hts
Main
package reversesubstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);    String input1= s.next(); 
		 int input2=s.nextInt();
		 int input3=s.nextInt(); 
		System.out.println(UserMainCode.retrieveString(input1,input2,input3)); 
	}

}
Usermaincode
package reversesubstring;

public class UserMainCode {

	public static String retrieveString(String input1, int input2, int input3) {
		StringBuffer sb=new StringBuffer(input1); 
		sb.reverse(); 
		String output=sb.substring(input2, input2+input3); 
		return output.toString();
	}

}
65. string finder
Sample Input 1:                                 Sample Output 1: geniousRajKumarDev                         Yes Raj Dev   
Sample Input 2:                                 Sample Output 2: geniousRajKumarDev                         No Dev Raj
Main
package stringfinder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);       
		 String s1=s.next();         
		 String s2=s.next();   
		 String s3=s.next();       
		 int b=UserMainCode.stringFinder(s1, s2, s3);
		 if(b==1) {         
			 System.out.println("yes"); } else           
			 System.out.println("No"); s.close();   
			 } 
	
	}


UserMainCode
package stringfinder;

public class UserMainCode {

	public static int stringFinder(String s1, String s2, String s3) {
		String a1=s1.toLowerCase();          
		String a2=s2.toLowerCase();     
		String a3=s3.toLowerCase();       
		if(a1.contains(a2)&&a1.contains(a3))  
		{                  
			if(a1.indexOf(a2)<a1.indexOf(a3))    
			{                                    
				return 1;                   
				}              
			else              
				return 2;          
			}          
		return 0; 
	}

}
66. phone number validator
Sample Input 1:                                             Sample Output 1: 265-265-7777                                                  Valid 
Sample Input 2:                                             Sample Output 2: 265-65-7777                                                    Invalid
Main
package phoevalidator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in); 
         String s1=s.nextLine(); 
         int b=UserMainCode.validatePhoneNumber(s1); 
if(b==1) 
{ 
System.out.println("Valid"); 
} 
else 
System.out.println("Invalid"); 
s.close(); 
} 
	}

UserMainCode
package phoevalidator;

public class UserMainCode {

	public static int validatePhoneNumber(String s1) {
		String s2 = s1.replaceAll("-", ""); 
		if (s2.matches("[0-9]{10}")) 
		           { 
		                        return 1; 
		                                    } 
		            else 
		                        return 2; 
		} 
		
		
	}

67. month number of days
Sample Input: 2000 1                                                Sample Output:   29

Main

package monthnoofdays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int y=s.nextInt(); 
		int c=s.nextInt();
		System.out.println(UserMainCode.getNumberOfDays(y, c));
		s.close();
	}

}
UserMainCode
package monthnoofdays;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode {

	public static int getNumberOfDays(int y, int c) {
		Date d=new Date();
		SimpleDateFormat adf=new SimpleDateFormat("EEEEE");
		Calendar cal=Calendar.getInstance();         
		cal.set(Calendar.YEAR, y);         
		cal.set(Calendar.MONTH, c);          
		int day=cal.getActualMaximum(Calendar.DAY_OF_MONTH); 
		return day; 
	}

}
68. negative string
Sample Input 1:              This just a misconception                     Sample Output 1:              This is not just a misconception 
Sample Input 2:    Today is misty                                                            Sample Output 2:      Today is not misty   
Main
package negativestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);  
		String s1=s.nextLine();        
		System.out.println(UserMainCode.negativeString(s1));  
		s.close(); 
	}

}
UserMainCode
package negativestring;

public class UserMainCode {

	public static String negativeString(String s1) {
		 String str=s1.replace(" is ", " is not ");     
		 return str; 
	}

}
69. validate number
Sample Input 1: -94923                                                                             Sample Output 1: 94923 
Sample Input 2: -6t                                                                                Sample Output 2: -1
Main
package validatenumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);           
		String s1=s.next();           
		System.out.println(UserMainCode.validateNumber(s1));  
		s.close(); 
	}

}
UserMainCode
package negativestring;

public class UserMainCode {

	public static String validatenumber(String s1) {
		 String ss="-1";         
		 if (s1.matches("[-]{1}[0-9]{1,}")) 
		 {                    
			 String st=s1.replace("-","");   
			 return st;             }   
		 else           
			 return ss;         
		 }
	} 
}
70. digits
Sample Input 1: 717                                 Sample Output 1:     2                                                 Sample Input 2:   4534                               Sample Output 2:        0
Main
package digits;

import java.util.Scanner;

public class Main {
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();               
		System.out.println(UserMainCode.validateNumber(s1)); 
		s.close(); 
	}

}
UserMaincode
package digits;

public class UserMainCode {

	public static int validateNumber(String s1) {
		s1=s1.replaceAll("[^7]", "");
		
	  int s4=   s1.length();
		return s4;
		

}
}
71. string processing – iii (lowercase x)
Sample Input 1: hixxxx                                Sample Output 1: xxhixx                                                  Sample Input 2: XXxxtest                                Sample Output 2: XXtestxx      
Main
package movelcasex;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);             
		  String s1=s.next();                      
		  System.out.println(UserMainCode.moveX(s1));   
		  s.close(); 
	}

}
 UserMainCode
package movelcasex;

public class UserMainCode {

	public static String moveX(String s1) {
		String S2="";
		String S3="";
		for (int i = 0; i < s1.length(); i++) {
			char c=s1.charAt(i);
			if(c=='x') {
				S2=S2+s1.charAt(i);
			}
			else
				S3=S3+s1.charAt(i);
		}
		String s4=S3.concat(S2);
		return s4;
	}

}

72. string processing – iv 
Sample Input 1:                                 Sample Output 1: 
HelloWorld                                          HelWrd 
Main
package getusingnthstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int n=sc.nextInt();
System.out.println(UserMainCode.getStringUsingNthCharacter (s1,n));
	}

}
UserMainCode
package getusingnthstring;

public class UserMainCode {

	public static String getStringUsingNthCharacter(String s1, int n) {
		StringBuffer sb=new StringBuffer();
		String s2=s1.replaceAll(" ","");

		sb.append(s2.charAt(0));
		
		for(int i=n-1;i<s2.length();i=i+n)
		{
			sb.append(s2.charAt(i));
		}
		
		return sb.toString();
		}
		

	}



73. digit comparison
Sample Input 1: 59 29 
Sample Output 1: TRUE   
Main
package digitcomparison;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		boolean res=UserMainCode.compareLastDigit(n1,n2);      
		if(res==true)       
		{          
			System.out.println("TRUE");   
			}              
		else    
		{         
			System.out.println("FALSE");     
			}      
		input.close();  
		}  
	} 
UserMainCode
package digitcomparison;

public class UserMainCode {

	public static boolean compareLastDigit(int n1, int n2) {
		 int c1=n1%10; 
		 int d1=n2%10;        
		 boolean b=false; 
		 if(c1==d1)  
			
		 {        b=true;   
		 }        return b;
		 }
	} 
74. duplicates
Sample Input 1: 1 2 1 Sample Output 1: 2 Sample Input 2: 1 2 3 Sample Output 2: 6
Main
package duplicates;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		int sum=(UserMainCode.getDistinctSum(n1,n2,n3));
		System.out.println(sum);

	}

}
 UserMainCode
package duplicates;

public class UserMainCode {

	public static int getDistinctSum(int n1, int n2, int n3) {
		int sum=0;
		if(n1==n2) {
			sum=n3;
		}
		else  if(n2==n3){
			sum=n1;
		}
		else if(n3==n1) {
			sum=n2;
		}
		else
			sum=n1+n2+n3;
		return sum;
	}

}
75. string processing – mixmania
Sample Input 1: Mix Mania Sample Output 1: TRUE
Main
package mixmania;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);   
		  String str=s.nextLine();             
		  boolean b2=UserMainCode.checkPattern(str); 
		  if(b2==true)         
		  {               
			  System.out.println("TRUE");      
			  }               
		  else              
		  {                      System.out.println("FALSE"); 
		  } 
		  s.close();       
		  }  
	} 
	
UserMainCode
package mixmania;

public class UserMainCode {

	public static boolean checkPattern(String str) {
		 String str1=str.substring(0,3);
		 int a=0,b=0,c=0;       
		 char c1=str1.charAt(0);   
		 char c2=str1.charAt(1);       
		 char c3=str1.charAt(2);       
		 boolean b1=false;        
		 if(Character.isDigit(c1)||Character.isLetter(c1))   
		 {             
			 a=1;      
			 }     
		 if(c2=='i')     
		 {            
			 b=1;      
			 }          
		 if(c3=='x')         
		 {                  
			 c=1;            
			 }           
		 if(a==1&&b==1&&c==1) 
		 {              
			 b1=true; 
	       }        return b1;       
	}

}
76. string processing(exchange characters)
Sample Input 1: HelloWorld Sample Output 1: delloWorlH
Main
package exchangechar;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {   
		 Scanner s=new Scanner(System.in);     
		 String s1=s.next();               
		 System.out.println(UserMainCode.exchangeCharacters(s1)); 
	 s.close();             
	 }
}
UserMaincode
package exchangechar;

public class UserMainCode {
	
	public static String exchangeCharacters(String s1) {
		String s2=s1.substring(1,s1.length()-1);       
		StringBuffer sb=new StringBuffer();    
		char c1=s1.charAt(0);    
		char c2=s1.charAt(s1.length()-1);
		sb.append(c2).append(s2).append(c1);   
		return sb.toString(); }
}
77. regular expression – ii
Sample Input 1: AcB Sample Output 1: TRUE
 Sample Input 2: A2B Sample Output 2: FALSE
Main
package validatestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);    
		 String s1=s.next();       
		 boolean b1=userMainCode.validateString(s1);     
		 if(b1==true)     
		 {       
			 System.out.println("TRUE");      
			 }      
		 else      
		 {       
			 System.out.println("FALSE");    
		 }         s.close();     
		 }   
	} 
UserMainCode
package validatestring;

public class userMainCode {

	public static boolean validateString(String s1) {
		  boolean b=false;           
		  if(s1.length()==3)         
		  {            
			  if(s1.matches("[a-zA-z]{3}"))     
			  {                    
				  b=true; 
				
          }                
			  }             
		  return b;     
		  }  
	}
78. strings processing – replication
Sample Input 1: Lily 2 Sample Output 1: LilyLily
Main
package replication;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		int n=input.nextInt();
		System.out.println(UserMainCode.repeatString(s1,n));
	}

}
UserMainCode
package replication;

public class UserMainCode {

	public static String repeatString(String s1, int n) {
		StringBuffer sb=new StringBuffer();
		for (int i = 0; i <n; i++) {
			sb.append(s1);
			
		}
		return sb.toString();
	}

}
79. sumodd
Sample Input 1: 6 Sample Output 1: 9
Main
package sumodd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		System.out.println(UserMainCode.addoddNumbers(n));

	}

}
UserMainCode
package sumodd;

public class UserMainCode {

	public static int addoddNumbers(int n) {
		int sum=0;
		for(int i=1;i<=n;i+=2) {
			sum=sum+i;
		}
		return sum;
	}

}
80. string processing – v
Sample Input 1: 3 AAA BBB CCC Sample Output 1: AAA,BBB,CCC
Main
package concatstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int n=s.nextInt(); 
		String s1[]=new String[n];
		for(int i=0;i<n;i++) 
		{        s1[i]=s.next();
		} 
		System.out.println(UserMainCode.concatString(n,s1));
	}

}
UserMainCode
package concatstring;

public class UserMainCode {

	public static String concatString(int n, String[] s1) {
		 StringBuffer sb=new StringBuffer();   
		 for(int i=0;i<s1.length;i++)        
		 {                 
			 sb.append(s1[i]).append(",");    
			 }            
		 String s2=sb.toString();
		 String s3=s2.substring(0,s2.length()-1);  
		 return s3;        
	}

}
81.unique number
Sample Input 1: 12 4 3 Sample Output 1: 3 
Sample Input 2: 4 -4 4 Sample Output 2: 2
Main
package uniqueNumber;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		System.out.println(UserMainCode.calculateUnique(a,b,c));
	}

}
UserMainCode
package uniqueNumber;


public class UserMainCode {

	public static int calculateUnique(int a, int b, int c) {
		int d=0;       
		if(a!=b&&a!=c&&b!=c)  
		{      
			d=3; 
			}      
		else if(a==b&&a==c&&b==c)      
		{       
			d=1;    
			}     
		else if((a!=b&&a==c&&b==c) || (a!=b&&a!=c&&b==c))  
		{        d=2;   
		}       
		else if((a==b&&a!=c&&b==c) || (a==b&&a!=c&&b!=c))     
		{     
			d=2;  
			}
		else if((a==b&&a==c&&b!=c) || (a!=b&&a==c&&b!=c)) 
		{          
			d=2;
			} 
		return d; 
		
		}

}
82. math calculator
Sample Input 1: 23 2 * 
Sample Output 1: 46
Main
package mathcalculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);              
		  int a=s.nextInt();             
		  int b=s.nextInt();               
		  char c = s.next().trim().charAt(0);   
		  System.out.println(UserMainCode.calculator(a, b, c));       
		  s.close(); 
	}

}
UserMainCode
package mathcalculator;

public class UserMainCode {

	public static int calculator(int a, int b, char c) {
		 int a1=0;   
	       if(c=='*') 
	       {      
		   a1=a*b;    
		   }       
	       else if(c=='+')  
	       {     
		   a1=a+b; 
		   }        
	       else if(c=='-')  
	       {        a1=a-b;  
	       }   
	       else if(c=='/')   
	       {        
		   a1=a/b;  
		   }    
	       else if(c=='%') 
	       {      
		   a1=a%b; 
		   }       
	       return a1;   
	}

}
83. scores
Sample Input 1: 3 1 100 100 Sample Output 1: TRUE
Sample Input 2: 3 100 1 100 Sample Output 2: FALSE 
  Main
package scores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    
		int n = sc.nextInt();      
		int[] arr = new int[n];      
		for(int i=0;i<n;i++)
		{       
			arr[i] = sc.nextInt();  
			}        
		System.out.println(UserMainCode.checkScores(arr, n)); 
		sc.close();    
		} 
	}
UserMainCode
package scores;

public class UserMainCode {

	

	public static boolean checkScores(int[] arr, int n) {
		 boolean b = false;      
		 for(int i=0;i<n-1;i++)
		 {               
			 if(arr[i] == 100)
			 {           
				 if(arr[i+1] == 100)
				 {         
					 b = true;   
					 break;    
					 }         
				 } 
		 }        
		 return b;              
	}

}

84. arrayfront
Sample Input 1: 6 1 2 3 4 5 6 Sample Output 1: FALSE 
Sample Input 2: 3 1 2 9 Sample Output 2: TRUE 
Main:
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
        int s=sc.nextInt(); 
        int []a=new int[s]; 
        for(int i=0;i<s;i++) 
        { 
        a[i]=sc.nextInt(); 
        } 
if(UserMainCode.scanArray(a)==true)  
System.out.println("TRUE"); 
        else  
System.out.println("FALSE"); 
        sc.close(); 

	}

}
UserMainCode
package arrayfont;

public class UserMainCode {

	public static boolean scanArray(int[] a) {
		 int u=0,l=0;    
		 boolean b=false;   
		 if(a.length>=4)      
			 l=4;       
		 else      
			 l=a.length;  
		 for(int i=0;i<l;i++) 
			 if(a[i]==9)        
				 u=10;       
		 if(u==10)       
			 b=true;     
		 return b;       

	}

}
85. word count
Sample Input 1: 4 a bb b ccc 1 Sample Output 1: 2
Sample Input 2: 5 dog cat monkey bear fox 3 Sample Output 2: 3 
Main
package wordcount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);              
		int n=sc.nextInt();  
		String[] str=new String[n];  
		for(int i=0;i<n;i++)          
		{                     
			str[i]=sc.next();     
			}              
		int c=sc.nextInt();     
		System.out.println(UserMainCode.countWord(n,str,c)); 
		sc.close();   

	}

}
UserMainCode
package wordcount;

public class UserMainCode {

	public static int countWord(int n, String[] str, int c) {
		 int count=0; 
		 for(int i=0;i<str.length;i++)    
		 {        
			 if(str[i].length()==c)      
			 {      
			 count++;   
			 }       
			 }       
		 return count;        
	}

}
86. find distance
Sample Input 1: 3 4 5 2 Sample Output 1: 3 
Sample Input 2: 3 1 5 2 Sample Output 2: 2   
Main
package finddistance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in); 
		 int a=s.nextInt();       
		 int b=s.nextInt();        
		 int c=s.nextInt();       
		 int d=s.nextInt(); System.out.println(UserMainCode.findDistance(a,b,c,d));
		 s.close();

	}

}
UserMainCode
package finddistance;

public class UserMainCode {

	public static int findDistance(int a, int b, int c, int d) {
		long q=(int)Math.round(Math.sqrt(((a-c)*(a-c))+((b-d)*(b-d))));    
		return (int) q;    
		
	}

}
87. word count – ii
Sample Input 1: Today is Sunday Sample Output 1: 3
Main
package wordcount2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);  
		 String s1=s.nextLine();    
		 System.out.println(UserMainCode.countWord(s1));   
		 s.close(); 

	}

}
UserMainCode
package wordcount2;

import java.util.StringTokenizer;

public class UserMainCode {

	public static int countWord(String s1) {
		 StringTokenizer st=new StringTokenizer(s1," "); 
		 int n=st.countTokens();  
		
		return n; 
	}

}
88. sum of max & min
Sample Input 1: 12 17 19 Sample Output 1: 31  
Main
package sumofmaxmin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);              
		int a=s.nextInt();             
		int b=s.nextInt();  
		int c=s.nextInt();          
		System.out.println(UserMainCode.getSumMaxMin(a,b,c));   
		s.close(); 
	}

}
UserMainCode
package sumofmaxmin;

public class UserMainCode {

	public static int getSumMaxMin(int a, int b, int c) {
		int d=0;        
		if(a<b&&b<c)    
		{      
			d=a+c;      
		}     
		else if(a<b&&b>c)       
		{        
			d=b+c;  
			}        
		else if(a>b&&b<c)  
		{    
			d=a+b;     
			}       
		return d; 
	}

}
89. decimal to binary conversion
Sample Input 1: 5 Sample Output 1: 101
Main
package deci2binaryconv;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(); 
		System.out.println(UserMainCode.convertDecimalToBinary(n)); 
		s.close(); 
	}

}
UserMainCode
package deci2binaryconv;

public class UserMainCode {

	public static long convertDecimalToBinary(int n) {
		 String s1=Integer.toBinaryString(n);   
		 long y=Long.parseLong(s1);
		return y; 
	}

}
90.string processing – v
Sample Input 1: Hello 2 Sample Output 1: lolo
 Sample Input 2: Hello 3 Sample Output 2: Llollollo
Main
package lastrepeatedchar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine(); int n1=s.nextInt(); 
		System.out.println(UserMainCode.returnLastRepeatedCharacters(s1,n1));
		s.close();

	}

}
UserMainCode
package lastrepeatedchar;

public class UserMainCode {

	public static String returnLastRepeatedCharacters(String s1, int n1) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0 ; i < n1 ; i++) 
			sb.append(s1.substring(s1.length()-n1, s1.length())); 
		return sb.toString(); 
	}

}
91.regular expression – iii
Sample Input 1: ab2 Sample Output 1: TRUE   
Sample Input 2: 72CAB Sample Output 2: FALSE
Main
package firstnotnum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in); 
	       String s1=s.nextLine(); 
	       if(UserMainCode.validateString(s1)==true) System.out.println("TRUE"); 
	       else System.out.println("FALSE"); 
	       s.close(); 
	
	}

}
UserMainCode
package firstnotnum;

public class UserMainCode {

	public static boolean validateString(String s1) {
		 boolean b=false;    
		 if(s1.charAt(0)=='0'||s1.charAt(0)=='1'||s1.charAt(0)=='2'||s1.charAt(0)=='3'
				 || s1.charAt(0)=='4'||s1.charAt(0)=='5'||s1.charAt(0)=='6'||s1.charAt(0)=='7'
				 ||s1.charAt(0 )=='8'||s1.charAt(0)=='9'){                             
			 b=false;             
			 }         
		 else           
			 b=true;     
		 return b;   
	}

}
92.string processing – trimcat
Sample Input 1: Hello Sample Output 1: Hlo  
Main
package trimcat;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		String s1=s.nextLine(); 
		System.out.println(UserMainCode.getAlternateChars(s1)); 
		s.close(); 
	}

}
UserMainCode
package trimcat;

public class UserMainCode {

	public static String getAlternateChars(String s1) {
		StringBuffer sbf = new StringBuffer(); 
		for(int i = 0; i < s1.length() ; i=i+2) 
		{ sbf.append(s1.charAt(i)); 
		} 
		String str = sbf.toString(); 
		return str; 
	}

}
93. string processing – username
Sample Input 1: admin@xyz.com Sample Output 1: admin
Main
package username;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); String s1=s.nextLine(); 
		System.out.println(UserMainCode.fetchUserName(s1));
		s.close(); 
	}

}
UserMainCode
package username;

import java.util.StringTokenizer;

public class UserMainCode {

	public static String fetchUserName(String s1) {
		 StringTokenizer st=new StringTokenizer(s1,"@");             
		 String s2=st.nextToken();      
		 return(s2); 
	}
	

}
94. string processing – vii
Sample Input 1: AAAA abab 2 Sample Output 1: TRUE 
Sample Input 2:  MNOP QRST 3 Sample Output 2: FALSE 
Main
package isequalstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		String s1=s.nextLine(); 
		String s2=s.nextLine(); 
		int n=s.nextInt(); 
		boolean output=UserMainCode.isEqual(s1,s2,n); 
		System.out.println(output); 
		s.close(); 
	}

}
UserMainCode
package isequalstring;

public class UserMainCode {

	public static boolean isEqual(String s1, String s2, int n) {
		
		
			boolean a=false;  
			if(n<s1.length()&&n<s2.length()) 
			{ 
			char c=s1.charAt(n);   
			char d=s2.charAt(s2.length()-n); 
			String s3=Character.toString(c);  
			
			String s4=Character.toString(d); 
			
			if(s3.equalsIgnoreCase(s4)) 
			{ 
			a=true;    
			} 
			else 
			{  
			a=false; 
			} 
			} 
			return a; 
			}  

}
95. largest difference
Sample Input 1: 7 2 4 5 1 9 3 8 Sample Output 1: 4
Main
package largestdiff;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int m=s.nextInt();        
		int[] n1=new int[m];      
		for(int i=0;i<m;i++){        
			n1[i]=s.nextInt();      
		}
		System.out.println(UserMainCode.checkDifference(n1)); s.close();
	}

}
UserMainCode
package largestdiff;

public class UserMainCode {

	public static int checkDifference(int[] n1) {
		int n2,n3=0,n4=0,i; for(i=0;i<n1.length-1;i++)
		{
			n2=Math.abs(n1[i]-n1[i+1]);
			if(n2>n3){ n3=n2; n4=i+1; 
			}
			} 
		return n4; 
	}

}
LEVEL 2
1.start case
Sample Input:
Now is the time to act!
Sample Output:
Now Is The Time To Act!

MAIN CLASS:
import java.util.Scanner;

public class Startcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in); 
		String  s1=s.nextLine();
		System.out.println(UserMainCode.printCapitalized(s1));
		s.close();


	}

}
USER MAIN CODE:
import java.util.StringTokenizer;

import level2.UserMainCode;
import level2.userMainCode;

// TODO Auto-generated method stub
		StringBuffer  sb=new  StringBuffer();
		StringTokenizer  t=new  StringTokenizer(s1,"  ");
		while(t.hasMoreTokens())
		{ String  s2=t.nextToken();
		String  s3=s2.substring(0,1);
		String  s4=s2.substring(1,  s2.length()); sb.append(s3.toUpperCase()).append(s4).append("  "); 
		}
		return  sb.toString();

		
		
		}

}
2.maximum difference
Sample Input :
6
4
8
6
1
9
4
Sample Output :
4
 Main class:
public class Maxdiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		int  n=s.nextInt(); 
		int  a[]=new  int[20]; for(int  i=0;i<n;i++)
		{
		a[i]=s.nextInt();
		}
		int  max=UserMainCode.findMaxDistance(a);
		System.out.println(max);
		s.close();



	}
}
User main code:

import java.util.StringTokenizer;

public class UserMainCode {
	static  int  findMaxDistance(int[]  a)
	{

	int  max=0,index=0;
	for(int  i=0;i<19;i++)
	{
	int  d=Math.abs(a[i]-a[i+1]);
	if(d>max)
	{
	max=d;
	if(a[i]>a[i+1])
	{
	index=i;
	}
	else
	{
	index=i+1;
	}
	}
	}
	return index;

	}
	}
3.palindrome-in range
Sample Input :
130
150
Sample Output :
272
(131+141 = 272)
Main class:

import java.util.Scanner;

public class Palinrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in); 
		int n1=s.nextInt();
		int n2=s.nextInt(); 
		System.out.println(UserMainCode.addPalindromes(n1,n2)); 
		s.close();


	}

}

User main code:


import java.util.StringTokenizer;

public class UserMainCode {


	public static int addPalindromes(int n1, int n2) {
		// TODO Auto-generated method stub
		int  sum=0;
		for(int  i=n1;i<=n2;i++){ int  r=0,n3=i; while(n3!=0){ r=(r*10)+(n3%10);
		n3=n3/10;
		}
		if(r==i) sum=sum+i;
		}
		return  sum;
		}
		}
4.pan card
Sample Input 1:
ALD3245E
Sample Output 1:
Valid
Sample Input 2:
OLE124F
Sample Output 2:
Invalid


Main class:
import java.util.Scanner;

public class Pancard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in); 
		String  s1=s.nextLine();
		UserMainCode.validatePAN(s1); 
		s.close();


	}

}
User main code:
import java.util.StringTokenizer;

public class UserMainCode {




	public static void validatePAN(String s1) {
		// TODO Auto-generated method stub
		if(s1.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
		{
		System.out.println("Valid");
		}
		else
		System.out.println("Invalid");
		}
		}
5.fibonacci sum
Sample Input :
5
Sample Output :
7
[0 + 1 + 1 + 2 + 3 = 7]



Main class:

import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in);
		int  n=s.nextInt();
		System.out.println(UserMainCode.getSumOfNfibos(n)); 
		s.close();

	}

}
User main code:

import java.util.StringTokenizer;

public class UserMainCode {

public static int getSumOfNfibos(int n) {
		// TODO Auto-generated method stub
	int  a=-1,b=1,c=0,d=0;
	for(int  i=0;i<n;i++)
	{
	c=a+b; d=d+c; a=b; b=c;
	}
	return d;
	}

	
		}
6.test vowels
Sample Input 1:
acbisouzze
Sample Output 1:
Yes

Sample Input 2:
cbisouzze
Sample Output 2:
No
Main class:
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in); 
		String  s1=s.nextLine();
		int  b=UserMainCode.testVowels(s1); 
		if(b==1) 
			System.out.println("Yes");
		else
		System.out.println("No"); 
s.close();


	}

}
User main class:
import java.util.StringTokenizer;

public class UserMainCode {



public static int testVowels(String s1) {
	// TODO Auto-generated method stub
	int  b;
	int  n1=0,n2=0,n3=0,n4=0,n5=0;
	String  s2=s1.toLowerCase(); for(int  i=0;i<s2.length();i++){ char  c=s2.charAt(i);  if(c=='a')
	n1++;
	if(c=='e') n2++;
	if(c=='i') n3++;
	if(c=='o') n4++;
	if(c=='u') n5++;}
	if(n1==1&&n2==1&n3==1&&n4==1&&n5==1) b=1;
	else  b=2;
	return  b;
	}


7.dash check
Sample Input 1:
Hi--there-you 12--(134)-753
Sample Output 1:
Yes
Sample Input 2:
-15-389
-xyw-zzy
Sample Output 2:
No

Main class:
import java.util.Scanner;

public class Dash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in); String  s1=s.nextLine();
		String  s2=s.nextLine();
		int  p=UserMainCode.compareDashes(s1,s2);
		if(p==1) System.out.println("Yes"); else
		System.out.println("No"); s.close();

	}

}
User main code:

import java.util.ArrayList;
import java.util.StringTokenizer;

public class UserMainCode {

	public static int compareDashes(String s1, String s2) {
		// TODO Auto-generated method stub
		ArrayList<Integer>l1=new  ArrayList<Integer>();
		for(int  i=0;i<s1.length();i++)
		{
		if(s1.charAt(i)=='-')
		{
		l1.add(i);
		}
		}
		ArrayList<Integer>l2=new  ArrayList<Integer>();
		for(int  i=0;i<s2.length();i++)
		{
		if(s2.charAt(i)=='-')
		{
		l2.add(i);
		}
		}
		if(l1.equals(l2))
		
		{
		return 1;
		}
		else
		return 2;
		}
		}


8.reverse split
Sample Input:
Rabbit
-
Sample Output:
t-i-b-b-a-R
Main class:

import java.util.Scanner;

public class Reversesplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s=new  Scanner(System.in); 
		String  s1=s.nextLine();
		String  s2=s.next(); 
		System.out.println(UserMainCode.reShape(s1,s2)); 
		s.close();

	}

}
User main code:


public class UserMainCode {
	public  static  String  reShape(String  s,String  s1){ 
	StringBuffer  sb=new  StringBuffer(s);
	StringBuffer  sb2=new  StringBuffer(); 
	String  s2=sb.reverse().toString(); 
	for(int  i=0;i<s2.length();i++)
	{
	sb2.append(s2.charAt(i)); sb2.append(s1);
	}
	sb2.deleteCharAt(sb2.length()-1);
	return sb2.toString();
	
}}
		
	
9.remove 10's
Sample Input :
5
1
10
20
10
2
Sample Output :
1
20
main class:
	import java.io.IOException;
	import java.util.Scanner;

	public class Removes10 {

		public static void main(String[] args) throws IOException,Exception{
			
			 Scanner sc = new Scanner(System.in); int i;
			int n = sc.nextInt(); 
			int a[] = new int[n]; 
			for (i = 0; i <n; i++) {
			a[i] = sc.nextInt();
			}
			UserMainCode.removeTens(a); 
			sc.close();


		}

	}
user main code:
	import java.util.ArrayList;
	import java.util.Scanner;
	import java.util.StringTokenizer;

	public class UserMainCode {
		public  static  void  removeTens(int  a[])
		{ Scanner  sc  =  new  Scanner(System.in);

		int  i,k  =  0;
		int  b[]  =  new  int[a.length];
		ArrayList<Integer>  al  =  new  ArrayList<Integer>();
		for  (i  =  0;  i  <a.length;  i++)  {
		if  (a[i]  !=  10)  {
		al.add(a[i]);
		}
		}
		
		int  b1[]  =  new  int[a.length];
		for  (i  =  0;  i  <a.length;  i++) 
		{ b1[i]  =  al.get(i); 
		System.out.println(b1[i]);
		}
		}
		}

10.	last letters
Smaple Input : This is a cat Sample 
Output : S$S$A$T
main class:
	import java.util.Scanner;

	public class Lastletters {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner  s=new  Scanner(System.in); 
			String  input=s.nextLine();
			System.out.println(UserMainCode.getLastLetter(input));



		}

	}

user main code:
		import java.util.StringTokenizer;

	public class UserMainCode {
			public  static  String  getLastLetter(String  input)
			{ String  str1=null;
			StringTokenizer  st=new  StringTokenizer(input,"  ");
			StringBuffer  sb=new  StringBuffer(); 
			while(st.hasMoreTokens()){
			str1=st.nextToken();
		    String  str2=str1.substring(str1.length()-1); 
		    String  str3=  str2.toUpperCase();
		    sb.append(str3).append("$");
			}
			sb.deleteCharAt(sb.length()-1);
			return  sb.toString();

			
		}
		
	}
			
11.largest key in hashmap
Sample Input 1:
3
12
amron 9
Exide 7

SF
Sample Output 1:

Amron

main class:

import java.util.HashMap;
import java.util.Scanner;

public class largestkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,  String>hm=new  HashMap<Integer,  String>();
		Scanner  s=new  Scanner(System.in);
		int  n=s.nextInt();
		for(int  i=0;i<n;i++)
		{
		int  a=s.nextInt(); String  s1=s.next(); hm.put(a,s1);

		}
		System.out.println(UserMainCode.getMaxKeyValue(hm));

		}


	}
user main code:
	

import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class UserMainCode {

	public  static  String  getMaxKeyValue(HashMap<Integer,  String>  hm)  {
		int  max=0; String  s3=null;
		Iterator<Integer>itr=hm.keySet().iterator();
		while(itr.hasNext())
		{
		int  b=itr.next();
		if(b>max)
		{
		max=b; s3=hm.get(b);
		}
		}
		return (s3);

		
		
	
	
	}
}	

12.all numbers
Sample Input 1:
4
123
24.5
23
one
Sample Output 1:
invalid
Sample Input 2:
2
123
24.5
Sample Output 2:
valid
main class:
	import java.util.Scanner;

	public class Allnumbers {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			String[] s1 = new String[n]; 
			for(int i=0;i<n;i++){
			s1[i] = s.next();
			}

			int out=(userMainCode.validateNumber(s1));
			if(out==1) {
				System.out.println("valid");}
				else {
					System.out.println("invalid");
			}



		}

	}

	user main code:
		import java.util.HashMap;

	class userMainCode{
		public static int validateNumber(String[] s1)
		{ int b =0 ,count,out=0;
		for(int i=0;i<s1.length;i++){ String s2 = s1[i]; if(s2.matches("[0-9.]{1,}"))
		{	count =0;
		for(int j=0;j<s2.length();j++)

		{
		char c = s2.charAt(j); if(c=='.')
		count++;
		}

		if(count>1)
		b=1;
		}
		else b=1;
		}
		if(b==0){ out=1;
		}
		else out=-1;
		return out;

		}

	}


13.day of the week
Sample Input 1:
07-13-2012
Sample Output 1:
Friday
main class:

import java.text.ParseException;
import java.util.Scanner;

public class Dayofweek {
	public  static  void  main(String[]  args)throws  ParseException  
	{ 
	Scanner  sc=new  Scanner(System.in);
	String  s1=sc.nextLine(); 
	System.out.println(UserMainCode.getDay(s1));
	}


}
user main code:
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class UserMainCode{

		public  static  String  getDay(String  s1)  throws  ParseException
		{
		SimpleDateFormat  sdf=new  SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat  sdf1=new  SimpleDateFormat("EEEEE"); 
		Date  d=sdf.parse(s1);
		String  s=sdf1.format(d);
		return s;
		}

		
	}

14.max substring
Sample Input 1:
delhi-pune-patna
-
Sample Output 1:
delhi
main class:
	import java.util.Scanner;

	public class maxsubsring {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner  sc=new  Scanner(System.in); 
			String  input1=sc.next();
			String  input2=sc.next(); 
			System.out.println(UserMainCode.extractMax(input1,input2));



		}

	}
user main code:
	import java.util.StringTokenizer;

	public class UserMainCode{
		public  static  String  extractMax(String  input1,String  input2){
			int  max=0; String  s3=null;
			StringTokenizer  st=new  StringTokenizer(input1,"-");
			while(  st.hasMoreTokens())
			{
			String  s2=st.nextToken(); int n=s2.length(); if(n>max)
			{
			max=n; s3=s2;
			}
			}
			return(s3);
			}}
15.states and capitals
	   Sample Input 1:
		3
		Karnataka
		Bangaluru 
		Punjab 
		Chandigarh 
		Gujarat 
		Gandhinagar 
		Punjab
		Sample Output 1:
		chandigarh$punjab
main class:
	import java.util.HashMap;
	import java.util.Scanner;

	public class Statesandcapital {
		public  static  void  main(String[]  args)
		{ 
		Scanner  sc=new  Scanner(System.in); 
		int n=sc.nextInt(); 
		HashMap<String,String>  hm=new HashMap<String,String>();
		for(int  i=0;i<n;i++)
		{
		String  s1=sc.next();
		String  s2=sc.next(); 
		hm.put(s1,s2);
		}
		String  sa=sc.next();
		System.out.print(UserMainCode.getCapital(hm,sa));
		}


	}
user main code:
	import java.util.HashMap;
	import java.util.Iterator;

	public class UserMainCode{

		public  static  String  getCapital(HashMap<String,String> hm,String  sa)
		{
		String  chan=null;
		Iterator<String>it=hm.keySet().iterator(); 
		StringBuffer  sb=new  StringBuffer();
		while(it.hasNext()){
		String  a=it.next();
		if(a.equals(sa))
		{
		chan=hm.get(a);
		
		sb.append(chan).append("$").append(sa);
		}
		}
		return  sb.toString();
		}
		}
17.vowels,arrays&arrayslist
Sample Input 1:
4
abcde 
pqrs
abci 
orto
Sample Output 1:
abcde
abci 
orto
main class:
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class Vowelsarrayarraylist {
		public  static  void  main(String[]  args)  {


			int  n;
			Scanner  sc=new  Scanner(System.in); 
			n=Integer.parseInt(sc.nextLine()); 
			String[]  str=new  String[n]; for(int  i=0;i<n;i++)
			{
			str[i]=sc.nextLine();
			}
			ArrayList<String>  arr=new  ArrayList<String>(); 
			arr=UserMainCode.matchCharacter(str); 
			Iterator<String>  it=arr.iterator(); while(it.hasNext())
			{
			System.out.println(it.next());
			}


	}}
user main code:
	import java.util.ArrayList;

	public class UserMainCode{

		public  static  ArrayList<String>  matchCharacter  (String[]  ss)
		{
		ArrayList<String>  as=new  ArrayList<String>();
		for(int  i=0;i<ss.length;i++)
		{
		String  sp=ss[i];
		char[]  mp=sp.toLowerCase().toCharArray();
		if((mp[0]=='a'||mp[0]=='e'||mp[0]=='i'||mp[0]=='o'||mp[0]=='u')&&(mp[sp.length()-
		1]=='a'||mp[sp.length()-1]=='e'||mp[sp.length()- 1]=='i'||mp[sp.length()-
		1]=='o'||mp[sp.length()-1]=='u'))
		{
		as.add(sp);
		}
		}
		return as;
		}
		}

18.transfer from hashmap to arraylist
Sample Input 1:
4
1
ravi5raJ 
2
sita8gitA 
3
ram8sitA 
4
rahul
Sample Output 1:
ravi5raJ 
sita8gitA 
ram8sitA
main class:
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Scanner;

	public class hashtoarraylist {
		public  static  void  main(String[]  args) throws IOException,Exception {
			HashMap<Integer,String>  hm1=new  HashMap<Integer,String>();
			int  n;
			Scanner  sc=new  Scanner(System.in); n=Integer.parseInt(sc.nextLine()); for(int  i=0;i<n;i++)
			{
			hm1.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
			}
			ArrayList<String>  al1=new  ArrayList<String>(); 
			al1=UserMainCode.getName(hm1);
			Iterator<String>  it=al1.iterator(); 
			while(it.hasNext())
			{
			
			System.out.println(it.next());
			}

			}
			}
user main code:
	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.Iterator;

	public class UserMainCode{
		public  static  ArrayList<String>  getName(HashMap<Integer,String>  hm1)
		{
		ArrayList<String>  al2=new  ArrayList<String>(); 
		Iterator<Integer>  it  =hm1.keySet().iterator(); 
		while(it.hasNext())
		{
		int  id=it.next();
		String  name=hm1.get(id);
		if(name.matches("[a-z]{1,}.*[0-9]{1,}.*[A-Z]{1}")) al2.add(name);
		}
		return al2;
		}
		}

19.max admissions
Sample Input 1:
4
2010
200000
2011
300000
2012
45000
2013
25000
Sample Output 1:

2011

main class:
	

20.sum non prime numbers
Sample Input:
9
Sample Output:
28
main class:

import java.util.Scanner;

public class Sumnonprimenumbers {

		public  static  void  main(String[]  args)  {
			{
			Scanner  s=new  Scanner(System.in);
			int  n=s.nextInt(); 
			System.out.println(UserMainCode.addNumbers(n));
			}
			
			}
			}
user main code:
	public class UserMainCode{
	public  static  int  addNumbers(int  n)  {
		int  sum=0;int  k=0;int  sum1=0;
		for(int  i=1;  i<=n;  i++)
	{  k=0;
	for(int  j=1;  j<=i;  j++)
	{
	if(i%j==0) k++;
	}
	if(k!=2)
	{
	sum=sum+i;
	}
	}
	return  sum;
	}

	}


21.date format conversion
Sample Input: 
12/11/1998
Sample Output:
12-11-98
main claass:

import java.util.Scanner;

public class Datefromatconv {



		public static void main(String[] args) {
			Scanner  s=new  Scanner(System.in);
			String  s1=s.next();
			UserMainCode.convertDateFormate(s1);
			}

	}

user main code:

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode{



		public  static  void  convertDateFormate(String  s1)  {
			SimpleDateFormat  sdf=new  SimpleDateFormat("dd/MM/yyyy");
			sdf.setLenient(false);
		try {
		Date  d1=sdf.parse(s1);
		SimpleDateFormat  sdf1=new  SimpleDateFormat("dd-MM-yy"); 
		String  s2=sdf1.format(d1);
		System.out.println(s2);
		}  
		catch  (ParseException  e) 
		{ e.printStackTrace();
		}
		}
		

	}
22.valid date
Sample Input 1:
12.03.2012
Sample Output 1:
Valid
Sample Input 2:
27#01#1977
Sample Output 2: 
Invalid 
main class:
	import java.text.ParseException;
	import java.util.Scanner;

	public class Validdate {
		public static void main(String [] args) throws ParseException

		{

		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int b=UserMainCode.dateformat(s1); if(b==1)
		{



		System.out.println("Valid");

		}

		else

		{

		System.out.println("Invalid");

		}

		s.close();

		}

		}


user main code:
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class UserMainCode{

		public static int dateformat(String s1) throws ParseException

		{

		String s2=" ";
		int n=-1;

		if(s1.matches("[0-9]{2}[.]{1}[0-9]{2}[.]{1}[0-9]{4}"))

		{

		SimpleDateFormat sdf=new SimpleDateFormat("dd.MM.yyyy");

		Date d=sdf.parse(s1);

		s2=sdf.format(d);

		n=1;

		}

		else if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{2}"))

		{

		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yy");

		Date d1=sdf1.parse(s1);

		s2=sdf1.format(d1);

		n=1;

		}

		else if(s1.matches("[0-9]{2}[-]{1}[0-9]{2}[-]{1}[0-9]{4}"))

		{

		SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy");

		Date d2=sdf2.parse(s1);

		s2=sdf2.format(d2);

		n=1;

		}

		else

		{

		n=-1;

		}

		return n;
		 }}
		
23.convert format
Sample Input:
555-666-1234
Sample Output:
55-56-661-234
main class:
	import java.util.Scanner;

	public class Convertformat {

		
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in); 
				String s=sc.next();
				System.out.println(UserMainCode.convertFormate(s));
				}


		}
user main code:
	import java.util.StringTokenizer;

	public class UserMainCode{

		
		public static String convertFormate(String s) { 
			StringTokenizer t=new StringTokenizer(s,"-");
			String s1=t.nextToken();
		String s2=t.nextToken(); String s3=t.nextToken();
		StringBuffer sb=new StringBuffer(); 
		sb.append(s1.substring(0, s1.length()-1)).append('-');
		sb.append(s1.charAt(s1.length()-1)).append(s2.charAt(0)).append('-');
		sb.append(s2.substring(1, s2.length())).append(s3.charAt(0)).append('-'); 
		sb.append(s3.substring(1, s3.length()));
		return sb.toString();
		}

		}

24.add and reverse
Sample Input
6
10
15
20
25
30
100
15
Sample Output
571

main class:
	
	
25.next year day
Sample Input:
13/07/2012
Sample Output:
Saturday

main class:
	import java.util.Scanner;

	public class Nextyearday {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner  sc=new  Scanner(System.in);
			String  s1=sc.next();
			UserMainCode  u=new  UserMainCode();
			{
			System.out.println(u.nextYearDay(s1));
			}
			}

		}

user main class:
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Calendar;
	import java.util.Date;

	public class UserMainCode{

		public  String  nextYearDay(String  s1)
		{
		String  s=null;
		SimpleDateFormat  sdf=new  SimpleDateFormat("dd/MM/yyyy"); sdf.setLenient(false);
		try {
		Date  d1=sdf.parse(s1);
		Calendar  cal=Calendar.getInstance(); cal.setTime(d1); cal.add(Calendar.YEAR,  1);
		Date  d2=cal.getTime();
		SimpleDateFormat  sdf1=new  SimpleDateFormat("EEEEE"); s=sdf1.format(d2);
		}
		catch  (ParseException  e)
		{
		e.printStackTrace();
		}
		return s;

	}
	}

26.sum squares of digit
Sample Input:
321
Sample Output:
14
main class:
	
import java.util.Scanner;

public class Sumsquaresofdigit {


		public  static  void  main(String[]  args)  { 
			Scanner  s=new  Scanner(System.in);
		int  n=s.nextInt(); 
		UserMainCode.getSumOfSquaresOfDigits(n);
		s.close();


	}

}

user main code:
	public class UserMainCode{



	public  static  void  getSumOfSquaresOfDigits(int  n)  {
		int  a=n; int  rem=0; int  sum=0; while(a!=0)
		{
		rem=a%10; sum=sum+(rem*rem); a=a/10;
		}
		System.out.println(sum);
		}

}

27.even and odd index sum
Sample Input 1:
23050
Sample Output 1:
no
Sample Input 2:
231
Sample Output 2:
Yes
main class:
	import java.util.Scanner;

	public class Evenandoddindexsum {



			public  static  void  main(String[]  args)  { 
				Scanner  sc  =  new  Scanner(System.in);
			int  n  =  sc.nextInt(); 
			UserMainCode.sumOfOddEvenPositioned(n); sc.close();


		}

	}
user main code:
	public class UserMainCode{

	public  static  void  sumOfOddEvenPositioned(int  n)  {
			int rem = 0, i = 0; int  a[]  =  new  int[10]; while (n > 0) {
			rem = n % 10; a[i]  =  rem;
			n  =  n  /  10; i++;
			}
			int  sume  =  0,  sumo  =  0;
			for  (int  j  =  i  -  1;  j  >=  0;  j--)  {
			if(j%2!=0)
			{
			sumo  =  sumo  +  a[j];
			}
			else
			{
			sume  =  sume  +  a[j];
			}
			}
			if  (sume  ==  sumo)  { System.out.println("Yes");
			} else
			System.out.println("No");
			}
			}
	


28.remove 3 multiples
Sample Input:
6
3
1
11
 19
17
19
Sample Output
3
1
19
17

main class:
	
	


29.string occurences
Sample Input 1:

catcowcat cat
Sample Output 1:

2

Sample Input 2:

catcowcat CAT
Sample Output 2:

0


main class:

import java.util.Scanner;

public class stringoccurences {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
	String s1=sc.nextLine(); 
	System.out.println(UserMainCode.getSubstring(s, s1)); 
	sc.close();
	}

}

user main code:
	import java.util.ArrayList;

	public class UserMainCode{
	public static int getSubstring(String s,String s1){ 
			int t=s1.length();


			int count=0;

			for(int i=0;i<s.length()-t+1;i++)

			{

			String s3=s.substring(i,t+i); if(s3.equals(s1))
			{

			count++;

			}

			}

			return count;

			}


	}

30.programming logic
Sample Input 1:

1

2

3

Sample Output 1:

6

Sample Input 2:

1

2

13

Sample Output 2:

3

Sample Input 3:

13

3

8

Sample Output 3:

8


main class:
	import java.util.Scanner;

	public class Programminglogic {
		public  static  void  main(String[]  args)
		{ Scanner  s=new  Scanner(System.in);
		int a=s.nextInt();

		int b=s.nextInt(); 
		int c=s.nextInt();
		System.out.println(UserMainCode.getluckySum(a,b,c));
		}
		}

user main code:
	import java.util.ArrayList;

	public class UserMainCode{

		public  static  int  getluckySum(int  a,  int  b,  int  c)
		{
		if(a == 13)
		return  0;
		if(b == 13) 
			return  a; 
		if(c == 13)
		return (a + b); 
		return (a + b + c);
		}
		}

	31.triplets
	Sample Input 1:
		7

		3

		3

		5

		5

		5

		2

		3

		Sample Output 1:

		TRUE

		Sample Input 2:

		7

		5

		3

		5

		1

		5

		2
		
		3

		Sample Output 2:

		FALSE

main class:
	import java.util.Scanner;

	public class triplets {
		public  static  void  main(String[]  args)

		{

		int  n;

		Scanner  sc=new  Scanner(System.in);

		n=sc.nextInt(); int[]  a=new  int[n]; for(int  i=0;i<n;i++)
		{

		a[i]=sc.nextInt();

		}

		boolean  s=UserMainCode.checkTripplets(a);

		if(s==true) 
			System.out.println("TRUE");
		else 
			System.out.println("FALSE");
		}


	}
user main code:
	public class UserMainCode{
	public static boolean checkTripplets(int[] a)

	{
	
	boolean b=false;


	for(int i=0;i<a.length-2;i++)

	{

	if((a[i]==a[i+1])&&(a[i+1]==a[i+2]))

	{

	b=true;

	}

	}

	return b;

	}

	}

32.repeat font
Sample Input 1:
	
Coward
2
Sample Output 1:

CowCow

Sample Input 2:

So 3
Sample Output 2:

SoSoSo

main class:

import java.util.Scanner;

public class repeatfont {
	public  static  void  main(String  []args){ 
		Scanner  sc=new  Scanner(System.in); 
		String  s=sc.nextLine();
	
	int  n=Integer.parseInt(sc.nextLine());
	System.out.println(UserMainCode.repeatFirstThreeCharacters(s,n)); 
	sc.close();}

}
user main code:
	public class UserMainCode{
	

	public  static  String  repeatFirstThreeCharacters(String  s,int  n)

	{
	
	StringBuffer  sb=new  StringBuffer(); 
	StringBuffer  sb1=new  StringBuffer();
	if(s.length()>3)
	{  sb.append(s.substring(0,3)); s=sb.toString();
	}

	for(int  i=0;i<n;i++) sb1.append(s);
	return  sb1.toString();

	}


}

33.sorted array
Sample Input 1:

6

AAA
BBB
AAA
AAA
CCC
CCC
Sample Output 1:

AAA
BBB
CCC
Sample Input 2:

7

AAA
BBB
aaa
AAA
Abc
A
b

Sample Output 2:

A 
AAA
Abc
BBB
aaa
b
main class:
	import java.util.Scanner;

	public class sortedearray {
		public  static  void  main(String[]  args)

		{

		int  n;

		Scanner  sin  =  new  Scanner(System.in);

		n  =  sin.nextInt();

		String[]  a1  =  new  String[n];

		for(int  i=0;i<n;i++)

		{

		a1[i]  =  sin.next();

		}

		a1  =  UserMainCode.orderElements(a1);
		for(int  i=0;i<a1.length;i++) 
			System.out.println(""+a1[i]);
		}

		}

user main class:
	import java.util.Arrays;
	import java.util.HashSet;
	import java.util.Iterator;

	public class UserMainCode{
		

		public  static  String[]  orderElements(String[]  arr)

		{

		HashSet<String>  al=new  HashSet<String>();

		for(int  i=0;i<arr.length;i++)

		{

		al.add(arr[i]);

		}

		Iterator<String>  itr=al.iterator();

		String  ar[]  =  new  String[al.size()];

		int i =0 ;

		while(itr.hasNext()){

		ar[i]  =  itr.next(); i++;
		}

		Arrays.sort(ar);

		return ar;

		}

		}

34.pattern matcher
Sample Input 1:

CPT-302020

Sample Output 1:

TRUE

Sample Input 2:

CPT123412

Sample Output 2:

FALSE
main class:
	import java.util.Scanner;

	public class Patternmatcher {
		public  static  void  main(String[]  args)

		{

		Scanner  sc  =  new  Scanner(System.in);
		String  s  =  sc.next();
		System.out.println(UserMainCode.CheckID(s));
		sc.close();

	}
	}
	
user main class:
	public class UserMainCode{
	public  static  boolean  CheckID(String  s)
	
	{

	boolean  b=false;

	if(s.matches("(CPT)[-]{1}[0-9]{6}"))

	{

	b=true;

	}

	else

	{

	b=false;

	}

	return  b;

	}

	}

36.regular expression 1
Sample Input 1:

vR4u

Sample Output 1:

TRUE

Sample Input 2:

vRau

Sample Output 2:

FALSE

Sample Input 3:

vrau

Sample Output 3:

FALSE

main class:
	import java.util.Scanner;

	public class regularexpression {
		public  static  void  main(String  []args){ 
			Scanner  sc=new  Scanner(System.in); 
			String  n=sc.nextLine();
			System.out.println(UserMainCode.validate(n));
			sc.close();
		}
		


	}

user main code:
	public class UserMainCode{
	public  static  String  validate(String  s)

	{

	String  w="FALSE";
	if(s.length()==4  && (Character.isDigit(s.charAt(0))||Character.isAlphabetic(s.charAt(0)))&&s.charAt(1)
	=='R')

	{

	if(Character.isDigit(s.charAt(2))) w="TRUE";
	}

	return  w;
	}
	}



38.regular expression-3
Sample Input 1:

9987684321

Sample Output 1:

TRUE

Sample Input 2:

0014623452

Sample Output 2:

FALSE


main class:
	import java.util.Scanner;

	public class re3 {
		public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		boolean b1=UserMainCode.validatePhone(s1);
		if(b1==true)
		{	//phone validation pg.no:151
		System.out.println("TRUE");
		}
		else
		{
		System.out.println("FALSE");
		}
		s.close();
		}

	}

user main code:
	public class UserMainCode{
	public static boolean validatePhone(String s1)
	{
	boolean b=false;
	if(s1.matches("[0]{1}[0]{1}[0-9]{8}") )
	{
	b=false;
	}
	//phone validation pg.no:151
	else
	{
	b=true;
	}
	return b;
	}


	}

39.string splitter
Sample Input 1:

AAA/bba/ccc/DDD

/

Sample Output 1:

aaa
abb 
ccc 
ddd

main classs:
	import java.util.Scanner;

	public class stringsplitter {
		public  static  void  main(String[]  args)

		{

		Scanner  s  =  new  Scanner(System.in); String  ip1=s.next();
		char  ip2='/';

		String  op[]=UserMainCode.manipulateLiteral(ip1,ip2);
		for(int  i=0;i<op.length;i++) 
		System.out.println(op[i]);
		s.close();


	}}
	
user main code:
	import java.util.ArrayList;
	import java.util.StringTokenizer;

	public class UserMainCode{
		public  static  String[]  manipulateLiteral(String  ip1,  char  ip2)

		{

		StringTokenizer  t1  =  new  StringTokenizer(ip1,"/");

		ArrayList<String>  lst  =  new  ArrayList<String>();

		while(t1.hasMoreTokens())

		{

		StringBuffer sb = new StringBuffer();
		sb.append(t1.nextToken().toLowerCase());
		
		lst.add(sb.reverse().toString());

		}

		String[]  op  =  new  String[lst.size()];

		for(int  i  =  0;i<lst.size();i++)

		{

		op[i]  =  lst.get(i);

		}

		return  op;

		}


		}

40.vowel count
Sample Input 1:

NewYork

Sample Output 1:

2

Sample Input 2:

Elephant

Sample Output 2:

3
main class:

import java.util.Scanner;

public class Vowelcount {
	public  static  void  main(String[]args)	//  Second  set:  40.Vowel Count//

	{

	Scanner  sc=new  Scanner(System.in); 
	String  s=sc.nextLine();
	int  max=UserMainCode.tellVowelCount(s);
	System.out.println(max);


}}

user main code:

public class UserMainCode{
	public  static  int  tellVowelCount(String  s)

	{

	int  max=0;

	int  count=0;

	for(int  i=0;i<s.length();i++)

	{

	char  c=s.charAt(i); if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'|| c=='O'||c=='U')
	{

	count++;

	}

	}

	if(count>max)
	
	{

	max=count;

	}

	return  max;

	}

	}

41.playing with string 2
Sample Input 1:

5

AAA
BB
CCCC
A 
ABCDE

Sample Output 1:

a
aaa
abcde
bb
cccc

main class:
	import java.util.Scanner;

	public class playingwithstring {
		

			 public  static  void  main(String[]  args)  {
				 Scanner  s=new  Scanner(System.in); int  n=s.nextInt();
			
			 String  s1[]=new  String[n]; String  s2[]=new  String[n];
			 for(int  i=0;i<n;i++)	

			 {

			 s1[i]=s.next();

			 }

			 s2=UserMainCode.sortArray(s1,n);

			 for  (int  i  =  0;  i  <  n;  i++)  { System.out.println(s2[i]);
			 }

			 s.close();

	}}

user main code:

import java.util.Arrays;

public class UserMainCode{



public  static  String[]  sortArray(String  s1[],int  n){

String  s2[]=new  String[n];

for  (int  i  =  0;  i  <  n;  i++)

{

s2[i]=s1[i].toLowerCase();

}

Arrays.sort(s2);

return s2;

}


	}

42.median calculation
Sample Input 1:
	
7

1

2

1

4

7

1

2

Sample Output 1:

2

Sample Input 2:

6

52

51

81

84

60

88

Sample Output 2:

71

main class:
	import java.util.Scanner;

	public class playingwithstring {
		

			 public  static  void  main(String[]  args)  {
				 Scanner  s=new  Scanner(System.in); int  n=s.nextInt();
			
			 String  s1[]=new  String[n]; String  s2[]=new  String[n];
			 for(int  i=0;i<n;i++)	

			 {

			 s1[i]=s.next();

			 }

			 s2=UserMainCode.sortArray(s1,n);

			 for  (int  i  =  0;  i  <  n;  i++)  { System.out.println(s2[i]);
			 }

			 s.close();

	}}

user main code:

import java.util.Arrays;

public class UserMainCode{



public  static  String[]  sortArray(String  s1[],int  n){

String  s2[]=new  String[n];

for  (int  i  =  0;  i  <  n;  i++)

{

s2[i]=s1[i].toLowerCase();

}

Arrays.sort(s2);

return s2;

}


	}

43.sequence in array
Sample Input 1:

9

11

-2

5

1

2

3

4

5

6

Sample Output 1:

TRUE

Sample Input 2:

6

-2

5

1

3

2

6

Sample Output 2:

FALSE

main class:

import java.util.Scanner;

public class sequenceinarray {
	public  static  void  main(String[]  args)

	{

	Scanner  s=new  Scanner(System.in);

	int  n=s.nextInt();

	int  a[]=new  int[n];
	
	for(int  i=0;i<n;i++){

	a[i]=s.nextInt();

	}

	System.out.println(UserMainCode.searchsequence(a)); s.close();
	}



}
user main class:
	import java.util.Arrays;

	public class UserMainCode{
		public  static  boolean  searchsequence(int[]  a)

		{

		boolean  b  =  false;

		for(int  i  =  0  ;  i<  a.length-3;  i++)

		{

		if(a[i]==1  &&  a[i+1]==2  &&  a[i+2]==3) b  =  true;
		}

		return  b;

		}


		}

44.asterisk & characters
Sample Input 1: 
Hello*World 
Sample Output 1: 
FALSE
Sample Input 2: 
Welcome*elizabeth 
Sample Output 2:
TRUE

main class:

import java.util.Scanner;

public class asteriskchar {
	public  static  void  main(String[]  args)  
	{ Scanner  s=new  Scanner(System.in);
	String  input=s.next();

	System.out.println(  UserMainCode.scanStarNeighbors(input)); 
	s.close();
	}



}
user main code:
	import java.util.Arrays;
	import java.util.StringTokenizer;

	public class UserMainCode{
		public  static  boolean  scanStarNeighbors (String  input)  {

			boolean  b=false;

			StringTokenizer  t=new  StringTokenizer(input,"*"); 
			String  s1=t.nextToken();
			String  s2=t.nextToken();

			String  s3=s1.substring(s1.length()-1); 
			String  s4=s2.substring(0,1);
			if(s3.equalsIgnoreCase(s4))
			b=true;

			return  b;

			}



		}

45.occurance count
Sample Input 1:

Hello world Java is best programming language in the world world
Sample Output 1:

2

Sample Input 2:

hello world World
Sample Output 2:

0

main class:

import java.util.Scanner;

public class occurancecount {
	public  static  void  main(String[]  args)  { 
		Scanner  s=new  Scanner(System.in);
		String  s1=s.nextLine();

		String  s2=s.nextLine();

		int  v=UserMainCode.countWords(s1,s2); 
		System.out.println(v);

}
}

user main code:

import java.util.StringTokenizer;

public class UserMainCode{
	public  static  int  countWords(String  s1,String  s2){
		StringTokenizer  t=new  StringTokenizer(s1,"  "); 
		int c=0;
	
	while(t.hasMoreTokens())

	{

	String  s3=t.nextToken();

	if(s3.equals(s2)) c++;
	}

	return c;

	}



	}

46.regular expressions-3
Sample Input 1:

Catcowcat cat
Sample Output 1:

2

Sample Input 2:

Catcowcat catp
Sample Output 2:

0
main class:
	import java.util.Scanner;

	public class regularexpression3 {
		public  static  void  main(String[]  args)  {
			Scanner  s=new  Scanner(System.in);
			String  s1=s.next();
			String  s2=s.next();
			int  v=UserMainCode.searchString(s1,s2); System.out.println(v);
			s.close();}
	}

user main code:
public class UserMainCode{
	
	public  static  int  searchString(String  s1,String  s2){

		int  c=0;

		int  t=s2.length();

		for(int  i=0;i<s1.length()-t+1;i++){

		if(s2.equalsIgnoreCase(s1.substring(i,t+i))){ c++;
		}

		}
		
		return c;

	}}


47.	string processing
Sample Input 1: 
Apple,Banana,Orange
2
Sample Output 1:

Banana

Sample Input 2:
Apple,Banana,Orange
4
Sample Output 2:
Orange
main class:
	import java.util.Scanner;

	public class stringprocessing {
		public  static  void  main(String  args[])

		{

		String  str=new  String();

		Scanner  sc=new  Scanner(System.in);
		str=sc.nextLine();
		int  n=sc.nextInt();

		String  k=UserMainCode.findFruitName(str,  n);
		System.out.println(k);
		sc.close();

	}}
user main code:
	import java.util.StringTokenizer;

	public class UserMainCode{
		
		public  static  String  findFruitName(String  m,int  n)

		{

		int  i=0; String  h=null;
		StringTokenizer  st=new  StringTokenizer(m,",");

		int  max=st.countTokens(); 
		String[]  ss=new  String[max];
		while(st.hasMoreElements())
		{

		ss[i++]=st.nextToken();
		
		}

		if(n>max)
			h=ss[i-1]; 
		else h=ss[n-1];
		return  h;

		}
		}
48.proper case
Sample Input 1:

This is cognizant academy

Sample Output 1:

This Is Cognizant Academy
main class:

import java.util.Scanner;

public class propercase {
	public  static  void  main(String[]  args)
	{ Scanner  s=new  Scanner(System.in);
	String  s1=s.nextLine();
	
	System.out.println(UserMainCode.changeCase(s1)); 
	s.close();

}}

user main code:

import java.util.StringTokenizer;

public class UserMainCode{
	
	public  static  String  changeCase(String  s1){
		StringBuffer  s5=new  StringBuffer(); 
		StringTokenizer  t=new  StringTokenizer(s1,"  "); 
		while(t.hasMoreTokens()){
	
		String  s2=t.nextToken(); 
		String  s3=s2.substring(0,1);
		String  s4=s2.substring(1,  s2.length()); 
		s5.append(s3.toUpperCase()).append(s4).append("  ");
		}
		return s5.toString();

	}}

49.length of same word
Sample Input 1:

This is Cognizant Academy

Sample Output 1:

11

Sample Input 2: Hello World Hello Sample Output 2:
5

main class:
	import java.util.Scanner;

	public class lengthsameword {
	public  static  void  main(String[]  args)  { 
	Scanner  sc=new  Scanner(System.in);
	String s1=sc.nextLine();
	System.out.println(UserMainCode.compareLastWords(s1)); 
	sc.close();
	}

	}
user main code:
	import java.util.ArrayList;
	import java.util.List;
	import java.util.StringTokenizer;

	public class UserMainCode{
		

		public  static  int  compareLastWords(String  s1){
			int n;
			List<String>  l=new  ArrayList<String>();
			StringTokenizer  t=new  StringTokenizer(s1,"  "); 
			while(t.hasMoreTokens())
		{

		String  s2=t.nextToken(); l.add(s2);
		}

		String  s3=l.get(0);

		String  s4=l.get(l.size()-1);

		if(s3.equals(s4))

		{

		 n=s3.length(); 
		System.out.println(n);
		}

		else

		{

		int  n1=s3.length();
		int  n2=s4.length(); 
		 n=n1+n2;
		}

		return  n;

		}


		}

50.perfect number
Sample Input 1:

28

Sample Output 1:

TRUE


main class:

import java.util.Scanner;

public class perfectnumber {

public static void main(String[] args){
	Scanner s=new Scanner(System.in); 
	int n=s.nextInt();
boolean j=(UserMainCode.getPerfection(n));
if(j==true)

System.out.println("TRUE"); 
else System.out.println("FALSE");
}

}

user main code:


public class UserMainCode{
	

	public static boolean getPerfection(int n){ 
		boolean b=false;
	int sum=0;

	for(int i=1;i<n;i++)
	{ 
		int r=n%i;
	if(r==0) 
		sum=sum+i;
	}

	b=(sum==n); return b;
	}

	}

51.find digits
Sample Input 1:

843.21

Sample Output 1:

3:2

Sample Input 2:

20.130

Sample Output 2:

2:2

main class:

import java.util.Scanner;

public class finddigits {
	public static void main(String[] args) {


		Scanner s=new Scanner(System.in); 
		double d=s.nextDouble();
		System.out.println(UserMainCode.findNoDigits(d));

		}}

user main code:

import java.util.StringTokenizer;

public class UserMainCode{
	public static String findNoDigits(double d) { int n1=0,n2=0;
	String s=String.valueOf(d);

	StringTokenizer t=new StringTokenizer(s,"."); 
	String s1=t.nextToken();
	String s2=t.nextToken(); 
	n1=s1.length(); 
	n2=s2.length(); 
	if(s1.charAt(0)=='0') 
		n1=s1.length()-1; 
	if(n2!=1)
	if(s2.charAt(s2.length()-1)=='0') 
		n2=s2.length()-1;
	String s3=String.valueOf(n1)+":"+String.valueOf(n2); 
	return s3;
	}
}

52.employees & designations
Sample Input 1:
4
Manish 
MGR
Babu
CLK
Rohit
MGR
Viru
PGR
MGR
Sample Output 1:
Manish
Rohit

main class:
	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Scanner;

	public class empdesg {
		public static void main(String[] args)

		{

		Scanner sc=new Scanner(System.in); 
		int k1=Integer.parseInt(sc.nextLine());
		LinkedHashMap<String,String> hm=new LinkedHashMap<String,String>(); 
		for(int i=0;i<k1;i++)
		{

		String k=sc.nextLine(); 
		String s=sc.nextLine(); 
		hm.put(k,s);
		}

		String n=sc.nextLine();

		LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>();
		hm1=UserMainCode.obtainDesignation(hm,n);
		Iterator<String> it=hm1.keySet().iterator(); 
		while(it.hasNext())
		{
		
		String s2=it.next(); System.out.println(s2);
		}

		}

		}

user main code:
	import java.util.Iterator;
	import java.util.LinkedHashMap;

	public class UserMainCode{

	public static LinkedHashMap<String,String> obtainDesignation(LinkedHashMap<String,String> h1,String n)
	{

	int k=0;

	LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>(); 
	Iterator<String>it=h1.keySet().iterator();
	while(it.hasNext())

	{

	String s2=it.next(); String s3=h1.get(s2); if(s3.equals(n))
	hm1.put(s2,s3);

	}

	return hm1;
	
	}}



54.dob validation
Sample Input 1:

12/23/1985

Sample Output 1:

TRUE

Sample Input 2:

31/12/1985

Sample Output 2:

FALSE
main class:
	import java.util.Scanner;

	public class dobvalidation {
		public static void main(String[] args)

		{

		String str=new String();

		Scanner sc=new Scanner(System.in); 
		str=sc.nextLine();
		Boolean b=UserMainCode.ValidateDOB(str);
		if(b==true)
		System.out.println("TRUE"); 
		if(b==false)
		System.out.println("FALSE");

		}

		}
user main code:
	import java.text.SimpleDateFormat;
	import java.util.Date;

	public class UserMainCode{
		public static Boolean ValidateDOB(String str){
			
			Boolean b=false;

			SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy"); 
			sdf.setLenient(false);
			try

			{

			Date d1=sdf.parse(str); 
			return b=true;
			}

			catch(Exception e)

			{

			return b=false;

			}

			}

55.experience validator
Sample Input:

2001

5

Sample Output:

TRUE

main class:
	import java.util.Scanner;

	public class experienceval {


	public static void main(String args[]){ 
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();

	String s1=sc.nextLine(); 
	System.out.println(UserMainCode.validateExp(s,s1));
	}
	}
user main code:

	
	public static boolean validateExp(String s,String s1)
	
	{

	int y1=Integer.parseInt(s); Date d=new Date();
	Calendar c=Calendar.getInstance(); 
	int y2=c.get(Calendar.YEAR);
	int y=Math.abs(y1-y2);

	int e=Integer.parseInt(s1); if(y>=e)
	return true; 
	else
	return false;

		}}
56.arraylist to string array
Sample Input 1:

4
a
d
c
b
Sample Output 1:

a
b
c
d
main classs:
	import java.util.ArrayList;
	import java.util.Scanner;

	public class arraylisttostringarray {
		public  static  void  main(String[]  args)

		{

		Scanner  s=new  Scanner(System.in);

		ArrayList<String>  l=new  ArrayList<String>();

		int  n=s.nextInt();

		for(int  i=0;i<n;i++)

		{

		l.add(s.next());
		
		}

		String  a[]=new  String[n]; a=UserMainCode.convertToStringArray(l); for(int  j=0;j<n;j++)
		{

		System.out.println(a[j]);

		}

		}



	}
	
user main code:

import java.util.ArrayList;
import java.util.Collections;

public class UserMainCode{
	
		public  static  String[]  convertToStringArray(ArrayList<String>  l)

	{

	Collections.sort(l);

	String  []  a  =  l.toArray(new  String[l.size()]);

	return  a;

	}
}

58.	arraylist to string array
Sample Input 1:
3
Apple
Cherry
Grapes
4
Orange
Mango
Melon
Apple
Sample Output 1:

Cherry
Grapes
Orange
main class:
	import java.util.ArrayList;
	import java.util.Scanner;

	public class arraylist {
		public static void main(String [] args)

		{

		Scanner s=new Scanner(System.in);

		int m=s.nextInt();

		ArrayList<String> aa1=new ArrayList<String>();

		for(int i=0;i<m;i++)

		{

		aa1.add(s.next());

		}

		int n=s.nextInt();

		ArrayList<String> aa2=new ArrayList<String>();

		for(int j=0;j<n;j++)

		{

		aa2.add(s.next());

		}

		int k;

		String st[]=UserMainCode.fruitSelector(aa1,aa2);

		for( k=0;k<st.length;k++)

		{

		System.out.println(st[k]);

		}

		if(st.length==0)
		
		System.out.println("No Fruit Found"); 
		s.close();
		}


	}

user main class:
		import java.util.ArrayList;
	import java.util.Collections;

	public class UserMainCode{
		
		public static String[] fruitSelector(ArrayList<String> a1,ArrayList<String> a2)

		{

		ArrayList<String> a3=new ArrayList<String>();

		for(int i=0;i<a1.size();i++)

		{

		String s1=a1.get(i);

		if(s1.charAt(s1.length()-1)!='a'&&s1.charAt(s1.length()-1)!='e'&&s1.charAt(s1.length()- 1)!='A'&&s1.charAt(s1.length()-1)!='E')

		{

		a3.add(s1);

		}

		}

		ArrayList<String> a4=new ArrayList<String>();

		for(int j=0;j<a2.size();j++)

		{

		String s2=a2.get(j);

		if(s2.charAt(0)!='m'&&s2.charAt(0)!='a'&&s2.charAt(0)!='M'&&s2.charAt(0)!='A')

		{

		a4.add(s2);

		}

		}

		a3.addAll(a4); 
		Collections.sort(a3);
		String st[]=new String[a3.size()];

		for(int k=0;k<a3.size();k++)

		{

		st[k]=a3.get(k);

		}

		return st;
		
		}

		}

59.elements in arraylist
Sample Input 1:
4
1
8
3
5
2
3
5
Sample Output 1:
1
8
Sample Input 2:
4
9
1
3
5
4
1
3
5
6
Sample Output 2:
6
9

main class:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class elemenstt {
	public  static  void  main(String[]  args)
	{
	int  n,m;
	Scanner  sin  =  new  Scanner(System.in); n  =  sin.nextInt();
	ArrayList<Integer>  a1  =  new  ArrayList<Integer>(n);
	for(int  i=0;i<n;i++)
	{
	int  k  =  sin.nextInt(); a1.add(k);
	}
	m  =  sin.nextInt();
	ArrayList<Integer>  a2  =  new  ArrayList<Integer>(m);
	for(int  i=0;i<m;i++)
	{
	int  k  =  sin.nextInt(); a2.add(k);
	}
	int[]  result  =  UserMainCode.arrayListSubtractor(a1,a2); 
	Arrays.sort(result);
	for(int  i=0;i<result.length;i++)
		System.out.println(result[i]);

}}

user main code:

import java.util.ArrayList;

public class UserMainCode{
	public  static  int[]  arrayListSubtractor(ArrayList<Integer> arrlist1,ArrayList<Integer>
	arrlist2)
	{
	int  count=0,key;
	int  max  =  arrlist1.size(); if(arrlist1.size()  <  arrlist2.size()) max  =  arrlist2.size();
	ArrayList<Integer>  temp  =  new  ArrayList<Integer>(max);
	for(int  i=0;i<arrlist1.size();i++)
	{
	key  =  (int)arrlist1.get(i);
	if(arrlist2.indexOf(key)  ==  -1)
	{
	++count; temp.add(key);
	}
	}
	for(int  i=0;i<arrlist2.size();i++)
	{
	key  =  (int)arrlist2.get(i);
	if(arrlist1.indexOf(key)  ==  -1)
	
	{
	if(!temp.contains(key))
	{
	++count; temp.add(key);
	}
	}
	}
	int[]  result  =  new  int[count]; 
	for(int  i=0;i<count;i++) 
		result[i]  =  (int)temp.get(i);
	return  result;

	
	}
	}

60.price calculator
Sample Input 1:
3
Monitor 
1200.36
Mouse
100.42
Speakers
500.25
2
Speakers
Mouse
Sample Output 1:
600.67

main class:

import java.util.HashMap;
import java.util.Scanner;

public class pricecal {
	public  static  void  main(String[]  args)  { 
		Scanner  S=new  Scanner(System.in); int  n=S.nextInt();
	
	HashMap<String,  Float>  m1=new  HashMap<String,  Float>();
	for(int  i=0;i<n;i++)
	{
	String  name=S.next(); float  price=S.nextFloat(); m1.put(name,price);
	}
	int  m=S.nextInt();
	String  s[]=new  String[m];
	for(int  j=0;j<m;j++)
	{
	s[j]=S.next();
	}
	System.out.println(UserMainCode.getTheTotalCostOfPheripherals
	(m1,s));

}}

user main code:
	import java.util.HashMap;
	import java.util.Iterator;

	public class UserMainCode{
		public  static  float  getTheTotalCostOfPheripherals(HashMap<String,Float>  m1, String[] s) {
			Float  f=(float)  0;
			Iterator<String>  i=m1.keySet().iterator();
			while(i.hasNext()){ String  s1=i.next(); Float  f1=m1.get(s1);
			for(int  j=0;j<s.length;j++)
			if(s[j].equals(s1)) f+=f1;  }
			return f;

		

		
		
		}}
61.	string processing - zigzag
Sample Input 1:
12-06-2012
Sample Output 1:
30
Sample Input 2:
10-02-2012
Sample Output 2:
29
main class:

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class StringprocessingzigzAG {
	public  static  void  main(String[]  args)  throws  IOException, ParseException {
		Scanner  S=new  Scanner(System.in);
		String  s1=S.next();
		UserMainCode.getLastDayOfMonth(s1);
		}

}
user main code:

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UserMainCode{
	public  static  void  getLastDayOfMonth(String  s1)  throws  ParseException{
	SimpleDateFormat  sdf=new  SimpleDateFormat("dd-MM-yyyy");
	Calendar  cal=Calendar.getInstance(); 
	Date  d1=sdf.parse(s1); cal.setTime(d1);
	int  n=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	System.out.println(n);



}}
	
62.leap year
Sample Input 1:
23/02/2012
Sample Output 1:
TRUE
Sample Input 2:
12/12/2011
Sample Output 2:
FALSE

main class:
	import java.io.IOException;
	import java.text.ParseException;
	import java.util.Scanner;

	public class leapyear {
	public  static void  main(String[]  args)  throws  IOException,  ParseException  {
	Scanner  S=new  Scanner(System.in);
	String  s1=S.next();
	UserMainCode.isLeapyear(s1);

	}}

user main code:

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

public class UserMainCode{
	public  static  void  isLeapyear(String  s1)  throws  ParseException{
		SimpleDateFormat  sdf=new  SimpleDateFormat("dd/MM/yyyy");
		GregorianCalendar  g=new  GregorianCalendar();
	StringTokenizer  t=new  StringTokenizer(s1,"/");
	String  s2=t.nextToken();
	String  s3=t.nextToken(); 
	String  s4=t.nextToken();
	int  n1=Integer.parseInt(s4);
	Date  d1=sdf.parse(s1); 
	boolean  b=g.isLeapYear(n1); 
	System.out.println(b);

	}
}

63.largest chunk
Sample Input 1:
This place is soooo good
Sample Output 1:
4
main class:
	import java.util.Scanner;

	public class largestchunk {
		public  static  void  main(String[]  args)  {
			Scanner  S=new  Scanner(System.in); 
			String  s1=S.nextLine();
		System.out.println(UserMainCode.getLargestSpan(s1));
		}

	}
user main code:

import java.util.StringTokenizer;

public class UserMainCode{
	public  static  int  getLargestSpan(String  s1)  {
		int max=0;
		StringTokenizer t=new StringTokenizer(s1," ");
		while(t.hasMoreTokens()){
		String s2=t.nextToken();
		int n=0;
		for(int i=0;i<s2.length()-1;i++)
		if(s2.charAt(i)==s2.charAt(i+1))
		n++;
		if(n>max)
		max=n;
		}
		return (max+1);
		}}
	
65.even sum & duplicate elements
Sample Input 1:
7
2
3
54
1 
6
7
7
Sample Output 1:
62
Sample Input 2:
6
3
7
9
13
17
21
Sample Output 2:
-1
main class:

import java.util.Scanner;

public class even {
	public  static  void  main(String  args[])
	{
	Scanner  sc=new  Scanner(System.in);
	int  n=sc.nextInt(); int  a[]=new  int[n]; for(int  i=0;i<n;i++)
	{
	a[i]=sc.nextInt();
	}
	System.out.println(UserMainCode.sumElements(a));
	}}

user main code:
	import java.util.Iterator;
	import java.util.LinkedHashSet;

	public class UserMainCode{
		public  static  int  sumElements(int  a[])
		{
		LinkedHashSet<Integer>h1=new  LinkedHashSet<Integer>();
		int s=0;
		for(int  i=0;i<a.length;i++)
		{
		h1.add(a[i]);
		}
		Iterator<Integer>  it=h1.iterator();
		while(it.hasNext())
		{
		int  k=it.next();
		if(k%2==0)
		{
		s=s+k;
		}
		}
		if(s>0) return s; else return -1;
		}

		}
		
	35.playing with string – i
	Sample Input 1: 
	4 
	ABC 
	XYZ 
	EFG 
	MN 
	3 
	Sample Output 1: 
	CZG$
	Main
	package formstring;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in); 
			int n=Integer.parseInt(s.nextLine()); 
			String[] sc=new String[n]; 
			for(int i=0;i<n;i++) 
			{ 
			sc[i]=s.nextLine(); 
			} 
			int a=Integer.parseInt(s.nextLine()); 
			System.out.println(UserMainCode.formString(n,sc,a)); 
			s.close(); 
		}

	}
	UserMainCode
	package formstring;

	public class UserMainCode {

		public static String formString(int n, String[] sc, int a) {
			StringBuffer sb=new StringBuffer(); 
		       for(int i=0;i<n;i++) 
		       { 
		       if(sc[i].length()>=a) 
		       { 
		       String a1=sc[i]; 
		       sb.append(a1.charAt(a-1)); 
		       } 
		       else 
		       { 
		       sb.append('$'); 
		       } 
		       } 
		       return sb.toString(); 
		}

	}
	28.remove 3 multiples
	Sample Input: 6 3 1 11 
	19 17 19 Sample Output 3 1 19 17
	Main
	package remove;

	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ArrayList<Integer> al=new ArrayList<Integer>();
			ArrayList<Integer> al1=new ArrayList<Integer>();
			int n=Integer.parseInt(sc.nextLine());
			for(int i=0;i<n;i++) {
				al.add(sc.nextInt());
				} 
			al1=UserMainCode.removeMultiplesOfThree(al); 
			Iterator it=al1.iterator(); 
			while(it.hasNext())
			{ System.out.println(it.next()); } 
		}

	}
	UserMainCode
	package remove;

	import java.util.ArrayList;

	public class UserMainCode {

		public static ArrayList<Integer> removeMultiplesOfThree(ArrayList<Integer> al) {
			ArrayList<Integer> al2=new ArrayList<Integer>();
			for(int i=0;i<al.size();i++) 
			{ if((i+1)%3!=0)
				al2.add(al.get(i));
			} return al2;

		}

	}
	24.add and reverse
	Sample Input 6 10 15 20 25 30 100 15 Sample Output 571
	 Main
	package addandreverse;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);     
			 int n=sc.nextInt();
			 int a[]=new int[n];  
			 for(int i=0;i<n;i++)  
			 {               
				 a[i]=sc.nextInt();  
				 } int b=sc.nextInt(); 
			 System.out.println(UserMainCode.addAndReverse(n,b,a)) 
			 ; sc.close(); 
		}

	}
	UserMainCode
	package addandreverse;

	public class UserMainCode {

		public static int addAndReverse(int n, int b, int[] a) {
			int i=0,sum=0,r=0;        
			for(i=0;i<a.length;i++)  
			{      
				if(a[i]>b)   
				{       
					sum=sum+a[i];  
					}       
				}        
			
			while(sum!=0)       
			{     
				r=((r*10)+(sum%10));     
			sum=sum/10;      
			}      
			return r; 
		}

	}
	19.max admissions
	Sample Input 1: 4 2010 200000 2011 300000 2012 45000 2013 25000 
	Sample Output 1: 2011
	Main
	package maxadmissin;

	import java.util.ArrayList;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in); 
			ArrayList<Integer> a1=new ArrayList<Integer>(); 
			int n=s.nextInt(); 
			n=n*2; 
			for(int i=0;i<n;i++) 
			{ 
			a1.add(s.nextInt()); 
			} 
			System.out.println(UserMainCode.year(a1)); 
			s.close(); 

		}

	}
	UserMainCode
	package maxadmissin;

	import java.util.ArrayList;

	public class UserMainCode {

		public static Integer year(ArrayList<Integer> a1) {
			int max=0,pos=0; 
			for(int i=1;i<a1.size();i+=2) 
			{ 
			if(a1.get(i)>max) 
			{ 
			max=a1.get(i); 
			pos=i; 
			} 
			} 
			return a1.get(pos-1); 
		}

	}
	16.simple string manipulation – ii
	Sample Input 1: COGNIZANT TECHNOLOGY SOLUTIONS COGNIZANT 
	Sample Output 1: 9 Sample Input 2: HOW ARE YOU Sample Output 2
	Main
	package firstlast;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			 Scanner sc=new Scanner(System.in);   
			 String inpList=sc.nextLine();             
			 System.out.println(UserMainCode.calculateWordSum(inpList)); 
		}

	}
	UserMainCode
	package firstlast;

	public class UserMainCode {

		public static int calculateWordSum(String inpList) {
			 int count=0;      
			 String st[]=inpList.split(" ");     
			 String s1=st[0];       
			 String slst=st[st.length-1];  
			 if(s1.equals(slst))     
			 {       
				 count=s1.length(); 
				 }      
			 else   
			 {    
				 count=s1.length()+slst.length();            
			 }     
			 return count;   
		}

	}

	69. Age for Voting
	Sample Input 1: 16/11/1991 Sample Output 1: eligible
	Main
	package maxscorer;

	import java.lang.reflect.Array;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String s =sc.nextLine();
			System.out.println(UserMainCode.display(s));
			}
		}
	UserMainCode
	package maxscorer;

	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.util.List;
	import java.util.StringTokenizer;

	public class UserMainCode {

		

		public static String display(String s) {
			int year=0;
			 String now="01/01/2015";
			SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
			try
			{
			
			Date d=sdf1.parse(s);
			Date d1=sdf1.parse(now);
			sdf1.setLenient(false);
			int y=d.getYear();
			int y1=d1.getYear();
			int m=d.getMonth();
			int m1=d1.getMonth();
			int day=d.getDay();
			int day1=d1.getDay();
			year=y1-y;
			if(m>m1)
			year--;
			else if(m==m1)
			{if(day<day1)
			year--;
			}
			}
			catch(Exception e)
			{
			e.printStackTrace();
			}
			if(year>18)
			return "eligible";
			else
			return "not-eligible";
			}
	}
			

	68. String processing – Long + Short + Long
	Sample Input 1: Hello Hi Sample Output 1: HelloHiHello
	Main
	package levl2;

	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			String s1=s.next(); 
			String s2=s.next();
			System.out.println(UserMainCode.getCombo(s1,s2)); s.close(); 

		}

	}
	UserMainCode
	package levl2;

	public class UserMainCode {

		public static String getCombo(String s1, String s2) {
			StringBuffer sb=new StringBuffer();
			int p=s1.length(); 
			int q=s2.length();
			if(p>q) 
			{ 
				sb.append(s1).append(s2).append(s1);
				} 
			else
			{
				sb.append(s2).append(s1).append(s2); 
				} 
			return sb.toString(); 
		}

	}
	67. Integer Factorial
	Sample Input1: 4 2 3 5 4 
	Sample Output1: 2:2 3:6 5:120 4:24
	Main
	package integerfactorial;

	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in); 
			int a=Integer.parseInt(s.nextLine());
			int[]k=new int[a];
			for(int i=0;i<a;i++) 
			{
				k[i]=s.nextInt();    
				} 
			LinkedHashMap<Integer,Integer>hm=new LinkedHashMap<Integer,Integer>(); 
			hm=UserMainCode.getFactorial(k); 
			Iterator<Integer> it=hm.keySet().iterator(); 
			for(int i=0;i<a;i++) 
			{
				int n=it.next(); 
			
				int fac=hm.get(n);
				System.out.println(n+":"+fac); 
				s.close(); 
		}

	}
	}
	UserMainCode
	package integerfactorial;

	import java.util.LinkedHashMap;

	public class UserMainCode {

		public static LinkedHashMap<Integer, Integer> getFactorial(int[] k) {
			LinkedHashMap<Integer,Integer> hm1=new LinkedHashMap<Integer,Integer>();
			for(int i=0;i<k.length;i++)
			{ 
				int u=1; 
				for(int j=1;j<=k[i];j++) 
				{
					u=u*j; 
			} 
				hm1.put(k[i],u); 
				}
			
			return hm1;  
		}

	}

64.largest span
Sample Input 1:
6
4
2
1
4
5
7

Sample Output 1:
4

main class:

import java.util.Scanner;

public class largestspan {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	
	 int n=sc.nextInt();
	 int []a=new int[n];
	 for(int i=0;i<n;i++)
	 {
	                 a[i]=sc.nextInt();
	 }
	 System.out.print(UserMainCode.getLargestSpan(a,n));


}
}

user main code:

public class UserMainCode{
    public static int getLargestSpan(int[] x,int n)
    {
                    int gap=0,max=0;
                    for(int i=0;i<n;i++)
                    {
                                    for(int j=i+1;j<n;j++)
                                    {
                                                    if(x[i]==x[j])
                                                    {
                                                                    gap=j;
                                                    }
                                    }
                                    if(gap-i>max)
                                                    max=gap-i;

                    }
                    return max+1;
    }


}

66.regular expression-3
Sample Input 1:
Technology$1213
Sample Output 1: 
valid
main class:
	import java.util.Scanner;

	public class Main 
	{ 
		public static void main(String[] args){ 
			Scanner s=new Scanner(System.in);     
			String password=s.next();     
			int b=UserMainCode.ValidatePassword(password);     
			if(b==1){        
				System.out.println("Valid");

			}     
			else{        
				System.out.println("Invalid");     
			}     
			s.close(); 
		}
	}   

user main code:
	class UserMainCode {
	public static int ValidatePassword (String password){
		if(password.matches(".*[0-9]{1,}.*") && password.matches(".*[@#$]{1,}.*")
				&& password.length()>=6 && password.length()<=20)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}

57.state id generator
Sample Input 1:
3

Kerala 
Gujarat
Goa
Sample Output 1:
	KER:Kerala
	GUJ:Gujarat 
	GOA:Goa
main class:

import java.util.*; 
public class Main
{

public static void main(String[] args)

{

Scanner s=new Scanner(System.in); 
int n=s.nextInt();
String[] s1=new String[n];

for(int i=0;i<n;i++)

{

s1[i]=s.next();

}

LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();

hm = UserMainCode.putvalues(s1);

for(Map.Entry<String, String> ans: hm.entrySet())

{

System.out.println(ans.getKey()+":"+ans.getValue());

}

}}

user main code:
	import java.util.HashMap;



	import java.util.LinkedHashMap;
	import java.util.Map;



	public class UserMainCode{



	public static LinkedHashMap<String, String> putvalues(String[] s1)

	{

	LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();

	ArrayList<String> lst1 = new ArrayList<String>();

	ArrayList<String> lst2 = new ArrayList<String>();
	for(String s : s1) lst1.add(s.toUpperCase().substring(0,3)); for(String s : s1)
	lst2.add(s);

	for(int i=0;i<s1.length;i++)

	{

	hm.put(lst1.get(i),lst2.get(i));

	}

	return (LinkedHashMap<String, String>) hm;

	}

	

	}


	53.grade calculator
	Sample Input 1:
		
		3

		Avi 
		76.36
		Sunil 
		68.42
		Raja 
		36.25
		Sample Output 1:

		Avi 
		PASS
		Sunil 
		PASS
		Raja
		FAIL


main class:
	import java.io.IOException;
	import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Scanner;

	public class ree333 {
		public static void main(String[] args) throws IOException,Exception

		{

		Scanner sc=new Scanner(System.in);
		int k1=Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, Float> hm=new LinkedHashMap<String,Float>(); 
		for(int i=0;i<k1;i++)
		{

		hm.put(sc.next(),sc.nextFloat());
		}

			LinkedHashMap<String,String> hm1=new LinkedHashMap<String,String>(); 
			hm1=UserMainCode.obtainDesignation(hm);
		    Iterator<String> it=hm1.keySet().iterator(); 
		    for(int i=0;i<k1;i++) {
			String n=it.next();
			String fac=hm1.get(n);
			System.out.println(n);
			System.out.println(fac);
			
		}
		}


	}
	
	user main code:
		import java.util.Iterator;
	import java.util.LinkedHashMap;
	import java.util.Map;
	import java.util.Map.Entry;

	public class UserMainCode{
		
		public static LinkedHashMap<String, String> obtainDesignation(LinkedHashMap<String,Float> hm) {
			LinkedHashMap<String,String> tm=new LinkedHashMap<String,String>();
			Iterator<String>it=hm.keySet().iterator();
			while(it.hasNext()) {
				String id=it.next();
				float mark=hm.get(id);
				if(mark<60) {
					tm.put(id,"FAIL");
				}else {
						tm.put(id,"PASS");
				}
			}
	return tm;

		}
		Sample Input 1:
			abcXXXabc
			Sample Output 1:
			1
			Sample Input 2: aaaxxyzAAAx Sample Output 2:
			2
			Main

			importjava.util.*; importjava.text.*; publicclassMain  {
			publicstaticvoid  main(String[]  arg)
			{
			HashMap<Integer,Double>hm=newHashMap<Integer,Double>();
			Scanner  sc=new  Scanner(System.in);
			intn=sc.nextInt();
			for(inti=0;i<n;i++)
			{
			inta=sc.nextInt(); doubles=sc.nextDouble(); hm.put(a,s);
			}
			System.out.println(UserMaincode.dis(hm));
			}}


			UserMainCode

			classUserMaincode
			{
			publicstaticdouble  dis(HashMap<Integer,Double>  h1)

			{
			doubleavg=0.0,sum=0.0;
			int k=0;
			for(Map.Entry  m:h1.entrySet())
			{
			int  a=(Integer)m.getKey();
			if(a%2!=0)
			{
			Double  d=(Double)  m.getValue(); sum=sum+d;
			k++;
			}
			}
			avg  =  (double)sum/k;
			DecimalFormatdf  =  newDecimalFormat(".##"); String  b1  =  df.format(avg);
			double  b  =  Double.parseDouble(b1);
			return b;

	}