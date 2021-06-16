package extra;
public class NameRepositoryDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        //print name from left to right
        System.out.println("Left-to-right");
        for (int index = 0; index < nameRepository.names.length; index++) {
            System.out.print(nameRepository.names[index]);
            System.out.print(", ");
        }
        System.out.println();
        //print name from right to left
        System.out.println("Right-to-left");
        for (int index = nameRepository.names.length - 1; index >= 0; index--) {
            System.out.print(nameRepository.names[index]);
            System.out.print(", ");
        }
    }
}