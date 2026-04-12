package Java;
public class Sec {
    public static void main(String[] args){
        System.out.println("second part");

// Data types
     //data types are the type of data which we insert in the var. value 
     //like int means inserted value is a integer 
    /*Data types are divided into two groups:

      Primitive data types - includes byte, short, int, long, float, double, boolean and char
      Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter) */   
      /*Data Type	Description
      byte	Stores whole numbers from -128 to 127
      short	Stores whole numbers from -32,768 to 32,767
      int	Stores whole numbers from -2,147,483,648 to 2,147,483,647
      long	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
      float	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
      double	Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits
      boolean	Stores true or false values
      char	Stores a single character/letter or ASCII values */
      /*Primitive number types are divided into two groups:

      Integer types stores whole numbers, positive or negative (such as 123 or -456), without decimals. 
      Valid types are byte, short, int and long. Which type you should use, depends on the numeric value.

      Floating point types represents numbers with a fractional part, containing one or more decimals. 
      There are two types: float and double. */
       // int and double are mostly use.
       //The float and double data types can store fractional numbers. Note that 
       //you should end the value with an "f" for floats and "d" for doubles.
       float mynum= 12.33f;
       double minum= 15.66d;
       System.out.println(mynum);    
       System.out.println(minum); 
       //Java has a boolean data type, which can only take the values true or false
       //Boolean values are mostly used for conditional testing.
       boolean isJavaFun = true;
       boolean isFishTasty = false;
       System.out.println(isJavaFun);     
       System.out.println(isFishTasty);   
       /*The String type is so much used and integrated in Java, that some call it "the special ninth type".

       A String in Java is actually a non-primitive data type, because it refers to an object. 
       The String object has methods that are used to perform certain operations on strings. 
       Don't worry if you don't understand the term "object" just yet.
        We will learn more about strings and objects in a later chapter. */
        int item= 50;
        float costperitem= 6.5f;
        float total= item*costperitem;
        char currency= '$';
        System.out.println("No.of items: "+item);
        System.out.println("Cost Per Item: "+costperitem);
        System.out.println("Total Cost: "+currency+total);
//Java Type Casting
   /*Type casting is when you assign a value of one primitive data type to another type.

     In Java, there are two types of casting:

     Widening Casting (automatically) - converting a smaller type to a larger type size
     byte -> short -> char -> int -> long -> float -> double

     Narrowing Casting (manually) - converting a larger type to a smaller size type
     double -> float -> long -> int -> char -> short -> byte
 */
        int myInt = 9;
        double myDouble = myInt;   
        System.out.println(myDouble);  
        // narrowing casting
        double mydouble = 9.78d;
        int myint = (int) mydouble;
        System.out.println(mydouble);
        System.out.println(myint);
        System.out.println("Git is interesting");


    }
    
}
