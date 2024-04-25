public class Task
{
    private String description;
    private int duration;
    public Task(String description, int duration)
    {
        this.description=description;
        this.duration=duration;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
    public void processTask()
    {
        try{
            Thread.sleep(duration);
        }
        catch (InterruptedException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", duration=" + duration +
                '}';
    }
}
