public void printOcean(boolean showShips){
    
    for (int row = 0; row < OCEAN_SIZE; row++) 
    {
        if(row == 0)
        {
            System.out.print(" ");
            for (int i = 0; i < OCEAN_SIZE; i++) 
            {
                System.out.print(String.format("%4s", i));
                System.out.println();
                {
                    System.out.print(" ");
                    System.out.print("+---");        
                }
                System.out.print("+\n");
                System.out.print(row +" ");


                for (int col = 0; col < OCEAN_SIZE; col++) 
                {
                    System.out.print("| " + ocean[row][col].printCoordinate(showShips) + " ");
                }
                System.out.print("|");
                System.out.println(); 
            }
            System.out.print(" ");
        }
        for (int i = 0; i < OCEAN_SIZE; i++) 
        {
            System.out.print("+---");           
        }
        System.out.print("+\n");
    }
}