public class Main {
    public static void main(String[] args)
    {
        Task[][] tasks = {
                {new Task("1",10), new Task("2",20)},
                {new Task("4",40)},
                {new Task("7",70), new Task("8",80), new Task("9",90)}
        };

        DiagonalInspector diagonalInspector = new DiagonalInspector(tasks);

        Task[] diagonal = diagonalInspector.getMainDiagonalTasks();

        for(int i=0;i<3;i++)
        {
            if(diagonal[i]!=null) System.out.println(diagonal[i].getExecutionTime());
            else System.out.println("null");
        }
    }
}
