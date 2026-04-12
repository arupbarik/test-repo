package Java;

public class First {

    public static void main(String[] args) {
        System.out.println("Helllo world");
        System.out.println("I am Arup Barik");
        System.out.println("Konichiba");
        System.out.print("Hi\n");
        System.out.print(" I am Arup Barik\n");
        System.out.println("*\n**\n***\n****");
        //prin() is also use for print things but other than println() 
        //it not break the line it will continue the line for every print() command
        //also we can use "\n" for next line
        System.out.println(22);
        System.out.println(2+5*6+5465+54*58963);
//this is used for comments in java
        /*this is used for multi line comment */
//Variables
    //these are the Types of variables,
        /*String - stores text, such as "Hello". String values are surrounded by double quotes
         int - stores integers (whole numbers), without decimals, such as 123 or -123
         float - stores floating point numbers, with decimals, such as 19.99 or -19.99
         char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
         boolean - stores values with two states: true or false */
         //syntax-- type varname= value
         // ex: String myname="Arup"
         //then system.out.println(myname)
         String myname="Arup";
         System.out.println(myname);
         int num=120;
         System.out.println(num);
 // to combine any string or int or any thing we use '+' sign.
         int x= 12;
         int y= 18;
         int z= x+y;
         System.out.println(z);
         String soi= "arup";
         String koi= " barik";
         System.out.println(soi+koi);
//To declare more than one variable of the same type, you can use a comma-separated list:
         //Instead of writing:

         /*int x = 5;
         int y = 6;
         int z = 50;
         System.out.println(x + y + z);
        
         //You can simply write:

         int x = 5, y = 6, z = 50;
         System.out.println(x + y + z);*/
         // it -is true for every variable
         int g = 5, h = 6, f = 50;
         System.out.println(g + h + f);
         int a,b,c;
         a=b=c=50;
         System.out.println(a+b+c);
//identifiers
    //java identifier which nothing the variable name 
    /*The general rules for naming variables are:

     Names can contain letters, digits, underscores, and dollar signs
     Names must begin with a letter
     Names should start with a lowercase letter, and cannot contain whitespace
     Names can also begin with $ and _
     Names are case-sensitive ("myVar" and "myvar" are different variables)
     Reserved words (like Java keywords, such as int or boolean) cannot be used as names */
          int $base= 56;
          System.out.println($base);
// examples
     //calculate area of the rectangle
         int length= 25;
         int width= 20;
         int area= length*width;
         System.out.println("Length is:" +length);
         System.out.println("Width is:" +width);
         System.out.println("Area of the rectangle is:" +area);
     //student data
         String studentname= "Arup";
         char section= 'B';
         int roll= 15;
         System.out.println("Student Name: "+studentname);
         System.out.println("Roll: "+roll);
         System.out.println("Section: "+section);


    }
}