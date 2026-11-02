public class DiagonalInspector {
    private Task[][] grid;

    public DiagonalInspector(Task[][] grid)
    {
        this.grid = grid;
    }

    public Task[] getMainDiagonalTasks()
    {
        Task[] output = new Task[grid.length];
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i]!=null && grid[i].length>i) output[i]=grid[i][i];
        }

        return output;
    }
}
