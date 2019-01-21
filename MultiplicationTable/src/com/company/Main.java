package com.company;

public class Main
{

    public static void main(String[] args)
    {
        final String NUMBER_FORMAT = "%5d";

        //Get the max number from the user
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Please enter a whole number: ");
        int max = input.nextInt();

        //Print the column headers
        System.out.print("         ");
        int headerColumnCount = 1;
        while (headerColumnCount <= max)
        {
            System.out.printf(NUMBER_FORMAT, headerColumnCount);
            headerColumnCount = headerColumnCount + 1;
        }
        System.out.println();

        //Print the row of dashes below the column headers
        System.out.print("        -");
        headerColumnCount = 1;
        while (headerColumnCount <= max)
        {
            System.out.print("-----");
            headerColumnCount = headerColumnCount + 1;
        }
        System.out.println();

        //Print each row
        int rowCount = 1;
        while (rowCount <= max)
        {
            //Print the row header
            int columnCount = 1;
            System.out.printf(NUMBER_FORMAT + "   |", rowCount);

            //Print each columns
            while (columnCount <= max)
            {
                int answer = rowCount * columnCount;
                System.out.printf(NUMBER_FORMAT, answer);
                columnCount = columnCount + 1;
            }

            //Drop cursor down for next row
            System.out.println();

            rowCount = rowCount + 1;
        }
    }
}
