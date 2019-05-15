// TODO: 1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
public class StringsDataStructures {

    public static void main(String[] args)
    {
        String test1 = "okei";
        char test2[] = {'j','a','k','a','k','\0'};
        System.out.println(varyingCharactersOne(test1));
        System.out.println(reverseCString(test2));

        String x = "alllllgorithm";
        StringBuilder sb;
        sb =  removeduplicate(x);
        System.out.println(sb.toString());

        String test3 = "owal";
        String test4 = "lowa";
        System.out.println(isAnagram(test3,test4));

        String test5 = "to jest piaty test";
        sb = replaceSpace(test5);
        System.out.println(sb.toString());

        int [][]testMatrix = {
                {1,3,4,7,1},
                {0,2,4,5,6},
                {1,1,3,4,5},
                {1,3,4,5,6}
        };

        fillWithZeros(testMatrix);

    }

    //no additional data structures
    //returns true when all the string characters are unique
    //false otherwise
    static boolean varyingCharactersOne(String expr){

        boolean value = false;
        char currentChar;
        for(int i = 0; i < expr.length(); i++)
        {
            currentChar = expr.charAt(i);
            for(int j = i+1; j < expr.length(); j++)
            {
                if(currentChar == expr.charAt(j)) {
                    value = false;
                }
                else {
                    value = true;
                }
            }

        }

        return value;
    }

    static char[] reverseCString(char [] expr){
        char result[] = new char[expr.length];

        int i = 0;
        while(expr [i] != '\0')
        {
            result[expr.length-2-i] = expr[i];
            i++;
        }

        return  result;
    }

    static StringBuilder removeduplicate(String expr){

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < expr.length(); i++)
        {
            char currentChr = expr.charAt(i);
            int repeated = 0;
            for (int j = i+1; j < expr.length(); j++)
            {
                if(expr.charAt(j) == currentChr)
                    repeated++;
            }

            if(repeated == 0){
                result.append(currentChr);
            }
        }
        return result;
    }

    static boolean isAnagram (String expr1, String expr2){
        boolean result = false;

        if(expr1.length() != expr2.length())
            result = false;

        for(int i = 0; i < expr1.length(); i++)
        {
            char checkedChar = expr1.charAt(i);
            int matchedLetter = 0;
            for (int j = 0; j < expr2.length(); j++)
            {
                if(checkedChar == expr2.charAt(j))
                    matchedLetter++;
            }
            if(matchedLetter == 0)
                result = false;
            else{
                result = true;
            }
        }

        return result;
    }

    static StringBuilder replaceSpace(String expr){
     StringBuilder result = new StringBuilder();

     for(int i = 0; i < expr.length(); i++)
     {
         if(expr.charAt(i) == ' '){
             result.append("%20");
         }else {
             result.append(expr.charAt(i));
         }
     }
     return result;
    }

    static void fillWithZeros(int matrix [][]){
        int [] row = new int[matrix.length];
        int [] column = new int [matrix[0].length];

        int positionCntr = 0;
        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[0].length; j++)
            {
                if(matrix[i][j] == 0){
                    row[i]=1;
                    column[j]=1;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length;j++)
            {
                if(row[i] == 1 || column[j] == 1)
                    matrix[i][j] = 0;
            }
        }

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }

    }



}
