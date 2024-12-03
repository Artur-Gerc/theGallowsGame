public class DrawTheGallows {

    public static void drawHangman(int errorCounter) {
        switch (errorCounter) {
            case 0:
                System.out.println("""
                        ___________               
                        |   \\    |
                        |  
                        |  
                        |  
                        |
                        ~~~~~~~~~~~
                        """);
                break;
            case 1:
                System.out.println("""
                        ___________               
                        |   \\    |
                        |   ()
                        |  
                        |  
                        |
                        ~~~~~~~~~~~
                        """);
                break;
            case 2:
                System.out.println("""
                        ___________                
                        |   \\    |
                        |   ()
                        |   []
                        |  
                        |
                        ~~~~~~~~~~~
                        """);
                break;
            case 3:
                System.out.println("""
                        ___________                
                        |   \\    |
                        |   ()
                        |  /[]
                        |  
                        |
                        ~~~~~~~~~~~
                        """);
                break;
            case 4:
                System.out.println("""
                        ___________                
                        |   \\    |
                        |   ()
                        |  /[]\\
                        |  
                        |
                        ~~~~~~~~~~~
                        """);
                break;
            case 5:
                System.out.println("""
                        ___________                
                        |   \\    |
                        |   ()
                        |  /[]\\
                        |  /   
                        |
                        ~~~~~~~~~~~
                        """);
                break;
            case 6:
                System.out.println("""
                        ___________                
                        |   \\    |
                        |   ()
                        |  /[]\\
                        |  /  \\
                        |
                        ~~~~~~~~~~~
                        """);
                break;
        }


    }

}

