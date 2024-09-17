class one {
    public void print_geek(){
        System.out.println("Geeks");
    }
}

class two extends one{
    public void  print_for(){
        System.out.println("for");
        
    }
}

class three extends two{
    public void print_my(){
        System.out.println("my");
    }
}

/**
 * Main
 */
public class multilevel {

    public static void main(String[] args) {
        three g=new three();

        g.print_geek();
        g.print_for();
        g.print_my();
    }
}
