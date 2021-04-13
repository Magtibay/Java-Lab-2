
class SortValues

	{




	//number of variables
	public static void SortNumbers(int... numbers)

	{

  

    int index; 
    int temp;

    index = temp = 0;

 
    //array depending on length
    int[] integerArr = new int[numbers.length];

   

    //loop numbers

    for(int num : numbers)

    {

      //Assign to array value

      integerArr[index++] = num;

    }

    

    for(int i = 0; i < integerArr.length; i++)

    {

      for(int j = i + 1; j < integerArr.length; j++)

      {

     

        if(integerArr[i] < integerArr[j])

        {

        

          temp = integerArr[i];

          integerArr[i] = integerArr[j];

          integerArr[j] = temp;

        }

      }

    }

  

    //output

    System.out.println("Sorted array in descending order: ");

    

    for(int arr_index = 0; arr_index <

    integerArr.length; arr_index++)

    {

      if(arr_index != (integerArr.length - 1))

      {

        System.out.print(integerArr[arr_index]

        + ", ");

      }

      else

      {

        System.out.println(integerArr[arr_index]

        + ".");

      }

    }

}
}