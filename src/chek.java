public class chek {
    
    public static void main(String[] args) throws Exception{
        Matematicas matematicas=new Matematicas();
        double c = matematicas.dividir(24, 0);
        System.out.println("El resultado es " + c);
    }
}
