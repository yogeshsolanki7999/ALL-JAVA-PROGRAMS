package com.Harry;

public class y_practice_set_7_Array {
    public static void main(String[] args) {
        //Problem1=Print the elements of an array in reverse order

       /* int[] reverse={66,55,44,33,22};
        for (int i=reverse.length-1;i>=0;i--){
            System.out.println("The " +i+ " element of reverse array is  = "+reverse[i]);
        }*/

        //Problem 2== Enter elements in array using loops
       /*Scanner s=new Scanner(System.in);

        int[] insert=new int[5];
        for (int i=0;i<=insert.length-1;i++){
            System.out.println("Enter index no of the element = "+i);
            insert[i]=s.nextInt();
        }
        for (int j=0;j<=insert.length-1;j++){
            System.out.println("Element no "+j+"in array is = "+insert[j]);
            }
        */

        //PROBLEM 3 =CREATE ARRAY OF 5 FLOATS AND AND CALCULATE THEIR SUM

        /*float [] marks= new float[5];
        Scanner s=new Scanner(System.in);
        float sum=0;
        for (int i=0;i<=marks.length-1;i++){
            System.out.println("ENTER THE VALUE FOR  "+i +" INDEX");
            marks[i] =s.nextFloat();
            sum=sum+marks[i];
        }
        System.out.println("THE TOTAL SUM OF VALUES OF ARRAY IS  ="+sum);*/


        //PROBLEM 4 = CALCULATE THE AVERAGE MARKS FROM ARRAY CONTAINING MARKS OF  ALL STUDENTS IN USING FOR EACH LOOP

       /* int [] marks = {5,5,5,5};
        int sum=0;
        for (int elements:marks
             ) {
            sum=sum+elements;
        }
        int avg=sum/marks.length;
        System.out.println(avg);*/


        // PROBLEM 5 = FIND OUT WEATHER A INTEGER IS PRESENT IN AN ARRAY OR NOT.
        /* int[] ar={5,6,8,77,65,45,87,35};
         Scanner s= new Scanner(System.in);
        System.out.println("ENTER ANY NUMBER TOU WANT TO CHECK IN ARRAY");
         int num=s.nextInt();
         boolean isArray=false;

        for (int element:ar
             ) {
            if (num==element){
                isArray=true;
                break;
            }
        }
        if (isArray){
            System.out.printf("%d IS PRESENT IN ARRAY",num);
        }
        else {
            System.out.printf("%d IS NOT PRESENT IN ARRAY",num);
        }*/

      /*  //PROBLEM 6 = JAVA PROGRAM TO ADD TWO MATRICES
        int[][] mat1={ {4,5,6}
                        ,{6,4,5}};
        int[][] mat2={ {4,5,6}
                ,{6,4,5}};
        int[][] result={ {0,0,0}
                ,{0,0,0}};

        for (int i=0;i<=mat1.length-1;i++){

            for (int j=0;j<=mat1[i].length-1;j++){
                System.out.printf("FOR SETTING THE VALUE i=%d and j=%d",i,j);
                result[i][j]=mat1[i][j] + mat2[i][j];
                System.out.println("");
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("PRINTING THE ELEMENT OF 2-D ARRAY");

        for (int i=0;i<=mat1.length-1;i++){
            for (int j=0;j<=mat1[i].length-1;j++){
                System.out.print(result[i][j] +" ");
            }
            System.out.println("");
        }*/



       /*
        //PROBLEM 6 = REVVERSE AN ARRAY
        //{TO FIND THE GREATEST INTER VALUE USE ( Math.floorDiv(value1,value2);}
        int [] a={1,2,3,4,5,6};

        int l=a.length;
        int n=Math.floorDiv(l,2);
        int temp;
         System.out.println(" REVERSE OF YOUR ARRAY IS ");
        for (int i=0;i<n;i++){
            //SWAP a[i] and a[l-i-1];
            temp=a[i];
            a[i]=a[l-i-1];
            a[l-i-1]=temp;


        }
        for (int reverse:a
             ) {
            System.out.println(reverse);
        }*/


      /*  //PROBLEM 7 = FINDING BIGGEST ELEMENT IN AN ARRAY
        int [] a={11,2,355,4000,56556,65};
        int max=0;
        for (int element:a
             ) {
            if (element>max){
                max=element;
            }

        }
        System.out.println("THE MAXIMUM VALUE OF THE ELEMENT IS="+max);*/

       /* //PROBLEM 7 = FINDING BIGGEST ELEMENT IN AN ARRAY
        int [] a={11,2,355,4000,56556,65};
        int min=0;
        for (int element:a
        ) {
            if (element>){
                max=element;
            }

        }
        System.out.println("THE MAXIMUM VALUE OF THE ELEMENT IS="+max);*/


        //PROBLEM 9 = ARRAYB IS SORTED OR NOT
      //  int [] a={11,2,355,4000,56556,65};
      //  boolean isarray=true;

       // for (int i=0;i<=a.length-2;i++){

      //      if (a[i]>a[i+1]){
         //       isarray=false;
         //       break;
          //  }
      //  }
     //   if (isarray){
       //     System.out.println("THE ARRAY IS SORTED");
     //   }
     //   else{
     //       System.out.println("THE ARRAY IS NOT SORTED");
   //     }



    }
}
