Scanner input = new Scanner(System.in);
    boolean didBuyClothing = false;

    System.out.println("Welcome to the Clothing Store! What would you like to purchase today?");
    System.out.println("1. Tops");
    System.out.println("2. Bottoms");
    System.out.println("> ");
    int userSelection = input.nextInt();

    if(userSelection == 1){

      System.out.println("What color is the top?");
      System.out.print("> ");
      String topColor = input.next();

      System.out.println("What is the price?");
      System.out.print("> ");
      double topPrice = input.nextDouble();

      System.out.println("What gender is it for?");
      System.out.print("> ");
      String topGender = input.next();

      System.out.println("Does it have a logo? (1 - Yes / 2 - No");
      System.out.print("> ");
      int logoChoice = input.nextInt();

      boolean hasLogo = false;
      if(logoChoice == 1){
        hasLogo = true;
      }

      System.out.println("What is the sleeve type? (short, long, sleeveless)");
      System.out.print("> ");
      String sleeveType = input.next();

      System.out.println();
      Tops newTop = new Tops(topColor, topPrice, topGender, hasLogo, sleeveType);

      System.out.println("Here's your top");
      System.out.println();
      System.out.println(newTop);

      didBuyClothing = true;
      
    }

    if (userSelection == 2){

      System.out.println("What color are the botoms?");
      System.out.println("> ");
      String bottomColor = input.next();

      System.out.println("What is the price?");
      System.out.print("> ");
      double bottomPrice = input.nextDouble();

      System.out.println("What gender are they for?");
      System.out.print("> ");
      String bottomGender = input.next();

      System.out.println("Are the bottoms baggy? (1 - Yes / 2 - No");
      System.out.print("> ");
      int baggyChoice = input.nextInt();

      boolean isBaggy = false;
      if (baggyChoice == 1){
        isBaggy = true;
      }

      System.out.println("What material are the bottoms made of?");
      System.out.print("> ");
      String material = input.next();

      System.out.println();
      Bottoms newBottoms = new Bottoms(bottomColor, bottomPrice, bottomGender, isBaggy, material);

      System.out.println("Here are your bottoms:");
      System.out.println();
      System.out.println(newBottoms);

      didBuyClothing = true;
    }

    System.out.println();

        if (didBuyClothing) {
      System.out.println("Thank you for your purchase. Come again!");
    } else {
      System.out.println("Thanks for visiting. Maybe next time you'll buy something!");
    }

    // Closes the Scanner object
    input.close();
  }
}